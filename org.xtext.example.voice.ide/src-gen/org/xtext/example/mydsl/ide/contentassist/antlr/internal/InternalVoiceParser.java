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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVoiceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'require'", "'HasFollowup'", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'", "'Intent'", "'Entity'", "'['", "']'", "'with'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'IsFollowup'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVoiceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVoiceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVoiceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVoice.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalVoice.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalVoice.g:54:1: ( ruleModel EOF )
            // InternalVoice.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVoice.g:62:1: ruleModel : ( ( rule__Model__AgentAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:66:2: ( ( ( rule__Model__AgentAssignment )* ) )
            // InternalVoice.g:67:2: ( ( rule__Model__AgentAssignment )* )
            {
            // InternalVoice.g:67:2: ( ( rule__Model__AgentAssignment )* )
            // InternalVoice.g:68:3: ( rule__Model__AgentAssignment )*
            {
             before(grammarAccess.getModelAccess().getAgentAssignment()); 
            // InternalVoice.g:69:3: ( rule__Model__AgentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=26 && LA1_0<=27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVoice.g:69:4: rule__Model__AgentAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__AgentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAgentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAgent"
    // InternalVoice.g:78:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalVoice.g:79:1: ( ruleAgent EOF )
            // InternalVoice.g:80:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalVoice.g:87:1: ruleAgent : ( ( rule__Agent__Alternatives ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:91:2: ( ( ( rule__Agent__Alternatives ) ) )
            // InternalVoice.g:92:2: ( ( rule__Agent__Alternatives ) )
            {
            // InternalVoice.g:92:2: ( ( rule__Agent__Alternatives ) )
            // InternalVoice.g:93:3: ( rule__Agent__Alternatives )
            {
             before(grammarAccess.getAgentAccess().getAlternatives()); 
            // InternalVoice.g:94:3: ( rule__Agent__Alternatives )
            // InternalVoice.g:94:4: rule__Agent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleIntent"
    // InternalVoice.g:103:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // InternalVoice.g:104:1: ( ruleIntent EOF )
            // InternalVoice.g:105:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalVoice.g:112:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:116:2: ( ( ( rule__Intent__Group__0 ) ) )
            // InternalVoice.g:117:2: ( ( rule__Intent__Group__0 ) )
            {
            // InternalVoice.g:117:2: ( ( rule__Intent__Group__0 ) )
            // InternalVoice.g:118:3: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // InternalVoice.g:119:3: ( rule__Intent__Group__0 )
            // InternalVoice.g:119:4: rule__Intent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEntity"
    // InternalVoice.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalVoice.g:129:1: ( ruleEntity EOF )
            // InternalVoice.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalVoice.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalVoice.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalVoice.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalVoice.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalVoice.g:144:3: ( rule__Entity__Group__0 )
            // InternalVoice.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQuestion"
    // InternalVoice.g:153:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalVoice.g:154:1: ( ruleQuestion EOF )
            // InternalVoice.g:155:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalVoice.g:162:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:166:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalVoice.g:167:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalVoice.g:167:2: ( ( rule__Question__Group__0 ) )
            // InternalVoice.g:168:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalVoice.g:169:3: ( rule__Question__Group__0 )
            // InternalVoice.g:169:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleQuestionEntity"
    // InternalVoice.g:178:1: entryRuleQuestionEntity : ruleQuestionEntity EOF ;
    public final void entryRuleQuestionEntity() throws RecognitionException {
        try {
            // InternalVoice.g:179:1: ( ruleQuestionEntity EOF )
            // InternalVoice.g:180:1: ruleQuestionEntity EOF
            {
             before(grammarAccess.getQuestionEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionEntity();

            state._fsp--;

             after(grammarAccess.getQuestionEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionEntity"


    // $ANTLR start "ruleQuestionEntity"
    // InternalVoice.g:187:1: ruleQuestionEntity : ( ( rule__QuestionEntity__WithEntityAssignment ) ) ;
    public final void ruleQuestionEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:191:2: ( ( ( rule__QuestionEntity__WithEntityAssignment ) ) )
            // InternalVoice.g:192:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            {
            // InternalVoice.g:192:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            // InternalVoice.g:193:3: ( rule__QuestionEntity__WithEntityAssignment )
            {
             before(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); 
            // InternalVoice.g:194:3: ( rule__QuestionEntity__WithEntityAssignment )
            // InternalVoice.g:194:4: rule__QuestionEntity__WithEntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QuestionEntity__WithEntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionEntity"


    // $ANTLR start "entryRulePrompt"
    // InternalVoice.g:203:1: entryRulePrompt : rulePrompt EOF ;
    public final void entryRulePrompt() throws RecognitionException {
        try {
            // InternalVoice.g:204:1: ( rulePrompt EOF )
            // InternalVoice.g:205:1: rulePrompt EOF
            {
             before(grammarAccess.getPromptRule()); 
            pushFollow(FOLLOW_1);
            rulePrompt();

            state._fsp--;

             after(grammarAccess.getPromptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrompt"


    // $ANTLR start "rulePrompt"
    // InternalVoice.g:212:1: rulePrompt : ( RULE_STRING ) ;
    public final void rulePrompt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:216:2: ( ( RULE_STRING ) )
            // InternalVoice.g:217:2: ( RULE_STRING )
            {
            // InternalVoice.g:217:2: ( RULE_STRING )
            // InternalVoice.g:218:3: RULE_STRING
            {
             before(grammarAccess.getPromptAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPromptAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrompt"


    // $ANTLR start "entryRuleRequired"
    // InternalVoice.g:228:1: entryRuleRequired : ruleRequired EOF ;
    public final void entryRuleRequired() throws RecognitionException {
        try {
            // InternalVoice.g:229:1: ( ruleRequired EOF )
            // InternalVoice.g:230:1: ruleRequired EOF
            {
             before(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_1);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getRequiredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // InternalVoice.g:237:1: ruleRequired : ( 'require' ) ;
    public final void ruleRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:241:2: ( ( 'require' ) )
            // InternalVoice.g:242:2: ( 'require' )
            {
            // InternalVoice.g:242:2: ( 'require' )
            // InternalVoice.g:243:3: 'require'
            {
             before(grammarAccess.getRequiredAccess().getRequireKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRequiredAccess().getRequireKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleTraining"
    // InternalVoice.g:253:1: entryRuleTraining : ruleTraining EOF ;
    public final void entryRuleTraining() throws RecognitionException {
        try {
            // InternalVoice.g:254:1: ( ruleTraining EOF )
            // InternalVoice.g:255:1: ruleTraining EOF
            {
             before(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getTrainingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalVoice.g:262:1: ruleTraining : ( ( rule__Training__Group__0 ) ) ;
    public final void ruleTraining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:266:2: ( ( ( rule__Training__Group__0 ) ) )
            // InternalVoice.g:267:2: ( ( rule__Training__Group__0 ) )
            {
            // InternalVoice.g:267:2: ( ( rule__Training__Group__0 ) )
            // InternalVoice.g:268:3: ( rule__Training__Group__0 )
            {
             before(grammarAccess.getTrainingAccess().getGroup()); 
            // InternalVoice.g:269:3: ( rule__Training__Group__0 )
            // InternalVoice.g:269:4: rule__Training__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleTrainingRef"
    // InternalVoice.g:278:1: entryRuleTrainingRef : ruleTrainingRef EOF ;
    public final void entryRuleTrainingRef() throws RecognitionException {
        try {
            // InternalVoice.g:279:1: ( ruleTrainingRef EOF )
            // InternalVoice.g:280:1: ruleTrainingRef EOF
            {
             before(grammarAccess.getTrainingRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingRef();

            state._fsp--;

             after(grammarAccess.getTrainingRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainingRef"


    // $ANTLR start "ruleTrainingRef"
    // InternalVoice.g:287:1: ruleTrainingRef : ( ( rule__TrainingRef__Group__0 ) ) ;
    public final void ruleTrainingRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:291:2: ( ( ( rule__TrainingRef__Group__0 ) ) )
            // InternalVoice.g:292:2: ( ( rule__TrainingRef__Group__0 ) )
            {
            // InternalVoice.g:292:2: ( ( rule__TrainingRef__Group__0 ) )
            // InternalVoice.g:293:3: ( rule__TrainingRef__Group__0 )
            {
             before(grammarAccess.getTrainingRefAccess().getGroup()); 
            // InternalVoice.g:294:3: ( rule__TrainingRef__Group__0 )
            // InternalVoice.g:294:4: rule__TrainingRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingRef"


    // $ANTLR start "entryRuleDeclaration"
    // InternalVoice.g:303:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalVoice.g:304:1: ( ruleDeclaration EOF )
            // InternalVoice.g:305:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalVoice.g:312:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:316:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalVoice.g:317:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalVoice.g:317:2: ( ( rule__Declaration__Group__0 ) )
            // InternalVoice.g:318:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalVoice.g:319:3: ( rule__Declaration__Group__0 )
            // InternalVoice.g:319:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntityExample"
    // InternalVoice.g:328:1: entryRuleEntityExample : ruleEntityExample EOF ;
    public final void entryRuleEntityExample() throws RecognitionException {
        try {
            // InternalVoice.g:329:1: ( ruleEntityExample EOF )
            // InternalVoice.g:330:1: ruleEntityExample EOF
            {
             before(grammarAccess.getEntityExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityExample();

            state._fsp--;

             after(grammarAccess.getEntityExampleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityExample"


    // $ANTLR start "ruleEntityExample"
    // InternalVoice.g:337:1: ruleEntityExample : ( ( rule__EntityExample__Group__0 ) ) ;
    public final void ruleEntityExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:341:2: ( ( ( rule__EntityExample__Group__0 ) ) )
            // InternalVoice.g:342:2: ( ( rule__EntityExample__Group__0 ) )
            {
            // InternalVoice.g:342:2: ( ( rule__EntityExample__Group__0 ) )
            // InternalVoice.g:343:3: ( rule__EntityExample__Group__0 )
            {
             before(grammarAccess.getEntityExampleAccess().getGroup()); 
            // InternalVoice.g:344:3: ( rule__EntityExample__Group__0 )
            // InternalVoice.g:344:4: rule__EntityExample__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityExample"


    // $ANTLR start "entryRuleHasFollowup"
    // InternalVoice.g:353:1: entryRuleHasFollowup : ruleHasFollowup EOF ;
    public final void entryRuleHasFollowup() throws RecognitionException {
        try {
            // InternalVoice.g:354:1: ( ruleHasFollowup EOF )
            // InternalVoice.g:355:1: ruleHasFollowup EOF
            {
             before(grammarAccess.getHasFollowupRule()); 
            pushFollow(FOLLOW_1);
            ruleHasFollowup();

            state._fsp--;

             after(grammarAccess.getHasFollowupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHasFollowup"


    // $ANTLR start "ruleHasFollowup"
    // InternalVoice.g:362:1: ruleHasFollowup : ( 'HasFollowup' ) ;
    public final void ruleHasFollowup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:366:2: ( ( 'HasFollowup' ) )
            // InternalVoice.g:367:2: ( 'HasFollowup' )
            {
            // InternalVoice.g:367:2: ( 'HasFollowup' )
            // InternalVoice.g:368:3: 'HasFollowup'
            {
             before(grammarAccess.getHasFollowupAccess().getHasFollowupKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHasFollowupAccess().getHasFollowupKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHasFollowup"


    // $ANTLR start "entryRuleIsFollowup"
    // InternalVoice.g:378:1: entryRuleIsFollowup : ruleIsFollowup EOF ;
    public final void entryRuleIsFollowup() throws RecognitionException {
        try {
            // InternalVoice.g:379:1: ( ruleIsFollowup EOF )
            // InternalVoice.g:380:1: ruleIsFollowup EOF
            {
             before(grammarAccess.getIsFollowupRule()); 
            pushFollow(FOLLOW_1);
            ruleIsFollowup();

            state._fsp--;

             after(grammarAccess.getIsFollowupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsFollowup"


    // $ANTLR start "ruleIsFollowup"
    // InternalVoice.g:387:1: ruleIsFollowup : ( ( rule__IsFollowup__Group__0 ) ) ;
    public final void ruleIsFollowup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:391:2: ( ( ( rule__IsFollowup__Group__0 ) ) )
            // InternalVoice.g:392:2: ( ( rule__IsFollowup__Group__0 ) )
            {
            // InternalVoice.g:392:2: ( ( rule__IsFollowup__Group__0 ) )
            // InternalVoice.g:393:3: ( rule__IsFollowup__Group__0 )
            {
             before(grammarAccess.getIsFollowupAccess().getGroup()); 
            // InternalVoice.g:394:3: ( rule__IsFollowup__Group__0 )
            // InternalVoice.g:394:4: rule__IsFollowup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsFollowup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsFollowupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsFollowup"


    // $ANTLR start "entryRuleSysvariable"
    // InternalVoice.g:403:1: entryRuleSysvariable : ruleSysvariable EOF ;
    public final void entryRuleSysvariable() throws RecognitionException {
        try {
            // InternalVoice.g:404:1: ( ruleSysvariable EOF )
            // InternalVoice.g:405:1: ruleSysvariable EOF
            {
             before(grammarAccess.getSysvariableRule()); 
            pushFollow(FOLLOW_1);
            ruleSysvariable();

            state._fsp--;

             after(grammarAccess.getSysvariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSysvariable"


    // $ANTLR start "ruleSysvariable"
    // InternalVoice.g:412:1: ruleSysvariable : ( ( rule__Sysvariable__ValueAssignment ) ) ;
    public final void ruleSysvariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:416:2: ( ( ( rule__Sysvariable__ValueAssignment ) ) )
            // InternalVoice.g:417:2: ( ( rule__Sysvariable__ValueAssignment ) )
            {
            // InternalVoice.g:417:2: ( ( rule__Sysvariable__ValueAssignment ) )
            // InternalVoice.g:418:3: ( rule__Sysvariable__ValueAssignment )
            {
             before(grammarAccess.getSysvariableAccess().getValueAssignment()); 
            // InternalVoice.g:419:3: ( rule__Sysvariable__ValueAssignment )
            // InternalVoice.g:419:4: rule__Sysvariable__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSysvariable"


    // $ANTLR start "entryRuleReference"
    // InternalVoice.g:428:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalVoice.g:429:1: ( ruleReference EOF )
            // InternalVoice.g:430:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalVoice.g:437:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:441:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalVoice.g:442:2: ( ( rule__Reference__Alternatives ) )
            {
            // InternalVoice.g:442:2: ( ( rule__Reference__Alternatives ) )
            // InternalVoice.g:443:3: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalVoice.g:444:3: ( rule__Reference__Alternatives )
            // InternalVoice.g:444:4: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__Agent__Alternatives"
    // InternalVoice.g:452:1: rule__Agent__Alternatives : ( ( ruleEntity ) | ( ruleIntent ) );
    public final void rule__Agent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:456:1: ( ( ruleEntity ) | ( ruleIntent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVoice.g:457:2: ( ruleEntity )
                    {
                    // InternalVoice.g:457:2: ( ruleEntity )
                    // InternalVoice.g:458:3: ruleEntity
                    {
                     before(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:463:2: ( ruleIntent )
                    {
                    // InternalVoice.g:463:2: ( ruleIntent )
                    // InternalVoice.g:464:3: ruleIntent
                    {
                     before(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntent();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Alternatives"


    // $ANTLR start "rule__TrainingRef__Alternatives_1"
    // InternalVoice.g:473:1: rule__TrainingRef__Alternatives_1 : ( ( RULE_STRING ) | ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) ) );
    public final void rule__TrainingRef__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:477:1: ( ( RULE_STRING ) | ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVoice.g:478:2: ( RULE_STRING )
                    {
                    // InternalVoice.g:478:2: ( RULE_STRING )
                    // InternalVoice.g:479:3: RULE_STRING
                    {
                     before(grammarAccess.getTrainingRefAccess().getSTRINGTerminalRuleCall_1_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTrainingRefAccess().getSTRINGTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:484:2: ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) )
                    {
                    // InternalVoice.g:484:2: ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) )
                    // InternalVoice.g:485:3: ( rule__TrainingRef__DeclarationsAssignment_1_1 )
                    {
                     before(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1_1()); 
                    // InternalVoice.g:486:3: ( rule__TrainingRef__DeclarationsAssignment_1_1 )
                    // InternalVoice.g:486:4: rule__TrainingRef__DeclarationsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrainingRef__DeclarationsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Alternatives_1"


    // $ANTLR start "rule__Sysvariable__ValueAlternatives_0"
    // InternalVoice.g:494:1: rule__Sysvariable__ValueAlternatives_0 : ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) );
    public final void rule__Sysvariable__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:498:1: ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) )
            int alt4=13;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            case 20:
                {
                alt4=8;
                }
                break;
            case 21:
                {
                alt4=9;
                }
                break;
            case 22:
                {
                alt4=10;
                }
                break;
            case 23:
                {
                alt4=11;
                }
                break;
            case 24:
                {
                alt4=12;
                }
                break;
            case 25:
                {
                alt4=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVoice.g:499:2: ( 'number' )
                    {
                    // InternalVoice.g:499:2: ( 'number' )
                    // InternalVoice.g:500:3: 'number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:505:2: ( 'date-time' )
                    {
                    // InternalVoice.g:505:2: ( 'date-time' )
                    // InternalVoice.g:506:3: 'date-time'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVoice.g:511:2: ( 'date' )
                    {
                    // InternalVoice.g:511:2: ( 'date' )
                    // InternalVoice.g:512:3: 'date'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVoice.g:517:2: ( 'duration' )
                    {
                    // InternalVoice.g:517:2: ( 'duration' )
                    // InternalVoice.g:518:3: 'duration'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVoice.g:523:2: ( 'address' )
                    {
                    // InternalVoice.g:523:2: ( 'address' )
                    // InternalVoice.g:524:3: 'address'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVoice.g:529:2: ( 'email' )
                    {
                    // InternalVoice.g:529:2: ( 'email' )
                    // InternalVoice.g:530:3: 'email'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVoice.g:535:2: ( 'phone-number' )
                    {
                    // InternalVoice.g:535:2: ( 'phone-number' )
                    // InternalVoice.g:536:3: 'phone-number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVoice.g:541:2: ( 'date-period' )
                    {
                    // InternalVoice.g:541:2: ( 'date-period' )
                    // InternalVoice.g:542:3: 'date-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVoice.g:547:2: ( 'time-period' )
                    {
                    // InternalVoice.g:547:2: ( 'time-period' )
                    // InternalVoice.g:548:3: 'time-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVoice.g:553:2: ( 'url' )
                    {
                    // InternalVoice.g:553:2: ( 'url' )
                    // InternalVoice.g:554:3: 'url'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVoice.g:559:2: ( 'any' )
                    {
                    // InternalVoice.g:559:2: ( 'any' )
                    // InternalVoice.g:560:3: 'any'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVoice.g:565:2: ( 'color' )
                    {
                    // InternalVoice.g:565:2: ( 'color' )
                    // InternalVoice.g:566:3: 'color'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVoice.g:571:2: ( 'language' )
                    {
                    // InternalVoice.g:571:2: ( 'language' )
                    // InternalVoice.g:572:3: 'language'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sysvariable__ValueAlternatives_0"


    // $ANTLR start "rule__Reference__Alternatives"
    // InternalVoice.g:581:1: rule__Reference__Alternatives : ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:585:1: ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=13 && LA5_0<=25)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVoice.g:586:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    {
                    // InternalVoice.g:586:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    // InternalVoice.g:587:3: ( rule__Reference__EntityAssignment_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 
                    // InternalVoice.g:588:3: ( rule__Reference__EntityAssignment_0 )
                    // InternalVoice.g:588:4: rule__Reference__EntityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__EntityAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:592:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    {
                    // InternalVoice.g:592:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    // InternalVoice.g:593:3: ( rule__Reference__SysvarAssignment_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 
                    // InternalVoice.g:594:3: ( rule__Reference__SysvarAssignment_1 )
                    // InternalVoice.g:594:4: rule__Reference__SysvarAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__SysvarAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__Intent__Group__0"
    // InternalVoice.g:602:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:606:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalVoice.g:607:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0"


    // $ANTLR start "rule__Intent__Group__0__Impl"
    // InternalVoice.g:614:1: rule__Intent__Group__0__Impl : ( 'Intent' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:618:1: ( ( 'Intent' ) )
            // InternalVoice.g:619:1: ( 'Intent' )
            {
            // InternalVoice.g:619:1: ( 'Intent' )
            // InternalVoice.g:620:2: 'Intent'
            {
             before(grammarAccess.getIntentAccess().getIntentKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getIntentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0__Impl"


    // $ANTLR start "rule__Intent__Group__1"
    // InternalVoice.g:629:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:633:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalVoice.g:634:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1"


    // $ANTLR start "rule__Intent__Group__1__Impl"
    // InternalVoice.g:641:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:645:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalVoice.g:646:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalVoice.g:646:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalVoice.g:647:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalVoice.g:648:2: ( rule__Intent__NameAssignment_1 )
            // InternalVoice.g:648:3: rule__Intent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1__Impl"


    // $ANTLR start "rule__Intent__Group__2"
    // InternalVoice.g:656:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:660:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalVoice.g:661:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2"


    // $ANTLR start "rule__Intent__Group__2__Impl"
    // InternalVoice.g:668:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__HasFollowupAssignment_2 )? ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:672:1: ( ( ( rule__Intent__HasFollowupAssignment_2 )? ) )
            // InternalVoice.g:673:1: ( ( rule__Intent__HasFollowupAssignment_2 )? )
            {
            // InternalVoice.g:673:1: ( ( rule__Intent__HasFollowupAssignment_2 )? )
            // InternalVoice.g:674:2: ( rule__Intent__HasFollowupAssignment_2 )?
            {
             before(grammarAccess.getIntentAccess().getHasFollowupAssignment_2()); 
            // InternalVoice.g:675:2: ( rule__Intent__HasFollowupAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVoice.g:675:3: rule__Intent__HasFollowupAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__HasFollowupAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getHasFollowupAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__3"
    // InternalVoice.g:683:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:687:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalVoice.g:688:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3"


    // $ANTLR start "rule__Intent__Group__3__Impl"
    // InternalVoice.g:695:1: rule__Intent__Group__3__Impl : ( ( rule__Intent__IsFollowupAssignment_3 )? ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:699:1: ( ( ( rule__Intent__IsFollowupAssignment_3 )? ) )
            // InternalVoice.g:700:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            {
            // InternalVoice.g:700:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            // InternalVoice.g:701:2: ( rule__Intent__IsFollowupAssignment_3 )?
            {
             before(grammarAccess.getIntentAccess().getIsFollowupAssignment_3()); 
            // InternalVoice.g:702:2: ( rule__Intent__IsFollowupAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVoice.g:702:3: rule__Intent__IsFollowupAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__IsFollowupAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getIsFollowupAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3__Impl"


    // $ANTLR start "rule__Intent__Group__4"
    // InternalVoice.g:710:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl rule__Intent__Group__5 ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:714:1: ( rule__Intent__Group__4__Impl rule__Intent__Group__5 )
            // InternalVoice.g:715:2: rule__Intent__Group__4__Impl rule__Intent__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Intent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4"


    // $ANTLR start "rule__Intent__Group__4__Impl"
    // InternalVoice.g:722:1: rule__Intent__Group__4__Impl : ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:726:1: ( ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) )
            // InternalVoice.g:727:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            {
            // InternalVoice.g:727:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            // InternalVoice.g:728:2: ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* )
            {
            // InternalVoice.g:728:2: ( ( rule__Intent__QuestionAssignment_4 ) )
            // InternalVoice.g:729:3: ( rule__Intent__QuestionAssignment_4 )
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalVoice.g:730:3: ( rule__Intent__QuestionAssignment_4 )
            // InternalVoice.g:730:4: rule__Intent__QuestionAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Intent__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 

            }

            // InternalVoice.g:733:2: ( ( rule__Intent__QuestionAssignment_4 )* )
            // InternalVoice.g:734:3: ( rule__Intent__QuestionAssignment_4 )*
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalVoice.g:735:3: ( rule__Intent__QuestionAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==11||(LA8_0>=13 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVoice.g:735:4: rule__Intent__QuestionAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Intent__QuestionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4__Impl"


    // $ANTLR start "rule__Intent__Group__5"
    // InternalVoice.g:744:1: rule__Intent__Group__5 : rule__Intent__Group__5__Impl ;
    public final void rule__Intent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:748:1: ( rule__Intent__Group__5__Impl )
            // InternalVoice.g:749:2: rule__Intent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__5"


    // $ANTLR start "rule__Intent__Group__5__Impl"
    // InternalVoice.g:755:1: rule__Intent__Group__5__Impl : ( ( rule__Intent__TrainingAssignment_5 ) ) ;
    public final void rule__Intent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:759:1: ( ( ( rule__Intent__TrainingAssignment_5 ) ) )
            // InternalVoice.g:760:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            {
            // InternalVoice.g:760:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            // InternalVoice.g:761:2: ( rule__Intent__TrainingAssignment_5 )
            {
             before(grammarAccess.getIntentAccess().getTrainingAssignment_5()); 
            // InternalVoice.g:762:2: ( rule__Intent__TrainingAssignment_5 )
            // InternalVoice.g:762:3: rule__Intent__TrainingAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Intent__TrainingAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getTrainingAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalVoice.g:771:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:775:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalVoice.g:776:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalVoice.g:783:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:787:1: ( ( 'Entity' ) )
            // InternalVoice.g:788:1: ( 'Entity' )
            {
            // InternalVoice.g:788:1: ( 'Entity' )
            // InternalVoice.g:789:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalVoice.g:798:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:802:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalVoice.g:803:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalVoice.g:810:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:814:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalVoice.g:815:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalVoice.g:815:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalVoice.g:816:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalVoice.g:817:2: ( rule__Entity__NameAssignment_1 )
            // InternalVoice.g:817:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalVoice.g:825:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:829:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalVoice.g:830:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalVoice.g:837:1: rule__Entity__Group__2__Impl : ( '[' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:841:1: ( ( '[' ) )
            // InternalVoice.g:842:1: ( '[' )
            {
            // InternalVoice.g:842:1: ( '[' )
            // InternalVoice.g:843:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalVoice.g:852:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:856:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalVoice.g:857:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalVoice.g:864:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:868:1: ( ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) )
            // InternalVoice.g:869:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            {
            // InternalVoice.g:869:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            // InternalVoice.g:870:2: ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* )
            {
            // InternalVoice.g:870:2: ( ( rule__Entity__ExampleAssignment_3 ) )
            // InternalVoice.g:871:3: ( rule__Entity__ExampleAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalVoice.g:872:3: ( rule__Entity__ExampleAssignment_3 )
            // InternalVoice.g:872:4: rule__Entity__ExampleAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__ExampleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }

            // InternalVoice.g:875:2: ( ( rule__Entity__ExampleAssignment_3 )* )
            // InternalVoice.g:876:3: ( rule__Entity__ExampleAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalVoice.g:877:3: ( rule__Entity__ExampleAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVoice.g:877:4: rule__Entity__ExampleAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__ExampleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalVoice.g:886:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:890:1: ( rule__Entity__Group__4__Impl )
            // InternalVoice.g:891:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalVoice.g:897:1: rule__Entity__Group__4__Impl : ( ']' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:901:1: ( ( ']' ) )
            // InternalVoice.g:902:1: ( ']' )
            {
            // InternalVoice.g:902:1: ( ']' )
            // InternalVoice.g:903:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalVoice.g:913:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:917:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalVoice.g:918:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalVoice.g:925:1: rule__Question__Group__0__Impl : ( ( rule__Question__RequiredAssignment_0 )? ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:929:1: ( ( ( rule__Question__RequiredAssignment_0 )? ) )
            // InternalVoice.g:930:1: ( ( rule__Question__RequiredAssignment_0 )? )
            {
            // InternalVoice.g:930:1: ( ( rule__Question__RequiredAssignment_0 )? )
            // InternalVoice.g:931:2: ( rule__Question__RequiredAssignment_0 )?
            {
             before(grammarAccess.getQuestionAccess().getRequiredAssignment_0()); 
            // InternalVoice.g:932:2: ( rule__Question__RequiredAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVoice.g:932:3: rule__Question__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__RequiredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getRequiredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalVoice.g:940:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:944:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalVoice.g:945:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalVoice.g:952:1: rule__Question__Group__1__Impl : ( ( rule__Question__QuestionEntityAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:956:1: ( ( ( rule__Question__QuestionEntityAssignment_1 ) ) )
            // InternalVoice.g:957:1: ( ( rule__Question__QuestionEntityAssignment_1 ) )
            {
            // InternalVoice.g:957:1: ( ( rule__Question__QuestionEntityAssignment_1 ) )
            // InternalVoice.g:958:2: ( rule__Question__QuestionEntityAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_1()); 
            // InternalVoice.g:959:2: ( rule__Question__QuestionEntityAssignment_1 )
            // InternalVoice.g:959:3: rule__Question__QuestionEntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalVoice.g:967:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:971:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalVoice.g:972:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalVoice.g:979:1: rule__Question__Group__2__Impl : ( 'with' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:983:1: ( ( 'with' ) )
            // InternalVoice.g:984:1: ( 'with' )
            {
            // InternalVoice.g:984:1: ( 'with' )
            // InternalVoice.g:985:2: 'with'
            {
             before(grammarAccess.getQuestionAccess().getWithKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalVoice.g:994:1: rule__Question__Group__3 : rule__Question__Group__3__Impl ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:998:1: ( rule__Question__Group__3__Impl )
            // InternalVoice.g:999:2: rule__Question__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalVoice.g:1005:1: rule__Question__Group__3__Impl : ( ( rule__Question__PromptAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1009:1: ( ( ( rule__Question__PromptAssignment_3 ) ) )
            // InternalVoice.g:1010:1: ( ( rule__Question__PromptAssignment_3 ) )
            {
            // InternalVoice.g:1010:1: ( ( rule__Question__PromptAssignment_3 ) )
            // InternalVoice.g:1011:2: ( rule__Question__PromptAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getPromptAssignment_3()); 
            // InternalVoice.g:1012:2: ( rule__Question__PromptAssignment_3 )
            // InternalVoice.g:1012:3: rule__Question__PromptAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Question__PromptAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getPromptAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Training__Group__0"
    // InternalVoice.g:1021:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1025:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalVoice.g:1026:2: rule__Training__Group__0__Impl rule__Training__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Training__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0"


    // $ANTLR start "rule__Training__Group__0__Impl"
    // InternalVoice.g:1033:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1037:1: ( ( () ) )
            // InternalVoice.g:1038:1: ( () )
            {
            // InternalVoice.g:1038:1: ( () )
            // InternalVoice.g:1039:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalVoice.g:1040:2: ()
            // InternalVoice.g:1040:3: 
            {
            }

             after(grammarAccess.getTrainingAccess().getTrainingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0__Impl"


    // $ANTLR start "rule__Training__Group__1"
    // InternalVoice.g:1048:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1052:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalVoice.g:1053:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Training__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1"


    // $ANTLR start "rule__Training__Group__1__Impl"
    // InternalVoice.g:1060:1: rule__Training__Group__1__Impl : ( 'Training:' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1064:1: ( ( 'Training:' ) )
            // InternalVoice.g:1065:1: ( 'Training:' )
            {
            // InternalVoice.g:1065:1: ( 'Training:' )
            // InternalVoice.g:1066:2: 'Training:'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__2"
    // InternalVoice.g:1075:1: rule__Training__Group__2 : rule__Training__Group__2__Impl ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1079:1: ( rule__Training__Group__2__Impl )
            // InternalVoice.g:1080:2: rule__Training__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2"


    // $ANTLR start "rule__Training__Group__2__Impl"
    // InternalVoice.g:1086:1: rule__Training__Group__2__Impl : ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1090:1: ( ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) )
            // InternalVoice.g:1091:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            {
            // InternalVoice.g:1091:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            // InternalVoice.g:1092:2: ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* )
            {
            // InternalVoice.g:1092:2: ( ( rule__Training__TrainingrefAssignment_2 ) )
            // InternalVoice.g:1093:3: ( rule__Training__TrainingrefAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1094:3: ( rule__Training__TrainingrefAssignment_2 )
            // InternalVoice.g:1094:4: rule__Training__TrainingrefAssignment_2
            {
            pushFollow(FOLLOW_14);
            rule__Training__TrainingrefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }

            // InternalVoice.g:1097:2: ( ( rule__Training__TrainingrefAssignment_2 )* )
            // InternalVoice.g:1098:3: ( rule__Training__TrainingrefAssignment_2 )*
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1099:3: ( rule__Training__TrainingrefAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVoice.g:1099:4: rule__Training__TrainingrefAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Training__TrainingrefAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2__Impl"


    // $ANTLR start "rule__TrainingRef__Group__0"
    // InternalVoice.g:1109:1: rule__TrainingRef__Group__0 : rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 ;
    public final void rule__TrainingRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1113:1: ( rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 )
            // InternalVoice.g:1114:2: rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__TrainingRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__0"


    // $ANTLR start "rule__TrainingRef__Group__0__Impl"
    // InternalVoice.g:1121:1: rule__TrainingRef__Group__0__Impl : ( () ) ;
    public final void rule__TrainingRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1125:1: ( ( () ) )
            // InternalVoice.g:1126:1: ( () )
            {
            // InternalVoice.g:1126:1: ( () )
            // InternalVoice.g:1127:2: ()
            {
             before(grammarAccess.getTrainingRefAccess().getTrainingRefSimpleAction_0()); 
            // InternalVoice.g:1128:2: ()
            // InternalVoice.g:1128:3: 
            {
            }

             after(grammarAccess.getTrainingRefAccess().getTrainingRefSimpleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__0__Impl"


    // $ANTLR start "rule__TrainingRef__Group__1"
    // InternalVoice.g:1136:1: rule__TrainingRef__Group__1 : rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 ;
    public final void rule__TrainingRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1140:1: ( rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 )
            // InternalVoice.g:1141:2: rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TrainingRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__1"


    // $ANTLR start "rule__TrainingRef__Group__1__Impl"
    // InternalVoice.g:1148:1: rule__TrainingRef__Group__1__Impl : ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) ) ;
    public final void rule__TrainingRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1152:1: ( ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) ) )
            // InternalVoice.g:1153:1: ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) )
            {
            // InternalVoice.g:1153:1: ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) )
            // InternalVoice.g:1154:2: ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* )
            {
            // InternalVoice.g:1154:2: ( ( rule__TrainingRef__Alternatives_1 ) )
            // InternalVoice.g:1155:3: ( rule__TrainingRef__Alternatives_1 )
            {
             before(grammarAccess.getTrainingRefAccess().getAlternatives_1()); 
            // InternalVoice.g:1156:3: ( rule__TrainingRef__Alternatives_1 )
            // InternalVoice.g:1156:4: rule__TrainingRef__Alternatives_1
            {
            pushFollow(FOLLOW_14);
            rule__TrainingRef__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getAlternatives_1()); 

            }

            // InternalVoice.g:1159:2: ( ( rule__TrainingRef__Alternatives_1 )* )
            // InternalVoice.g:1160:3: ( rule__TrainingRef__Alternatives_1 )*
            {
             before(grammarAccess.getTrainingRefAccess().getAlternatives_1()); 
            // InternalVoice.g:1161:3: ( rule__TrainingRef__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVoice.g:1161:4: rule__TrainingRef__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TrainingRef__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTrainingRefAccess().getAlternatives_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__1__Impl"


    // $ANTLR start "rule__TrainingRef__Group__2"
    // InternalVoice.g:1170:1: rule__TrainingRef__Group__2 : rule__TrainingRef__Group__2__Impl ;
    public final void rule__TrainingRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1174:1: ( rule__TrainingRef__Group__2__Impl )
            // InternalVoice.g:1175:2: rule__TrainingRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__2"


    // $ANTLR start "rule__TrainingRef__Group__2__Impl"
    // InternalVoice.g:1181:1: rule__TrainingRef__Group__2__Impl : ( '.' ) ;
    public final void rule__TrainingRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1185:1: ( ( '.' ) )
            // InternalVoice.g:1186:1: ( '.' )
            {
            // InternalVoice.g:1186:1: ( '.' )
            // InternalVoice.g:1187:2: '.'
            {
             before(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalVoice.g:1197:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1201:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalVoice.g:1202:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalVoice.g:1209:1: rule__Declaration__Group__0__Impl : ( '(' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1213:1: ( ( '(' ) )
            // InternalVoice.g:1214:1: ( '(' )
            {
            // InternalVoice.g:1214:1: ( '(' )
            // InternalVoice.g:1215:2: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalVoice.g:1224:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1228:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalVoice.g:1229:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalVoice.g:1236:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__TrainingstringAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1240:1: ( ( ( rule__Declaration__TrainingstringAssignment_1 ) ) )
            // InternalVoice.g:1241:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            {
            // InternalVoice.g:1241:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            // InternalVoice.g:1242:2: ( rule__Declaration__TrainingstringAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 
            // InternalVoice.g:1243:2: ( rule__Declaration__TrainingstringAssignment_1 )
            // InternalVoice.g:1243:3: rule__Declaration__TrainingstringAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__TrainingstringAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // InternalVoice.g:1251:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1255:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalVoice.g:1256:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // InternalVoice.g:1263:1: rule__Declaration__Group__2__Impl : ( 'is' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1267:1: ( ( 'is' ) )
            // InternalVoice.g:1268:1: ( 'is' )
            {
            // InternalVoice.g:1268:1: ( 'is' )
            // InternalVoice.g:1269:2: 'is'
            {
             before(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // InternalVoice.g:1278:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1282:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // InternalVoice.g:1283:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // InternalVoice.g:1290:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__ReferenceAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1294:1: ( ( ( rule__Declaration__ReferenceAssignment_3 ) ) )
            // InternalVoice.g:1295:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            {
            // InternalVoice.g:1295:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            // InternalVoice.g:1296:2: ( rule__Declaration__ReferenceAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 
            // InternalVoice.g:1297:2: ( rule__Declaration__ReferenceAssignment_3 )
            // InternalVoice.g:1297:3: rule__Declaration__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__4"
    // InternalVoice.g:1305:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1309:1: ( rule__Declaration__Group__4__Impl )
            // InternalVoice.g:1310:2: rule__Declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4"


    // $ANTLR start "rule__Declaration__Group__4__Impl"
    // InternalVoice.g:1316:1: rule__Declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1320:1: ( ( ')' ) )
            // InternalVoice.g:1321:1: ( ')' )
            {
            // InternalVoice.g:1321:1: ( ')' )
            // InternalVoice.g:1322:2: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4__Impl"


    // $ANTLR start "rule__EntityExample__Group__0"
    // InternalVoice.g:1332:1: rule__EntityExample__Group__0 : rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 ;
    public final void rule__EntityExample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1336:1: ( rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 )
            // InternalVoice.g:1337:2: rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EntityExample__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__0"


    // $ANTLR start "rule__EntityExample__Group__0__Impl"
    // InternalVoice.g:1344:1: rule__EntityExample__Group__0__Impl : ( ( rule__EntityExample__NameAssignment_0 ) ) ;
    public final void rule__EntityExample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1348:1: ( ( ( rule__EntityExample__NameAssignment_0 ) ) )
            // InternalVoice.g:1349:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            {
            // InternalVoice.g:1349:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            // InternalVoice.g:1350:2: ( rule__EntityExample__NameAssignment_0 )
            {
             before(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 
            // InternalVoice.g:1351:2: ( rule__EntityExample__NameAssignment_0 )
            // InternalVoice.g:1351:3: rule__EntityExample__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__0__Impl"


    // $ANTLR start "rule__EntityExample__Group__1"
    // InternalVoice.g:1359:1: rule__EntityExample__Group__1 : rule__EntityExample__Group__1__Impl ;
    public final void rule__EntityExample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1363:1: ( rule__EntityExample__Group__1__Impl )
            // InternalVoice.g:1364:2: rule__EntityExample__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__1"


    // $ANTLR start "rule__EntityExample__Group__1__Impl"
    // InternalVoice.g:1370:1: rule__EntityExample__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EntityExample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1374:1: ( ( ( ',' )? ) )
            // InternalVoice.g:1375:1: ( ( ',' )? )
            {
            // InternalVoice.g:1375:1: ( ( ',' )? )
            // InternalVoice.g:1376:2: ( ',' )?
            {
             before(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 
            // InternalVoice.g:1377:2: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVoice.g:1377:3: ','
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__1__Impl"


    // $ANTLR start "rule__IsFollowup__Group__0"
    // InternalVoice.g:1386:1: rule__IsFollowup__Group__0 : rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 ;
    public final void rule__IsFollowup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1390:1: ( rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 )
            // InternalVoice.g:1391:2: rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__IsFollowup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsFollowup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowup__Group__0"


    // $ANTLR start "rule__IsFollowup__Group__0__Impl"
    // InternalVoice.g:1398:1: rule__IsFollowup__Group__0__Impl : ( 'IsFollowup' ) ;
    public final void rule__IsFollowup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1402:1: ( ( 'IsFollowup' ) )
            // InternalVoice.g:1403:1: ( 'IsFollowup' )
            {
            // InternalVoice.g:1403:1: ( 'IsFollowup' )
            // InternalVoice.g:1404:2: 'IsFollowup'
            {
             before(grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowup__Group__0__Impl"


    // $ANTLR start "rule__IsFollowup__Group__1"
    // InternalVoice.g:1413:1: rule__IsFollowup__Group__1 : rule__IsFollowup__Group__1__Impl ;
    public final void rule__IsFollowup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1417:1: ( rule__IsFollowup__Group__1__Impl )
            // InternalVoice.g:1418:2: rule__IsFollowup__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsFollowup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowup__Group__1"


    // $ANTLR start "rule__IsFollowup__Group__1__Impl"
    // InternalVoice.g:1424:1: rule__IsFollowup__Group__1__Impl : ( ( rule__IsFollowup__IntentAssignment_1 ) ) ;
    public final void rule__IsFollowup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1428:1: ( ( ( rule__IsFollowup__IntentAssignment_1 ) ) )
            // InternalVoice.g:1429:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            {
            // InternalVoice.g:1429:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            // InternalVoice.g:1430:2: ( rule__IsFollowup__IntentAssignment_1 )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentAssignment_1()); 
            // InternalVoice.g:1431:2: ( rule__IsFollowup__IntentAssignment_1 )
            // InternalVoice.g:1431:3: rule__IsFollowup__IntentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IsFollowup__IntentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIsFollowupAccess().getIntentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowup__Group__1__Impl"


    // $ANTLR start "rule__Model__AgentAssignment"
    // InternalVoice.g:1440:1: rule__Model__AgentAssignment : ( ruleAgent ) ;
    public final void rule__Model__AgentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1444:1: ( ( ruleAgent ) )
            // InternalVoice.g:1445:2: ( ruleAgent )
            {
            // InternalVoice.g:1445:2: ( ruleAgent )
            // InternalVoice.g:1446:3: ruleAgent
            {
             before(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AgentAssignment"


    // $ANTLR start "rule__Intent__NameAssignment_1"
    // InternalVoice.g:1455:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1459:1: ( ( RULE_ID ) )
            // InternalVoice.g:1460:2: ( RULE_ID )
            {
            // InternalVoice.g:1460:2: ( RULE_ID )
            // InternalVoice.g:1461:3: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__NameAssignment_1"


    // $ANTLR start "rule__Intent__HasFollowupAssignment_2"
    // InternalVoice.g:1470:1: rule__Intent__HasFollowupAssignment_2 : ( ruleHasFollowup ) ;
    public final void rule__Intent__HasFollowupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1474:1: ( ( ruleHasFollowup ) )
            // InternalVoice.g:1475:2: ( ruleHasFollowup )
            {
            // InternalVoice.g:1475:2: ( ruleHasFollowup )
            // InternalVoice.g:1476:3: ruleHasFollowup
            {
             before(grammarAccess.getIntentAccess().getHasFollowupHasFollowupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHasFollowup();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getHasFollowupHasFollowupParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__HasFollowupAssignment_2"


    // $ANTLR start "rule__Intent__IsFollowupAssignment_3"
    // InternalVoice.g:1485:1: rule__Intent__IsFollowupAssignment_3 : ( ruleIsFollowup ) ;
    public final void rule__Intent__IsFollowupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1489:1: ( ( ruleIsFollowup ) )
            // InternalVoice.g:1490:2: ( ruleIsFollowup )
            {
            // InternalVoice.g:1490:2: ( ruleIsFollowup )
            // InternalVoice.g:1491:3: ruleIsFollowup
            {
             before(grammarAccess.getIntentAccess().getIsFollowupIsFollowupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIsFollowup();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getIsFollowupIsFollowupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__IsFollowupAssignment_3"


    // $ANTLR start "rule__Intent__QuestionAssignment_4"
    // InternalVoice.g:1500:1: rule__Intent__QuestionAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Intent__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1504:1: ( ( ruleQuestion ) )
            // InternalVoice.g:1505:2: ( ruleQuestion )
            {
            // InternalVoice.g:1505:2: ( ruleQuestion )
            // InternalVoice.g:1506:3: ruleQuestion
            {
             before(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__QuestionAssignment_4"


    // $ANTLR start "rule__Intent__TrainingAssignment_5"
    // InternalVoice.g:1515:1: rule__Intent__TrainingAssignment_5 : ( ruleTraining ) ;
    public final void rule__Intent__TrainingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1519:1: ( ( ruleTraining ) )
            // InternalVoice.g:1520:2: ( ruleTraining )
            {
            // InternalVoice.g:1520:2: ( ruleTraining )
            // InternalVoice.g:1521:3: ruleTraining
            {
             before(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__TrainingAssignment_5"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalVoice.g:1530:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1534:1: ( ( RULE_ID ) )
            // InternalVoice.g:1535:2: ( RULE_ID )
            {
            // InternalVoice.g:1535:2: ( RULE_ID )
            // InternalVoice.g:1536:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ExampleAssignment_3"
    // InternalVoice.g:1545:1: rule__Entity__ExampleAssignment_3 : ( ruleEntityExample ) ;
    public final void rule__Entity__ExampleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1549:1: ( ( ruleEntityExample ) )
            // InternalVoice.g:1550:2: ( ruleEntityExample )
            {
            // InternalVoice.g:1550:2: ( ruleEntityExample )
            // InternalVoice.g:1551:3: ruleEntityExample
            {
             before(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityExample();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExampleAssignment_3"


    // $ANTLR start "rule__Question__RequiredAssignment_0"
    // InternalVoice.g:1560:1: rule__Question__RequiredAssignment_0 : ( ruleRequired ) ;
    public final void rule__Question__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1564:1: ( ( ruleRequired ) )
            // InternalVoice.g:1565:2: ( ruleRequired )
            {
            // InternalVoice.g:1565:2: ( ruleRequired )
            // InternalVoice.g:1566:3: ruleRequired
            {
             before(grammarAccess.getQuestionAccess().getRequiredRequiredParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getRequiredRequiredParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__RequiredAssignment_0"


    // $ANTLR start "rule__Question__QuestionEntityAssignment_1"
    // InternalVoice.g:1575:1: rule__Question__QuestionEntityAssignment_1 : ( ruleQuestionEntity ) ;
    public final void rule__Question__QuestionEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1579:1: ( ( ruleQuestionEntity ) )
            // InternalVoice.g:1580:2: ( ruleQuestionEntity )
            {
            // InternalVoice.g:1580:2: ( ruleQuestionEntity )
            // InternalVoice.g:1581:3: ruleQuestionEntity
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionEntity();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionEntityAssignment_1"


    // $ANTLR start "rule__Question__PromptAssignment_3"
    // InternalVoice.g:1590:1: rule__Question__PromptAssignment_3 : ( rulePrompt ) ;
    public final void rule__Question__PromptAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1594:1: ( ( rulePrompt ) )
            // InternalVoice.g:1595:2: ( rulePrompt )
            {
            // InternalVoice.g:1595:2: ( rulePrompt )
            // InternalVoice.g:1596:3: rulePrompt
            {
             before(grammarAccess.getQuestionAccess().getPromptPromptParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrompt();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getPromptPromptParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__PromptAssignment_3"


    // $ANTLR start "rule__QuestionEntity__WithEntityAssignment"
    // InternalVoice.g:1605:1: rule__QuestionEntity__WithEntityAssignment : ( ruleReference ) ;
    public final void rule__QuestionEntity__WithEntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1609:1: ( ( ruleReference ) )
            // InternalVoice.g:1610:2: ( ruleReference )
            {
            // InternalVoice.g:1610:2: ( ruleReference )
            // InternalVoice.g:1611:3: ruleReference
            {
             before(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionEntity__WithEntityAssignment"


    // $ANTLR start "rule__Training__TrainingrefAssignment_2"
    // InternalVoice.g:1620:1: rule__Training__TrainingrefAssignment_2 : ( ruleTrainingRef ) ;
    public final void rule__Training__TrainingrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1624:1: ( ( ruleTrainingRef ) )
            // InternalVoice.g:1625:2: ( ruleTrainingRef )
            {
            // InternalVoice.g:1625:2: ( ruleTrainingRef )
            // InternalVoice.g:1626:3: ruleTrainingRef
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainingRef();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__TrainingrefAssignment_2"


    // $ANTLR start "rule__TrainingRef__DeclarationsAssignment_1_1"
    // InternalVoice.g:1635:1: rule__TrainingRef__DeclarationsAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__TrainingRef__DeclarationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1639:1: ( ( ruleDeclaration ) )
            // InternalVoice.g:1640:2: ( ruleDeclaration )
            {
            // InternalVoice.g:1640:2: ( ruleDeclaration )
            // InternalVoice.g:1641:3: ruleDeclaration
            {
             before(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__DeclarationsAssignment_1_1"


    // $ANTLR start "rule__Declaration__TrainingstringAssignment_1"
    // InternalVoice.g:1650:1: rule__Declaration__TrainingstringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__TrainingstringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1654:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1655:2: ( RULE_STRING )
            {
            // InternalVoice.g:1655:2: ( RULE_STRING )
            // InternalVoice.g:1656:3: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TrainingstringAssignment_1"


    // $ANTLR start "rule__Declaration__ReferenceAssignment_3"
    // InternalVoice.g:1665:1: rule__Declaration__ReferenceAssignment_3 : ( ruleReference ) ;
    public final void rule__Declaration__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1669:1: ( ( ruleReference ) )
            // InternalVoice.g:1670:2: ( ruleReference )
            {
            // InternalVoice.g:1670:2: ( ruleReference )
            // InternalVoice.g:1671:3: ruleReference
            {
             before(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ReferenceAssignment_3"


    // $ANTLR start "rule__EntityExample__NameAssignment_0"
    // InternalVoice.g:1680:1: rule__EntityExample__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityExample__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1684:1: ( ( RULE_ID ) )
            // InternalVoice.g:1685:2: ( RULE_ID )
            {
            // InternalVoice.g:1685:2: ( RULE_ID )
            // InternalVoice.g:1686:3: RULE_ID
            {
             before(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__NameAssignment_0"


    // $ANTLR start "rule__IsFollowup__IntentAssignment_1"
    // InternalVoice.g:1695:1: rule__IsFollowup__IntentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IsFollowup__IntentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1699:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1700:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1700:2: ( ( RULE_ID ) )
            // InternalVoice.g:1701:3: ( RULE_ID )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0()); 
            // InternalVoice.g:1702:3: ( RULE_ID )
            // InternalVoice.g:1703:4: RULE_ID
            {
             before(grammarAccess.getIsFollowupAccess().getIntentIntentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIsFollowupAccess().getIntentIntentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowup__IntentAssignment_1"


    // $ANTLR start "rule__Sysvariable__ValueAssignment"
    // InternalVoice.g:1714:1: rule__Sysvariable__ValueAssignment : ( ( rule__Sysvariable__ValueAlternatives_0 ) ) ;
    public final void rule__Sysvariable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1718:1: ( ( ( rule__Sysvariable__ValueAlternatives_0 ) ) )
            // InternalVoice.g:1719:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            {
            // InternalVoice.g:1719:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            // InternalVoice.g:1720:3: ( rule__Sysvariable__ValueAlternatives_0 )
            {
             before(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 
            // InternalVoice.g:1721:3: ( rule__Sysvariable__ValueAlternatives_0 )
            // InternalVoice.g:1721:4: rule__Sysvariable__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sysvariable__ValueAssignment"


    // $ANTLR start "rule__Reference__EntityAssignment_0"
    // InternalVoice.g:1729:1: rule__Reference__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1733:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1734:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1734:2: ( ( RULE_ID ) )
            // InternalVoice.g:1735:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 
            // InternalVoice.g:1736:3: ( RULE_ID )
            // InternalVoice.g:1737:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__EntityAssignment_0"


    // $ANTLR start "rule__Reference__SysvarAssignment_1"
    // InternalVoice.g:1748:1: rule__Reference__SysvarAssignment_1 : ( ruleSysvariable ) ;
    public final void rule__Reference__SysvarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1752:1: ( ( ruleSysvariable ) )
            // InternalVoice.g:1753:2: ( ruleSysvariable )
            {
            // InternalVoice.g:1753:2: ( ruleSysvariable )
            // InternalVoice.g:1754:3: ruleSysvariable
            {
             before(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSysvariable();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SysvarAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002003FFF820L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002003FFF822L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});

}