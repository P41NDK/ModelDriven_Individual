/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.voice.Model
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.xtext.example.mydsl.voice.VoicePackage
import org.xtext.example.mydsl.validation.VoiceValidator
import org.xtext.example.mydsl.voice.Agent
import java.util.List
import org.xtext.example.mydsl.voice.Intent
import java.util.ArrayList
import org.xtext.example.mydsl.voice.QuestionReference

@ExtendWith(InjectionExtension)
@InjectWith(VoiceInjectorProvider)
class VoiceParsingTest {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void T00_loadModel() {
	val result =
	'''
	Entity car [Toyota, Audi, BMW]
	
	Intent pickCar
		car with 'what car would you like?'
		
		Training:
		'i would like a ' ('Toyota' is car).
	'''
	val parse = result.parse
	Assertions.assertNotNull(parse)
	parse.assertNoErrors
	} 
	
	
	@Test
	def void T01_noCyclicInheritance(){
	'''
	Entity car [Toyota, Audi, BMW]
	Entity city [Odense, Aarhus, Copenhagen]
	
	Intent pickCar extends pickPlace
		car with 'what car would you like?'
		
		Training:
		'i would like a ' ('Toyota' is car).
		
	Intent pickPlace extends pickCar
			city with 'Where would you like to pick it up??'
			
			Training:
			'i would pick the car up at ' ('Odense' is city).
	'''.parse.assertCycleInHierarchy("pickCar")
	}
	def private assertCycleInHierarchy(Model m, String intentName) {
	m.assertError(VoicePackage.Literals.MODEL, VoiceValidator.HIERARCHY_CYCLE,"cycle in hierarchy of intent '" + intentName + "'")
	}
	
	
	@Test
	def void T02_testIntentIsCorrectlyNamed() {
	val result =
	'''
	Entity car [Toyota, Audi, BMW]
	
	Intent pickCar
		car with 'what car would you like?'
		
		Training:
		'i would like a ' ('Toyota' is car).
	'''
	val parsed = result.parse
	Assertions.assertTrue(checkForIntentName(parsed.agent, "pickCar"))
}
def boolean checkForIntentName(List<Agent> agentList, String name){
	for(Agent agent: agentList){
		if(agent instanceof Intent){
			if(agent.name.equals(name)){
				return true
			}
		}
	}
	return false
}

	@Test
	def void T03_variableInheritance(){
		'''
	Entity car [Toyota, Audi, BMW]
	Entity city [Odense, Aarhus, Copenhagen]
	
	Intent pickCar
		newcar = car with 'what car would you like?'
		
		Training:
		'i would like a ' ('Toyota' is car).
		
	Intent pickPlace extends pickCar
			city with 'Where would you like to pick it up??'
			get newcar
			
			Training:
			'i would pick the car up at ' ('Odense' is city).
	'''.parse.assertNoErrors
	}
	
	
	@Test
	def void T04_noVariableInheritanceFromOthers(){
		val result = '''
	Entity car [Toyota, Audi, BMW]
	Entity city [Odense, Aarhus, Copenhagen]
	Intent pickCar
		newcar = car with 'what car would you like?'
		
		Training:
		'i would like a ' ('Toyota' is car).
		
	Intent pickPlace extends pickCar
			get newcar
			
			Training:
			'i would pick the car up at ' ('Odense' is city).
	'''.parse
	Assertions.assertTrue(checkForInheritedQuestion(result.agent))
	}
	
	@Test
	def void T05_questionsAreNotTheSame(){
		val result = '''
	Entity car [Toyota, Audi, BMW]
	Entity city [Odense, Aarhus, Copenhagen]
	Intent pickCar
		newcar = car with 'what car would you like?'
		
		Training:
		'i would like a ' ('Toyota' is car).
		
	Intent pickPlace extends pickCar
		concertLocal = city with 'What city would you like?'
			
			Training:
			'i would pick the car up at ' ('Odense' is city).
	'''.parse
	Assertions.assertFalse(checkForInheritedQuestion(result.agent))
	}
	
	def boolean checkForInheritedQuestion(List<Agent> agentList){
	val intentList = new ArrayList<QuestionReference>()
	for(Agent agent: agentList){
		if(agent instanceof Intent){
			for(QuestionReference question: agent.questions)
				intentList.add(question)
		}
	}
	return intentList.get(0).question !== null?intentList.get(0).question.equals(intentList.get(1).questionReference):intentList.get(0).questionReference.equals(intentList.get(1).question)
}


}
