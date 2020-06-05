/*
 * generated by Xtext 2.21.0
 */
grammar InternalVoice;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.VoiceGrammarAccess;

}
@parser::members {
	private VoiceGrammarAccess grammarAccess;

	public void setGrammarAccess(VoiceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getAgentAssignment()); }
		(rule__Model__AgentAssignment)*
		{ after(grammarAccess.getModelAccess().getAgentAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAgent
entryRuleAgent
:
{ before(grammarAccess.getAgentRule()); }
	 ruleAgent
{ after(grammarAccess.getAgentRule()); } 
	 EOF 
;

// Rule Agent
ruleAgent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAgentAccess().getAlternatives()); }
		(rule__Agent__Alternatives)
		{ after(grammarAccess.getAgentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntent
entryRuleIntent
:
{ before(grammarAccess.getIntentRule()); }
	 ruleIntent
{ after(grammarAccess.getIntentRule()); } 
	 EOF 
;

// Rule Intent
ruleIntent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntentAccess().getGroup()); }
		(rule__Intent__Group__0)
		{ after(grammarAccess.getIntentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuestion
entryRuleQuestion
:
{ before(grammarAccess.getQuestionRule()); }
	 ruleQuestion
{ after(grammarAccess.getQuestionRule()); } 
	 EOF 
;

// Rule Question
ruleQuestion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuestionAccess().getGroup()); }
		(rule__Question__Group__0)
		{ after(grammarAccess.getQuestionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuestionEntity
entryRuleQuestionEntity
:
{ before(grammarAccess.getQuestionEntityRule()); }
	 ruleQuestionEntity
{ after(grammarAccess.getQuestionEntityRule()); } 
	 EOF 
;

// Rule QuestionEntity
ruleQuestionEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); }
		(rule__QuestionEntity__WithEntityAssignment)
		{ after(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTraining
entryRuleTraining
:
{ before(grammarAccess.getTrainingRule()); }
	 ruleTraining
{ after(grammarAccess.getTrainingRule()); } 
	 EOF 
;

// Rule Training
ruleTraining 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrainingAccess().getGroup()); }
		(rule__Training__Group__0)
		{ after(grammarAccess.getTrainingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTrainingRef
entryRuleTrainingRef
:
{ before(grammarAccess.getTrainingRefRule()); }
	 ruleTrainingRef
{ after(grammarAccess.getTrainingRefRule()); } 
	 EOF 
;

// Rule TrainingRef
ruleTrainingRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTrainingRefAccess().getGroup()); }
		(rule__TrainingRef__Group__0)
		{ after(grammarAccess.getTrainingRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaration
entryRuleDeclaration
:
{ before(grammarAccess.getDeclarationRule()); }
	 ruleDeclaration
{ after(grammarAccess.getDeclarationRule()); } 
	 EOF 
;

// Rule Declaration
ruleDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationAccess().getGroup()); }
		(rule__Declaration__Group__0)
		{ after(grammarAccess.getDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityExample
entryRuleEntityExample
:
{ before(grammarAccess.getEntityExampleRule()); }
	 ruleEntityExample
{ after(grammarAccess.getEntityExampleRule()); } 
	 EOF 
;

// Rule EntityExample
ruleEntityExample 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityExampleAccess().getGroup()); }
		(rule__EntityExample__Group__0)
		{ after(grammarAccess.getEntityExampleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIsFollowup
entryRuleIsFollowup
:
{ before(grammarAccess.getIsFollowupRule()); }
	 ruleIsFollowup
{ after(grammarAccess.getIsFollowupRule()); } 
	 EOF 
;

// Rule IsFollowup
ruleIsFollowup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsFollowupAccess().getGroup()); }
		(rule__IsFollowup__Group__0)
		{ after(grammarAccess.getIsFollowupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSysvariable
entryRuleSysvariable
:
{ before(grammarAccess.getSysvariableRule()); }
	 ruleSysvariable
{ after(grammarAccess.getSysvariableRule()); } 
	 EOF 
;

// Rule Sysvariable
ruleSysvariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSysvariableAccess().getValueAssignment()); }
		(rule__Sysvariable__ValueAssignment)
		{ after(grammarAccess.getSysvariableAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReference
entryRuleReference
:
{ before(grammarAccess.getReferenceRule()); }
	 ruleReference
{ after(grammarAccess.getReferenceRule()); } 
	 EOF 
;

// Rule Reference
ruleReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferenceAccess().getAlternatives()); }
		(rule__Reference__Alternatives)
		{ after(grammarAccess.getReferenceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); }
		ruleEntity
		{ after(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); }
		ruleIntent
		{ after(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TrainingRef__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrainingRefAccess().getSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTrainingRefAccess().getSTRINGTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1_1()); }
		(rule__TrainingRef__DeclarationsAssignment_1_1)
		{ after(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sysvariable__ValueAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); }
		'number'
		{ after(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); }
		'date-time'
		{ after(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); }
		'date'
		{ after(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); }
		'duration'
		{ after(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); }
		'address'
		{ after(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); }
		'email'
		{ after(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); }
		'phone-number'
		{ after(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); }
		'date-period'
		{ after(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); }
		'time-period'
		{ after(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); }
		'url'
		{ after(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); }
		'any'
		{ after(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); }
		'color'
		{ after(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); }
	)
	|
	(
		{ before(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); }
		'language'
		{ after(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getEntityAssignment_0()); }
		(rule__Reference__EntityAssignment_0)
		{ after(grammarAccess.getReferenceAccess().getEntityAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); }
		(rule__Reference__SysvarAssignment_1)
		{ after(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__0__Impl
	rule__Intent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getIntentKeyword_0()); }
	'Intent'
	{ after(grammarAccess.getIntentAccess().getIntentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__1__Impl
	rule__Intent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getNameAssignment_1()); }
	(rule__Intent__NameAssignment_1)
	{ after(grammarAccess.getIntentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__2__Impl
	rule__Intent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getGroup_2()); }
	(rule__Intent__Group_2__0)?
	{ after(grammarAccess.getIntentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__3__Impl
	rule__Intent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getIsFollowupAssignment_3()); }
	(rule__Intent__IsFollowupAssignment_3)?
	{ after(grammarAccess.getIntentAccess().getIsFollowupAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__4__Impl
	rule__Intent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); }
		(rule__Intent__QuestionAssignment_4)
		{ after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); }
	)
	(
		{ before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); }
		(rule__Intent__QuestionAssignment_4)*
		{ after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getTrainingAssignment_5()); }
	(rule__Intent__TrainingAssignment_5)
	{ after(grammarAccess.getIntentAccess().getTrainingAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Intent__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group_2__0__Impl
	rule__Intent__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getColonKeyword_2_0()); }
	':'
	{ after(grammarAccess.getIntentAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); }
	(rule__Intent__ZuperAssignment_2_1)
	{ after(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'Entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); }
	'['
	{ after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getEntityAccess().getExampleAssignment_3()); }
		(rule__Entity__ExampleAssignment_3)
		{ after(grammarAccess.getEntityAccess().getExampleAssignment_3()); }
	)
	(
		{ before(grammarAccess.getEntityAccess().getExampleAssignment_3()); }
		(rule__Entity__ExampleAssignment_3)*
		{ after(grammarAccess.getEntityAccess().getExampleAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); }
	']'
	{ after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__0__Impl
	rule__Question__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_0()); }
	(rule__Question__QuestionEntityAssignment_0)
	{ after(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__1__Impl
	rule__Question__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getWithKeyword_1()); }
	'with'
	{ after(grammarAccess.getQuestionAccess().getWithKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getPromptAssignment_2()); }
	(rule__Question__PromptAssignment_2)
	{ after(grammarAccess.getQuestionAccess().getPromptAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Training__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Training__Group__0__Impl
	rule__Training__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Training__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrainingAccess().getTrainingAction_0()); }
	()
	{ after(grammarAccess.getTrainingAccess().getTrainingAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Training__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Training__Group__1__Impl
	rule__Training__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Training__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); }
	'Training:'
	{ after(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Training__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Training__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Training__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); }
		(rule__Training__TrainingrefAssignment_2)
		{ after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); }
	)
	(
		{ before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); }
		(rule__Training__TrainingrefAssignment_2)*
		{ after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TrainingRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TrainingRef__Group__0__Impl
	rule__TrainingRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TrainingRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrainingRefAccess().getTrainingRefSimpleAction_0()); }
	()
	{ after(grammarAccess.getTrainingRefAccess().getTrainingRefSimpleAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TrainingRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TrainingRef__Group__1__Impl
	rule__TrainingRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TrainingRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTrainingRefAccess().getAlternatives_1()); }
		(rule__TrainingRef__Alternatives_1)
		{ after(grammarAccess.getTrainingRefAccess().getAlternatives_1()); }
	)
	(
		{ before(grammarAccess.getTrainingRefAccess().getAlternatives_1()); }
		(rule__TrainingRef__Alternatives_1)*
		{ after(grammarAccess.getTrainingRefAccess().getAlternatives_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TrainingRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TrainingRef__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TrainingRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Declaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declaration__Group__0__Impl
	rule__Declaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declaration__Group__1__Impl
	rule__Declaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); }
	(rule__Declaration__TrainingstringAssignment_1)
	{ after(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declaration__Group__2__Impl
	rule__Declaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationAccess().getIsKeyword_2()); }
	'is'
	{ after(grammarAccess.getDeclarationAccess().getIsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declaration__Group__3__Impl
	rule__Declaration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); }
	(rule__Declaration__ReferenceAssignment_3)
	{ after(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declaration__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityExample__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExample__Group__0__Impl
	rule__EntityExample__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExample__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); }
	(rule__EntityExample__NameAssignment_0)
	{ after(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExample__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExample__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExample__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); }
	(',')?
	{ after(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IsFollowup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsFollowup__Group__0__Impl
	rule__IsFollowup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IsFollowup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0()); }
	'IsFollowup'
	{ after(grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsFollowup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsFollowup__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IsFollowup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsFollowupAccess().getIntentAssignment_1()); }
	(rule__IsFollowup__IntentAssignment_1)
	{ after(grammarAccess.getIsFollowupAccess().getIntentAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__AgentAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); }
		ruleAgent
		{ after(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__ZuperAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getIntentAccess().getZuperIntentIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIntentAccess().getZuperIntentIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__IsFollowupAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getIsFollowupIsFollowupParserRuleCall_3_0()); }
		ruleIsFollowup
		{ after(grammarAccess.getIntentAccess().getIsFollowupIsFollowupParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__QuestionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_4_0()); }
		ruleQuestion
		{ after(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__TrainingAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0()); }
		ruleTraining
		{ after(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__ExampleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); }
		ruleEntityExample
		{ after(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__QuestionEntityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0()); }
		ruleQuestionEntity
		{ after(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__PromptAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QuestionEntity__WithEntityAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); }
		ruleReference
		{ after(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Training__TrainingrefAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); }
		ruleTrainingRef
		{ after(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TrainingRef__DeclarationsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_1_0()); }
		ruleDeclaration
		{ after(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__TrainingstringAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__ReferenceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); }
		ruleReference
		{ after(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExample__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsFollowup__IntentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0()); }
		(
			{ before(grammarAccess.getIsFollowupAccess().getIntentIntentIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIsFollowupAccess().getIntentIntentIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sysvariable__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); }
		(rule__Sysvariable__ValueAlternatives_0)
		{ after(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__EntityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); }
		(
			{ before(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__SysvarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); }
		ruleSysvariable
		{ after(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
