/*
 * generated by Xtext 2.21.0
 */
grammar InternalVoice;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.VoiceGrammarAccess;

}

@parser::members {

 	private VoiceGrammarAccess grammarAccess;

    public InternalVoiceParser(TokenStream input, VoiceGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected VoiceGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0());
			}
			lv_agent_0_0=ruleAgent
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"agent",
					lv_agent_0_0,
					"org.xtext.example.mydsl.Voice.Agent");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAgent
entryRuleAgent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAgentRule()); }
	iv_ruleAgent=ruleAgent
	{ $current=$iv_ruleAgent.current; }
	EOF;

// Rule Agent
ruleAgent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAgentAccess().getEntityParserRuleCall_0());
		}
		this_Entity_0=ruleEntity
		{
			$current = $this_Entity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAgentAccess().getIntentParserRuleCall_1());
		}
		this_Intent_1=ruleIntent
		{
			$current = $this_Intent_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntent
entryRuleIntent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntentRule()); }
	iv_ruleIntent=ruleIntent
	{ $current=$iv_ruleIntent.current; }
	EOF;

// Rule Intent
ruleIntent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Intent'
		{
			newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getIntentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIntentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getIntentAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIntentRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getIntentAccess().getIsFollowupIsFollowupParserRuleCall_3_0());
				}
				lv_isFollowup_4_0=ruleIsFollowup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntentRule());
					}
					set(
						$current,
						"isFollowup",
						lv_isFollowup_4_0,
						"org.xtext.example.mydsl.Voice.IsFollowup");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getIntentAccess().getQuestionsQuestionReferenceParserRuleCall_4_0());
				}
				lv_questions_5_0=ruleQuestionReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntentRule());
					}
					add(
						$current,
						"questions",
						lv_questions_5_0,
						"org.xtext.example.mydsl.Voice.QuestionReference");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0());
				}
				lv_training_6_0=ruleTraining
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntentRule());
					}
					set(
						$current,
						"training",
						lv_training_6_0,
						"org.xtext.example.mydsl.Voice.Training");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntityAccess().getEntityAction_0(),
					$current);
			}
		)
		otherlv_1='Entity'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='['
		{
			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_4_0());
				}
				lv_example_4_0=ruleEntityExample
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"example",
						lv_example_4_0,
						"org.xtext.example.mydsl.Voice.EntityExample");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5=']'
		{
			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleQuestionReference
entryRuleQuestionReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuestionReferenceRule()); }
	iv_ruleQuestionReference=ruleQuestionReference
	{ $current=$iv_ruleQuestionReference.current; }
	EOF;

// Rule QuestionReference
ruleQuestionReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionParserRuleCall_0_0());
				}
				lv_question_0_0=ruleQuestion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionReferenceRule());
					}
					set(
						$current,
						"question",
						lv_question_0_0,
						"org.xtext.example.mydsl.Voice.Question");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_1='get'
			{
				newLeafNode(otherlv_1, grammarAccess.getQuestionReferenceAccess().getGetKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuestionReferenceRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getQuestionReferenceAccess().getQuestionReferenceQuestionCrossReference_1_1_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	iv_ruleQuestion=ruleQuestion
	{ $current=$iv_ruleQuestion.current; }
	EOF;

// Rule Question
ruleQuestion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_0=RULE_ID
					{
						newLeafNode(lv_name_0_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuestionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getEqualsSignKeyword_0_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_1_0());
				}
				lv_questionEntity_2_0=ruleQuestionEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					set(
						$current,
						"questionEntity",
						lv_questionEntity_2_0,
						"org.xtext.example.mydsl.Voice.QuestionEntity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='with'
		{
			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getWithKeyword_2());
		}
		(
			(
				lv_prompt_4_0=RULE_STRING
				{
					newLeafNode(lv_prompt_4_0, grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuestionRule());
					}
					setWithLastConsumed(
						$current,
						"prompt",
						lv_prompt_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleQuestionEntity
entryRuleQuestionEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuestionEntityRule()); }
	iv_ruleQuestionEntity=ruleQuestionEntity
	{ $current=$iv_ruleQuestionEntity.current; }
	EOF;

// Rule QuestionEntity
ruleQuestionEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0());
			}
			lv_withEntity_0_0=ruleReference
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getQuestionEntityRule());
				}
				set(
					$current,
					"withEntity",
					lv_withEntity_0_0,
					"org.xtext.example.mydsl.Voice.Reference");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0());
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0());
				}
				lv_sysvar_1_0=ruleSysvariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceRule());
					}
					set(
						$current,
						"sysvar",
						lv_sysvar_1_0,
						"org.xtext.example.mydsl.Voice.Sysvariable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTraining
entryRuleTraining returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrainingRule()); }
	iv_ruleTraining=ruleTraining
	{ $current=$iv_ruleTraining.current; }
	EOF;

// Rule Training
ruleTraining returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTrainingAccess().getTrainingAction_0(),
					$current);
			}
		)
		otherlv_1='Training:'
		{
			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0());
				}
				lv_trainingref_2_0=ruleTrainingRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrainingRule());
					}
					add(
						$current,
						"trainingref",
						lv_trainingref_2_0,
						"org.xtext.example.mydsl.Voice.TrainingRef");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleTrainingRef
entryRuleTrainingRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrainingRefRule()); }
	iv_ruleTrainingRef=ruleTrainingRef
	{ $current=$iv_ruleTrainingRef.current; }
	EOF;

// Rule TrainingRef
ruleTrainingRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_phrase_0_0=RULE_STRING
				{
					newLeafNode(lv_phrase_0_0, grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTrainingRefRule());
					}
					setWithLastConsumed(
						$current,
						"phrase",
						lv_phrase_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_0());
				}
				lv_declarations_1_0=ruleDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrainingRefRule());
					}
					set(
						$current,
						"declarations",
						lv_declarations_1_0,
						"org.xtext.example.mydsl.Voice.Declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getTrainingRefAccess().getFullStopKeyword_2());
		}
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_trainingstring_1_0=RULE_STRING
				{
					newLeafNode(lv_trainingstring_1_0, grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"trainingstring",
						lv_trainingstring_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getIsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0());
				}
				lv_reference_3_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclarationRule());
					}
					set(
						$current,
						"reference",
						lv_reference_3_0,
						"org.xtext.example.mydsl.Voice.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleEntityExample
entryRuleEntityExample returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityExampleRule()); }
	iv_ruleEntityExample=ruleEntityExample
	{ $current=$iv_ruleEntityExample.current; }
	EOF;

// Rule EntityExample
ruleEntityExample returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityExampleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getEntityExampleAccess().getCommaKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleIsFollowup
entryRuleIsFollowup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIsFollowupRule()); }
	iv_ruleIsFollowup=ruleIsFollowup
	{ $current=$iv_ruleIsFollowup.current; }
	EOF;

// Rule IsFollowup
ruleIsFollowup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='IsFollowup'
		{
			newLeafNode(otherlv_0, grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsFollowupRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleSysvariable
entryRuleSysvariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSysvariableRule()); }
	iv_ruleSysvariable=ruleSysvariable
	{ $current=$iv_ruleSysvariable.current; }
	EOF;

// Rule Sysvariable
ruleSysvariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSysvariableAccess().getSysvariableAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_defaultValue_1_1='number'
					{
						newLeafNode(lv_defaultValue_1_1, grammarAccess.getSysvariableAccess().getDefaultValueNumberKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_1, null);
					}
					    |
					lv_defaultValue_1_2='date-time'
					{
						newLeafNode(lv_defaultValue_1_2, grammarAccess.getSysvariableAccess().getDefaultValueDateTimeKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_2, null);
					}
					    |
					lv_defaultValue_1_3='date'
					{
						newLeafNode(lv_defaultValue_1_3, grammarAccess.getSysvariableAccess().getDefaultValueDateKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_3, null);
					}
					    |
					lv_defaultValue_1_4='duration'
					{
						newLeafNode(lv_defaultValue_1_4, grammarAccess.getSysvariableAccess().getDefaultValueDurationKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_4, null);
					}
					    |
					lv_defaultValue_1_5='address'
					{
						newLeafNode(lv_defaultValue_1_5, grammarAccess.getSysvariableAccess().getDefaultValueAddressKeyword_1_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_5, null);
					}
					    |
					lv_defaultValue_1_6='email'
					{
						newLeafNode(lv_defaultValue_1_6, grammarAccess.getSysvariableAccess().getDefaultValueEmailKeyword_1_0_5());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_6, null);
					}
					    |
					lv_defaultValue_1_7='phone-number'
					{
						newLeafNode(lv_defaultValue_1_7, grammarAccess.getSysvariableAccess().getDefaultValuePhoneNumberKeyword_1_0_6());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_7, null);
					}
					    |
					lv_defaultValue_1_8='date-period'
					{
						newLeafNode(lv_defaultValue_1_8, grammarAccess.getSysvariableAccess().getDefaultValueDatePeriodKeyword_1_0_7());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_8, null);
					}
					    |
					lv_defaultValue_1_9='time-period'
					{
						newLeafNode(lv_defaultValue_1_9, grammarAccess.getSysvariableAccess().getDefaultValueTimePeriodKeyword_1_0_8());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_9, null);
					}
					    |
					lv_defaultValue_1_10='url'
					{
						newLeafNode(lv_defaultValue_1_10, grammarAccess.getSysvariableAccess().getDefaultValueUrlKeyword_1_0_9());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_10, null);
					}
					    |
					lv_defaultValue_1_11='any'
					{
						newLeafNode(lv_defaultValue_1_11, grammarAccess.getSysvariableAccess().getDefaultValueAnyKeyword_1_0_10());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_11, null);
					}
					    |
					lv_defaultValue_1_12='color'
					{
						newLeafNode(lv_defaultValue_1_12, grammarAccess.getSysvariableAccess().getDefaultValueColorKeyword_1_0_11());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_12, null);
					}
					    |
					lv_defaultValue_1_13='language'
					{
						newLeafNode(lv_defaultValue_1_13, grammarAccess.getSysvariableAccess().getDefaultValueLanguageKeyword_1_0_12());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSysvariableRule());
						}
						setWithLastConsumed($current, "defaultValue", lv_defaultValue_1_13, null);
					}
				)
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
