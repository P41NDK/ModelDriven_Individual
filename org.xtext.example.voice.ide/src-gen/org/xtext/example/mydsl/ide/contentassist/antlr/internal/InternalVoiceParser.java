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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'", "'Intent'", "':'", "'Entity'", "'['", "']'", "'with'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'IsFollowup'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
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

                if ( (LA1_0==24||LA1_0==26) ) {
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


    // $ANTLR start "entryRuleTraining"
    // InternalVoice.g:203:1: entryRuleTraining : ruleTraining EOF ;
    public final void entryRuleTraining() throws RecognitionException {
        try {
            // InternalVoice.g:204:1: ( ruleTraining EOF )
            // InternalVoice.g:205:1: ruleTraining EOF
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
    // InternalVoice.g:212:1: ruleTraining : ( ( rule__Training__Group__0 ) ) ;
    public final void ruleTraining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:216:2: ( ( ( rule__Training__Group__0 ) ) )
            // InternalVoice.g:217:2: ( ( rule__Training__Group__0 ) )
            {
            // InternalVoice.g:217:2: ( ( rule__Training__Group__0 ) )
            // InternalVoice.g:218:3: ( rule__Training__Group__0 )
            {
             before(grammarAccess.getTrainingAccess().getGroup()); 
            // InternalVoice.g:219:3: ( rule__Training__Group__0 )
            // InternalVoice.g:219:4: rule__Training__Group__0
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
    // InternalVoice.g:228:1: entryRuleTrainingRef : ruleTrainingRef EOF ;
    public final void entryRuleTrainingRef() throws RecognitionException {
        try {
            // InternalVoice.g:229:1: ( ruleTrainingRef EOF )
            // InternalVoice.g:230:1: ruleTrainingRef EOF
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
    // InternalVoice.g:237:1: ruleTrainingRef : ( ( rule__TrainingRef__Group__0 ) ) ;
    public final void ruleTrainingRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:241:2: ( ( ( rule__TrainingRef__Group__0 ) ) )
            // InternalVoice.g:242:2: ( ( rule__TrainingRef__Group__0 ) )
            {
            // InternalVoice.g:242:2: ( ( rule__TrainingRef__Group__0 ) )
            // InternalVoice.g:243:3: ( rule__TrainingRef__Group__0 )
            {
             before(grammarAccess.getTrainingRefAccess().getGroup()); 
            // InternalVoice.g:244:3: ( rule__TrainingRef__Group__0 )
            // InternalVoice.g:244:4: rule__TrainingRef__Group__0
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
    // InternalVoice.g:253:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalVoice.g:254:1: ( ruleDeclaration EOF )
            // InternalVoice.g:255:1: ruleDeclaration EOF
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
    // InternalVoice.g:262:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:266:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalVoice.g:267:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalVoice.g:267:2: ( ( rule__Declaration__Group__0 ) )
            // InternalVoice.g:268:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalVoice.g:269:3: ( rule__Declaration__Group__0 )
            // InternalVoice.g:269:4: rule__Declaration__Group__0
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
    // InternalVoice.g:278:1: entryRuleEntityExample : ruleEntityExample EOF ;
    public final void entryRuleEntityExample() throws RecognitionException {
        try {
            // InternalVoice.g:279:1: ( ruleEntityExample EOF )
            // InternalVoice.g:280:1: ruleEntityExample EOF
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
    // InternalVoice.g:287:1: ruleEntityExample : ( ( rule__EntityExample__Group__0 ) ) ;
    public final void ruleEntityExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:291:2: ( ( ( rule__EntityExample__Group__0 ) ) )
            // InternalVoice.g:292:2: ( ( rule__EntityExample__Group__0 ) )
            {
            // InternalVoice.g:292:2: ( ( rule__EntityExample__Group__0 ) )
            // InternalVoice.g:293:3: ( rule__EntityExample__Group__0 )
            {
             before(grammarAccess.getEntityExampleAccess().getGroup()); 
            // InternalVoice.g:294:3: ( rule__EntityExample__Group__0 )
            // InternalVoice.g:294:4: rule__EntityExample__Group__0
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


    // $ANTLR start "entryRuleIsFollowup"
    // InternalVoice.g:303:1: entryRuleIsFollowup : ruleIsFollowup EOF ;
    public final void entryRuleIsFollowup() throws RecognitionException {
        try {
            // InternalVoice.g:304:1: ( ruleIsFollowup EOF )
            // InternalVoice.g:305:1: ruleIsFollowup EOF
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
    // InternalVoice.g:312:1: ruleIsFollowup : ( ( rule__IsFollowup__Group__0 ) ) ;
    public final void ruleIsFollowup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:316:2: ( ( ( rule__IsFollowup__Group__0 ) ) )
            // InternalVoice.g:317:2: ( ( rule__IsFollowup__Group__0 ) )
            {
            // InternalVoice.g:317:2: ( ( rule__IsFollowup__Group__0 ) )
            // InternalVoice.g:318:3: ( rule__IsFollowup__Group__0 )
            {
             before(grammarAccess.getIsFollowupAccess().getGroup()); 
            // InternalVoice.g:319:3: ( rule__IsFollowup__Group__0 )
            // InternalVoice.g:319:4: rule__IsFollowup__Group__0
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
    // InternalVoice.g:328:1: entryRuleSysvariable : ruleSysvariable EOF ;
    public final void entryRuleSysvariable() throws RecognitionException {
        try {
            // InternalVoice.g:329:1: ( ruleSysvariable EOF )
            // InternalVoice.g:330:1: ruleSysvariable EOF
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
    // InternalVoice.g:337:1: ruleSysvariable : ( ( rule__Sysvariable__ValueAssignment ) ) ;
    public final void ruleSysvariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:341:2: ( ( ( rule__Sysvariable__ValueAssignment ) ) )
            // InternalVoice.g:342:2: ( ( rule__Sysvariable__ValueAssignment ) )
            {
            // InternalVoice.g:342:2: ( ( rule__Sysvariable__ValueAssignment ) )
            // InternalVoice.g:343:3: ( rule__Sysvariable__ValueAssignment )
            {
             before(grammarAccess.getSysvariableAccess().getValueAssignment()); 
            // InternalVoice.g:344:3: ( rule__Sysvariable__ValueAssignment )
            // InternalVoice.g:344:4: rule__Sysvariable__ValueAssignment
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
    // InternalVoice.g:353:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalVoice.g:354:1: ( ruleReference EOF )
            // InternalVoice.g:355:1: ruleReference EOF
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
    // InternalVoice.g:362:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:366:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalVoice.g:367:2: ( ( rule__Reference__Alternatives ) )
            {
            // InternalVoice.g:367:2: ( ( rule__Reference__Alternatives ) )
            // InternalVoice.g:368:3: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalVoice.g:369:3: ( rule__Reference__Alternatives )
            // InternalVoice.g:369:4: rule__Reference__Alternatives
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
    // InternalVoice.g:377:1: rule__Agent__Alternatives : ( ( ruleEntity ) | ( ruleIntent ) );
    public final void rule__Agent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:381:1: ( ( ruleEntity ) | ( ruleIntent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVoice.g:382:2: ( ruleEntity )
                    {
                    // InternalVoice.g:382:2: ( ruleEntity )
                    // InternalVoice.g:383:3: ruleEntity
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
                    // InternalVoice.g:388:2: ( ruleIntent )
                    {
                    // InternalVoice.g:388:2: ( ruleIntent )
                    // InternalVoice.g:389:3: ruleIntent
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
    // InternalVoice.g:398:1: rule__TrainingRef__Alternatives_1 : ( ( RULE_STRING ) | ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) ) );
    public final void rule__TrainingRef__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:402:1: ( ( RULE_STRING ) | ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVoice.g:403:2: ( RULE_STRING )
                    {
                    // InternalVoice.g:403:2: ( RULE_STRING )
                    // InternalVoice.g:404:3: RULE_STRING
                    {
                     before(grammarAccess.getTrainingRefAccess().getSTRINGTerminalRuleCall_1_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTrainingRefAccess().getSTRINGTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:409:2: ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) )
                    {
                    // InternalVoice.g:409:2: ( ( rule__TrainingRef__DeclarationsAssignment_1_1 ) )
                    // InternalVoice.g:410:3: ( rule__TrainingRef__DeclarationsAssignment_1_1 )
                    {
                     before(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1_1()); 
                    // InternalVoice.g:411:3: ( rule__TrainingRef__DeclarationsAssignment_1_1 )
                    // InternalVoice.g:411:4: rule__TrainingRef__DeclarationsAssignment_1_1
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
    // InternalVoice.g:419:1: rule__Sysvariable__ValueAlternatives_0 : ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) );
    public final void rule__Sysvariable__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:423:1: ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) )
            int alt4=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
                }
                break;
            case 20:
                {
                alt4=10;
                }
                break;
            case 21:
                {
                alt4=11;
                }
                break;
            case 22:
                {
                alt4=12;
                }
                break;
            case 23:
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
                    // InternalVoice.g:424:2: ( 'number' )
                    {
                    // InternalVoice.g:424:2: ( 'number' )
                    // InternalVoice.g:425:3: 'number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:430:2: ( 'date-time' )
                    {
                    // InternalVoice.g:430:2: ( 'date-time' )
                    // InternalVoice.g:431:3: 'date-time'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVoice.g:436:2: ( 'date' )
                    {
                    // InternalVoice.g:436:2: ( 'date' )
                    // InternalVoice.g:437:3: 'date'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVoice.g:442:2: ( 'duration' )
                    {
                    // InternalVoice.g:442:2: ( 'duration' )
                    // InternalVoice.g:443:3: 'duration'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVoice.g:448:2: ( 'address' )
                    {
                    // InternalVoice.g:448:2: ( 'address' )
                    // InternalVoice.g:449:3: 'address'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVoice.g:454:2: ( 'email' )
                    {
                    // InternalVoice.g:454:2: ( 'email' )
                    // InternalVoice.g:455:3: 'email'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVoice.g:460:2: ( 'phone-number' )
                    {
                    // InternalVoice.g:460:2: ( 'phone-number' )
                    // InternalVoice.g:461:3: 'phone-number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVoice.g:466:2: ( 'date-period' )
                    {
                    // InternalVoice.g:466:2: ( 'date-period' )
                    // InternalVoice.g:467:3: 'date-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVoice.g:472:2: ( 'time-period' )
                    {
                    // InternalVoice.g:472:2: ( 'time-period' )
                    // InternalVoice.g:473:3: 'time-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVoice.g:478:2: ( 'url' )
                    {
                    // InternalVoice.g:478:2: ( 'url' )
                    // InternalVoice.g:479:3: 'url'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVoice.g:484:2: ( 'any' )
                    {
                    // InternalVoice.g:484:2: ( 'any' )
                    // InternalVoice.g:485:3: 'any'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVoice.g:490:2: ( 'color' )
                    {
                    // InternalVoice.g:490:2: ( 'color' )
                    // InternalVoice.g:491:3: 'color'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVoice.g:496:2: ( 'language' )
                    {
                    // InternalVoice.g:496:2: ( 'language' )
                    // InternalVoice.g:497:3: 'language'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalVoice.g:506:1: rule__Reference__Alternatives : ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:510:1: ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=11 && LA5_0<=23)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVoice.g:511:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    {
                    // InternalVoice.g:511:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    // InternalVoice.g:512:3: ( rule__Reference__EntityAssignment_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 
                    // InternalVoice.g:513:3: ( rule__Reference__EntityAssignment_0 )
                    // InternalVoice.g:513:4: rule__Reference__EntityAssignment_0
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
                    // InternalVoice.g:517:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    {
                    // InternalVoice.g:517:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    // InternalVoice.g:518:3: ( rule__Reference__SysvarAssignment_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 
                    // InternalVoice.g:519:3: ( rule__Reference__SysvarAssignment_1 )
                    // InternalVoice.g:519:4: rule__Reference__SysvarAssignment_1
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
    // InternalVoice.g:527:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:531:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalVoice.g:532:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
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
    // InternalVoice.g:539:1: rule__Intent__Group__0__Impl : ( 'Intent' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:543:1: ( ( 'Intent' ) )
            // InternalVoice.g:544:1: ( 'Intent' )
            {
            // InternalVoice.g:544:1: ( 'Intent' )
            // InternalVoice.g:545:2: 'Intent'
            {
             before(grammarAccess.getIntentAccess().getIntentKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalVoice.g:554:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:558:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalVoice.g:559:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
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
    // InternalVoice.g:566:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:570:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalVoice.g:571:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalVoice.g:571:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalVoice.g:572:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalVoice.g:573:2: ( rule__Intent__NameAssignment_1 )
            // InternalVoice.g:573:3: rule__Intent__NameAssignment_1
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
    // InternalVoice.g:581:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:585:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalVoice.g:586:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
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
    // InternalVoice.g:593:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Group_2__0 )? ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:597:1: ( ( ( rule__Intent__Group_2__0 )? ) )
            // InternalVoice.g:598:1: ( ( rule__Intent__Group_2__0 )? )
            {
            // InternalVoice.g:598:1: ( ( rule__Intent__Group_2__0 )? )
            // InternalVoice.g:599:2: ( rule__Intent__Group_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_2()); 
            // InternalVoice.g:600:2: ( rule__Intent__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVoice.g:600:3: rule__Intent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_2()); 

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
    // InternalVoice.g:608:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:612:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalVoice.g:613:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
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
    // InternalVoice.g:620:1: rule__Intent__Group__3__Impl : ( ( rule__Intent__IsFollowupAssignment_3 )? ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:624:1: ( ( ( rule__Intent__IsFollowupAssignment_3 )? ) )
            // InternalVoice.g:625:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            {
            // InternalVoice.g:625:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            // InternalVoice.g:626:2: ( rule__Intent__IsFollowupAssignment_3 )?
            {
             before(grammarAccess.getIntentAccess().getIsFollowupAssignment_3()); 
            // InternalVoice.g:627:2: ( rule__Intent__IsFollowupAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVoice.g:627:3: rule__Intent__IsFollowupAssignment_3
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
    // InternalVoice.g:635:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl rule__Intent__Group__5 ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:639:1: ( rule__Intent__Group__4__Impl rule__Intent__Group__5 )
            // InternalVoice.g:640:2: rule__Intent__Group__4__Impl rule__Intent__Group__5
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
    // InternalVoice.g:647:1: rule__Intent__Group__4__Impl : ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:651:1: ( ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) )
            // InternalVoice.g:652:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            {
            // InternalVoice.g:652:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            // InternalVoice.g:653:2: ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* )
            {
            // InternalVoice.g:653:2: ( ( rule__Intent__QuestionAssignment_4 ) )
            // InternalVoice.g:654:3: ( rule__Intent__QuestionAssignment_4 )
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalVoice.g:655:3: ( rule__Intent__QuestionAssignment_4 )
            // InternalVoice.g:655:4: rule__Intent__QuestionAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Intent__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 

            }

            // InternalVoice.g:658:2: ( ( rule__Intent__QuestionAssignment_4 )* )
            // InternalVoice.g:659:3: ( rule__Intent__QuestionAssignment_4 )*
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalVoice.g:660:3: ( rule__Intent__QuestionAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=11 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVoice.g:660:4: rule__Intent__QuestionAssignment_4
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
    // InternalVoice.g:669:1: rule__Intent__Group__5 : rule__Intent__Group__5__Impl ;
    public final void rule__Intent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:673:1: ( rule__Intent__Group__5__Impl )
            // InternalVoice.g:674:2: rule__Intent__Group__5__Impl
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
    // InternalVoice.g:680:1: rule__Intent__Group__5__Impl : ( ( rule__Intent__TrainingAssignment_5 ) ) ;
    public final void rule__Intent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:684:1: ( ( ( rule__Intent__TrainingAssignment_5 ) ) )
            // InternalVoice.g:685:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            {
            // InternalVoice.g:685:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            // InternalVoice.g:686:2: ( rule__Intent__TrainingAssignment_5 )
            {
             before(grammarAccess.getIntentAccess().getTrainingAssignment_5()); 
            // InternalVoice.g:687:2: ( rule__Intent__TrainingAssignment_5 )
            // InternalVoice.g:687:3: rule__Intent__TrainingAssignment_5
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


    // $ANTLR start "rule__Intent__Group_2__0"
    // InternalVoice.g:696:1: rule__Intent__Group_2__0 : rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 ;
    public final void rule__Intent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:700:1: ( rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 )
            // InternalVoice.g:701:2: rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Intent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__1();

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
    // $ANTLR end "rule__Intent__Group_2__0"


    // $ANTLR start "rule__Intent__Group_2__0__Impl"
    // InternalVoice.g:708:1: rule__Intent__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Intent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:712:1: ( ( ':' ) )
            // InternalVoice.g:713:1: ( ':' )
            {
            // InternalVoice.g:713:1: ( ':' )
            // InternalVoice.g:714:2: ':'
            {
             before(grammarAccess.getIntentAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__Intent__Group_2__0__Impl"


    // $ANTLR start "rule__Intent__Group_2__1"
    // InternalVoice.g:723:1: rule__Intent__Group_2__1 : rule__Intent__Group_2__1__Impl ;
    public final void rule__Intent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:727:1: ( rule__Intent__Group_2__1__Impl )
            // InternalVoice.g:728:2: rule__Intent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__1__Impl();

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
    // $ANTLR end "rule__Intent__Group_2__1"


    // $ANTLR start "rule__Intent__Group_2__1__Impl"
    // InternalVoice.g:734:1: rule__Intent__Group_2__1__Impl : ( ( rule__Intent__ZuperAssignment_2_1 ) ) ;
    public final void rule__Intent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:738:1: ( ( ( rule__Intent__ZuperAssignment_2_1 ) ) )
            // InternalVoice.g:739:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            {
            // InternalVoice.g:739:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            // InternalVoice.g:740:2: ( rule__Intent__ZuperAssignment_2_1 )
            {
             before(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); 
            // InternalVoice.g:741:2: ( rule__Intent__ZuperAssignment_2_1 )
            // InternalVoice.g:741:3: rule__Intent__ZuperAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__ZuperAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); 

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
    // $ANTLR end "rule__Intent__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalVoice.g:750:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:754:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalVoice.g:755:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalVoice.g:762:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:766:1: ( ( 'Entity' ) )
            // InternalVoice.g:767:1: ( 'Entity' )
            {
            // InternalVoice.g:767:1: ( 'Entity' )
            // InternalVoice.g:768:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalVoice.g:777:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:781:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalVoice.g:782:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalVoice.g:789:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:793:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalVoice.g:794:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalVoice.g:794:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalVoice.g:795:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalVoice.g:796:2: ( rule__Entity__NameAssignment_1 )
            // InternalVoice.g:796:3: rule__Entity__NameAssignment_1
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
    // InternalVoice.g:804:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:808:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalVoice.g:809:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalVoice.g:816:1: rule__Entity__Group__2__Impl : ( '[' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:820:1: ( ( '[' ) )
            // InternalVoice.g:821:1: ( '[' )
            {
            // InternalVoice.g:821:1: ( '[' )
            // InternalVoice.g:822:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalVoice.g:831:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:835:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalVoice.g:836:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalVoice.g:843:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:847:1: ( ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) )
            // InternalVoice.g:848:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            {
            // InternalVoice.g:848:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            // InternalVoice.g:849:2: ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* )
            {
            // InternalVoice.g:849:2: ( ( rule__Entity__ExampleAssignment_3 ) )
            // InternalVoice.g:850:3: ( rule__Entity__ExampleAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalVoice.g:851:3: ( rule__Entity__ExampleAssignment_3 )
            // InternalVoice.g:851:4: rule__Entity__ExampleAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__ExampleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }

            // InternalVoice.g:854:2: ( ( rule__Entity__ExampleAssignment_3 )* )
            // InternalVoice.g:855:3: ( rule__Entity__ExampleAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalVoice.g:856:3: ( rule__Entity__ExampleAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVoice.g:856:4: rule__Entity__ExampleAssignment_3
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
    // InternalVoice.g:865:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:869:1: ( rule__Entity__Group__4__Impl )
            // InternalVoice.g:870:2: rule__Entity__Group__4__Impl
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
    // InternalVoice.g:876:1: rule__Entity__Group__4__Impl : ( ']' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:880:1: ( ( ']' ) )
            // InternalVoice.g:881:1: ( ']' )
            {
            // InternalVoice.g:881:1: ( ']' )
            // InternalVoice.g:882:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalVoice.g:892:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:896:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalVoice.g:897:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVoice.g:904:1: rule__Question__Group__0__Impl : ( ( rule__Question__QuestionEntityAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:908:1: ( ( ( rule__Question__QuestionEntityAssignment_0 ) ) )
            // InternalVoice.g:909:1: ( ( rule__Question__QuestionEntityAssignment_0 ) )
            {
            // InternalVoice.g:909:1: ( ( rule__Question__QuestionEntityAssignment_0 ) )
            // InternalVoice.g:910:2: ( rule__Question__QuestionEntityAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_0()); 
            // InternalVoice.g:911:2: ( rule__Question__QuestionEntityAssignment_0 )
            // InternalVoice.g:911:3: rule__Question__QuestionEntityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionEntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_0()); 

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
    // InternalVoice.g:919:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:923:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalVoice.g:924:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalVoice.g:931:1: rule__Question__Group__1__Impl : ( 'with' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:935:1: ( ( 'with' ) )
            // InternalVoice.g:936:1: ( 'with' )
            {
            // InternalVoice.g:936:1: ( 'with' )
            // InternalVoice.g:937:2: 'with'
            {
             before(grammarAccess.getQuestionAccess().getWithKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getWithKeyword_1()); 

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
    // InternalVoice.g:946:1: rule__Question__Group__2 : rule__Question__Group__2__Impl ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:950:1: ( rule__Question__Group__2__Impl )
            // InternalVoice.g:951:2: rule__Question__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__2__Impl();

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
    // InternalVoice.g:957:1: rule__Question__Group__2__Impl : ( ( rule__Question__PromptAssignment_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:961:1: ( ( ( rule__Question__PromptAssignment_2 ) ) )
            // InternalVoice.g:962:1: ( ( rule__Question__PromptAssignment_2 ) )
            {
            // InternalVoice.g:962:1: ( ( rule__Question__PromptAssignment_2 ) )
            // InternalVoice.g:963:2: ( rule__Question__PromptAssignment_2 )
            {
             before(grammarAccess.getQuestionAccess().getPromptAssignment_2()); 
            // InternalVoice.g:964:2: ( rule__Question__PromptAssignment_2 )
            // InternalVoice.g:964:3: rule__Question__PromptAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__PromptAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getPromptAssignment_2()); 

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


    // $ANTLR start "rule__Training__Group__0"
    // InternalVoice.g:973:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:977:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalVoice.g:978:2: rule__Training__Group__0__Impl rule__Training__Group__1
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
    // InternalVoice.g:985:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:989:1: ( ( () ) )
            // InternalVoice.g:990:1: ( () )
            {
            // InternalVoice.g:990:1: ( () )
            // InternalVoice.g:991:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalVoice.g:992:2: ()
            // InternalVoice.g:992:3: 
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
    // InternalVoice.g:1000:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1004:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalVoice.g:1005:2: rule__Training__Group__1__Impl rule__Training__Group__2
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
    // InternalVoice.g:1012:1: rule__Training__Group__1__Impl : ( 'Training:' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1016:1: ( ( 'Training:' ) )
            // InternalVoice.g:1017:1: ( 'Training:' )
            {
            // InternalVoice.g:1017:1: ( 'Training:' )
            // InternalVoice.g:1018:2: 'Training:'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalVoice.g:1027:1: rule__Training__Group__2 : rule__Training__Group__2__Impl ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1031:1: ( rule__Training__Group__2__Impl )
            // InternalVoice.g:1032:2: rule__Training__Group__2__Impl
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
    // InternalVoice.g:1038:1: rule__Training__Group__2__Impl : ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1042:1: ( ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) )
            // InternalVoice.g:1043:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            {
            // InternalVoice.g:1043:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            // InternalVoice.g:1044:2: ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* )
            {
            // InternalVoice.g:1044:2: ( ( rule__Training__TrainingrefAssignment_2 ) )
            // InternalVoice.g:1045:3: ( rule__Training__TrainingrefAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1046:3: ( rule__Training__TrainingrefAssignment_2 )
            // InternalVoice.g:1046:4: rule__Training__TrainingrefAssignment_2
            {
            pushFollow(FOLLOW_14);
            rule__Training__TrainingrefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }

            // InternalVoice.g:1049:2: ( ( rule__Training__TrainingrefAssignment_2 )* )
            // InternalVoice.g:1050:3: ( rule__Training__TrainingrefAssignment_2 )*
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1051:3: ( rule__Training__TrainingrefAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVoice.g:1051:4: rule__Training__TrainingrefAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Training__TrainingrefAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalVoice.g:1061:1: rule__TrainingRef__Group__0 : rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 ;
    public final void rule__TrainingRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1065:1: ( rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 )
            // InternalVoice.g:1066:2: rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1
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
    // InternalVoice.g:1073:1: rule__TrainingRef__Group__0__Impl : ( () ) ;
    public final void rule__TrainingRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1077:1: ( ( () ) )
            // InternalVoice.g:1078:1: ( () )
            {
            // InternalVoice.g:1078:1: ( () )
            // InternalVoice.g:1079:2: ()
            {
             before(grammarAccess.getTrainingRefAccess().getTrainingRefSimpleAction_0()); 
            // InternalVoice.g:1080:2: ()
            // InternalVoice.g:1080:3: 
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
    // InternalVoice.g:1088:1: rule__TrainingRef__Group__1 : rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 ;
    public final void rule__TrainingRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1092:1: ( rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 )
            // InternalVoice.g:1093:2: rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2
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
    // InternalVoice.g:1100:1: rule__TrainingRef__Group__1__Impl : ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) ) ;
    public final void rule__TrainingRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1104:1: ( ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) ) )
            // InternalVoice.g:1105:1: ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) )
            {
            // InternalVoice.g:1105:1: ( ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* ) )
            // InternalVoice.g:1106:2: ( ( rule__TrainingRef__Alternatives_1 ) ) ( ( rule__TrainingRef__Alternatives_1 )* )
            {
            // InternalVoice.g:1106:2: ( ( rule__TrainingRef__Alternatives_1 ) )
            // InternalVoice.g:1107:3: ( rule__TrainingRef__Alternatives_1 )
            {
             before(grammarAccess.getTrainingRefAccess().getAlternatives_1()); 
            // InternalVoice.g:1108:3: ( rule__TrainingRef__Alternatives_1 )
            // InternalVoice.g:1108:4: rule__TrainingRef__Alternatives_1
            {
            pushFollow(FOLLOW_14);
            rule__TrainingRef__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getAlternatives_1()); 

            }

            // InternalVoice.g:1111:2: ( ( rule__TrainingRef__Alternatives_1 )* )
            // InternalVoice.g:1112:3: ( rule__TrainingRef__Alternatives_1 )*
            {
             before(grammarAccess.getTrainingRefAccess().getAlternatives_1()); 
            // InternalVoice.g:1113:3: ( rule__TrainingRef__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVoice.g:1113:4: rule__TrainingRef__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TrainingRef__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalVoice.g:1122:1: rule__TrainingRef__Group__2 : rule__TrainingRef__Group__2__Impl ;
    public final void rule__TrainingRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1126:1: ( rule__TrainingRef__Group__2__Impl )
            // InternalVoice.g:1127:2: rule__TrainingRef__Group__2__Impl
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
    // InternalVoice.g:1133:1: rule__TrainingRef__Group__2__Impl : ( '.' ) ;
    public final void rule__TrainingRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1137:1: ( ( '.' ) )
            // InternalVoice.g:1138:1: ( '.' )
            {
            // InternalVoice.g:1138:1: ( '.' )
            // InternalVoice.g:1139:2: '.'
            {
             before(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalVoice.g:1149:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1153:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalVoice.g:1154:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
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
    // InternalVoice.g:1161:1: rule__Declaration__Group__0__Impl : ( '(' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1165:1: ( ( '(' ) )
            // InternalVoice.g:1166:1: ( '(' )
            {
            // InternalVoice.g:1166:1: ( '(' )
            // InternalVoice.g:1167:2: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalVoice.g:1176:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1180:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalVoice.g:1181:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
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
    // InternalVoice.g:1188:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__TrainingstringAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1192:1: ( ( ( rule__Declaration__TrainingstringAssignment_1 ) ) )
            // InternalVoice.g:1193:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            {
            // InternalVoice.g:1193:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            // InternalVoice.g:1194:2: ( rule__Declaration__TrainingstringAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 
            // InternalVoice.g:1195:2: ( rule__Declaration__TrainingstringAssignment_1 )
            // InternalVoice.g:1195:3: rule__Declaration__TrainingstringAssignment_1
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
    // InternalVoice.g:1203:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1207:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalVoice.g:1208:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
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
    // InternalVoice.g:1215:1: rule__Declaration__Group__2__Impl : ( 'is' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1219:1: ( ( 'is' ) )
            // InternalVoice.g:1220:1: ( 'is' )
            {
            // InternalVoice.g:1220:1: ( 'is' )
            // InternalVoice.g:1221:2: 'is'
            {
             before(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVoice.g:1230:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1234:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // InternalVoice.g:1235:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
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
    // InternalVoice.g:1242:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__ReferenceAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1246:1: ( ( ( rule__Declaration__ReferenceAssignment_3 ) ) )
            // InternalVoice.g:1247:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            {
            // InternalVoice.g:1247:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            // InternalVoice.g:1248:2: ( rule__Declaration__ReferenceAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 
            // InternalVoice.g:1249:2: ( rule__Declaration__ReferenceAssignment_3 )
            // InternalVoice.g:1249:3: rule__Declaration__ReferenceAssignment_3
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
    // InternalVoice.g:1257:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1261:1: ( rule__Declaration__Group__4__Impl )
            // InternalVoice.g:1262:2: rule__Declaration__Group__4__Impl
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
    // InternalVoice.g:1268:1: rule__Declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1272:1: ( ( ')' ) )
            // InternalVoice.g:1273:1: ( ')' )
            {
            // InternalVoice.g:1273:1: ( ')' )
            // InternalVoice.g:1274:2: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalVoice.g:1284:1: rule__EntityExample__Group__0 : rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 ;
    public final void rule__EntityExample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1288:1: ( rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 )
            // InternalVoice.g:1289:2: rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1
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
    // InternalVoice.g:1296:1: rule__EntityExample__Group__0__Impl : ( ( rule__EntityExample__NameAssignment_0 ) ) ;
    public final void rule__EntityExample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1300:1: ( ( ( rule__EntityExample__NameAssignment_0 ) ) )
            // InternalVoice.g:1301:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            {
            // InternalVoice.g:1301:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            // InternalVoice.g:1302:2: ( rule__EntityExample__NameAssignment_0 )
            {
             before(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 
            // InternalVoice.g:1303:2: ( rule__EntityExample__NameAssignment_0 )
            // InternalVoice.g:1303:3: rule__EntityExample__NameAssignment_0
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
    // InternalVoice.g:1311:1: rule__EntityExample__Group__1 : rule__EntityExample__Group__1__Impl ;
    public final void rule__EntityExample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1315:1: ( rule__EntityExample__Group__1__Impl )
            // InternalVoice.g:1316:2: rule__EntityExample__Group__1__Impl
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
    // InternalVoice.g:1322:1: rule__EntityExample__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EntityExample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1326:1: ( ( ( ',' )? ) )
            // InternalVoice.g:1327:1: ( ( ',' )? )
            {
            // InternalVoice.g:1327:1: ( ( ',' )? )
            // InternalVoice.g:1328:2: ( ',' )?
            {
             before(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 
            // InternalVoice.g:1329:2: ( ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVoice.g:1329:3: ','
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalVoice.g:1338:1: rule__IsFollowup__Group__0 : rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 ;
    public final void rule__IsFollowup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1342:1: ( rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 )
            // InternalVoice.g:1343:2: rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1
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
    // InternalVoice.g:1350:1: rule__IsFollowup__Group__0__Impl : ( 'IsFollowup' ) ;
    public final void rule__IsFollowup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1354:1: ( ( 'IsFollowup' ) )
            // InternalVoice.g:1355:1: ( 'IsFollowup' )
            {
            // InternalVoice.g:1355:1: ( 'IsFollowup' )
            // InternalVoice.g:1356:2: 'IsFollowup'
            {
             before(grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVoice.g:1365:1: rule__IsFollowup__Group__1 : rule__IsFollowup__Group__1__Impl ;
    public final void rule__IsFollowup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1369:1: ( rule__IsFollowup__Group__1__Impl )
            // InternalVoice.g:1370:2: rule__IsFollowup__Group__1__Impl
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
    // InternalVoice.g:1376:1: rule__IsFollowup__Group__1__Impl : ( ( rule__IsFollowup__IntentAssignment_1 ) ) ;
    public final void rule__IsFollowup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1380:1: ( ( ( rule__IsFollowup__IntentAssignment_1 ) ) )
            // InternalVoice.g:1381:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            {
            // InternalVoice.g:1381:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            // InternalVoice.g:1382:2: ( rule__IsFollowup__IntentAssignment_1 )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentAssignment_1()); 
            // InternalVoice.g:1383:2: ( rule__IsFollowup__IntentAssignment_1 )
            // InternalVoice.g:1383:3: rule__IsFollowup__IntentAssignment_1
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
    // InternalVoice.g:1392:1: rule__Model__AgentAssignment : ( ruleAgent ) ;
    public final void rule__Model__AgentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1396:1: ( ( ruleAgent ) )
            // InternalVoice.g:1397:2: ( ruleAgent )
            {
            // InternalVoice.g:1397:2: ( ruleAgent )
            // InternalVoice.g:1398:3: ruleAgent
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
    // InternalVoice.g:1407:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1411:1: ( ( RULE_ID ) )
            // InternalVoice.g:1412:2: ( RULE_ID )
            {
            // InternalVoice.g:1412:2: ( RULE_ID )
            // InternalVoice.g:1413:3: RULE_ID
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


    // $ANTLR start "rule__Intent__ZuperAssignment_2_1"
    // InternalVoice.g:1422:1: rule__Intent__ZuperAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Intent__ZuperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1426:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1427:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1427:2: ( ( RULE_ID ) )
            // InternalVoice.g:1428:3: ( RULE_ID )
            {
             before(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); 
            // InternalVoice.g:1429:3: ( RULE_ID )
            // InternalVoice.g:1430:4: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getZuperIntentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getZuperIntentIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Intent__ZuperAssignment_2_1"


    // $ANTLR start "rule__Intent__IsFollowupAssignment_3"
    // InternalVoice.g:1441:1: rule__Intent__IsFollowupAssignment_3 : ( ruleIsFollowup ) ;
    public final void rule__Intent__IsFollowupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1445:1: ( ( ruleIsFollowup ) )
            // InternalVoice.g:1446:2: ( ruleIsFollowup )
            {
            // InternalVoice.g:1446:2: ( ruleIsFollowup )
            // InternalVoice.g:1447:3: ruleIsFollowup
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
    // InternalVoice.g:1456:1: rule__Intent__QuestionAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Intent__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1460:1: ( ( ruleQuestion ) )
            // InternalVoice.g:1461:2: ( ruleQuestion )
            {
            // InternalVoice.g:1461:2: ( ruleQuestion )
            // InternalVoice.g:1462:3: ruleQuestion
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
    // InternalVoice.g:1471:1: rule__Intent__TrainingAssignment_5 : ( ruleTraining ) ;
    public final void rule__Intent__TrainingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1475:1: ( ( ruleTraining ) )
            // InternalVoice.g:1476:2: ( ruleTraining )
            {
            // InternalVoice.g:1476:2: ( ruleTraining )
            // InternalVoice.g:1477:3: ruleTraining
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
    // InternalVoice.g:1486:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1490:1: ( ( RULE_ID ) )
            // InternalVoice.g:1491:2: ( RULE_ID )
            {
            // InternalVoice.g:1491:2: ( RULE_ID )
            // InternalVoice.g:1492:3: RULE_ID
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
    // InternalVoice.g:1501:1: rule__Entity__ExampleAssignment_3 : ( ruleEntityExample ) ;
    public final void rule__Entity__ExampleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1505:1: ( ( ruleEntityExample ) )
            // InternalVoice.g:1506:2: ( ruleEntityExample )
            {
            // InternalVoice.g:1506:2: ( ruleEntityExample )
            // InternalVoice.g:1507:3: ruleEntityExample
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


    // $ANTLR start "rule__Question__QuestionEntityAssignment_0"
    // InternalVoice.g:1516:1: rule__Question__QuestionEntityAssignment_0 : ( ruleQuestionEntity ) ;
    public final void rule__Question__QuestionEntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1520:1: ( ( ruleQuestionEntity ) )
            // InternalVoice.g:1521:2: ( ruleQuestionEntity )
            {
            // InternalVoice.g:1521:2: ( ruleQuestionEntity )
            // InternalVoice.g:1522:3: ruleQuestionEntity
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionEntity();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Question__QuestionEntityAssignment_0"


    // $ANTLR start "rule__Question__PromptAssignment_2"
    // InternalVoice.g:1531:1: rule__Question__PromptAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Question__PromptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1535:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1536:2: ( RULE_STRING )
            {
            // InternalVoice.g:1536:2: ( RULE_STRING )
            // InternalVoice.g:1537:3: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Question__PromptAssignment_2"


    // $ANTLR start "rule__QuestionEntity__WithEntityAssignment"
    // InternalVoice.g:1546:1: rule__QuestionEntity__WithEntityAssignment : ( ruleReference ) ;
    public final void rule__QuestionEntity__WithEntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1550:1: ( ( ruleReference ) )
            // InternalVoice.g:1551:2: ( ruleReference )
            {
            // InternalVoice.g:1551:2: ( ruleReference )
            // InternalVoice.g:1552:3: ruleReference
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
    // InternalVoice.g:1561:1: rule__Training__TrainingrefAssignment_2 : ( ruleTrainingRef ) ;
    public final void rule__Training__TrainingrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1565:1: ( ( ruleTrainingRef ) )
            // InternalVoice.g:1566:2: ( ruleTrainingRef )
            {
            // InternalVoice.g:1566:2: ( ruleTrainingRef )
            // InternalVoice.g:1567:3: ruleTrainingRef
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
    // InternalVoice.g:1576:1: rule__TrainingRef__DeclarationsAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__TrainingRef__DeclarationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1580:1: ( ( ruleDeclaration ) )
            // InternalVoice.g:1581:2: ( ruleDeclaration )
            {
            // InternalVoice.g:1581:2: ( ruleDeclaration )
            // InternalVoice.g:1582:3: ruleDeclaration
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
    // InternalVoice.g:1591:1: rule__Declaration__TrainingstringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__TrainingstringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1595:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1596:2: ( RULE_STRING )
            {
            // InternalVoice.g:1596:2: ( RULE_STRING )
            // InternalVoice.g:1597:3: RULE_STRING
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
    // InternalVoice.g:1606:1: rule__Declaration__ReferenceAssignment_3 : ( ruleReference ) ;
    public final void rule__Declaration__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1610:1: ( ( ruleReference ) )
            // InternalVoice.g:1611:2: ( ruleReference )
            {
            // InternalVoice.g:1611:2: ( ruleReference )
            // InternalVoice.g:1612:3: ruleReference
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
    // InternalVoice.g:1621:1: rule__EntityExample__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityExample__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1625:1: ( ( RULE_ID ) )
            // InternalVoice.g:1626:2: ( RULE_ID )
            {
            // InternalVoice.g:1626:2: ( RULE_ID )
            // InternalVoice.g:1627:3: RULE_ID
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
    // InternalVoice.g:1636:1: rule__IsFollowup__IntentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IsFollowup__IntentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1640:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1641:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1641:2: ( ( RULE_ID ) )
            // InternalVoice.g:1642:3: ( RULE_ID )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0()); 
            // InternalVoice.g:1643:3: ( RULE_ID )
            // InternalVoice.g:1644:4: RULE_ID
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
    // InternalVoice.g:1655:1: rule__Sysvariable__ValueAssignment : ( ( rule__Sysvariable__ValueAlternatives_0 ) ) ;
    public final void rule__Sysvariable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1659:1: ( ( ( rule__Sysvariable__ValueAlternatives_0 ) ) )
            // InternalVoice.g:1660:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            {
            // InternalVoice.g:1660:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            // InternalVoice.g:1661:3: ( rule__Sysvariable__ValueAlternatives_0 )
            {
             before(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 
            // InternalVoice.g:1662:3: ( rule__Sysvariable__ValueAlternatives_0 )
            // InternalVoice.g:1662:4: rule__Sysvariable__ValueAlternatives_0
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
    // InternalVoice.g:1670:1: rule__Reference__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1674:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1675:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1675:2: ( ( RULE_ID ) )
            // InternalVoice.g:1676:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 
            // InternalVoice.g:1677:3: ( RULE_ID )
            // InternalVoice.g:1678:4: RULE_ID
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
    // InternalVoice.g:1689:1: rule__Reference__SysvarAssignment_1 : ( ruleSysvariable ) ;
    public final void rule__Reference__SysvarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1693:1: ( ( ruleSysvariable ) )
            // InternalVoice.g:1694:2: ( ruleSysvariable )
            {
            // InternalVoice.g:1694:2: ( ruleSysvariable )
            // InternalVoice.g:1695:3: ruleSysvariable
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001002FFF820L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001002FFF822L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});

}