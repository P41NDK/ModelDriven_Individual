/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.Iterator
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.voice.Entity
import org.xtext.example.mydsl.voice.Intent
import org.xtext.example.mydsl.voice.Question
import org.xtext.example.mydsl.voice.Reference
import org.xtext.example.mydsl.voice.Training
import org.xtext.example.mydsl.voice.TrainingRef

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VoiceGenerator extends AbstractGenerator {
	var Set<IntentFollowUp> followUpInformation
	var ArrayList<Intent> intentsWithFollowup = new ArrayList<Intent>

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		followUpInformation = resource.allContents.filter(Intent).collectFollowUp
		
		resource.allContents.filter(Entity).forEach[generateEntityFile(fsa)]
		followUpInformation.forEach[generateIntentFile(fsa)]			
	}
	
	def generateEntityFile(Entity entity, IFileSystemAccess2 fsa) {
		fsa.generateFile(entity.name + "_entries_en.json",entity.generateEntityEntries)
		fsa.generateFile(entity.name + ".json", entity.generateEntity)
	}
	
	def generateIntentFile(IntentFollowUp intent, IFileSystemAccess2 fsa) {
		fsa.generateFile(intent.name + ".json", intent.generateIntent)
	}
	
	def CharSequence generateIntent(IntentFollowUp intent)
		'''
		{
		"id": "�generateUUID�",
		"name": "�intent.name�",
		"auto": true,
		�intent.generateFollowup�
			"parameters": [
		�FOR parameter: intent.createQuestionList�
		{ 
		          "id": "�generateUUID�",
		          "required": "true",
		          "dataType": "@�parameter.questionEntity.withEntity.getEntityType�",
		          "name": "�parameter.questionEntity.withEntity.sysvar!==null?parameter.questionEntity.withEntity.sysvar.value:parameter.questionEntity.withEntity.entity.name�",
		          "value": "$�parameter.questionEntity.withEntity.sysvar!==null?parameter.questionEntity.withEntity.sysvar.value:parameter.questionEntity.withEntity.entity.name�",
		          "prompts": [
		            "�parameter.prompt�"
		          ],
		          "promptMessages": [],
		          "noMatchPromptMessages": [],
		          "noInputPromptMessages": [],
		          "outputDialogContexts": [],
		          "isList": false
		        } �if (parameter != intent.question.last && intent.superIntent === null) ''','''�
		�ENDFOR�
		],
		      "messages": [
		        {
		          "type": 0,
		          "lang": "en",
		          "condition": "",
		          "speech": []
		        }
		      ],
		      "defaultResponsePlatforms": {},
		      "speech": []
		    }
		  ],
		  "priority": 500000,
		  "webhookUsed": true,
		  "webhookForSlotFilling": false,
		  "fallbackIntent": false,
		  "events": [],
		  "conditionalResponses": [],
		  "condition": "",
		  "conditionalFollowupEvents": [],
		  "userSays": [
		  �FOR trainingRef : intent.createTrainingList�
		  �trainingRef.generateTraining� �if (trainingRef !== intent.training.trainingref.last) ''','''�
		  �ENDFOR�
		  ]
		}
		'''
	def List<Question> createQuestionList(IntentFollowUp intent){
		val result = intent.question
		if(intent.superIntent !== null){
			result.addAll(intent.superIntent.question)
		}
		result
	}
	def List<TrainingRef> createTrainingList(IntentFollowUp intent){
		val result = intent.training.trainingref
		if(intent.superIntent !== null){
			result.addAll(intent.superIntent.training.trainingref)
		}
		result
	}
	
	def CharSequence generateTraining(TrainingRef training){	
		'''
		{
		"isTemplate": false,
		"data": [
		{
		"text": "�training.phrase�",
		"userDefined": false
		},
		{
		"text": "�training.declarations.trainingstring�",
		"userDefined": true,
		"alias": "�training.declarations.reference.sysvar!==null?training.declarations.reference.sysvar.value:training.declarations.reference.entity.name�",
		"meta": "@�training.declarations.reference.entityType�"
		}
		],
		"count": 0,
		"updated": null
		}
		'''
	}
	
	def Set<IntentFollowUp> collectFollowUp(Iterator<Intent> intents){
		val result = new HashSet<IntentFollowUp>
		intents.forEach[item | 
			result.add(new IntentFollowUp(item.name, item.isFollowup !== null ? item.isFollowup.intent : null, item, item.question, item.training, item.zuper))
			if(item.isFollowup !== null) 
				intentsWithFollowup.add(item.isFollowup.intent)
		]
		result
	}
	def String getEntityType(Reference ref) {
		if (ref.entity !== null)
			ref.entity.name
		else if (ref.sysvar !== null)
			"sys." + ref.sysvar.value
	}
	
	def generateFollowup(IntentFollowUp followup)
	'''
	"contexts": [
	�if (followup.followupTo !== null)'''"�followup.followupTo.name�-followup"'''�
	],
				  "responses": [
				  					{
				  					"resetContexts": false,
				  					"affectedContexts":[
				  					�if(intentsWithFollowup.contains(followup.followupFrom))
				  					'''{
				  							"name": "�followup.followupFrom.name�-followup",
				  							"parameters": {},
				  							"lifespan": 2
				  						}'''�        
				  					],
				  					"action": "",
				  					'''

	def CharSequence generateEntityEntries(Entity entity) '''
	[
	�FOR example: entity.example�
	  {
	    "value": "�example.name�",
	    "synonyms": [
	      ""
	    ]
	  }�if (example != entity.example.last) ''','''�
	�ENDFOR�
	]
	'''
	
	
	def CharSequence generateEntity(Entity entity) '''
	{
	  "id": "�generateUUID�",
	  "name": "�entity.name�",
	  "isOverridable": true,
	  "isEnum": false,
	  "isRegexp": false,
	  "automatedExpansion": false,
	  "allowFuzzyExtraction": true
	}
	'''
	def String generateUUID(){
		8.generateId + "-"+ 4.generateId + "-" + 4.generateId + "-" + 4.generateId + "-" + 12.generateId
	} 
	val ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvxyz0123456789"
	def String generateId(int count) {
		var c = count
    	var id = ""
    	while (c-- != 0) {
        	val character = (Math.random() * ALPHA_NUMERIC_STRING.length).intValue
        	id += (ALPHA_NUMERIC_STRING.charAt(character))
    }
   		id
	}
	@Data
	static class IntentFollowUp{
		String name
		//to is the intent which its supposed to follow
		Intent followupTo
		//from is this intent
		Intent followupFrom
		List<Question> question
		Training training
		Intent superIntent
	}
}