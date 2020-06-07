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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'", "'Intent'", "'extends'", "'Entity'", "'['", "']'", "'get'", "'with'", "'='", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'IsFollowup'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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


    // $ANTLR start "entryRuleQuestionReference"
    // InternalVoice.g:153:1: entryRuleQuestionReference : ruleQuestionReference EOF ;
    public final void entryRuleQuestionReference() throws RecognitionException {
        try {
            // InternalVoice.g:154:1: ( ruleQuestionReference EOF )
            // InternalVoice.g:155:1: ruleQuestionReference EOF
            {
             before(grammarAccess.getQuestionReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionReference();

            state._fsp--;

             after(grammarAccess.getQuestionReferenceRule()); 
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
    // $ANTLR end "entryRuleQuestionReference"


    // $ANTLR start "ruleQuestionReference"
    // InternalVoice.g:162:1: ruleQuestionReference : ( ( rule__QuestionReference__Alternatives ) ) ;
    public final void ruleQuestionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:166:2: ( ( ( rule__QuestionReference__Alternatives ) ) )
            // InternalVoice.g:167:2: ( ( rule__QuestionReference__Alternatives ) )
            {
            // InternalVoice.g:167:2: ( ( rule__QuestionReference__Alternatives ) )
            // InternalVoice.g:168:3: ( rule__QuestionReference__Alternatives )
            {
             before(grammarAccess.getQuestionReferenceAccess().getAlternatives()); 
            // InternalVoice.g:169:3: ( rule__QuestionReference__Alternatives )
            // InternalVoice.g:169:4: rule__QuestionReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QuestionReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionReferenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuestionReference"


    // $ANTLR start "entryRuleQuestion"
    // InternalVoice.g:178:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalVoice.g:179:1: ( ruleQuestion EOF )
            // InternalVoice.g:180:1: ruleQuestion EOF
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
    // InternalVoice.g:187:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:191:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalVoice.g:192:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalVoice.g:192:2: ( ( rule__Question__Group__0 ) )
            // InternalVoice.g:193:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalVoice.g:194:3: ( rule__Question__Group__0 )
            // InternalVoice.g:194:4: rule__Question__Group__0
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
    // InternalVoice.g:203:1: entryRuleQuestionEntity : ruleQuestionEntity EOF ;
    public final void entryRuleQuestionEntity() throws RecognitionException {
        try {
            // InternalVoice.g:204:1: ( ruleQuestionEntity EOF )
            // InternalVoice.g:205:1: ruleQuestionEntity EOF
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
    // InternalVoice.g:212:1: ruleQuestionEntity : ( ( rule__QuestionEntity__WithEntityAssignment ) ) ;
    public final void ruleQuestionEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:216:2: ( ( ( rule__QuestionEntity__WithEntityAssignment ) ) )
            // InternalVoice.g:217:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            {
            // InternalVoice.g:217:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            // InternalVoice.g:218:3: ( rule__QuestionEntity__WithEntityAssignment )
            {
             before(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); 
            // InternalVoice.g:219:3: ( rule__QuestionEntity__WithEntityAssignment )
            // InternalVoice.g:219:4: rule__QuestionEntity__WithEntityAssignment
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


    // $ANTLR start "entryRuleReference"
    // InternalVoice.g:228:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalVoice.g:229:1: ( ruleReference EOF )
            // InternalVoice.g:230:1: ruleReference EOF
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
    // InternalVoice.g:237:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:241:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalVoice.g:242:2: ( ( rule__Reference__Alternatives ) )
            {
            // InternalVoice.g:242:2: ( ( rule__Reference__Alternatives ) )
            // InternalVoice.g:243:3: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalVoice.g:244:3: ( rule__Reference__Alternatives )
            // InternalVoice.g:244:4: rule__Reference__Alternatives
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


    // $ANTLR start "entryRuleIsFollowup"
    // InternalVoice.g:353:1: entryRuleIsFollowup : ruleIsFollowup EOF ;
    public final void entryRuleIsFollowup() throws RecognitionException {
        try {
            // InternalVoice.g:354:1: ( ruleIsFollowup EOF )
            // InternalVoice.g:355:1: ruleIsFollowup EOF
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
    // InternalVoice.g:362:1: ruleIsFollowup : ( ( rule__IsFollowup__Group__0 ) ) ;
    public final void ruleIsFollowup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:366:2: ( ( ( rule__IsFollowup__Group__0 ) ) )
            // InternalVoice.g:367:2: ( ( rule__IsFollowup__Group__0 ) )
            {
            // InternalVoice.g:367:2: ( ( rule__IsFollowup__Group__0 ) )
            // InternalVoice.g:368:3: ( rule__IsFollowup__Group__0 )
            {
             before(grammarAccess.getIsFollowupAccess().getGroup()); 
            // InternalVoice.g:369:3: ( rule__IsFollowup__Group__0 )
            // InternalVoice.g:369:4: rule__IsFollowup__Group__0
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
    // InternalVoice.g:378:1: entryRuleSysvariable : ruleSysvariable EOF ;
    public final void entryRuleSysvariable() throws RecognitionException {
        try {
            // InternalVoice.g:379:1: ( ruleSysvariable EOF )
            // InternalVoice.g:380:1: ruleSysvariable EOF
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
    // InternalVoice.g:387:1: ruleSysvariable : ( ( rule__Sysvariable__Group__0 ) ) ;
    public final void ruleSysvariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:391:2: ( ( ( rule__Sysvariable__Group__0 ) ) )
            // InternalVoice.g:392:2: ( ( rule__Sysvariable__Group__0 ) )
            {
            // InternalVoice.g:392:2: ( ( rule__Sysvariable__Group__0 ) )
            // InternalVoice.g:393:3: ( rule__Sysvariable__Group__0 )
            {
             before(grammarAccess.getSysvariableAccess().getGroup()); 
            // InternalVoice.g:394:3: ( rule__Sysvariable__Group__0 )
            // InternalVoice.g:394:4: rule__Sysvariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getGroup()); 

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


    // $ANTLR start "rule__Agent__Alternatives"
    // InternalVoice.g:402:1: rule__Agent__Alternatives : ( ( ruleEntity ) | ( ruleIntent ) );
    public final void rule__Agent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:406:1: ( ( ruleEntity ) | ( ruleIntent ) )
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
                    // InternalVoice.g:407:2: ( ruleEntity )
                    {
                    // InternalVoice.g:407:2: ( ruleEntity )
                    // InternalVoice.g:408:3: ruleEntity
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
                    // InternalVoice.g:413:2: ( ruleIntent )
                    {
                    // InternalVoice.g:413:2: ( ruleIntent )
                    // InternalVoice.g:414:3: ruleIntent
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


    // $ANTLR start "rule__QuestionReference__Alternatives"
    // InternalVoice.g:423:1: rule__QuestionReference__Alternatives : ( ( ( rule__QuestionReference__QuestionAssignment_0 ) ) | ( ( rule__QuestionReference__Group_1__0 ) ) );
    public final void rule__QuestionReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:427:1: ( ( ( rule__QuestionReference__QuestionAssignment_0 ) ) | ( ( rule__QuestionReference__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=11 && LA3_0<=23)) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVoice.g:428:2: ( ( rule__QuestionReference__QuestionAssignment_0 ) )
                    {
                    // InternalVoice.g:428:2: ( ( rule__QuestionReference__QuestionAssignment_0 ) )
                    // InternalVoice.g:429:3: ( rule__QuestionReference__QuestionAssignment_0 )
                    {
                     before(grammarAccess.getQuestionReferenceAccess().getQuestionAssignment_0()); 
                    // InternalVoice.g:430:3: ( rule__QuestionReference__QuestionAssignment_0 )
                    // InternalVoice.g:430:4: rule__QuestionReference__QuestionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionReference__QuestionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionReferenceAccess().getQuestionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:434:2: ( ( rule__QuestionReference__Group_1__0 ) )
                    {
                    // InternalVoice.g:434:2: ( ( rule__QuestionReference__Group_1__0 ) )
                    // InternalVoice.g:435:3: ( rule__QuestionReference__Group_1__0 )
                    {
                     before(grammarAccess.getQuestionReferenceAccess().getGroup_1()); 
                    // InternalVoice.g:436:3: ( rule__QuestionReference__Group_1__0 )
                    // InternalVoice.g:436:4: rule__QuestionReference__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionReference__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionReferenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QuestionReference__Alternatives"


    // $ANTLR start "rule__Reference__Alternatives"
    // InternalVoice.g:444:1: rule__Reference__Alternatives : ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:448:1: ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) )
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
                    // InternalVoice.g:449:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    {
                    // InternalVoice.g:449:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    // InternalVoice.g:450:3: ( rule__Reference__EntityAssignment_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 
                    // InternalVoice.g:451:3: ( rule__Reference__EntityAssignment_0 )
                    // InternalVoice.g:451:4: rule__Reference__EntityAssignment_0
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
                    // InternalVoice.g:455:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    {
                    // InternalVoice.g:455:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    // InternalVoice.g:456:3: ( rule__Reference__SysvarAssignment_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 
                    // InternalVoice.g:457:3: ( rule__Reference__SysvarAssignment_1 )
                    // InternalVoice.g:457:4: rule__Reference__SysvarAssignment_1
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


    // $ANTLR start "rule__Sysvariable__DefaultValueAlternatives_1_0"
    // InternalVoice.g:465:1: rule__Sysvariable__DefaultValueAlternatives_1_0 : ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) );
    public final void rule__Sysvariable__DefaultValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:469:1: ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) )
            int alt5=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            case 20:
                {
                alt5=10;
                }
                break;
            case 21:
                {
                alt5=11;
                }
                break;
            case 22:
                {
                alt5=12;
                }
                break;
            case 23:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVoice.g:470:2: ( 'number' )
                    {
                    // InternalVoice.g:470:2: ( 'number' )
                    // InternalVoice.g:471:3: 'number'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueNumberKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueNumberKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:476:2: ( 'date-time' )
                    {
                    // InternalVoice.g:476:2: ( 'date-time' )
                    // InternalVoice.g:477:3: 'date-time'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueDateTimeKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueDateTimeKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVoice.g:482:2: ( 'date' )
                    {
                    // InternalVoice.g:482:2: ( 'date' )
                    // InternalVoice.g:483:3: 'date'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueDateKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueDateKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVoice.g:488:2: ( 'duration' )
                    {
                    // InternalVoice.g:488:2: ( 'duration' )
                    // InternalVoice.g:489:3: 'duration'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueDurationKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueDurationKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVoice.g:494:2: ( 'address' )
                    {
                    // InternalVoice.g:494:2: ( 'address' )
                    // InternalVoice.g:495:3: 'address'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueAddressKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueAddressKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVoice.g:500:2: ( 'email' )
                    {
                    // InternalVoice.g:500:2: ( 'email' )
                    // InternalVoice.g:501:3: 'email'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueEmailKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueEmailKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVoice.g:506:2: ( 'phone-number' )
                    {
                    // InternalVoice.g:506:2: ( 'phone-number' )
                    // InternalVoice.g:507:3: 'phone-number'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValuePhoneNumberKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValuePhoneNumberKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVoice.g:512:2: ( 'date-period' )
                    {
                    // InternalVoice.g:512:2: ( 'date-period' )
                    // InternalVoice.g:513:3: 'date-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueDatePeriodKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueDatePeriodKeyword_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVoice.g:518:2: ( 'time-period' )
                    {
                    // InternalVoice.g:518:2: ( 'time-period' )
                    // InternalVoice.g:519:3: 'time-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueTimePeriodKeyword_1_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueTimePeriodKeyword_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVoice.g:524:2: ( 'url' )
                    {
                    // InternalVoice.g:524:2: ( 'url' )
                    // InternalVoice.g:525:3: 'url'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueUrlKeyword_1_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueUrlKeyword_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVoice.g:530:2: ( 'any' )
                    {
                    // InternalVoice.g:530:2: ( 'any' )
                    // InternalVoice.g:531:3: 'any'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueAnyKeyword_1_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueAnyKeyword_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVoice.g:536:2: ( 'color' )
                    {
                    // InternalVoice.g:536:2: ( 'color' )
                    // InternalVoice.g:537:3: 'color'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueColorKeyword_1_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueColorKeyword_1_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVoice.g:542:2: ( 'language' )
                    {
                    // InternalVoice.g:542:2: ( 'language' )
                    // InternalVoice.g:543:3: 'language'
                    {
                     before(grammarAccess.getSysvariableAccess().getDefaultValueLanguageKeyword_1_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getDefaultValueLanguageKeyword_1_0_12()); 

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
    // $ANTLR end "rule__Sysvariable__DefaultValueAlternatives_1_0"


    // $ANTLR start "rule__Intent__Group__0"
    // InternalVoice.g:552:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:556:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalVoice.g:557:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
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
    // InternalVoice.g:564:1: rule__Intent__Group__0__Impl : ( 'Intent' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:568:1: ( ( 'Intent' ) )
            // InternalVoice.g:569:1: ( 'Intent' )
            {
            // InternalVoice.g:569:1: ( 'Intent' )
            // InternalVoice.g:570:2: 'Intent'
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
    // InternalVoice.g:579:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:583:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalVoice.g:584:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
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
    // InternalVoice.g:591:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:595:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalVoice.g:596:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalVoice.g:596:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalVoice.g:597:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalVoice.g:598:2: ( rule__Intent__NameAssignment_1 )
            // InternalVoice.g:598:3: rule__Intent__NameAssignment_1
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
    // InternalVoice.g:606:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:610:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalVoice.g:611:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
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
    // InternalVoice.g:618:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Group_2__0 )? ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:622:1: ( ( ( rule__Intent__Group_2__0 )? ) )
            // InternalVoice.g:623:1: ( ( rule__Intent__Group_2__0 )? )
            {
            // InternalVoice.g:623:1: ( ( rule__Intent__Group_2__0 )? )
            // InternalVoice.g:624:2: ( rule__Intent__Group_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_2()); 
            // InternalVoice.g:625:2: ( rule__Intent__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVoice.g:625:3: rule__Intent__Group_2__0
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
    // InternalVoice.g:633:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:637:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalVoice.g:638:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
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
    // InternalVoice.g:645:1: rule__Intent__Group__3__Impl : ( ( rule__Intent__IsFollowupAssignment_3 )? ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:649:1: ( ( ( rule__Intent__IsFollowupAssignment_3 )? ) )
            // InternalVoice.g:650:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            {
            // InternalVoice.g:650:1: ( ( rule__Intent__IsFollowupAssignment_3 )? )
            // InternalVoice.g:651:2: ( rule__Intent__IsFollowupAssignment_3 )?
            {
             before(grammarAccess.getIntentAccess().getIsFollowupAssignment_3()); 
            // InternalVoice.g:652:2: ( rule__Intent__IsFollowupAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVoice.g:652:3: rule__Intent__IsFollowupAssignment_3
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
    // InternalVoice.g:660:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl rule__Intent__Group__5 ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:664:1: ( rule__Intent__Group__4__Impl rule__Intent__Group__5 )
            // InternalVoice.g:665:2: rule__Intent__Group__4__Impl rule__Intent__Group__5
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
    // InternalVoice.g:672:1: rule__Intent__Group__4__Impl : ( ( ( rule__Intent__QuestionsAssignment_4 ) ) ( ( rule__Intent__QuestionsAssignment_4 )* ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:676:1: ( ( ( ( rule__Intent__QuestionsAssignment_4 ) ) ( ( rule__Intent__QuestionsAssignment_4 )* ) ) )
            // InternalVoice.g:677:1: ( ( ( rule__Intent__QuestionsAssignment_4 ) ) ( ( rule__Intent__QuestionsAssignment_4 )* ) )
            {
            // InternalVoice.g:677:1: ( ( ( rule__Intent__QuestionsAssignment_4 ) ) ( ( rule__Intent__QuestionsAssignment_4 )* ) )
            // InternalVoice.g:678:2: ( ( rule__Intent__QuestionsAssignment_4 ) ) ( ( rule__Intent__QuestionsAssignment_4 )* )
            {
            // InternalVoice.g:678:2: ( ( rule__Intent__QuestionsAssignment_4 ) )
            // InternalVoice.g:679:3: ( rule__Intent__QuestionsAssignment_4 )
            {
             before(grammarAccess.getIntentAccess().getQuestionsAssignment_4()); 
            // InternalVoice.g:680:3: ( rule__Intent__QuestionsAssignment_4 )
            // InternalVoice.g:680:4: rule__Intent__QuestionsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Intent__QuestionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getQuestionsAssignment_4()); 

            }

            // InternalVoice.g:683:2: ( ( rule__Intent__QuestionsAssignment_4 )* )
            // InternalVoice.g:684:3: ( rule__Intent__QuestionsAssignment_4 )*
            {
             before(grammarAccess.getIntentAccess().getQuestionsAssignment_4()); 
            // InternalVoice.g:685:3: ( rule__Intent__QuestionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=11 && LA8_0<=23)||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVoice.g:685:4: rule__Intent__QuestionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Intent__QuestionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getQuestionsAssignment_4()); 

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
    // InternalVoice.g:694:1: rule__Intent__Group__5 : rule__Intent__Group__5__Impl ;
    public final void rule__Intent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:698:1: ( rule__Intent__Group__5__Impl )
            // InternalVoice.g:699:2: rule__Intent__Group__5__Impl
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
    // InternalVoice.g:705:1: rule__Intent__Group__5__Impl : ( ( rule__Intent__TrainingAssignment_5 ) ) ;
    public final void rule__Intent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:709:1: ( ( ( rule__Intent__TrainingAssignment_5 ) ) )
            // InternalVoice.g:710:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            {
            // InternalVoice.g:710:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            // InternalVoice.g:711:2: ( rule__Intent__TrainingAssignment_5 )
            {
             before(grammarAccess.getIntentAccess().getTrainingAssignment_5()); 
            // InternalVoice.g:712:2: ( rule__Intent__TrainingAssignment_5 )
            // InternalVoice.g:712:3: rule__Intent__TrainingAssignment_5
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
    // InternalVoice.g:721:1: rule__Intent__Group_2__0 : rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 ;
    public final void rule__Intent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:725:1: ( rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 )
            // InternalVoice.g:726:2: rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1
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
    // InternalVoice.g:733:1: rule__Intent__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Intent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:737:1: ( ( 'extends' ) )
            // InternalVoice.g:738:1: ( 'extends' )
            {
            // InternalVoice.g:738:1: ( 'extends' )
            // InternalVoice.g:739:2: 'extends'
            {
             before(grammarAccess.getIntentAccess().getExtendsKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getExtendsKeyword_2_0()); 

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
    // InternalVoice.g:748:1: rule__Intent__Group_2__1 : rule__Intent__Group_2__1__Impl ;
    public final void rule__Intent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:752:1: ( rule__Intent__Group_2__1__Impl )
            // InternalVoice.g:753:2: rule__Intent__Group_2__1__Impl
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
    // InternalVoice.g:759:1: rule__Intent__Group_2__1__Impl : ( ( rule__Intent__ZuperAssignment_2_1 ) ) ;
    public final void rule__Intent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:763:1: ( ( ( rule__Intent__ZuperAssignment_2_1 ) ) )
            // InternalVoice.g:764:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            {
            // InternalVoice.g:764:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            // InternalVoice.g:765:2: ( rule__Intent__ZuperAssignment_2_1 )
            {
             before(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); 
            // InternalVoice.g:766:2: ( rule__Intent__ZuperAssignment_2_1 )
            // InternalVoice.g:766:3: rule__Intent__ZuperAssignment_2_1
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
    // InternalVoice.g:775:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:779:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalVoice.g:780:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalVoice.g:787:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:791:1: ( ( () ) )
            // InternalVoice.g:792:1: ( () )
            {
            // InternalVoice.g:792:1: ( () )
            // InternalVoice.g:793:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalVoice.g:794:2: ()
            // InternalVoice.g:794:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalVoice.g:802:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:806:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalVoice.g:807:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalVoice.g:814:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:818:1: ( ( 'Entity' ) )
            // InternalVoice.g:819:1: ( 'Entity' )
            {
            // InternalVoice.g:819:1: ( 'Entity' )
            // InternalVoice.g:820:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // InternalVoice.g:829:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:833:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalVoice.g:834:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalVoice.g:841:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:845:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalVoice.g:846:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalVoice.g:846:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalVoice.g:847:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalVoice.g:848:2: ( rule__Entity__NameAssignment_2 )
            // InternalVoice.g:848:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // InternalVoice.g:856:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:860:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalVoice.g:861:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalVoice.g:868:1: rule__Entity__Group__3__Impl : ( '[' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:872:1: ( ( '[' ) )
            // InternalVoice.g:873:1: ( '[' )
            {
            // InternalVoice.g:873:1: ( '[' )
            // InternalVoice.g:874:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3()); 

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
    // InternalVoice.g:883:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:887:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalVoice.g:888:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // InternalVoice.g:895:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__ExampleAssignment_4 ) ) ( ( rule__Entity__ExampleAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:899:1: ( ( ( ( rule__Entity__ExampleAssignment_4 ) ) ( ( rule__Entity__ExampleAssignment_4 )* ) ) )
            // InternalVoice.g:900:1: ( ( ( rule__Entity__ExampleAssignment_4 ) ) ( ( rule__Entity__ExampleAssignment_4 )* ) )
            {
            // InternalVoice.g:900:1: ( ( ( rule__Entity__ExampleAssignment_4 ) ) ( ( rule__Entity__ExampleAssignment_4 )* ) )
            // InternalVoice.g:901:2: ( ( rule__Entity__ExampleAssignment_4 ) ) ( ( rule__Entity__ExampleAssignment_4 )* )
            {
            // InternalVoice.g:901:2: ( ( rule__Entity__ExampleAssignment_4 ) )
            // InternalVoice.g:902:3: ( rule__Entity__ExampleAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_4()); 
            // InternalVoice.g:903:3: ( rule__Entity__ExampleAssignment_4 )
            // InternalVoice.g:903:4: rule__Entity__ExampleAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__Entity__ExampleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExampleAssignment_4()); 

            }

            // InternalVoice.g:906:2: ( ( rule__Entity__ExampleAssignment_4 )* )
            // InternalVoice.g:907:3: ( rule__Entity__ExampleAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_4()); 
            // InternalVoice.g:908:3: ( rule__Entity__ExampleAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVoice.g:908:4: rule__Entity__ExampleAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Entity__ExampleAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getExampleAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalVoice.g:917:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:921:1: ( rule__Entity__Group__5__Impl )
            // InternalVoice.g:922:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalVoice.g:928:1: rule__Entity__Group__5__Impl : ( ']' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:932:1: ( ( ']' ) )
            // InternalVoice.g:933:1: ( ']' )
            {
            // InternalVoice.g:933:1: ( ']' )
            // InternalVoice.g:934:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__QuestionReference__Group_1__0"
    // InternalVoice.g:944:1: rule__QuestionReference__Group_1__0 : rule__QuestionReference__Group_1__0__Impl rule__QuestionReference__Group_1__1 ;
    public final void rule__QuestionReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:948:1: ( rule__QuestionReference__Group_1__0__Impl rule__QuestionReference__Group_1__1 )
            // InternalVoice.g:949:2: rule__QuestionReference__Group_1__0__Impl rule__QuestionReference__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QuestionReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionReference__Group_1__1();

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
    // $ANTLR end "rule__QuestionReference__Group_1__0"


    // $ANTLR start "rule__QuestionReference__Group_1__0__Impl"
    // InternalVoice.g:956:1: rule__QuestionReference__Group_1__0__Impl : ( 'get' ) ;
    public final void rule__QuestionReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:960:1: ( ( 'get' ) )
            // InternalVoice.g:961:1: ( 'get' )
            {
            // InternalVoice.g:961:1: ( 'get' )
            // InternalVoice.g:962:2: 'get'
            {
             before(grammarAccess.getQuestionReferenceAccess().getGetKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionReferenceAccess().getGetKeyword_1_0()); 

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
    // $ANTLR end "rule__QuestionReference__Group_1__0__Impl"


    // $ANTLR start "rule__QuestionReference__Group_1__1"
    // InternalVoice.g:971:1: rule__QuestionReference__Group_1__1 : rule__QuestionReference__Group_1__1__Impl ;
    public final void rule__QuestionReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:975:1: ( rule__QuestionReference__Group_1__1__Impl )
            // InternalVoice.g:976:2: rule__QuestionReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionReference__Group_1__1__Impl();

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
    // $ANTLR end "rule__QuestionReference__Group_1__1"


    // $ANTLR start "rule__QuestionReference__Group_1__1__Impl"
    // InternalVoice.g:982:1: rule__QuestionReference__Group_1__1__Impl : ( ( rule__QuestionReference__QuestionReferenceAssignment_1_1 ) ) ;
    public final void rule__QuestionReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:986:1: ( ( ( rule__QuestionReference__QuestionReferenceAssignment_1_1 ) ) )
            // InternalVoice.g:987:1: ( ( rule__QuestionReference__QuestionReferenceAssignment_1_1 ) )
            {
            // InternalVoice.g:987:1: ( ( rule__QuestionReference__QuestionReferenceAssignment_1_1 ) )
            // InternalVoice.g:988:2: ( rule__QuestionReference__QuestionReferenceAssignment_1_1 )
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceAssignment_1_1()); 
            // InternalVoice.g:989:2: ( rule__QuestionReference__QuestionReferenceAssignment_1_1 )
            // InternalVoice.g:989:3: rule__QuestionReference__QuestionReferenceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionReference__QuestionReferenceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceAssignment_1_1()); 

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
    // $ANTLR end "rule__QuestionReference__Group_1__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalVoice.g:998:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1002:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalVoice.g:1003:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalVoice.g:1010:1: rule__Question__Group__0__Impl : ( ( rule__Question__Group_0__0 )? ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1014:1: ( ( ( rule__Question__Group_0__0 )? ) )
            // InternalVoice.g:1015:1: ( ( rule__Question__Group_0__0 )? )
            {
            // InternalVoice.g:1015:1: ( ( rule__Question__Group_0__0 )? )
            // InternalVoice.g:1016:2: ( rule__Question__Group_0__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_0()); 
            // InternalVoice.g:1017:2: ( rule__Question__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==31) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalVoice.g:1017:3: rule__Question__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_0()); 

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
    // InternalVoice.g:1025:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1029:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalVoice.g:1030:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalVoice.g:1037:1: rule__Question__Group__1__Impl : ( ( rule__Question__QuestionEntityAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1041:1: ( ( ( rule__Question__QuestionEntityAssignment_1 ) ) )
            // InternalVoice.g:1042:1: ( ( rule__Question__QuestionEntityAssignment_1 ) )
            {
            // InternalVoice.g:1042:1: ( ( rule__Question__QuestionEntityAssignment_1 ) )
            // InternalVoice.g:1043:2: ( rule__Question__QuestionEntityAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_1()); 
            // InternalVoice.g:1044:2: ( rule__Question__QuestionEntityAssignment_1 )
            // InternalVoice.g:1044:3: rule__Question__QuestionEntityAssignment_1
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
    // InternalVoice.g:1052:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1056:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalVoice.g:1057:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalVoice.g:1064:1: rule__Question__Group__2__Impl : ( 'with' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1068:1: ( ( 'with' ) )
            // InternalVoice.g:1069:1: ( 'with' )
            {
            // InternalVoice.g:1069:1: ( 'with' )
            // InternalVoice.g:1070:2: 'with'
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
    // InternalVoice.g:1079:1: rule__Question__Group__3 : rule__Question__Group__3__Impl ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1083:1: ( rule__Question__Group__3__Impl )
            // InternalVoice.g:1084:2: rule__Question__Group__3__Impl
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
    // InternalVoice.g:1090:1: rule__Question__Group__3__Impl : ( ( rule__Question__PromptAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1094:1: ( ( ( rule__Question__PromptAssignment_3 ) ) )
            // InternalVoice.g:1095:1: ( ( rule__Question__PromptAssignment_3 ) )
            {
            // InternalVoice.g:1095:1: ( ( rule__Question__PromptAssignment_3 ) )
            // InternalVoice.g:1096:2: ( rule__Question__PromptAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getPromptAssignment_3()); 
            // InternalVoice.g:1097:2: ( rule__Question__PromptAssignment_3 )
            // InternalVoice.g:1097:3: rule__Question__PromptAssignment_3
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


    // $ANTLR start "rule__Question__Group_0__0"
    // InternalVoice.g:1106:1: rule__Question__Group_0__0 : rule__Question__Group_0__0__Impl rule__Question__Group_0__1 ;
    public final void rule__Question__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1110:1: ( rule__Question__Group_0__0__Impl rule__Question__Group_0__1 )
            // InternalVoice.g:1111:2: rule__Question__Group_0__0__Impl rule__Question__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Question__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_0__1();

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
    // $ANTLR end "rule__Question__Group_0__0"


    // $ANTLR start "rule__Question__Group_0__0__Impl"
    // InternalVoice.g:1118:1: rule__Question__Group_0__0__Impl : ( ( rule__Question__NameAssignment_0_0 ) ) ;
    public final void rule__Question__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1122:1: ( ( ( rule__Question__NameAssignment_0_0 ) ) )
            // InternalVoice.g:1123:1: ( ( rule__Question__NameAssignment_0_0 ) )
            {
            // InternalVoice.g:1123:1: ( ( rule__Question__NameAssignment_0_0 ) )
            // InternalVoice.g:1124:2: ( rule__Question__NameAssignment_0_0 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_0_0()); 
            // InternalVoice.g:1125:2: ( rule__Question__NameAssignment_0_0 )
            // InternalVoice.g:1125:3: rule__Question__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Question__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_0_0()); 

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
    // $ANTLR end "rule__Question__Group_0__0__Impl"


    // $ANTLR start "rule__Question__Group_0__1"
    // InternalVoice.g:1133:1: rule__Question__Group_0__1 : rule__Question__Group_0__1__Impl ;
    public final void rule__Question__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1137:1: ( rule__Question__Group_0__1__Impl )
            // InternalVoice.g:1138:2: rule__Question__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_0__1__Impl();

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
    // $ANTLR end "rule__Question__Group_0__1"


    // $ANTLR start "rule__Question__Group_0__1__Impl"
    // InternalVoice.g:1144:1: rule__Question__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Question__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1148:1: ( ( '=' ) )
            // InternalVoice.g:1149:1: ( '=' )
            {
            // InternalVoice.g:1149:1: ( '=' )
            // InternalVoice.g:1150:2: '='
            {
             before(grammarAccess.getQuestionAccess().getEqualsSignKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Question__Group_0__1__Impl"


    // $ANTLR start "rule__Training__Group__0"
    // InternalVoice.g:1160:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1164:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalVoice.g:1165:2: rule__Training__Group__0__Impl rule__Training__Group__1
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
    // InternalVoice.g:1172:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1176:1: ( ( () ) )
            // InternalVoice.g:1177:1: ( () )
            {
            // InternalVoice.g:1177:1: ( () )
            // InternalVoice.g:1178:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalVoice.g:1179:2: ()
            // InternalVoice.g:1179:3: 
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
    // InternalVoice.g:1187:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1191:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalVoice.g:1192:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalVoice.g:1199:1: rule__Training__Group__1__Impl : ( 'Training:' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1203:1: ( ( 'Training:' ) )
            // InternalVoice.g:1204:1: ( 'Training:' )
            {
            // InternalVoice.g:1204:1: ( 'Training:' )
            // InternalVoice.g:1205:2: 'Training:'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalVoice.g:1214:1: rule__Training__Group__2 : rule__Training__Group__2__Impl ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1218:1: ( rule__Training__Group__2__Impl )
            // InternalVoice.g:1219:2: rule__Training__Group__2__Impl
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
    // InternalVoice.g:1225:1: rule__Training__Group__2__Impl : ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1229:1: ( ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) )
            // InternalVoice.g:1230:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            {
            // InternalVoice.g:1230:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            // InternalVoice.g:1231:2: ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* )
            {
            // InternalVoice.g:1231:2: ( ( rule__Training__TrainingrefAssignment_2 ) )
            // InternalVoice.g:1232:3: ( rule__Training__TrainingrefAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1233:3: ( rule__Training__TrainingrefAssignment_2 )
            // InternalVoice.g:1233:4: rule__Training__TrainingrefAssignment_2
            {
            pushFollow(FOLLOW_16);
            rule__Training__TrainingrefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }

            // InternalVoice.g:1236:2: ( ( rule__Training__TrainingrefAssignment_2 )* )
            // InternalVoice.g:1237:3: ( rule__Training__TrainingrefAssignment_2 )*
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalVoice.g:1238:3: ( rule__Training__TrainingrefAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVoice.g:1238:4: rule__Training__TrainingrefAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalVoice.g:1248:1: rule__TrainingRef__Group__0 : rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 ;
    public final void rule__TrainingRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1252:1: ( rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 )
            // InternalVoice.g:1253:2: rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalVoice.g:1260:1: rule__TrainingRef__Group__0__Impl : ( ( rule__TrainingRef__PhraseAssignment_0 ) ) ;
    public final void rule__TrainingRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1264:1: ( ( ( rule__TrainingRef__PhraseAssignment_0 ) ) )
            // InternalVoice.g:1265:1: ( ( rule__TrainingRef__PhraseAssignment_0 ) )
            {
            // InternalVoice.g:1265:1: ( ( rule__TrainingRef__PhraseAssignment_0 ) )
            // InternalVoice.g:1266:2: ( rule__TrainingRef__PhraseAssignment_0 )
            {
             before(grammarAccess.getTrainingRefAccess().getPhraseAssignment_0()); 
            // InternalVoice.g:1267:2: ( rule__TrainingRef__PhraseAssignment_0 )
            // InternalVoice.g:1267:3: rule__TrainingRef__PhraseAssignment_0
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
    // InternalVoice.g:1275:1: rule__TrainingRef__Group__1 : rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 ;
    public final void rule__TrainingRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1279:1: ( rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 )
            // InternalVoice.g:1280:2: rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalVoice.g:1287:1: rule__TrainingRef__Group__1__Impl : ( ( rule__TrainingRef__DeclarationsAssignment_1 ) ) ;
    public final void rule__TrainingRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1291:1: ( ( ( rule__TrainingRef__DeclarationsAssignment_1 ) ) )
            // InternalVoice.g:1292:1: ( ( rule__TrainingRef__DeclarationsAssignment_1 ) )
            {
            // InternalVoice.g:1292:1: ( ( rule__TrainingRef__DeclarationsAssignment_1 ) )
            // InternalVoice.g:1293:2: ( rule__TrainingRef__DeclarationsAssignment_1 )
            {
             before(grammarAccess.getTrainingRefAccess().getDeclarationsAssignment_1()); 
            // InternalVoice.g:1294:2: ( rule__TrainingRef__DeclarationsAssignment_1 )
            // InternalVoice.g:1294:3: rule__TrainingRef__DeclarationsAssignment_1
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
    // InternalVoice.g:1302:1: rule__TrainingRef__Group__2 : rule__TrainingRef__Group__2__Impl ;
    public final void rule__TrainingRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1306:1: ( rule__TrainingRef__Group__2__Impl )
            // InternalVoice.g:1307:2: rule__TrainingRef__Group__2__Impl
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
    // InternalVoice.g:1313:1: rule__TrainingRef__Group__2__Impl : ( '.' ) ;
    public final void rule__TrainingRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1317:1: ( ( '.' ) )
            // InternalVoice.g:1318:1: ( '.' )
            {
            // InternalVoice.g:1318:1: ( '.' )
            // InternalVoice.g:1319:2: '.'
            {
             before(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVoice.g:1329:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1333:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalVoice.g:1334:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalVoice.g:1341:1: rule__Declaration__Group__0__Impl : ( '(' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1345:1: ( ( '(' ) )
            // InternalVoice.g:1346:1: ( '(' )
            {
            // InternalVoice.g:1346:1: ( '(' )
            // InternalVoice.g:1347:2: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalVoice.g:1356:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1360:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalVoice.g:1361:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalVoice.g:1368:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__TrainingstringAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1372:1: ( ( ( rule__Declaration__TrainingstringAssignment_1 ) ) )
            // InternalVoice.g:1373:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            {
            // InternalVoice.g:1373:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            // InternalVoice.g:1374:2: ( rule__Declaration__TrainingstringAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 
            // InternalVoice.g:1375:2: ( rule__Declaration__TrainingstringAssignment_1 )
            // InternalVoice.g:1375:3: rule__Declaration__TrainingstringAssignment_1
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
    // InternalVoice.g:1383:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1387:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalVoice.g:1388:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalVoice.g:1395:1: rule__Declaration__Group__2__Impl : ( 'is' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1399:1: ( ( 'is' ) )
            // InternalVoice.g:1400:1: ( 'is' )
            {
            // InternalVoice.g:1400:1: ( 'is' )
            // InternalVoice.g:1401:2: 'is'
            {
             before(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalVoice.g:1410:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1414:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // InternalVoice.g:1415:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalVoice.g:1422:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__ReferenceAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1426:1: ( ( ( rule__Declaration__ReferenceAssignment_3 ) ) )
            // InternalVoice.g:1427:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            {
            // InternalVoice.g:1427:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            // InternalVoice.g:1428:2: ( rule__Declaration__ReferenceAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 
            // InternalVoice.g:1429:2: ( rule__Declaration__ReferenceAssignment_3 )
            // InternalVoice.g:1429:3: rule__Declaration__ReferenceAssignment_3
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
    // InternalVoice.g:1437:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1441:1: ( rule__Declaration__Group__4__Impl )
            // InternalVoice.g:1442:2: rule__Declaration__Group__4__Impl
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
    // InternalVoice.g:1448:1: rule__Declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1452:1: ( ( ')' ) )
            // InternalVoice.g:1453:1: ( ')' )
            {
            // InternalVoice.g:1453:1: ( ')' )
            // InternalVoice.g:1454:2: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVoice.g:1464:1: rule__EntityExample__Group__0 : rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 ;
    public final void rule__EntityExample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1468:1: ( rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 )
            // InternalVoice.g:1469:2: rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalVoice.g:1476:1: rule__EntityExample__Group__0__Impl : ( ( rule__EntityExample__NameAssignment_0 ) ) ;
    public final void rule__EntityExample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1480:1: ( ( ( rule__EntityExample__NameAssignment_0 ) ) )
            // InternalVoice.g:1481:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            {
            // InternalVoice.g:1481:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            // InternalVoice.g:1482:2: ( rule__EntityExample__NameAssignment_0 )
            {
             before(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 
            // InternalVoice.g:1483:2: ( rule__EntityExample__NameAssignment_0 )
            // InternalVoice.g:1483:3: rule__EntityExample__NameAssignment_0
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
    // InternalVoice.g:1491:1: rule__EntityExample__Group__1 : rule__EntityExample__Group__1__Impl ;
    public final void rule__EntityExample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1495:1: ( rule__EntityExample__Group__1__Impl )
            // InternalVoice.g:1496:2: rule__EntityExample__Group__1__Impl
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
    // InternalVoice.g:1502:1: rule__EntityExample__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EntityExample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1506:1: ( ( ( ',' )? ) )
            // InternalVoice.g:1507:1: ( ( ',' )? )
            {
            // InternalVoice.g:1507:1: ( ( ',' )? )
            // InternalVoice.g:1508:2: ( ',' )?
            {
             before(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 
            // InternalVoice.g:1509:2: ( ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVoice.g:1509:3: ','
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalVoice.g:1518:1: rule__IsFollowup__Group__0 : rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 ;
    public final void rule__IsFollowup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1522:1: ( rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1 )
            // InternalVoice.g:1523:2: rule__IsFollowup__Group__0__Impl rule__IsFollowup__Group__1
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
    // InternalVoice.g:1530:1: rule__IsFollowup__Group__0__Impl : ( 'IsFollowup' ) ;
    public final void rule__IsFollowup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1534:1: ( ( 'IsFollowup' ) )
            // InternalVoice.g:1535:1: ( 'IsFollowup' )
            {
            // InternalVoice.g:1535:1: ( 'IsFollowup' )
            // InternalVoice.g:1536:2: 'IsFollowup'
            {
             before(grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalVoice.g:1545:1: rule__IsFollowup__Group__1 : rule__IsFollowup__Group__1__Impl ;
    public final void rule__IsFollowup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1549:1: ( rule__IsFollowup__Group__1__Impl )
            // InternalVoice.g:1550:2: rule__IsFollowup__Group__1__Impl
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
    // InternalVoice.g:1556:1: rule__IsFollowup__Group__1__Impl : ( ( rule__IsFollowup__IntentAssignment_1 ) ) ;
    public final void rule__IsFollowup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1560:1: ( ( ( rule__IsFollowup__IntentAssignment_1 ) ) )
            // InternalVoice.g:1561:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            {
            // InternalVoice.g:1561:1: ( ( rule__IsFollowup__IntentAssignment_1 ) )
            // InternalVoice.g:1562:2: ( rule__IsFollowup__IntentAssignment_1 )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentAssignment_1()); 
            // InternalVoice.g:1563:2: ( rule__IsFollowup__IntentAssignment_1 )
            // InternalVoice.g:1563:3: rule__IsFollowup__IntentAssignment_1
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


    // $ANTLR start "rule__Sysvariable__Group__0"
    // InternalVoice.g:1572:1: rule__Sysvariable__Group__0 : rule__Sysvariable__Group__0__Impl rule__Sysvariable__Group__1 ;
    public final void rule__Sysvariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1576:1: ( rule__Sysvariable__Group__0__Impl rule__Sysvariable__Group__1 )
            // InternalVoice.g:1577:2: rule__Sysvariable__Group__0__Impl rule__Sysvariable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Sysvariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sysvariable__Group__1();

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
    // $ANTLR end "rule__Sysvariable__Group__0"


    // $ANTLR start "rule__Sysvariable__Group__0__Impl"
    // InternalVoice.g:1584:1: rule__Sysvariable__Group__0__Impl : ( () ) ;
    public final void rule__Sysvariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1588:1: ( ( () ) )
            // InternalVoice.g:1589:1: ( () )
            {
            // InternalVoice.g:1589:1: ( () )
            // InternalVoice.g:1590:2: ()
            {
             before(grammarAccess.getSysvariableAccess().getSysvariableAction_0()); 
            // InternalVoice.g:1591:2: ()
            // InternalVoice.g:1591:3: 
            {
            }

             after(grammarAccess.getSysvariableAccess().getSysvariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sysvariable__Group__0__Impl"


    // $ANTLR start "rule__Sysvariable__Group__1"
    // InternalVoice.g:1599:1: rule__Sysvariable__Group__1 : rule__Sysvariable__Group__1__Impl ;
    public final void rule__Sysvariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1603:1: ( rule__Sysvariable__Group__1__Impl )
            // InternalVoice.g:1604:2: rule__Sysvariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__Group__1__Impl();

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
    // $ANTLR end "rule__Sysvariable__Group__1"


    // $ANTLR start "rule__Sysvariable__Group__1__Impl"
    // InternalVoice.g:1610:1: rule__Sysvariable__Group__1__Impl : ( ( rule__Sysvariable__DefaultValueAssignment_1 ) ) ;
    public final void rule__Sysvariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1614:1: ( ( ( rule__Sysvariable__DefaultValueAssignment_1 ) ) )
            // InternalVoice.g:1615:1: ( ( rule__Sysvariable__DefaultValueAssignment_1 ) )
            {
            // InternalVoice.g:1615:1: ( ( rule__Sysvariable__DefaultValueAssignment_1 ) )
            // InternalVoice.g:1616:2: ( rule__Sysvariable__DefaultValueAssignment_1 )
            {
             before(grammarAccess.getSysvariableAccess().getDefaultValueAssignment_1()); 
            // InternalVoice.g:1617:2: ( rule__Sysvariable__DefaultValueAssignment_1 )
            // InternalVoice.g:1617:3: rule__Sysvariable__DefaultValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__DefaultValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getDefaultValueAssignment_1()); 

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
    // $ANTLR end "rule__Sysvariable__Group__1__Impl"


    // $ANTLR start "rule__Model__AgentAssignment"
    // InternalVoice.g:1626:1: rule__Model__AgentAssignment : ( ruleAgent ) ;
    public final void rule__Model__AgentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1630:1: ( ( ruleAgent ) )
            // InternalVoice.g:1631:2: ( ruleAgent )
            {
            // InternalVoice.g:1631:2: ( ruleAgent )
            // InternalVoice.g:1632:3: ruleAgent
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
    // InternalVoice.g:1641:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1645:1: ( ( RULE_ID ) )
            // InternalVoice.g:1646:2: ( RULE_ID )
            {
            // InternalVoice.g:1646:2: ( RULE_ID )
            // InternalVoice.g:1647:3: RULE_ID
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
    // InternalVoice.g:1656:1: rule__Intent__ZuperAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Intent__ZuperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1660:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1661:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1661:2: ( ( RULE_ID ) )
            // InternalVoice.g:1662:3: ( RULE_ID )
            {
             before(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); 
            // InternalVoice.g:1663:3: ( RULE_ID )
            // InternalVoice.g:1664:4: RULE_ID
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
    // InternalVoice.g:1675:1: rule__Intent__IsFollowupAssignment_3 : ( ruleIsFollowup ) ;
    public final void rule__Intent__IsFollowupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1679:1: ( ( ruleIsFollowup ) )
            // InternalVoice.g:1680:2: ( ruleIsFollowup )
            {
            // InternalVoice.g:1680:2: ( ruleIsFollowup )
            // InternalVoice.g:1681:3: ruleIsFollowup
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


    // $ANTLR start "rule__Intent__QuestionsAssignment_4"
    // InternalVoice.g:1690:1: rule__Intent__QuestionsAssignment_4 : ( ruleQuestionReference ) ;
    public final void rule__Intent__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1694:1: ( ( ruleQuestionReference ) )
            // InternalVoice.g:1695:2: ( ruleQuestionReference )
            {
            // InternalVoice.g:1695:2: ( ruleQuestionReference )
            // InternalVoice.g:1696:3: ruleQuestionReference
            {
             before(grammarAccess.getIntentAccess().getQuestionsQuestionReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionReference();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getQuestionsQuestionReferenceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Intent__QuestionsAssignment_4"


    // $ANTLR start "rule__Intent__TrainingAssignment_5"
    // InternalVoice.g:1705:1: rule__Intent__TrainingAssignment_5 : ( ruleTraining ) ;
    public final void rule__Intent__TrainingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1709:1: ( ( ruleTraining ) )
            // InternalVoice.g:1710:2: ( ruleTraining )
            {
            // InternalVoice.g:1710:2: ( ruleTraining )
            // InternalVoice.g:1711:3: ruleTraining
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


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalVoice.g:1720:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1724:1: ( ( RULE_ID ) )
            // InternalVoice.g:1725:2: ( RULE_ID )
            {
            // InternalVoice.g:1725:2: ( RULE_ID )
            // InternalVoice.g:1726:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__ExampleAssignment_4"
    // InternalVoice.g:1735:1: rule__Entity__ExampleAssignment_4 : ( ruleEntityExample ) ;
    public final void rule__Entity__ExampleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1739:1: ( ( ruleEntityExample ) )
            // InternalVoice.g:1740:2: ( ruleEntityExample )
            {
            // InternalVoice.g:1740:2: ( ruleEntityExample )
            // InternalVoice.g:1741:3: ruleEntityExample
            {
             before(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityExample();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__ExampleAssignment_4"


    // $ANTLR start "rule__QuestionReference__QuestionAssignment_0"
    // InternalVoice.g:1750:1: rule__QuestionReference__QuestionAssignment_0 : ( ruleQuestion ) ;
    public final void rule__QuestionReference__QuestionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1754:1: ( ( ruleQuestion ) )
            // InternalVoice.g:1755:2: ( ruleQuestion )
            {
            // InternalVoice.g:1755:2: ( ruleQuestion )
            // InternalVoice.g:1756:3: ruleQuestion
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__QuestionReference__QuestionAssignment_0"


    // $ANTLR start "rule__QuestionReference__QuestionReferenceAssignment_1_1"
    // InternalVoice.g:1765:1: rule__QuestionReference__QuestionReferenceAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__QuestionReference__QuestionReferenceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1769:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1770:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1770:2: ( ( RULE_ID ) )
            // InternalVoice.g:1771:3: ( RULE_ID )
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceQuestionCrossReference_1_1_0()); 
            // InternalVoice.g:1772:3: ( RULE_ID )
            // InternalVoice.g:1773:4: RULE_ID
            {
             before(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceQuestionIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceQuestionIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getQuestionReferenceAccess().getQuestionReferenceQuestionCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__QuestionReference__QuestionReferenceAssignment_1_1"


    // $ANTLR start "rule__Question__NameAssignment_0_0"
    // InternalVoice.g:1784:1: rule__Question__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1788:1: ( ( RULE_ID ) )
            // InternalVoice.g:1789:2: ( RULE_ID )
            {
            // InternalVoice.g:1789:2: ( RULE_ID )
            // InternalVoice.g:1790:3: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Question__NameAssignment_0_0"


    // $ANTLR start "rule__Question__QuestionEntityAssignment_1"
    // InternalVoice.g:1799:1: rule__Question__QuestionEntityAssignment_1 : ( ruleQuestionEntity ) ;
    public final void rule__Question__QuestionEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1803:1: ( ( ruleQuestionEntity ) )
            // InternalVoice.g:1804:2: ( ruleQuestionEntity )
            {
            // InternalVoice.g:1804:2: ( ruleQuestionEntity )
            // InternalVoice.g:1805:3: ruleQuestionEntity
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
    // InternalVoice.g:1814:1: rule__Question__PromptAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Question__PromptAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1818:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1819:2: ( RULE_STRING )
            {
            // InternalVoice.g:1819:2: ( RULE_STRING )
            // InternalVoice.g:1820:3: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_3_0()); 

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
    // InternalVoice.g:1829:1: rule__QuestionEntity__WithEntityAssignment : ( ruleReference ) ;
    public final void rule__QuestionEntity__WithEntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1833:1: ( ( ruleReference ) )
            // InternalVoice.g:1834:2: ( ruleReference )
            {
            // InternalVoice.g:1834:2: ( ruleReference )
            // InternalVoice.g:1835:3: ruleReference
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


    // $ANTLR start "rule__Reference__EntityAssignment_0"
    // InternalVoice.g:1844:1: rule__Reference__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1848:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1849:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1849:2: ( ( RULE_ID ) )
            // InternalVoice.g:1850:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 
            // InternalVoice.g:1851:3: ( RULE_ID )
            // InternalVoice.g:1852:4: RULE_ID
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
    // InternalVoice.g:1863:1: rule__Reference__SysvarAssignment_1 : ( ruleSysvariable ) ;
    public final void rule__Reference__SysvarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1867:1: ( ( ruleSysvariable ) )
            // InternalVoice.g:1868:2: ( ruleSysvariable )
            {
            // InternalVoice.g:1868:2: ( ruleSysvariable )
            // InternalVoice.g:1869:3: ruleSysvariable
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


    // $ANTLR start "rule__Training__TrainingrefAssignment_2"
    // InternalVoice.g:1878:1: rule__Training__TrainingrefAssignment_2 : ( ruleTrainingRef ) ;
    public final void rule__Training__TrainingrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1882:1: ( ( ruleTrainingRef ) )
            // InternalVoice.g:1883:2: ( ruleTrainingRef )
            {
            // InternalVoice.g:1883:2: ( ruleTrainingRef )
            // InternalVoice.g:1884:3: ruleTrainingRef
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
    // InternalVoice.g:1893:1: rule__TrainingRef__PhraseAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TrainingRef__PhraseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1897:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1898:2: ( RULE_STRING )
            {
            // InternalVoice.g:1898:2: ( RULE_STRING )
            // InternalVoice.g:1899:3: RULE_STRING
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
    // InternalVoice.g:1908:1: rule__TrainingRef__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__TrainingRef__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1912:1: ( ( ruleDeclaration ) )
            // InternalVoice.g:1913:2: ( ruleDeclaration )
            {
            // InternalVoice.g:1913:2: ( ruleDeclaration )
            // InternalVoice.g:1914:3: ruleDeclaration
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
    // InternalVoice.g:1923:1: rule__Declaration__TrainingstringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__TrainingstringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1927:1: ( ( RULE_STRING ) )
            // InternalVoice.g:1928:2: ( RULE_STRING )
            {
            // InternalVoice.g:1928:2: ( RULE_STRING )
            // InternalVoice.g:1929:3: RULE_STRING
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
    // InternalVoice.g:1938:1: rule__Declaration__ReferenceAssignment_3 : ( ruleReference ) ;
    public final void rule__Declaration__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1942:1: ( ( ruleReference ) )
            // InternalVoice.g:1943:2: ( ruleReference )
            {
            // InternalVoice.g:1943:2: ( ruleReference )
            // InternalVoice.g:1944:3: ruleReference
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
    // InternalVoice.g:1953:1: rule__EntityExample__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityExample__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1957:1: ( ( RULE_ID ) )
            // InternalVoice.g:1958:2: ( RULE_ID )
            {
            // InternalVoice.g:1958:2: ( RULE_ID )
            // InternalVoice.g:1959:3: RULE_ID
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
    // InternalVoice.g:1968:1: rule__IsFollowup__IntentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IsFollowup__IntentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1972:1: ( ( ( RULE_ID ) ) )
            // InternalVoice.g:1973:2: ( ( RULE_ID ) )
            {
            // InternalVoice.g:1973:2: ( ( RULE_ID ) )
            // InternalVoice.g:1974:3: ( RULE_ID )
            {
             before(grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0()); 
            // InternalVoice.g:1975:3: ( RULE_ID )
            // InternalVoice.g:1976:4: RULE_ID
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


    // $ANTLR start "rule__Sysvariable__DefaultValueAssignment_1"
    // InternalVoice.g:1987:1: rule__Sysvariable__DefaultValueAssignment_1 : ( ( rule__Sysvariable__DefaultValueAlternatives_1_0 ) ) ;
    public final void rule__Sysvariable__DefaultValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVoice.g:1991:1: ( ( ( rule__Sysvariable__DefaultValueAlternatives_1_0 ) ) )
            // InternalVoice.g:1992:2: ( ( rule__Sysvariable__DefaultValueAlternatives_1_0 ) )
            {
            // InternalVoice.g:1992:2: ( ( rule__Sysvariable__DefaultValueAlternatives_1_0 ) )
            // InternalVoice.g:1993:3: ( rule__Sysvariable__DefaultValueAlternatives_1_0 )
            {
             before(grammarAccess.getSysvariableAccess().getDefaultValueAlternatives_1_0()); 
            // InternalVoice.g:1994:3: ( rule__Sysvariable__DefaultValueAlternatives_1_0 )
            // InternalVoice.g:1994:4: rule__Sysvariable__DefaultValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__DefaultValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getDefaultValueAlternatives_1_0()); 

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
    // $ANTLR end "rule__Sysvariable__DefaultValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004022FFF810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004022FFF812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000FFF810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});

}