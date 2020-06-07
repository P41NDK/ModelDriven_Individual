/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.VoiceGrammarAccess;
import org.xtext.example.mydsl.voice.Declaration;
import org.xtext.example.mydsl.voice.Entity;
import org.xtext.example.mydsl.voice.EntityExample;
import org.xtext.example.mydsl.voice.Intent;
import org.xtext.example.mydsl.voice.IsFollowup;
import org.xtext.example.mydsl.voice.Model;
import org.xtext.example.mydsl.voice.Question;
import org.xtext.example.mydsl.voice.QuestionEntity;
import org.xtext.example.mydsl.voice.Reference;
import org.xtext.example.mydsl.voice.Sysvariable;
import org.xtext.example.mydsl.voice.Training;
import org.xtext.example.mydsl.voice.TrainingRef;
import org.xtext.example.mydsl.voice.VoicePackage;

@SuppressWarnings("all")
public class VoiceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VoiceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == VoicePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VoicePackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case VoicePackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case VoicePackage.ENTITY_EXAMPLE:
				sequence_EntityExample(context, (EntityExample) semanticObject); 
				return; 
			case VoicePackage.INTENT:
				sequence_Intent(context, (Intent) semanticObject); 
				return; 
			case VoicePackage.IS_FOLLOWUP:
				sequence_IsFollowup(context, (IsFollowup) semanticObject); 
				return; 
			case VoicePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case VoicePackage.QUESTION:
				sequence_Question(context, (Question) semanticObject); 
				return; 
			case VoicePackage.QUESTION_ENTITY:
				sequence_QuestionEntity(context, (QuestionEntity) semanticObject); 
				return; 
			case VoicePackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case VoicePackage.SYSVARIABLE:
				sequence_Sysvariable(context, (Sysvariable) semanticObject); 
				return; 
			case VoicePackage.TRAINING:
				sequence_Training(context, (Training) semanticObject); 
				return; 
			case VoicePackage.TRAINING_REF:
				sequence_TrainingRef(context, (TrainingRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     (trainingstring=STRING reference=Reference)
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VoicePackage.Literals.DECLARATION__TRAININGSTRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VoicePackage.Literals.DECLARATION__TRAININGSTRING));
			if (transientValues.isValueTransient(semanticObject, VoicePackage.Literals.DECLARATION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VoicePackage.Literals.DECLARATION__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0(), semanticObject.getTrainingstring());
		feeder.accept(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityExample returns EntityExample
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EntityExample(ISerializationContext context, EntityExample semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VoicePackage.Literals.ENTITY_EXAMPLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VoicePackage.Literals.ENTITY_EXAMPLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Agent returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID example+=EntityExample+)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Agent returns Intent
	 *     Intent returns Intent
	 *
	 * Constraint:
	 *     (name=ID zuper=[Intent|ID]? isFollowup=IsFollowup? question+=Question+ training=Training)
	 */
	protected void sequence_Intent(ISerializationContext context, Intent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IsFollowup returns IsFollowup
	 *
	 * Constraint:
	 *     intent=[Intent|ID]
	 */
	protected void sequence_IsFollowup(ISerializationContext context, IsFollowup semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VoicePackage.Literals.IS_FOLLOWUP__INTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VoicePackage.Literals.IS_FOLLOWUP__INTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsFollowupAccess().getIntentIntentIDTerminalRuleCall_1_0_1(), semanticObject.eGet(VoicePackage.Literals.IS_FOLLOWUP__INTENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     agent+=Agent+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QuestionEntity returns QuestionEntity
	 *
	 * Constraint:
	 *     withEntity=Reference
	 */
	protected void sequence_QuestionEntity(ISerializationContext context, QuestionEntity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VoicePackage.Literals.QUESTION_ENTITY__WITH_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VoicePackage.Literals.QUESTION_ENTITY__WITH_ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0(), semanticObject.getWithEntity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Question returns Question
	 *
	 * Constraint:
	 *     (extendedQuestion=[ReferenceObject|ID] | (questionEntity=QuestionEntity prompt=STRING))
	 */
	protected void sequence_Question(ISerializationContext context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] | sysvar=Sysvariable)
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sysvariable returns Sysvariable
	 *
	 * Constraint:
	 *     (name=ID? defaultValue=DefaultValues)
	 */
	protected void sequence_Sysvariable(ISerializationContext context, Sysvariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TrainingRef returns TrainingRef
	 *
	 * Constraint:
	 *     (phrase=STRING declarations=Declaration)
	 */
	protected void sequence_TrainingRef(ISerializationContext context, TrainingRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VoicePackage.Literals.TRAINING_REF__PHRASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VoicePackage.Literals.TRAINING_REF__PHRASE));
			if (transientValues.isValueTransient(semanticObject, VoicePackage.Literals.TRAINING_REF__DECLARATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VoicePackage.Literals.TRAINING_REF__DECLARATIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0(), semanticObject.getPhrase());
		feeder.accept(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_0(), semanticObject.getDeclarations());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Training returns Training
	 *
	 * Constraint:
	 *     trainingref+=TrainingRef+
	 */
	protected void sequence_Training(ISerializationContext context, Training semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
