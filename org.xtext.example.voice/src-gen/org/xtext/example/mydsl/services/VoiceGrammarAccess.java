/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class VoiceGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Model");
		private final Assignment cAgentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAgentAgentParserRuleCall_0 = (RuleCall)cAgentAssignment.eContents().get(0);
		
		//Model:
		//	agent+=Agent*;
		@Override public ParserRule getRule() { return rule; }
		
		//agent+=Agent*
		public Assignment getAgentAssignment() { return cAgentAssignment; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_0() { return cAgentAgentParserRuleCall_0; }
	}
	public class AgentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Agent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Agent:
		//	Entity | Intent;
		@Override public ParserRule getRule() { return rule; }
		
		//Entity | Intent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_0() { return cEntityParserRuleCall_0; }
		
		//Intent
		public RuleCall getIntentParserRuleCall_1() { return cIntentParserRuleCall_1; }
	}
	public class IntentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Intent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cZuperAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cZuperIntentCrossReference_2_1_0 = (CrossReference)cZuperAssignment_2_1.eContents().get(0);
		private final RuleCall cZuperIntentIDTerminalRuleCall_2_1_0_1 = (RuleCall)cZuperIntentCrossReference_2_1_0.eContents().get(1);
		private final Assignment cIsFollowupAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIsFollowupIsFollowupParserRuleCall_3_0 = (RuleCall)cIsFollowupAssignment_3.eContents().get(0);
		private final Assignment cQuestionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cQuestionQuestionParserRuleCall_4_0 = (RuleCall)cQuestionAssignment_4.eContents().get(0);
		private final Assignment cTrainingAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTrainingTrainingParserRuleCall_5_0 = (RuleCall)cTrainingAssignment_5.eContents().get(0);
		
		//Intent:
		//	'Intent' name=ID ('extends' zuper=[Intent])? isFollowup=IsFollowup? question+=Question+ training=Training;
		@Override public ParserRule getRule() { return rule; }
		
		//'Intent' name=ID ('extends' zuper=[Intent])? isFollowup=IsFollowup? question+=Question+ training=Training
		public Group getGroup() { return cGroup; }
		
		//'Intent'
		public Keyword getIntentKeyword_0() { return cIntentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' zuper=[Intent])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//zuper=[Intent]
		public Assignment getZuperAssignment_2_1() { return cZuperAssignment_2_1; }
		
		//[Intent]
		public CrossReference getZuperIntentCrossReference_2_1_0() { return cZuperIntentCrossReference_2_1_0; }
		
		//ID
		public RuleCall getZuperIntentIDTerminalRuleCall_2_1_0_1() { return cZuperIntentIDTerminalRuleCall_2_1_0_1; }
		
		//isFollowup=IsFollowup?
		public Assignment getIsFollowupAssignment_3() { return cIsFollowupAssignment_3; }
		
		//IsFollowup
		public RuleCall getIsFollowupIsFollowupParserRuleCall_3_0() { return cIsFollowupIsFollowupParserRuleCall_3_0; }
		
		//question+=Question+
		public Assignment getQuestionAssignment_4() { return cQuestionAssignment_4; }
		
		//Question
		public RuleCall getQuestionQuestionParserRuleCall_4_0() { return cQuestionQuestionParserRuleCall_4_0; }
		
		//training=Training
		public Assignment getTrainingAssignment_5() { return cTrainingAssignment_5; }
		
		//Training
		public RuleCall getTrainingTrainingParserRuleCall_5_0() { return cTrainingTrainingParserRuleCall_5_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExampleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExampleEntityExampleParserRuleCall_3_0 = (RuleCall)cExampleAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity:
		//	'Entity' name=ID '[' example+=EntityExample+ ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'Entity' name=ID '[' example+=EntityExample+ ']'
		public Group getGroup() { return cGroup; }
		
		//'Entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//example+=EntityExample+
		public Assignment getExampleAssignment_3() { return cExampleAssignment_3; }
		
		//EntityExample
		public RuleCall getExampleEntityExampleParserRuleCall_3_0() { return cExampleEntityExampleParserRuleCall_3_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cQuestionEntityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cQuestionEntityQuestionEntityParserRuleCall_0_0 = (RuleCall)cQuestionEntityAssignment_0.eContents().get(0);
		private final Keyword cWithKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPromptAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPromptSTRINGTerminalRuleCall_2_0 = (RuleCall)cPromptAssignment_2.eContents().get(0);
		
		//Question:
		//	questionEntity=QuestionEntity 'with' prompt=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//questionEntity=QuestionEntity 'with' prompt=STRING
		public Group getGroup() { return cGroup; }
		
		//questionEntity=QuestionEntity
		public Assignment getQuestionEntityAssignment_0() { return cQuestionEntityAssignment_0; }
		
		//QuestionEntity
		public RuleCall getQuestionEntityQuestionEntityParserRuleCall_0_0() { return cQuestionEntityQuestionEntityParserRuleCall_0_0; }
		
		//'with'
		public Keyword getWithKeyword_1() { return cWithKeyword_1; }
		
		//prompt=STRING
		public Assignment getPromptAssignment_2() { return cPromptAssignment_2; }
		
		//STRING
		public RuleCall getPromptSTRINGTerminalRuleCall_2_0() { return cPromptSTRINGTerminalRuleCall_2_0; }
	}
	public class QuestionEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.QuestionEntity");
		private final Assignment cWithEntityAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cWithEntityReferenceParserRuleCall_0 = (RuleCall)cWithEntityAssignment.eContents().get(0);
		
		//QuestionEntity:
		//	withEntity=Reference;
		@Override public ParserRule getRule() { return rule; }
		
		//withEntity=Reference
		public Assignment getWithEntityAssignment() { return cWithEntityAssignment; }
		
		//Reference
		public RuleCall getWithEntityReferenceParserRuleCall_0() { return cWithEntityReferenceParserRuleCall_0; }
	}
	public class TrainingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Training");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTrainingAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTrainingKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTrainingrefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTrainingrefTrainingRefParserRuleCall_2_0 = (RuleCall)cTrainingrefAssignment_2.eContents().get(0);
		
		//Training:
		//	{Training} 'Training:' trainingref+=TrainingRef+;
		@Override public ParserRule getRule() { return rule; }
		
		//{Training} 'Training:' trainingref+=TrainingRef+
		public Group getGroup() { return cGroup; }
		
		//{Training}
		public Action getTrainingAction_0() { return cTrainingAction_0; }
		
		//'Training:'
		public Keyword getTrainingKeyword_1() { return cTrainingKeyword_1; }
		
		//trainingref+=TrainingRef+
		public Assignment getTrainingrefAssignment_2() { return cTrainingrefAssignment_2; }
		
		//TrainingRef
		public RuleCall getTrainingrefTrainingRefParserRuleCall_2_0() { return cTrainingrefTrainingRefParserRuleCall_2_0; }
	}
	public class TrainingRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.TrainingRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPhraseAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPhraseSTRINGTerminalRuleCall_0_0 = (RuleCall)cPhraseAssignment_0.eContents().get(0);
		private final Assignment cDeclarationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDeclarationsDeclarationParserRuleCall_1_0 = (RuleCall)cDeclarationsAssignment_1.eContents().get(0);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//TrainingRef:
		//	phrase=STRING declarations=Declaration '.';
		@Override public ParserRule getRule() { return rule; }
		
		//phrase=STRING declarations=Declaration '.'
		public Group getGroup() { return cGroup; }
		
		//phrase=STRING
		public Assignment getPhraseAssignment_0() { return cPhraseAssignment_0; }
		
		//STRING
		public RuleCall getPhraseSTRINGTerminalRuleCall_0_0() { return cPhraseSTRINGTerminalRuleCall_0_0; }
		
		//declarations=Declaration
		public Assignment getDeclarationsAssignment_1() { return cDeclarationsAssignment_1; }
		
		//Declaration
		public RuleCall getDeclarationsDeclarationParserRuleCall_1_0() { return cDeclarationsDeclarationParserRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
	}
	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Declaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTrainingstringAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTrainingstringSTRINGTerminalRuleCall_1_0 = (RuleCall)cTrainingstringAssignment_1.eContents().get(0);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cReferenceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cReferenceReferenceParserRuleCall_3_0 = (RuleCall)cReferenceAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Declaration:
		//	'(' trainingstring=STRING 'is' reference=Reference ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' trainingstring=STRING 'is' reference=Reference ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//trainingstring=STRING
		public Assignment getTrainingstringAssignment_1() { return cTrainingstringAssignment_1; }
		
		//STRING
		public RuleCall getTrainingstringSTRINGTerminalRuleCall_1_0() { return cTrainingstringSTRINGTerminalRuleCall_1_0; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//reference=Reference
		public Assignment getReferenceAssignment_3() { return cReferenceAssignment_3; }
		
		//Reference
		public RuleCall getReferenceReferenceParserRuleCall_3_0() { return cReferenceReferenceParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class EntityExampleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.EntityExample");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//EntityExample:
		//	name=ID ','?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ','?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//','?
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
	}
	public class IsFollowupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.IsFollowup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIsFollowupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIntentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cIntentIntentCrossReference_1_0 = (CrossReference)cIntentAssignment_1.eContents().get(0);
		private final RuleCall cIntentIntentIDTerminalRuleCall_1_0_1 = (RuleCall)cIntentIntentCrossReference_1_0.eContents().get(1);
		
		//IsFollowup:
		//	'IsFollowup' intent=[Intent];
		@Override public ParserRule getRule() { return rule; }
		
		//'IsFollowup' intent=[Intent]
		public Group getGroup() { return cGroup; }
		
		//'IsFollowup'
		public Keyword getIsFollowupKeyword_0() { return cIsFollowupKeyword_0; }
		
		//intent=[Intent]
		public Assignment getIntentAssignment_1() { return cIntentAssignment_1; }
		
		//[Intent]
		public CrossReference getIntentIntentCrossReference_1_0() { return cIntentIntentCrossReference_1_0; }
		
		//ID
		public RuleCall getIntentIntentIDTerminalRuleCall_1_0_1() { return cIntentIntentIDTerminalRuleCall_1_0_1; }
	}
	public class SysvariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Sysvariable");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cValueAlternatives_0 = (Alternatives)cValueAssignment.eContents().get(0);
		private final Keyword cValueNumberKeyword_0_0 = (Keyword)cValueAlternatives_0.eContents().get(0);
		private final Keyword cValueDateTimeKeyword_0_1 = (Keyword)cValueAlternatives_0.eContents().get(1);
		private final Keyword cValueDateKeyword_0_2 = (Keyword)cValueAlternatives_0.eContents().get(2);
		private final Keyword cValueDurationKeyword_0_3 = (Keyword)cValueAlternatives_0.eContents().get(3);
		private final Keyword cValueAddressKeyword_0_4 = (Keyword)cValueAlternatives_0.eContents().get(4);
		private final Keyword cValueEmailKeyword_0_5 = (Keyword)cValueAlternatives_0.eContents().get(5);
		private final Keyword cValuePhoneNumberKeyword_0_6 = (Keyword)cValueAlternatives_0.eContents().get(6);
		private final Keyword cValueDatePeriodKeyword_0_7 = (Keyword)cValueAlternatives_0.eContents().get(7);
		private final Keyword cValueTimePeriodKeyword_0_8 = (Keyword)cValueAlternatives_0.eContents().get(8);
		private final Keyword cValueUrlKeyword_0_9 = (Keyword)cValueAlternatives_0.eContents().get(9);
		private final Keyword cValueAnyKeyword_0_10 = (Keyword)cValueAlternatives_0.eContents().get(10);
		private final Keyword cValueColorKeyword_0_11 = (Keyword)cValueAlternatives_0.eContents().get(11);
		private final Keyword cValueLanguageKeyword_0_12 = (Keyword)cValueAlternatives_0.eContents().get(12);
		
		//Sysvariable:
		//	value=('number' | 'date-time' | 'date' | 'duration' | 'address' | 'email' | 'phone-number' | 'date-period'
		//	| 'time-period' | 'url' | 'any' | 'color' | 'language');
		@Override public ParserRule getRule() { return rule; }
		
		//value=('number' | 'date-time' | 'date' | 'duration' | 'address' | 'email' | 'phone-number' | 'date-period' |
		//'time-period' | 'url' | 'any' | 'color' | 'language')
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//('number' | 'date-time' | 'date' | 'duration' | 'address' | 'email' | 'phone-number' | 'date-period' | 'time-period' |
		//'url' | 'any' | 'color' | 'language')
		public Alternatives getValueAlternatives_0() { return cValueAlternatives_0; }
		
		//'number'
		public Keyword getValueNumberKeyword_0_0() { return cValueNumberKeyword_0_0; }
		
		//'date-time'
		public Keyword getValueDateTimeKeyword_0_1() { return cValueDateTimeKeyword_0_1; }
		
		//'date'
		public Keyword getValueDateKeyword_0_2() { return cValueDateKeyword_0_2; }
		
		//'duration'
		public Keyword getValueDurationKeyword_0_3() { return cValueDurationKeyword_0_3; }
		
		//'address'
		public Keyword getValueAddressKeyword_0_4() { return cValueAddressKeyword_0_4; }
		
		//'email'
		public Keyword getValueEmailKeyword_0_5() { return cValueEmailKeyword_0_5; }
		
		//'phone-number'
		public Keyword getValuePhoneNumberKeyword_0_6() { return cValuePhoneNumberKeyword_0_6; }
		
		//'date-period'
		public Keyword getValueDatePeriodKeyword_0_7() { return cValueDatePeriodKeyword_0_7; }
		
		//'time-period'
		public Keyword getValueTimePeriodKeyword_0_8() { return cValueTimePeriodKeyword_0_8; }
		
		//'url'
		public Keyword getValueUrlKeyword_0_9() { return cValueUrlKeyword_0_9; }
		
		//'any'
		public Keyword getValueAnyKeyword_0_10() { return cValueAnyKeyword_0_10; }
		
		//'color'
		public Keyword getValueColorKeyword_0_11() { return cValueColorKeyword_0_11; }
		
		//'language'
		public Keyword getValueLanguageKeyword_0_12() { return cValueLanguageKeyword_0_12; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Voice.Reference");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cEntityAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cEntityEntityCrossReference_0_0 = (CrossReference)cEntityAssignment_0.eContents().get(0);
		private final RuleCall cEntityEntityIDTerminalRuleCall_0_0_1 = (RuleCall)cEntityEntityCrossReference_0_0.eContents().get(1);
		private final Assignment cSysvarAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cSysvarSysvariableParserRuleCall_1_0 = (RuleCall)cSysvarAssignment_1.eContents().get(0);
		
		//Reference:
		//	entity=[Entity] | sysvar=Sysvariable;
		@Override public ParserRule getRule() { return rule; }
		
		//entity=[Entity] | sysvar=Sysvariable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//entity=[Entity]
		public Assignment getEntityAssignment_0() { return cEntityAssignment_0; }
		
		//[Entity]
		public CrossReference getEntityEntityCrossReference_0_0() { return cEntityEntityCrossReference_0_0; }
		
		//ID
		public RuleCall getEntityEntityIDTerminalRuleCall_0_0_1() { return cEntityEntityIDTerminalRuleCall_0_0_1; }
		
		//sysvar=Sysvariable
		public Assignment getSysvarAssignment_1() { return cSysvarAssignment_1; }
		
		//Sysvariable
		public RuleCall getSysvarSysvariableParserRuleCall_1_0() { return cSysvarSysvariableParserRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final AgentElements pAgent;
	private final IntentElements pIntent;
	private final EntityElements pEntity;
	private final QuestionElements pQuestion;
	private final QuestionEntityElements pQuestionEntity;
	private final TrainingElements pTraining;
	private final TrainingRefElements pTrainingRef;
	private final DeclarationElements pDeclaration;
	private final EntityExampleElements pEntityExample;
	private final IsFollowupElements pIsFollowup;
	private final SysvariableElements pSysvariable;
	private final ReferenceElements pReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VoiceGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAgent = new AgentElements();
		this.pIntent = new IntentElements();
		this.pEntity = new EntityElements();
		this.pQuestion = new QuestionElements();
		this.pQuestionEntity = new QuestionEntityElements();
		this.pTraining = new TrainingElements();
		this.pTrainingRef = new TrainingRefElements();
		this.pDeclaration = new DeclarationElements();
		this.pEntityExample = new EntityExampleElements();
		this.pIsFollowup = new IsFollowupElements();
		this.pSysvariable = new SysvariableElements();
		this.pReference = new ReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.Voice".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	agent+=Agent*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Agent:
	//	Entity | Intent;
	public AgentElements getAgentAccess() {
		return pAgent;
	}
	
	public ParserRule getAgentRule() {
		return getAgentAccess().getRule();
	}
	
	//Intent:
	//	'Intent' name=ID ('extends' zuper=[Intent])? isFollowup=IsFollowup? question+=Question+ training=Training;
	public IntentElements getIntentAccess() {
		return pIntent;
	}
	
	public ParserRule getIntentRule() {
		return getIntentAccess().getRule();
	}
	
	//Entity:
	//	'Entity' name=ID '[' example+=EntityExample+ ']';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Question:
	//	questionEntity=QuestionEntity 'with' prompt=STRING;
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}
	
	//QuestionEntity:
	//	withEntity=Reference;
	public QuestionEntityElements getQuestionEntityAccess() {
		return pQuestionEntity;
	}
	
	public ParserRule getQuestionEntityRule() {
		return getQuestionEntityAccess().getRule();
	}
	
	//Training:
	//	{Training} 'Training:' trainingref+=TrainingRef+;
	public TrainingElements getTrainingAccess() {
		return pTraining;
	}
	
	public ParserRule getTrainingRule() {
		return getTrainingAccess().getRule();
	}
	
	//TrainingRef:
	//	phrase=STRING declarations=Declaration '.';
	public TrainingRefElements getTrainingRefAccess() {
		return pTrainingRef;
	}
	
	public ParserRule getTrainingRefRule() {
		return getTrainingRefAccess().getRule();
	}
	
	//Declaration:
	//	'(' trainingstring=STRING 'is' reference=Reference ')';
	public DeclarationElements getDeclarationAccess() {
		return pDeclaration;
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}
	
	//EntityExample:
	//	name=ID ','?;
	public EntityExampleElements getEntityExampleAccess() {
		return pEntityExample;
	}
	
	public ParserRule getEntityExampleRule() {
		return getEntityExampleAccess().getRule();
	}
	
	//IsFollowup:
	//	'IsFollowup' intent=[Intent];
	public IsFollowupElements getIsFollowupAccess() {
		return pIsFollowup;
	}
	
	public ParserRule getIsFollowupRule() {
		return getIsFollowupAccess().getRule();
	}
	
	//Sysvariable:
	//	value=('number' | 'date-time' | 'date' | 'duration' | 'address' | 'email' | 'phone-number' | 'date-period'
	//	| 'time-period' | 'url' | 'any' | 'color' | 'language');
	public SysvariableElements getSysvariableAccess() {
		return pSysvariable;
	}
	
	public ParserRule getSysvariableRule() {
		return getSysvariableAccess().getRule();
	}
	
	//Reference:
	//	entity=[Entity] | sysvar=Sysvariable;
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
