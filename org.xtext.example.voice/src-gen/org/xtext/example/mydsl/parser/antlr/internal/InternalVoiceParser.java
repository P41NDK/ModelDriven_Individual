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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVoiceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Intent'", "'Entity'", "'['", "']'", "'with'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'IsFollowup'", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'"
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




    // $ANTLR start "entryRuleModel"
    // InternalVoice.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVoice.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalVoice.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVoice.g:71:1: ruleModel returns [EObject current=null] : ( (lv_agent_0_0= ruleAgent ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_agent_0_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:77:2: ( ( (lv_agent_0_0= ruleAgent ) )* )
            // InternalVoice.g:78:2: ( (lv_agent_0_0= ruleAgent ) )*
            {
            // InternalVoice.g:78:2: ( (lv_agent_0_0= ruleAgent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVoice.g:79:3: (lv_agent_0_0= ruleAgent )
            	    {
            	    // InternalVoice.g:79:3: (lv_agent_0_0= ruleAgent )
            	    // InternalVoice.g:80:4: lv_agent_0_0= ruleAgent
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_agent_0_0=ruleAgent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"agent",
            	    					lv_agent_0_0,
            	    					"org.xtext.example.mydsl.Voice.Agent");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAgent"
    // InternalVoice.g:100:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalVoice.g:100:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalVoice.g:101:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalVoice.g:107:1: ruleAgent returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Intent_1 = null;



        	enterRule();

        try {
            // InternalVoice.g:113:2: ( (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent ) )
            // InternalVoice.g:114:2: (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent )
            {
            // InternalVoice.g:114:2: (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVoice.g:115:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVoice.g:124:3: this_Intent_1= ruleIntent
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getIntentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Intent_1=ruleIntent();

                    state._fsp--;


                    			current = this_Intent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleIntent"
    // InternalVoice.g:136:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // InternalVoice.g:136:47: (iv_ruleIntent= ruleIntent EOF )
            // InternalVoice.g:137:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalVoice.g:143:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFollowup_2_0= ruleIsFollowup ) )? ( (lv_question_3_0= ruleQuestion ) )+ ( (lv_training_4_0= ruleTraining ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_isFollowup_2_0 = null;

        EObject lv_question_3_0 = null;

        EObject lv_training_4_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:149:2: ( (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFollowup_2_0= ruleIsFollowup ) )? ( (lv_question_3_0= ruleQuestion ) )+ ( (lv_training_4_0= ruleTraining ) ) ) )
            // InternalVoice.g:150:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFollowup_2_0= ruleIsFollowup ) )? ( (lv_question_3_0= ruleQuestion ) )+ ( (lv_training_4_0= ruleTraining ) ) )
            {
            // InternalVoice.g:150:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFollowup_2_0= ruleIsFollowup ) )? ( (lv_question_3_0= ruleQuestion ) )+ ( (lv_training_4_0= ruleTraining ) ) )
            // InternalVoice.g:151:3: otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFollowup_2_0= ruleIsFollowup ) )? ( (lv_question_3_0= ruleQuestion ) )+ ( (lv_training_4_0= ruleTraining ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getIntentKeyword_0());
            		
            // InternalVoice.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVoice.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVoice.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalVoice.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVoice.g:173:3: ( (lv_isFollowup_2_0= ruleIsFollowup ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVoice.g:174:4: (lv_isFollowup_2_0= ruleIsFollowup )
                    {
                    // InternalVoice.g:174:4: (lv_isFollowup_2_0= ruleIsFollowup )
                    // InternalVoice.g:175:5: lv_isFollowup_2_0= ruleIsFollowup
                    {

                    					newCompositeNode(grammarAccess.getIntentAccess().getIsFollowupIsFollowupParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_isFollowup_2_0=ruleIsFollowup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntentRule());
                    					}
                    					set(
                    						current,
                    						"isFollowup",
                    						lv_isFollowup_2_0,
                    						"org.xtext.example.mydsl.Voice.IsFollowup");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVoice.g:192:3: ( (lv_question_3_0= ruleQuestion ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=23 && LA4_0<=35)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVoice.g:193:4: (lv_question_3_0= ruleQuestion )
            	    {
            	    // InternalVoice.g:193:4: (lv_question_3_0= ruleQuestion )
            	    // InternalVoice.g:194:5: lv_question_3_0= ruleQuestion
            	    {

            	    					newCompositeNode(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_question_3_0=ruleQuestion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"question",
            	    						lv_question_3_0,
            	    						"org.xtext.example.mydsl.Voice.Question");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalVoice.g:211:3: ( (lv_training_4_0= ruleTraining ) )
            // InternalVoice.g:212:4: (lv_training_4_0= ruleTraining )
            {
            // InternalVoice.g:212:4: (lv_training_4_0= ruleTraining )
            // InternalVoice.g:213:5: lv_training_4_0= ruleTraining
            {

            					newCompositeNode(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_training_4_0=ruleTraining();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntentRule());
            					}
            					set(
            						current,
            						"training",
            						lv_training_4_0,
            						"org.xtext.example.mydsl.Voice.Training");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEntity"
    // InternalVoice.g:234:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalVoice.g:234:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalVoice.g:235:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalVoice.g:241:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_example_3_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:247:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' ) )
            // InternalVoice.g:248:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' )
            {
            // InternalVoice.g:248:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' )
            // InternalVoice.g:249:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalVoice.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVoice.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVoice.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalVoice.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVoice.g:275:3: ( (lv_example_3_0= ruleEntityExample ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVoice.g:276:4: (lv_example_3_0= ruleEntityExample )
            	    {
            	    // InternalVoice.g:276:4: (lv_example_3_0= ruleEntityExample )
            	    // InternalVoice.g:277:5: lv_example_3_0= ruleEntityExample
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_example_3_0=ruleEntityExample();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"example",
            	    						lv_example_3_0,
            	    						"org.xtext.example.mydsl.Voice.EntityExample");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQuestion"
    // InternalVoice.g:302:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalVoice.g:302:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalVoice.g:303:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalVoice.g:309:1: ruleQuestion returns [EObject current=null] : ( ( (lv_questionEntity_0_0= ruleQuestionEntity ) ) otherlv_1= 'with' ( (lv_prompt_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prompt_2_0=null;
        EObject lv_questionEntity_0_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:315:2: ( ( ( (lv_questionEntity_0_0= ruleQuestionEntity ) ) otherlv_1= 'with' ( (lv_prompt_2_0= RULE_STRING ) ) ) )
            // InternalVoice.g:316:2: ( ( (lv_questionEntity_0_0= ruleQuestionEntity ) ) otherlv_1= 'with' ( (lv_prompt_2_0= RULE_STRING ) ) )
            {
            // InternalVoice.g:316:2: ( ( (lv_questionEntity_0_0= ruleQuestionEntity ) ) otherlv_1= 'with' ( (lv_prompt_2_0= RULE_STRING ) ) )
            // InternalVoice.g:317:3: ( (lv_questionEntity_0_0= ruleQuestionEntity ) ) otherlv_1= 'with' ( (lv_prompt_2_0= RULE_STRING ) )
            {
            // InternalVoice.g:317:3: ( (lv_questionEntity_0_0= ruleQuestionEntity ) )
            // InternalVoice.g:318:4: (lv_questionEntity_0_0= ruleQuestionEntity )
            {
            // InternalVoice.g:318:4: (lv_questionEntity_0_0= ruleQuestionEntity )
            // InternalVoice.g:319:5: lv_questionEntity_0_0= ruleQuestionEntity
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_questionEntity_0_0=ruleQuestionEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"questionEntity",
            						lv_questionEntity_0_0,
            						"org.xtext.example.mydsl.Voice.QuestionEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getWithKeyword_1());
            		
            // InternalVoice.g:340:3: ( (lv_prompt_2_0= RULE_STRING ) )
            // InternalVoice.g:341:4: (lv_prompt_2_0= RULE_STRING )
            {
            // InternalVoice.g:341:4: (lv_prompt_2_0= RULE_STRING )
            // InternalVoice.g:342:5: lv_prompt_2_0= RULE_STRING
            {
            lv_prompt_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_prompt_2_0, grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prompt",
            						lv_prompt_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleQuestionEntity"
    // InternalVoice.g:362:1: entryRuleQuestionEntity returns [EObject current=null] : iv_ruleQuestionEntity= ruleQuestionEntity EOF ;
    public final EObject entryRuleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionEntity = null;


        try {
            // InternalVoice.g:362:55: (iv_ruleQuestionEntity= ruleQuestionEntity EOF )
            // InternalVoice.g:363:2: iv_ruleQuestionEntity= ruleQuestionEntity EOF
            {
             newCompositeNode(grammarAccess.getQuestionEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionEntity=ruleQuestionEntity();

            state._fsp--;

             current =iv_ruleQuestionEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionEntity"


    // $ANTLR start "ruleQuestionEntity"
    // InternalVoice.g:369:1: ruleQuestionEntity returns [EObject current=null] : ( (lv_withEntity_0_0= ruleReference ) ) ;
    public final EObject ruleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_withEntity_0_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:375:2: ( ( (lv_withEntity_0_0= ruleReference ) ) )
            // InternalVoice.g:376:2: ( (lv_withEntity_0_0= ruleReference ) )
            {
            // InternalVoice.g:376:2: ( (lv_withEntity_0_0= ruleReference ) )
            // InternalVoice.g:377:3: (lv_withEntity_0_0= ruleReference )
            {
            // InternalVoice.g:377:3: (lv_withEntity_0_0= ruleReference )
            // InternalVoice.g:378:4: lv_withEntity_0_0= ruleReference
            {

            				newCompositeNode(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_withEntity_0_0=ruleReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getQuestionEntityRule());
            				}
            				set(
            					current,
            					"withEntity",
            					lv_withEntity_0_0,
            					"org.xtext.example.mydsl.Voice.Reference");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionEntity"


    // $ANTLR start "entryRuleTraining"
    // InternalVoice.g:398:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalVoice.g:398:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalVoice.g:399:2: iv_ruleTraining= ruleTraining EOF
            {
             newCompositeNode(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraining=ruleTraining();

            state._fsp--;

             current =iv_ruleTraining; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalVoice.g:405:1: ruleTraining returns [EObject current=null] : ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) ;
    public final EObject ruleTraining() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trainingref_2_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:411:2: ( ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) )
            // InternalVoice.g:412:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            {
            // InternalVoice.g:412:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            // InternalVoice.g:413:3: () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            {
            // InternalVoice.g:413:3: ()
            // InternalVoice.g:414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingAccess().getTrainingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
            		
            // InternalVoice.g:424:3: ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVoice.g:425:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    {
            	    // InternalVoice.g:425:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    // InternalVoice.g:426:5: lv_trainingref_2_0= ruleTrainingRef
            	    {

            	    					newCompositeNode(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_trainingref_2_0=ruleTrainingRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTrainingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trainingref",
            	    						lv_trainingref_2_0,
            	    						"org.xtext.example.mydsl.Voice.TrainingRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleTrainingRef"
    // InternalVoice.g:447:1: entryRuleTrainingRef returns [EObject current=null] : iv_ruleTrainingRef= ruleTrainingRef EOF ;
    public final EObject entryRuleTrainingRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingRef = null;


        try {
            // InternalVoice.g:447:52: (iv_ruleTrainingRef= ruleTrainingRef EOF )
            // InternalVoice.g:448:2: iv_ruleTrainingRef= ruleTrainingRef EOF
            {
             newCompositeNode(grammarAccess.getTrainingRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingRef=ruleTrainingRef();

            state._fsp--;

             current =iv_ruleTrainingRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainingRef"


    // $ANTLR start "ruleTrainingRef"
    // InternalVoice.g:454:1: ruleTrainingRef returns [EObject current=null] : ( () (this_STRING_1= RULE_STRING | ( (lv_declarations_2_0= ruleDeclaration ) ) )+ otherlv_3= '.' ) ;
    public final EObject ruleTrainingRef() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token otherlv_3=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:460:2: ( ( () (this_STRING_1= RULE_STRING | ( (lv_declarations_2_0= ruleDeclaration ) ) )+ otherlv_3= '.' ) )
            // InternalVoice.g:461:2: ( () (this_STRING_1= RULE_STRING | ( (lv_declarations_2_0= ruleDeclaration ) ) )+ otherlv_3= '.' )
            {
            // InternalVoice.g:461:2: ( () (this_STRING_1= RULE_STRING | ( (lv_declarations_2_0= ruleDeclaration ) ) )+ otherlv_3= '.' )
            // InternalVoice.g:462:3: () (this_STRING_1= RULE_STRING | ( (lv_declarations_2_0= ruleDeclaration ) ) )+ otherlv_3= '.'
            {
            // InternalVoice.g:462:3: ()
            // InternalVoice.g:463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingRefAccess().getTrainingRefSimpleAction_0(),
            					current);
            			

            }

            // InternalVoice.g:469:3: (this_STRING_1= RULE_STRING | ( (lv_declarations_2_0= ruleDeclaration ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }
                else if ( (LA7_0==18) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVoice.g:470:4: this_STRING_1= RULE_STRING
            	    {
            	    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    				newLeafNode(this_STRING_1, grammarAccess.getTrainingRefAccess().getSTRINGTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalVoice.g:475:4: ( (lv_declarations_2_0= ruleDeclaration ) )
            	    {
            	    // InternalVoice.g:475:4: ( (lv_declarations_2_0= ruleDeclaration ) )
            	    // InternalVoice.g:476:5: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalVoice.g:476:5: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalVoice.g:477:6: lv_declarations_2_0= ruleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTrainingRefRule());
            	    						}
            	    						add(
            	    							current,
            	    							"declarations",
            	    							lv_declarations_2_0,
            	    							"org.xtext.example.mydsl.Voice.Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTrainingRefAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainingRef"


    // $ANTLR start "entryRuleDeclaration"
    // InternalVoice.g:503:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalVoice.g:503:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalVoice.g:504:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalVoice.g:510:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_trainingstring_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:516:2: ( (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) )
            // InternalVoice.g:517:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            {
            // InternalVoice.g:517:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            // InternalVoice.g:518:3: otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalVoice.g:522:3: ( (lv_trainingstring_1_0= RULE_STRING ) )
            // InternalVoice.g:523:4: (lv_trainingstring_1_0= RULE_STRING )
            {
            // InternalVoice.g:523:4: (lv_trainingstring_1_0= RULE_STRING )
            // InternalVoice.g:524:5: lv_trainingstring_1_0= RULE_STRING
            {
            lv_trainingstring_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_trainingstring_1_0, grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"trainingstring",
            						lv_trainingstring_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getIsKeyword_2());
            		
            // InternalVoice.g:544:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalVoice.g:545:4: (lv_reference_3_0= ruleReference )
            {
            // InternalVoice.g:545:4: (lv_reference_3_0= ruleReference )
            // InternalVoice.g:546:5: lv_reference_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_reference_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_3_0,
            						"org.xtext.example.mydsl.Voice.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntityExample"
    // InternalVoice.g:571:1: entryRuleEntityExample returns [EObject current=null] : iv_ruleEntityExample= ruleEntityExample EOF ;
    public final EObject entryRuleEntityExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityExample = null;


        try {
            // InternalVoice.g:571:54: (iv_ruleEntityExample= ruleEntityExample EOF )
            // InternalVoice.g:572:2: iv_ruleEntityExample= ruleEntityExample EOF
            {
             newCompositeNode(grammarAccess.getEntityExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityExample=ruleEntityExample();

            state._fsp--;

             current =iv_ruleEntityExample; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityExample"


    // $ANTLR start "ruleEntityExample"
    // InternalVoice.g:578:1: ruleEntityExample returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleEntityExample() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVoice.g:584:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalVoice.g:585:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalVoice.g:585:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalVoice.g:586:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalVoice.g:586:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVoice.g:587:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVoice.g:587:4: (lv_name_0_0= RULE_ID )
            // InternalVoice.g:588:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityExampleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVoice.g:604:3: (otherlv_1= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVoice.g:605:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityExampleAccess().getCommaKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityExample"


    // $ANTLR start "entryRuleIsFollowup"
    // InternalVoice.g:614:1: entryRuleIsFollowup returns [EObject current=null] : iv_ruleIsFollowup= ruleIsFollowup EOF ;
    public final EObject entryRuleIsFollowup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsFollowup = null;


        try {
            // InternalVoice.g:614:51: (iv_ruleIsFollowup= ruleIsFollowup EOF )
            // InternalVoice.g:615:2: iv_ruleIsFollowup= ruleIsFollowup EOF
            {
             newCompositeNode(grammarAccess.getIsFollowupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsFollowup=ruleIsFollowup();

            state._fsp--;

             current =iv_ruleIsFollowup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsFollowup"


    // $ANTLR start "ruleIsFollowup"
    // InternalVoice.g:621:1: ruleIsFollowup returns [EObject current=null] : (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleIsFollowup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVoice.g:627:2: ( (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVoice.g:628:2: (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVoice.g:628:2: (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) )
            // InternalVoice.g:629:3: otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0());
            		
            // InternalVoice.g:633:3: ( (otherlv_1= RULE_ID ) )
            // InternalVoice.g:634:4: (otherlv_1= RULE_ID )
            {
            // InternalVoice.g:634:4: (otherlv_1= RULE_ID )
            // InternalVoice.g:635:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsFollowupRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getIsFollowupAccess().getIntentIntentCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsFollowup"


    // $ANTLR start "entryRuleSysvariable"
    // InternalVoice.g:650:1: entryRuleSysvariable returns [EObject current=null] : iv_ruleSysvariable= ruleSysvariable EOF ;
    public final EObject entryRuleSysvariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSysvariable = null;


        try {
            // InternalVoice.g:650:52: (iv_ruleSysvariable= ruleSysvariable EOF )
            // InternalVoice.g:651:2: iv_ruleSysvariable= ruleSysvariable EOF
            {
             newCompositeNode(grammarAccess.getSysvariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSysvariable=ruleSysvariable();

            state._fsp--;

             current =iv_ruleSysvariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSysvariable"


    // $ANTLR start "ruleSysvariable"
    // InternalVoice.g:657:1: ruleSysvariable returns [EObject current=null] : ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) ) ;
    public final EObject ruleSysvariable() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;
        Token lv_value_0_8=null;
        Token lv_value_0_9=null;
        Token lv_value_0_10=null;
        Token lv_value_0_11=null;
        Token lv_value_0_12=null;
        Token lv_value_0_13=null;


        	enterRule();

        try {
            // InternalVoice.g:663:2: ( ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) ) )
            // InternalVoice.g:664:2: ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) )
            {
            // InternalVoice.g:664:2: ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) )
            // InternalVoice.g:665:3: ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) )
            {
            // InternalVoice.g:665:3: ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) )
            // InternalVoice.g:666:4: (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' )
            {
            // InternalVoice.g:666:4: (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' )
            int alt9=13;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 27:
                {
                alt9=5;
                }
                break;
            case 28:
                {
                alt9=6;
                }
                break;
            case 29:
                {
                alt9=7;
                }
                break;
            case 30:
                {
                alt9=8;
                }
                break;
            case 31:
                {
                alt9=9;
                }
                break;
            case 32:
                {
                alt9=10;
                }
                break;
            case 33:
                {
                alt9=11;
                }
                break;
            case 34:
                {
                alt9=12;
                }
                break;
            case 35:
                {
                alt9=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVoice.g:667:5: lv_value_0_1= 'number'
                    {
                    lv_value_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalVoice.g:678:5: lv_value_0_2= 'date-time'
                    {
                    lv_value_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalVoice.g:689:5: lv_value_0_3= 'date'
                    {
                    lv_value_0_3=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalVoice.g:700:5: lv_value_0_4= 'duration'
                    {
                    lv_value_0_4=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalVoice.g:711:5: lv_value_0_5= 'address'
                    {
                    lv_value_0_5=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalVoice.g:722:5: lv_value_0_6= 'email'
                    {
                    lv_value_0_6=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalVoice.g:733:5: lv_value_0_7= 'phone-number'
                    {
                    lv_value_0_7=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalVoice.g:744:5: lv_value_0_8= 'date-period'
                    {
                    lv_value_0_8=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalVoice.g:755:5: lv_value_0_9= 'time-period'
                    {
                    lv_value_0_9=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalVoice.g:766:5: lv_value_0_10= 'url'
                    {
                    lv_value_0_10=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_value_0_10, grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_10, null);
                    				

                    }
                    break;
                case 11 :
                    // InternalVoice.g:777:5: lv_value_0_11= 'any'
                    {
                    lv_value_0_11=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_value_0_11, grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_11, null);
                    				

                    }
                    break;
                case 12 :
                    // InternalVoice.g:788:5: lv_value_0_12= 'color'
                    {
                    lv_value_0_12=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_12, grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_12, null);
                    				

                    }
                    break;
                case 13 :
                    // InternalVoice.g:799:5: lv_value_0_13= 'language'
                    {
                    lv_value_0_13=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_13, grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_13, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSysvariable"


    // $ANTLR start "entryRuleReference"
    // InternalVoice.g:815:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalVoice.g:815:50: (iv_ruleReference= ruleReference EOF )
            // InternalVoice.g:816:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalVoice.g:822:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sysvar_1_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:828:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) )
            // InternalVoice.g:829:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            {
            // InternalVoice.g:829:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=23 && LA10_0<=35)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVoice.g:830:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalVoice.g:830:3: ( (otherlv_0= RULE_ID ) )
                    // InternalVoice.g:831:4: (otherlv_0= RULE_ID )
                    {
                    // InternalVoice.g:831:4: (otherlv_0= RULE_ID )
                    // InternalVoice.g:832:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReferenceRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:844:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    {
                    // InternalVoice.g:844:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    // InternalVoice.g:845:4: (lv_sysvar_1_0= ruleSysvariable )
                    {
                    // InternalVoice.g:845:4: (lv_sysvar_1_0= ruleSysvariable )
                    // InternalVoice.g:846:5: lv_sysvar_1_0= ruleSysvariable
                    {

                    					newCompositeNode(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sysvar_1_0=ruleSysvariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReferenceRule());
                    					}
                    					set(
                    						current,
                    						"sysvar",
                    						lv_sysvar_1_0,
                    						"org.xtext.example.mydsl.Voice.Sysvariable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FFFC00010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FFFC10010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});

}