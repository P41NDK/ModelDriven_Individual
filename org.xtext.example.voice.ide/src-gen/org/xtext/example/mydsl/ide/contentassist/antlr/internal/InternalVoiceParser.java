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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'", "'Intent'", "':'", "'Entity'", "'['", "']'", "'with'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'IsFollowup'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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


    // $ANTLR start "rule__Sysvariable__ValueAlternatives_0"
    // InternalVoice.g:398:1: rule__Sysvariable__ValueAlternatives_0 : ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) );
    public final void rule__Sysvariable__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:402:1: ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            case 22:
                {
                alt3=12;
                }
                break;
            case 23:
                {
                alt3=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVoice.g:403:2: ( 'number' )
                    {
                    // InternalVoice.g:403:2: ( 'number' )
                    // InternalVoice.g:404:3: 'number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:409:2: ( 'date-time' )
                    {
                    // InternalVoice.g:409:2: ( 'date-time' )
                    // InternalVoice.g:410:3: 'date-time'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVoice.g:415:2: ( 'date' )
                    {
                    // InternalVoice.g:415:2: ( 'date' )
                    // InternalVoice.g:416:3: 'date'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVoice.g:421:2: ( 'duration' )
                    {
                    // InternalVoice.g:421:2: ( 'duration' )
                    // InternalVoice.g:422:3: 'duration'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVoice.g:427:2: ( 'address' )
                    {
                    // InternalVoice.g:427:2: ( 'address' )
                    // InternalVoice.g:428:3: 'address'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVoice.g:433:2: ( 'email' )
                    {
                    // InternalVoice.g:433:2: ( 'email' )
                    // InternalVoice.g:434:3: 'email'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVoice.g:439:2: ( 'phone-number' )
                    {
                    // InternalVoice.g:439:2: ( 'phone-number' )
                    // InternalVoice.g:440:3: 'phone-number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVoice.g:445:2: ( 'date-period' )
                    {
                    // InternalVoice.g:445:2: ( 'date-period' )
                    // InternalVoice.g:446:3: 'date-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVoice.g:451:2: ( 'time-period' )
                    {
                    // InternalVoice.g:451:2: ( 'time-period' )
                    // InternalVoice.g:452:3: 'time-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVoice.g:457:2: ( 'url' )
                    {
                    // InternalVoice.g:457:2: ( 'url' )
                    // InternalVoice.g:458:3: 'url'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVoice.g:463:2: ( 'any' )
                    {
                    // InternalVoice.g:463:2: ( 'any' )
                    // InternalVoice.g:464:3: 'any'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVoice.g:469:2: ( 'color' )
                    {
                    // InternalVoice.g:469:2: ( 'color' )
                    // InternalVoice.g:470:3: 'color'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVoice.g:475:2: ( 'language' )
                    {
                    // InternalVoice.g:475:2: ( 'language' )
                    // InternalVoice.g:476:3: 'language'
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
    // InternalVoice.g:485:1: rule__Reference__Alternatives : ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:489:1: ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=11 && LA4_0<=23)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVoice.g:490:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    {
                    // InternalVoice.g:490:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    // InternalVoice.g:491:3: ( rule__Reference__EntityAssignment_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 
                    // InternalVoice.g:492:3: ( rule__Reference__EntityAssignment_0 )
                    // InternalVoice.g:492:4: rule__Reference__EntityAssignment_0
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
                    // InternalVoice.g:496:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    {
                    // InternalVoice.g:496:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    // InternalVoice.g:497:3: ( rule__Reference__SysvarAssignment_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 
                    // InternalVoice.g:498:3: ( rule__Reference__SysvarAssignment_1 )
                    // InternalVoice.g:498:4: rule__Reference__SysvarAssignment_1
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
    // InternalVoice.g:506:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:510:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalVoice.g:511:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
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
    // InternalVoice.g:518:1: rule__Intent__Group__0__Impl : ( 'Intent' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:522:1: ( ( 'Intent' ) )
            // InternalVoice.g:523:1: ( 'Intent' )
            {
            // InternalVoice.g:523:1: ( 'Intent' )
            // InternalVoice.g:524:2: 'Intent'
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
    // InternalVoice.g:533:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:537:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalVoice.g:538:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
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
    // InternalVoice.g:545:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:549:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalVoice.g:550:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalVoice.g:550:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalVoice.g:551:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalVoice.g:552:2: ( rule__Intent__NameAssignment_1 )
            // InternalVoice.g:552:3: rule__Intent__NameAssignment_1
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
    // InternalVoice.g:560:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:564:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalVoice.g:565:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
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
    // InternalVoice.g:572:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Group_2__0 )? ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:576:1: ( ( ( rule__Intent__Group_2__0 )? ) )
            // InternalVoice.g:577:1: ( ( rule__Intent__Group_2__0 )? )
            {
            // InternalVoice.g:577:1: ( ( rule__Intent__Group_2__0 )? )
            // InternalVoice.g:578:2: ( rule__Intent__Group_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_2()); 
            // InternalVoice.g:579:2: ( rule__Intent__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVoice.g:579:3: rule__Intent__Group_2__0
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
    // InternalVoice.g:587:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:591:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalVoice.g:592:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
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
    // InternalVoice.g:599:1: rule__Intent__Group__3__Impl : ( ( rule__Intent__IsFollowupAssignment_3 )? ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:603:1: ( ( ( rule__Intent__IsFollowupAssignment_3 )? ) )
            // InternalVoice.g:604:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            {
            // InternalVoice.g:604:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            // InternalVoice.g:605:2: ( rule__Intent__IsFollowupAssignment_3 )?
            {
             before(grammarAccess.getIntentAccess().getIsFollowupAssignment_3()); 
            // InternalVoice.g:606:2: ( rule__Intent__IsFollowupAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVoice.g:606:3: rule__Intent__IsFollowupAssignment_3
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
    // InternalVoice.g:614:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl rule__Intent__Group__5 ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:618:1: ( rule__Intent__Group__4__Impl rule__Intent__Group__5 )
            // InternalVoice.g:619:2: rule__Intent__Group__4__Impl rule__Intent__Group__5
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
    // InternalVoice.g:626:1: rule__Intent__Group__4__Impl : ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:630:1: ( ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) )
            // InternalVoice.g:631:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            {
            // InternalVoice.g:631:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            // InternalVoice.g:632:2: ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* )
            {
            // InternalVoice.g:632:2: ( ( rule__Intent__QuestionAssignment_4 ) )
            // InternalVoice.g:633:3: ( rule__Intent__QuestionAssignment_4 )
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalVoice.g:634:3: ( rule__Intent__QuestionAssignment_4 )
            // InternalVoice.g:634:4: rule__Intent__QuestionAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Intent__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 

            }

            // InternalVoice.g:637:2: ( ( rule__Intent__QuestionAssignment_4 )* )
            // InternalVoice.g:638:3: ( rule__Intent__QuestionAssignment_4 )*
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalVoice.g:639:3: ( rule__Intent__QuestionAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVoice.g:639:4: rule__Intent__QuestionAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Intent__QuestionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalVoice.g:648:1: rule__Intent__Group__5 : rule__Intent__Group__5__Impl ;
    public final void rule__Intent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:652:1: ( rule__Intent__Group__5__Impl )
            // InternalVoice.g:653:2: rule__Intent__Group__5__Impl
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
    // InternalVoice.g:659:1: rule__Intent__Group__5__Impl : ( ( rule__Intent__TrainingAssignment_5 ) ) ;
    public final void rule__Intent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:663:1: ( ( ( rule__Intent__TrainingAssignment_5 ) ) )
            // InternalVoice.g:664:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            {
            // InternalVoice.g:664:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            // InternalVoice.g:665:2: ( rule__Intent__TrainingAssignment_5 )
            {
             before(grammarAccess.getIntentAccess().getTrainingAssignment_5()); 
            // InternalVoice.g:666:2: ( rule__Intent__TrainingAssignment_5 )
            // InternalVoice.g:666:3: rule__Intent__TrainingAssignment_5
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
    // InternalVoice.g:675:1: rule__Intent__Group_2__0 : rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 ;
    public final void rule__Intent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:679:1: ( rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 )
            // InternalVoice.g:680:2: rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1
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
    // InternalVoice.g:687:1: rule__Intent__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Intent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:691:1: ( ( ':' ) )
            // InternalVoice.g:692:1: ( ':' )
            {
            // InternalVoice.g:692:1: ( ':' )
            // InternalVoice.g:693:2: ':'
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
    // InternalVoice.g:702:1: rule__Intent__Group_2__1 : rule__Intent__Group_2__1__Impl ;
    public final void rule__Intent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:706:1: ( rule__Intent__Group_2__1__Impl )
            // InternalVoice.g:707:2: rule__Intent__Group_2__1__Impl
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
    // InternalVoice.g:713:1: rule__Intent__Group_2__1__Impl : ( ( rule__Intent__ZuperAssignment_2_1 ) ) ;
    public final void rule__Intent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:717:1: ( ( ( rule__Intent__ZuperAssignment_2_1 ) ) )
            // InternalVoice.g:718:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            {
            // InternalVoice.g:718:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            // InternalVoice.g:719:2: ( rule__Intent__ZuperAssignment_2_1 )
            {
             before(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); 
            // InternalVoice.g:720:2: ( rule__Intent__ZuperAssignment_2_1 )
            // InternalVoice.g:720:3: rule__Intent__ZuperAssignment_2_1
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
    // InternalVoice.g:729:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:733:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalVoice.g:734:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalVoice.g:741:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:745:1: ( ( 'Entity' ) )
            // InternalVoice.g:746:1: ( 'Entity' )
            {
            // InternalVoice.g:746:1: ( 'Entity' )
            // InternalVoice.g:747:2: 'Entity'
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
    // InternalVoice.g:756:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:760:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalVoice.g:761:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalVoice.g:768:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:772:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalVoice.g:773:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalVoice.g:773:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalVoice.g:774:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalVoice.g:775:2: ( rule__Entity__NameAssignment_1 )
            // InternalVoice.g:775:3: rule__Entity__NameAssignment_1
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
    // InternalVoice.g:783:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:787:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalVoice.g:788:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalVoice.g:795:1: rule__Entity__Group__2__Impl : ( '[' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:799:1: ( ( '[' ) )
            // InternalVoice.g:800:1: ( '[' )
            {
            // InternalVoice.g:800:1: ( '[' )
            // InternalVoice.g:801:2: '['
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
    // InternalVoice.g:810:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:814:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalVoice.g:815:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalVoice.g:822:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:826:1: ( ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) )
            // InternalVoice.g:827:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            {
            // InternalVoice.g:827:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            // InternalVoice.g:828:2: ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* )
            {
            // InternalVoice.g:828:2: ( ( rule__Entity__ExampleAssignment_3 ) )
            // InternalVoice.g:829:3: ( rule__Entity__ExampleAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalVoice.g:830:3: ( rule__Entity__ExampleAssignment_3 )
            // InternalVoice.g:830:4: rule__Entity__ExampleAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__ExampleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }

            // InternalVoice.g:833:2: ( ( rule__Entity__ExampleAssignment_3 )* )
            // InternalVoice.g:834:3: ( rule__Entity__ExampleAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalVoice.g:835:3: ( rule__Entity__ExampleAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVoice.g:835:4: rule__Entity__ExampleAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__ExampleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalVoice.g:844:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:848:1: ( rule__Entity__Group__4__Impl )
            // InternalVoice.g:849:2: rule__Entity__Group__4__Impl
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
    // InternalVoice.g:855:1: rule__Entity__Group__4__Impl : ( ']' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:859:1: ( ( ']' ) )
            // InternalVoice.g:860:1: ( ']' )
            {
            // InternalVoice.g:860:1: ( ']' )
            // InternalVoice.g:861:2: ']'
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
    // InternalVoice.g:871:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:875:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalVoice.g:876:2: rule__Question__Group__0__Impl rule__Question__Group__1
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
    // InternalVoice.g:883:1: rule__Question__Group__0__Impl : ( ( rule__Question__QuestionEntityAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:887:1: ( ( ( rule__Question__QuestionEntityAssignment_0 ) ) )
            // InternalVoice.g:888:1: ( ( rule__Question__QuestionEntityAssignment_0 ) )
            {
            // InternalVoice.g:888:1: ( ( rule__Question__QuestionEntityAssignment_0 ) )
            // InternalVoice.g:889:2: ( rule__Question__QuestionEntityAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_0()); 
            // InternalVoice.g:890:2: ( rule__Question__QuestionEntityAssignment_0 )
            // InternalVoice.g:890:3: rule__Question__QuestionEntityAssignment_0
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
    // InternalVoice.g:898:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:902:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalVoice.g:903:2: rule__Question__Group__1__Impl rule__Question__Group__2
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
    // InternalVoice.g:910:1: rule__Question__Group__1__Impl : ( 'with' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:914:1: ( ( 'with' ) )
            // InternalVoice.g:915:1: ( 'with' )
            {
            // InternalVoice.g:915:1: ( 'with' )
            // InternalVoice.g:916:2: 'with'
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
    // InternalVoice.g:925:1: rule__Question__Group__2 : rule__Question__Group__2__Impl ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:929:1: ( rule__Question__Group__2__Impl )
            // InternalVoice.g:930:2: rule__Question__Group__2__Impl
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
    // InternalVoice.g:936:1: rule__Question__Group__2__Impl : ( ( rule__Question__PromptAssignment_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:940:1: ( ( ( rule__Question__PromptAssignment_2 ) ) )
            // InternalVoice.g:941:1: ( ( rule__Question__PromptAssignment_2 ) )
            {
            // InternalVoice.g:941:1: ( ( rule__Question__PromptAssignment_2 ) )
            // InternalVoice.g:942:2: ( rule__Question__PromptAssignment_2 )
            {
             before(grammarAccess.getQuestionAccess().getPromptAssignment_2()); 
            // InternalVoice.g:943:2: ( rule__Question__PromptAssignment_2 )
            // InternalVoice.g:943:3: rule__Question__PromptAssignment_2
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
    // InternalVoice.g:952:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:956:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalVoice.g:957:2: rule__Training__Group__0__Impl rule__Training__Group__1
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
    // InternalVoice.g:964:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:968:1: ( ( () ) )
            // InternalVoice.g:969:1: ( () )
            {
            // InternalVoice.g:969:1: ( () )
            // InternalVoice.g:970:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalVoice.g:971:2: ()
            // InternalVoice.g:971:3: 
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
    // InternalVoice.g:979:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:983:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalVoice.g:984:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalVoice.g:991:1: rule__Training__Group__1__Impl : ( 'Training:' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:995:1: ( ( 'Training:' ) )
            // InternalVoice.g:996:1: ( 'Training:' )
            {
            // InternalVoice.g:996:1: ( 'Training:' )
            // InternalVoice.g:997:2: 'Training:'
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
    // InternalVoice.g:1006:1: rule__Training__Group__2 : rule__Training__Group__2__Impl ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1010:1: ( rule__Training__Group__2__Impl )
            // InternalVoice.g:1011:2: rule__Training__Group__2__Impl
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
    // InternalVoice.g:1017:1: rule__Training__Group__2__Impl : ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1021:1: ( ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) )
            // InternalVoice.g:1022:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            {
            // InternalVoice.g:1022:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            // InternalVoice.g:1023:2: ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* )
            {
            // InternalVoice.g:1023:2: ( ( rule__Training__TrainingrefAssignment_2 ) )
            // InternalVoice.g:1024:3: ( rule__Training__TrainingrefAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1025:3: ( rule__Training__TrainingrefAssignment_2 )
            // InternalVoice.g:1025:4: rule__Training__TrainingrefAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__Training__TrainingrefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }

            // InternalVoice.g:1028:2: ( ( rule__Training__TrainingrefAssignment_2 )* )
            // InternalVoice.g:1029:3: ( rule__Training__TrainingrefAssignment_2 )*
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1030:3: ( rule__Training__TrainingrefAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVoice.g:1030:4: rule__Training__TrainingrefAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Training__TrainingrefAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalVoice.g:1040:1: rule__TrainingRef__Group__0 : rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 ;
    public final void rule__TrainingRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1044:1: ( rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 )
            // InternalVoice.g:1045:2: rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalVoice.g:1052:1: rule__TrainingRef__Group__0__Impl : ( ( rule__TrainingRef__PhraseAssignment_0 ) ) ;
    public final void rule__TrainingRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1056:1: ( ( ( rule__TrainingRef__PhraseAssignment_0 ) ) )
            // InternalVoice.g:1057:1: ( ( rule__TrainingRef__PhraseAssignment_0 ) )
            {
            // InternalVoice.g:1057:1: ( ( rule__TrainingRef__PhraseAssignment_0 ) )
            // InternalVoice.g:1058:2: ( rule__TrainingRef__PhraseAssignment_0 )
            {
             before(grammarAccess.getTrainingRefAccess().getPhraseAssignment_0()); 
            // InternalVoice.g:1059:2: ( rule__TrainingRef__PhraseAssignment_0 )
            // InternalVoice.g:1059:3: rule__TrainingRef__PhraseAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__PhraseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getPhraseAssignment_0()); 

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
    // $ANTLR end "rule__TrainingRef__Group__0__Impl"


    // $ANTLR start "rule__TrainingRef__Group__1"
    // InternalVoice.g:1067:1: rule__TrainingRef__Group__1 : rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 ;
    public final void rule__TrainingRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1071:1: ( rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 )
            // InternalVoice.g:1072:2: rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2
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
    // InternalVoice.g:1079:1: rule__TrainingRef__Group__1__Impl : ( ( rule__TrainingRef__DeclarationsAssignment_1 ) ) ;
    public final void rule__TrainingRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1083:1: ( ( ( rule__TrainingRef__DeclarationsAssignment_1 ) ) )
            // InternalVoice.g:1084:1: ( ( rule__TrainingRef__DeclarationsAssignment_1 ) )
            {
            // InternalVoice.g:1084:1: ( ( rule__TrainingRef__DeclarationsAssignment_1 ) )
            // InternalVoice.g:1085:2: ( rule__TrainingRef__DeclarationsAssignment_1 )
            {
             before(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1()); 
            // InternalVoice.g:1086:2: ( rule__TrainingRef__DeclarationsAssignment_1 )
            // InternalVoice.g:1086:3: rule__TrainingRef__DeclarationsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__DeclarationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1()); 

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
    // InternalVoice.g:1094:1: rule__TrainingRef__Group__2 : rule__TrainingRef__Group__2__Impl ;
    public final void rule__TrainingRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1098:1: ( rule__TrainingRef__Group__2__Impl )
            // InternalVoice.g:1099:2: rule__TrainingRef__Group__2__Impl
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
    // InternalVoice.g:1105:1: rule__TrainingRef__Group__2__Impl : ( '.' ) ;
    public final void rule__TrainingRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1109:1: ( ( '.' ) )
            // InternalVoice.g:1110:1: ( '.' )
            {
            // InternalVoice.g:1110:1: ( '.' )
            // InternalVoice.g:1111:2: '.'
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
    // InternalVoice.g:1121:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1125:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalVoice.g:1126:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
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
    // InternalVoice.g:1133:1: rule__Declaration__Group__0__Impl : ( '(' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1137:1: ( ( '(' ) )
            // InternalVoice.g:1138:1: ( '(' )
            {
            // InternalVoice.g:1138:1: ( '(' )
            // InternalVoice.g:1139:2: '('
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
    // InternalVoice.g:1148:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1152:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalVoice.g:1153:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
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
    // InternalVoice.g:1160:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__TrainingstringAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1164:1: ( ( ( rule__Declaration__TrainingstringAssignment_1 ) ) )
            // InternalVoice.g:1165:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            {
            // InternalVoice.g:1165:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            // InternalVoice.g:1166:2: ( rule__Declaration__TrainingstringAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 
            // InternalVoice.g:1167:2: ( rule__Declaration__TrainingstringAssignment_1 )
            // InternalVoice.g:1167:3: rule__Declaration__TrainingstringAssignment_1
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
    // InternalVoice.g:1175:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1179:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalVoice.g:1180:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
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
    // InternalVoice.g:1187:1: rule__Declaration__Group__2__Impl : ( 'is' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1191:1: ( ( 'is' ) )
            // InternalVoice.g:1192:1: ( 'is' )
            {
            // InternalVoice.g:1192:1: ( 'is' )
            // InternalVoice.g:1193:2: 'is'
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
    // InternalVoice.g:1202:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1206:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // InternalVoice.g:1207:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
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
    // InternalVoice.g:1214:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__ReferenceAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1218:1: ( ( ( rule__Declaration__ReferenceAssignment_3 ) ) )
            // InternalVoice.g:1219:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            {
            // InternalVoice.g:1219:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            // InternalVoice.g:1220:2: ( rule__Declaration__ReferenceAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 
            // InternalVoice.g:1221:2: ( rule__Declaration__ReferenceAssignment_3 )
            // InternalVoice.g:1221:3: rule__Declaration__ReferenceAssignment_3
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
    // InternalVoice.g:1229:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1233:1: ( rule__Declaration__Group__4__Impl )
            // InternalVoice.g:1234:2: rule__Declaration__Group__4__Impl
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
    // InternalVoice.g:1240:1: rule__Declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1244:1: ( ( ')' ) )
            // InternalVoice.g:1245:1: ( ')' )
            {
            // InternalVoice.g:1245:1: ( ')' )
            // InternalVoice.g:1246:2: ')'
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
    // InternalVoice.g:1256:1: rule__EntityExample__Group__0 : rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 ;
    public final void rule__EntityExample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1260:1: ( rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 )
            // InternalVoice.g:1261:2: rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1
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
    // InternalVoice.g:1268:1: rule__EntityExample__Group__0__Impl : ( ( rule__EntityExample__NameAssignment_0 ) ) ;
    public final void rule__EntityExample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1272:1: ( ( ( rule__EntityExample__NameAssignment_0 ) ) )
            // InternalVoice.g:1273:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            {
            // InternalVoice.g:1273:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            // InternalVoice.g:1274:2: ( rule__EntityExample__NameAssignment_0 )
            {
             before(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 
            // InternalVoice.g:1275:2: ( rule__EntityExample__NameAssignment_0 )
            // InternalVoice.g:1275:3: rule__EntityExample__NameAssignment_0
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
    // InternalVoice.g:1283:1: rule__EntityExample__Group__1 : rule__EntityExample__Group__1__Impl ;
    public final void rule__EntityExample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1287:1: ( rule__EntityExample__Group__1__Impl )
            // InternalVoice.g:1288:2: rule__EntityExample__Group__1__Impl
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
    // InternalVoice.g:1294:1: rule__EntityExample__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EntityExample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1298:1: ( ( ( ',' )? ) )
            // InternalVoice.g:1299:1: ( ( ',' )? )
            {
            // InternalVoice.g:1299:1: ( ( ',' )? )
            // InternalVoice.g:1300:2: ( ',' )?
            {
             before(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 
            // InternalVoice.g:1301:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVoice.g:1301:3: ','
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
    // InternalVoice.g:1310:1: rule__IsFollowup__Group__0 : rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 ;
    public final void rule__IsFollowup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1314:1: ( rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 )
            // InternalVoice.g:1315:2: rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1
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
    // InternalVoice.g:1322:1: rule__IsFollowup__Group__0__Impl : ( 'IsFollowup' ) ;
    public final void rule__IsFollowup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1326:1: ( ( 'IsFollowup' ) )
            // InternalVoice.g:1327:1: ( 'IsFollowup' )
            {
            // InternalVoice.g:1327:1: ( 'IsFollowup' )
            // InternalVoice.g:1328:2: 'IsFollowup'
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
    // InternalVoice.g:1337:1: rule__IsFollowup__Group__1 : rule__IsFollowup__Group__1__Impl ;
    public final void rule__IsFollowup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1341:1: ( rule__IsFollowup__Group__1__Impl )
            // InternalVoice.g:1342:2: rule__IsFollowup__Group__1__Impl
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
    // InternalVoice.g:1348:1: rule__IsFollowup__Group__1__Impl : ( ( rule__IsFollowup__IntentAssignment_1 ) ) ;
    public final void rule__IsFollowup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1352:1: ( ( ( rule__IsFollowup__IntentAssignment_1 ) ) )
            // InternalVoice.g:1353:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            {
            // InternalVoice.g:1353:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            // InternalVoice.g:1354:2: ( rule__IsFollowup__IntentAssignment_1 )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentAssignment_1()); 
            // InternalVoice.g:1355:2: ( rule__IsFollowup__IntentAssignment_1 )
            // InternalVoice.g:1355:3: rule__IsFollowup__IntentAssignment_1
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
    // InternalVoice.g:1364:1: rule__Model__AgentAssignment : ( ruleAgent ) ;
    public final void rule__Model__AgentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1368:1: ( ( ruleAgent ) )
            // InternalVoice.g:1369:2: ( ruleAgent )
            {
            // InternalVoice.g:1369:2: ( ruleAgent )
            // InternalVoice.g:1370:3: ruleAgent
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
    // InternalVoice.g:1379:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1383:1: ( ( RULE_ID ) )
            // InternalVoice.g:1384:2: ( RULE_ID )
            {
            // InternalVoice.g:1384:2: ( RULE_ID )
            // InternalVoice.g:1385:3: RULE_ID
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
    // InternalVoice.g:1394:1: rule__Intent__ZuperAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Intent__ZuperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1398:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1399:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1399:2: ( ( RULE_ID ) )
            // InternalVoice.g:1400:3: ( RULE_ID )
            {
             before(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); 
            // InternalVoice.g:1401:3: ( RULE_ID )
            // InternalVoice.g:1402:4: RULE_ID
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
    // InternalVoice.g:1413:1: rule__Intent__IsFollowupAssignment_3 : ( ruleIsFollowup ) ;
    public final void rule__Intent__IsFollowupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1417:1: ( ( ruleIsFollowup ) )
            // InternalVoice.g:1418:2: ( ruleIsFollowup )
            {
            // InternalVoice.g:1418:2: ( ruleIsFollowup )
            // InternalVoice.g:1419:3: ruleIsFollowup
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
    // InternalVoice.g:1428:1: rule__Intent__QuestionAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Intent__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1432:1: ( ( ruleQuestion ) )
            // InternalVoice.g:1433:2: ( ruleQuestion )
            {
            // InternalVoice.g:1433:2: ( ruleQuestion )
            // InternalVoice.g:1434:3: ruleQuestion
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
    // InternalVoice.g:1443:1: rule__Intent__TrainingAssignment_5 : ( ruleTraining ) ;
    public final void rule__Intent__TrainingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1447:1: ( ( ruleTraining ) )
            // InternalVoice.g:1448:2: ( ruleTraining )
            {
            // InternalVoice.g:1448:2: ( ruleTraining )
            // InternalVoice.g:1449:3: ruleTraining
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
    // InternalVoice.g:1458:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1462:1: ( ( RULE_ID ) )
            // InternalVoice.g:1463:2: ( RULE_ID )
            {
            // InternalVoice.g:1463:2: ( RULE_ID )
            // InternalVoice.g:1464:3: RULE_ID
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
    // InternalVoice.g:1473:1: rule__Entity__ExampleAssignment_3 : ( ruleEntityExample ) ;
    public final void rule__Entity__ExampleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1477:1: ( ( ruleEntityExample ) )
            // InternalVoice.g:1478:2: ( ruleEntityExample )
            {
            // InternalVoice.g:1478:2: ( ruleEntityExample )
            // InternalVoice.g:1479:3: ruleEntityExample
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
    // InternalVoice.g:1488:1: rule__Question__QuestionEntityAssignment_0 : ( ruleQuestionEntity ) ;
    public final void rule__Question__QuestionEntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1492:1: ( ( ruleQuestionEntity ) )
            // InternalVoice.g:1493:2: ( ruleQuestionEntity )
            {
            // InternalVoice.g:1493:2: ( ruleQuestionEntity )
            // InternalVoice.g:1494:3: ruleQuestionEntity
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
    // InternalVoice.g:1503:1: rule__Question__PromptAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Question__PromptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1507:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1508:2: ( RULE_STRING )
            {
            // InternalVoice.g:1508:2: ( RULE_STRING )
            // InternalVoice.g:1509:3: RULE_STRING
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
    // InternalVoice.g:1518:1: rule__QuestionEntity__WithEntityAssignment : ( ruleReference ) ;
    public final void rule__QuestionEntity__WithEntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1522:1: ( ( ruleReference ) )
            // InternalVoice.g:1523:2: ( ruleReference )
            {
            // InternalVoice.g:1523:2: ( ruleReference )
            // InternalVoice.g:1524:3: ruleReference
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
    // InternalVoice.g:1533:1: rule__Training__TrainingrefAssignment_2 : ( ruleTrainingRef ) ;
    public final void rule__Training__TrainingrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1537:1: ( ( ruleTrainingRef ) )
            // InternalVoice.g:1538:2: ( ruleTrainingRef )
            {
            // InternalVoice.g:1538:2: ( ruleTrainingRef )
            // InternalVoice.g:1539:3: ruleTrainingRef
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


    // $ANTLR start "rule__TrainingRef__PhraseAssignment_0"
    // InternalVoice.g:1548:1: rule__TrainingRef__PhraseAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TrainingRef__PhraseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1552:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1553:2: ( RULE_STRING )
            {
            // InternalVoice.g:1553:2: ( RULE_STRING )
            // InternalVoice.g:1554:3: RULE_STRING
            {
             before(grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TrainingRef__PhraseAssignment_0"


    // $ANTLR start "rule__TrainingRef__DeclarationsAssignment_1"
    // InternalVoice.g:1563:1: rule__TrainingRef__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__TrainingRef__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1567:1: ( ( ruleDeclaration ) )
            // InternalVoice.g:1568:2: ( ruleDeclaration )
            {
            // InternalVoice.g:1568:2: ( ruleDeclaration )
            // InternalVoice.g:1569:3: ruleDeclaration
            {
             before(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TrainingRef__DeclarationsAssignment_1"


    // $ANTLR start "rule__Declaration__TrainingstringAssignment_1"
    // InternalVoice.g:1578:1: rule__Declaration__TrainingstringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__TrainingstringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1582:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1583:2: ( RULE_STRING )
            {
            // InternalVoice.g:1583:2: ( RULE_STRING )
            // InternalVoice.g:1584:3: RULE_STRING
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
    // InternalVoice.g:1593:1: rule__Declaration__ReferenceAssignment_3 : ( ruleReference ) ;
    public final void rule__Declaration__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1597:1: ( ( ruleReference ) )
            // InternalVoice.g:1598:2: ( ruleReference )
            {
            // InternalVoice.g:1598:2: ( ruleReference )
            // InternalVoice.g:1599:3: ruleReference
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
    // InternalVoice.g:1608:1: rule__EntityExample__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityExample__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1612:1: ( ( RULE_ID ) )
            // InternalVoice.g:1613:2: ( RULE_ID )
            {
            // InternalVoice.g:1613:2: ( RULE_ID )
            // InternalVoice.g:1614:3: RULE_ID
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
    // InternalVoice.g:1623:1: rule__IsFollowup__IntentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IsFollowup__IntentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1627:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1628:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1628:2: ( ( RULE_ID ) )
            // InternalVoice.g:1629:3: ( RULE_ID )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0()); 
            // InternalVoice.g:1630:3: ( RULE_ID )
            // InternalVoice.g:1631:4: RULE_ID
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
    // InternalVoice.g:1642:1: rule__Sysvariable__ValueAssignment : ( ( rule__Sysvariable__ValueAlternatives_0 ) ) ;
    public final void rule__Sysvariable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1646:1: ( ( ( rule__Sysvariable__ValueAlternatives_0 ) ) )
            // InternalVoice.g:1647:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            {
            // InternalVoice.g:1647:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            // InternalVoice.g:1648:3: ( rule__Sysvariable__ValueAlternatives_0 )
            {
             before(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 
            // InternalVoice.g:1649:3: ( rule__Sysvariable__ValueAlternatives_0 )
            // InternalVoice.g:1649:4: rule__Sysvariable__ValueAlternatives_0
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
    // InternalVoice.g:1657:1: rule__Reference__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1661:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1662:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1662:2: ( ( RULE_ID ) )
            // InternalVoice.g:1663:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 
            // InternalVoice.g:1664:3: ( RULE_ID )
            // InternalVoice.g:1665:4: RULE_ID
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
    // InternalVoice.g:1676:1: rule__Reference__SysvarAssignment_1 : ( ruleSysvariable ) ;
    public final void rule__Reference__SysvarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1680:1: ( ( ruleSysvariable ) )
            // InternalVoice.g:1681:2: ( ruleSysvariable )
            {
            // InternalVoice.g:1681:2: ( ruleSysvariable )
            // InternalVoice.g:1682:3: ruleSysvariable
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001002FFF810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001002FFF812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});

}