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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Intent'", "'extends'", "'Entity'", "'['", "']'", "'get'", "'with'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'IsFollowup'", "'='", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'"
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

                if ( (LA1_0==11||LA1_0==13) ) {
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

            if ( (LA2_0==13) ) {
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
    // InternalVoice.g:143:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_question_5_0= ruleQuestion ) )+ ( (lv_training_6_0= ruleTraining ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_isFollowup_4_0 = null;

        EObject lv_question_5_0 = null;

        EObject lv_training_6_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:149:2: ( (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_question_5_0= ruleQuestion ) )+ ( (lv_training_6_0= ruleTraining ) ) ) )
            // InternalVoice.g:150:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_question_5_0= ruleQuestion ) )+ ( (lv_training_6_0= ruleTraining ) ) )
            {
            // InternalVoice.g:150:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_question_5_0= ruleQuestion ) )+ ( (lv_training_6_0= ruleTraining ) ) )
            // InternalVoice.g:151:3: otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_question_5_0= ruleQuestion ) )+ ( (lv_training_6_0= ruleTraining ) )
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

            // InternalVoice.g:173:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVoice.g:174:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntentAccess().getExtendsKeyword_2_0());
                    			
                    // InternalVoice.g:178:4: ( (otherlv_3= RULE_ID ) )
                    // InternalVoice.g:179:5: (otherlv_3= RULE_ID )
                    {
                    // InternalVoice.g:179:5: (otherlv_3= RULE_ID )
                    // InternalVoice.g:180:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntentRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVoice.g:192:3: ( (lv_isFollowup_4_0= ruleIsFollowup ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVoice.g:193:4: (lv_isFollowup_4_0= ruleIsFollowup )
                    {
                    // InternalVoice.g:193:4: (lv_isFollowup_4_0= ruleIsFollowup )
                    // InternalVoice.g:194:5: lv_isFollowup_4_0= ruleIsFollowup
                    {

                    					newCompositeNode(grammarAccess.getIntentAccess().getIsFollowupIsFollowupParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_isFollowup_4_0=ruleIsFollowup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntentRule());
                    					}
                    					set(
                    						current,
                    						"isFollowup",
                    						lv_isFollowup_4_0,
                    						"org.xtext.example.mydsl.Voice.IsFollowup");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVoice.g:211:3: ( (lv_question_5_0= ruleQuestion ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==16||(LA5_0>=26 && LA5_0<=38)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVoice.g:212:4: (lv_question_5_0= ruleQuestion )
            	    {
            	    // InternalVoice.g:212:4: (lv_question_5_0= ruleQuestion )
            	    // InternalVoice.g:213:5: lv_question_5_0= ruleQuestion
            	    {

            	    					newCompositeNode(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_question_5_0=ruleQuestion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"question",
            	    						lv_question_5_0,
            	    						"org.xtext.example.mydsl.Voice.Question");
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

            // InternalVoice.g:230:3: ( (lv_training_6_0= ruleTraining ) )
            // InternalVoice.g:231:4: (lv_training_6_0= ruleTraining )
            {
            // InternalVoice.g:231:4: (lv_training_6_0= ruleTraining )
            // InternalVoice.g:232:5: lv_training_6_0= ruleTraining
            {

            					newCompositeNode(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_training_6_0=ruleTraining();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntentRule());
            					}
            					set(
            						current,
            						"training",
            						lv_training_6_0,
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
    // InternalVoice.g:253:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalVoice.g:253:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalVoice.g:254:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalVoice.g:260:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_example_4_0= ruleEntityExample ) )+ otherlv_5= ']' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_example_4_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:266:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_example_4_0= ruleEntityExample ) )+ otherlv_5= ']' ) )
            // InternalVoice.g:267:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_example_4_0= ruleEntityExample ) )+ otherlv_5= ']' )
            {
            // InternalVoice.g:267:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_example_4_0= ruleEntityExample ) )+ otherlv_5= ']' )
            // InternalVoice.g:268:3: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_example_4_0= ruleEntityExample ) )+ otherlv_5= ']'
            {
            // InternalVoice.g:268:3: ()
            // InternalVoice.g:269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalVoice.g:279:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVoice.g:280:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVoice.g:280:4: (lv_name_2_0= RULE_ID )
            // InternalVoice.g:281:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalVoice.g:301:3: ( (lv_example_4_0= ruleEntityExample ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVoice.g:302:4: (lv_example_4_0= ruleEntityExample )
            	    {
            	    // InternalVoice.g:302:4: (lv_example_4_0= ruleEntityExample )
            	    // InternalVoice.g:303:5: lv_example_4_0= ruleEntityExample
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_example_4_0=ruleEntityExample();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"example",
            	    						lv_example_4_0,
            	    						"org.xtext.example.mydsl.Voice.EntityExample");
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5());
            		

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
    // InternalVoice.g:328:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalVoice.g:328:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalVoice.g:329:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalVoice.g:335:1: ruleQuestion returns [EObject current=null] : ( (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_prompt_4_0=null;
        EObject lv_questionEntity_2_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:341:2: ( ( (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) ) ) )
            // InternalVoice.g:342:2: ( (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) ) )
            {
            // InternalVoice.g:342:2: ( (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||(LA7_0>=26 && LA7_0<=38)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVoice.g:343:3: (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalVoice.g:343:3: (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) )
                    // InternalVoice.g:344:4: otherlv_0= 'get' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getGetKeyword_0_0());
                    			
                    // InternalVoice.g:348:4: ( (otherlv_1= RULE_ID ) )
                    // InternalVoice.g:349:5: (otherlv_1= RULE_ID )
                    {
                    // InternalVoice.g:349:5: (otherlv_1= RULE_ID )
                    // InternalVoice.g:350:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getExtendedQuestionReferenceObjectCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:363:3: ( ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) )
                    {
                    // InternalVoice.g:363:3: ( ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) )
                    // InternalVoice.g:364:4: ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) )
                    {
                    // InternalVoice.g:364:4: ( (lv_questionEntity_2_0= ruleQuestionEntity ) )
                    // InternalVoice.g:365:5: (lv_questionEntity_2_0= ruleQuestionEntity )
                    {
                    // InternalVoice.g:365:5: (lv_questionEntity_2_0= ruleQuestionEntity )
                    // InternalVoice.g:366:6: lv_questionEntity_2_0= ruleQuestionEntity
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_questionEntity_2_0=ruleQuestionEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"questionEntity",
                    							lv_questionEntity_2_0,
                    							"org.xtext.example.mydsl.Voice.QuestionEntity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getWithKeyword_1_1());
                    			
                    // InternalVoice.g:387:4: ( (lv_prompt_4_0= RULE_STRING ) )
                    // InternalVoice.g:388:5: (lv_prompt_4_0= RULE_STRING )
                    {
                    // InternalVoice.g:388:5: (lv_prompt_4_0= RULE_STRING )
                    // InternalVoice.g:389:6: lv_prompt_4_0= RULE_STRING
                    {
                    lv_prompt_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_prompt_4_0, grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prompt",
                    							lv_prompt_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleQuestionEntity"
    // InternalVoice.g:410:1: entryRuleQuestionEntity returns [EObject current=null] : iv_ruleQuestionEntity= ruleQuestionEntity EOF ;
    public final EObject entryRuleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionEntity = null;


        try {
            // InternalVoice.g:410:55: (iv_ruleQuestionEntity= ruleQuestionEntity EOF )
            // InternalVoice.g:411:2: iv_ruleQuestionEntity= ruleQuestionEntity EOF
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
    // InternalVoice.g:417:1: ruleQuestionEntity returns [EObject current=null] : ( (lv_withEntity_0_0= ruleReference ) ) ;
    public final EObject ruleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_withEntity_0_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:423:2: ( ( (lv_withEntity_0_0= ruleReference ) ) )
            // InternalVoice.g:424:2: ( (lv_withEntity_0_0= ruleReference ) )
            {
            // InternalVoice.g:424:2: ( (lv_withEntity_0_0= ruleReference ) )
            // InternalVoice.g:425:3: (lv_withEntity_0_0= ruleReference )
            {
            // InternalVoice.g:425:3: (lv_withEntity_0_0= ruleReference )
            // InternalVoice.g:426:4: lv_withEntity_0_0= ruleReference
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


    // $ANTLR start "entryRuleReference"
    // InternalVoice.g:446:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalVoice.g:446:50: (iv_ruleReference= ruleReference EOF )
            // InternalVoice.g:447:2: iv_ruleReference= ruleReference EOF
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
    // InternalVoice.g:453:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sysvar_1_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:459:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) )
            // InternalVoice.g:460:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            {
            // InternalVoice.g:460:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==17||LA8_1==22) ) {
                    alt8=1;
                }
                else if ( (LA8_1==25) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA8_0>=26 && LA8_0<=38)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVoice.g:461:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalVoice.g:461:3: ( (otherlv_0= RULE_ID ) )
                    // InternalVoice.g:462:4: (otherlv_0= RULE_ID )
                    {
                    // InternalVoice.g:462:4: (otherlv_0= RULE_ID )
                    // InternalVoice.g:463:5: otherlv_0= RULE_ID
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
                    // InternalVoice.g:475:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    {
                    // InternalVoice.g:475:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    // InternalVoice.g:476:4: (lv_sysvar_1_0= ruleSysvariable )
                    {
                    // InternalVoice.g:476:4: (lv_sysvar_1_0= ruleSysvariable )
                    // InternalVoice.g:477:5: lv_sysvar_1_0= ruleSysvariable
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


    // $ANTLR start "entryRuleTraining"
    // InternalVoice.g:498:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalVoice.g:498:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalVoice.g:499:2: iv_ruleTraining= ruleTraining EOF
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
    // InternalVoice.g:505:1: ruleTraining returns [EObject current=null] : ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) ;
    public final EObject ruleTraining() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trainingref_2_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:511:2: ( ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) )
            // InternalVoice.g:512:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            {
            // InternalVoice.g:512:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            // InternalVoice.g:513:3: () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            {
            // InternalVoice.g:513:3: ()
            // InternalVoice.g:514:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingAccess().getTrainingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
            		
            // InternalVoice.g:524:3: ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVoice.g:525:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    {
            	    // InternalVoice.g:525:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    // InternalVoice.g:526:5: lv_trainingref_2_0= ruleTrainingRef
            	    {

            	    					newCompositeNode(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalVoice.g:547:1: entryRuleTrainingRef returns [EObject current=null] : iv_ruleTrainingRef= ruleTrainingRef EOF ;
    public final EObject entryRuleTrainingRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingRef = null;


        try {
            // InternalVoice.g:547:52: (iv_ruleTrainingRef= ruleTrainingRef EOF )
            // InternalVoice.g:548:2: iv_ruleTrainingRef= ruleTrainingRef EOF
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
    // InternalVoice.g:554:1: ruleTrainingRef returns [EObject current=null] : ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' ) ;
    public final EObject ruleTrainingRef() throws RecognitionException {
        EObject current = null;

        Token lv_phrase_0_0=null;
        Token otherlv_2=null;
        EObject lv_declarations_1_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:560:2: ( ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' ) )
            // InternalVoice.g:561:2: ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' )
            {
            // InternalVoice.g:561:2: ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' )
            // InternalVoice.g:562:3: ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.'
            {
            // InternalVoice.g:562:3: ( (lv_phrase_0_0= RULE_STRING ) )
            // InternalVoice.g:563:4: (lv_phrase_0_0= RULE_STRING )
            {
            // InternalVoice.g:563:4: (lv_phrase_0_0= RULE_STRING )
            // InternalVoice.g:564:5: lv_phrase_0_0= RULE_STRING
            {
            lv_phrase_0_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_phrase_0_0, grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phrase",
            						lv_phrase_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVoice.g:580:3: ( (lv_declarations_1_0= ruleDeclaration ) )
            // InternalVoice.g:581:4: (lv_declarations_1_0= ruleDeclaration )
            {
            // InternalVoice.g:581:4: (lv_declarations_1_0= ruleDeclaration )
            // InternalVoice.g:582:5: lv_declarations_1_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_declarations_1_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainingRefRule());
            					}
            					set(
            						current,
            						"declarations",
            						lv_declarations_1_0,
            						"org.xtext.example.mydsl.Voice.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainingRefAccess().getFullStopKeyword_2());
            		

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
    // InternalVoice.g:607:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalVoice.g:607:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalVoice.g:608:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalVoice.g:614:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_trainingstring_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:620:2: ( (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) )
            // InternalVoice.g:621:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            {
            // InternalVoice.g:621:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            // InternalVoice.g:622:3: otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalVoice.g:626:3: ( (lv_trainingstring_1_0= RULE_STRING ) )
            // InternalVoice.g:627:4: (lv_trainingstring_1_0= RULE_STRING )
            {
            // InternalVoice.g:627:4: (lv_trainingstring_1_0= RULE_STRING )
            // InternalVoice.g:628:5: lv_trainingstring_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getIsKeyword_2());
            		
            // InternalVoice.g:648:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalVoice.g:649:4: (lv_reference_3_0= ruleReference )
            {
            // InternalVoice.g:649:4: (lv_reference_3_0= ruleReference )
            // InternalVoice.g:650:5: lv_reference_3_0= ruleReference
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalVoice.g:675:1: entryRuleEntityExample returns [EObject current=null] : iv_ruleEntityExample= ruleEntityExample EOF ;
    public final EObject entryRuleEntityExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityExample = null;


        try {
            // InternalVoice.g:675:54: (iv_ruleEntityExample= ruleEntityExample EOF )
            // InternalVoice.g:676:2: iv_ruleEntityExample= ruleEntityExample EOF
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
    // InternalVoice.g:682:1: ruleEntityExample returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleEntityExample() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVoice.g:688:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalVoice.g:689:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalVoice.g:689:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalVoice.g:690:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalVoice.g:690:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVoice.g:691:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVoice.g:691:4: (lv_name_0_0= RULE_ID )
            // InternalVoice.g:692:5: lv_name_0_0= RULE_ID
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

            // InternalVoice.g:708:3: (otherlv_1= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVoice.g:709:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVoice.g:718:1: entryRuleIsFollowup returns [EObject current=null] : iv_ruleIsFollowup= ruleIsFollowup EOF ;
    public final EObject entryRuleIsFollowup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsFollowup = null;


        try {
            // InternalVoice.g:718:51: (iv_ruleIsFollowup= ruleIsFollowup EOF )
            // InternalVoice.g:719:2: iv_ruleIsFollowup= ruleIsFollowup EOF
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
    // InternalVoice.g:725:1: ruleIsFollowup returns [EObject current=null] : (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleIsFollowup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVoice.g:731:2: ( (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVoice.g:732:2: (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVoice.g:732:2: (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) )
            // InternalVoice.g:733:3: otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0());
            		
            // InternalVoice.g:737:3: ( (otherlv_1= RULE_ID ) )
            // InternalVoice.g:738:4: (otherlv_1= RULE_ID )
            {
            // InternalVoice.g:738:4: (otherlv_1= RULE_ID )
            // InternalVoice.g:739:5: otherlv_1= RULE_ID
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
    // InternalVoice.g:754:1: entryRuleSysvariable returns [EObject current=null] : iv_ruleSysvariable= ruleSysvariable EOF ;
    public final EObject entryRuleSysvariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSysvariable = null;


        try {
            // InternalVoice.g:754:52: (iv_ruleSysvariable= ruleSysvariable EOF )
            // InternalVoice.g:755:2: iv_ruleSysvariable= ruleSysvariable EOF
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
    // InternalVoice.g:761:1: ruleSysvariable returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_defaultValue_3_0= ruleDefaultValues ) ) ) ;
    public final EObject ruleSysvariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_defaultValue_3_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:767:2: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_defaultValue_3_0= ruleDefaultValues ) ) ) )
            // InternalVoice.g:768:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_defaultValue_3_0= ruleDefaultValues ) ) )
            {
            // InternalVoice.g:768:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_defaultValue_3_0= ruleDefaultValues ) ) )
            // InternalVoice.g:769:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_defaultValue_3_0= ruleDefaultValues ) )
            {
            // InternalVoice.g:769:3: ()
            // InternalVoice.g:770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSysvariableAccess().getSysvariableAction_0(),
            					current);
            			

            }

            // InternalVoice.g:776:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVoice.g:777:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // InternalVoice.g:777:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalVoice.g:778:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalVoice.g:778:5: (lv_name_1_0= RULE_ID )
                    // InternalVoice.g:779:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getSysvariableAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSysvariableAccess().getEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalVoice.g:800:3: ( (lv_defaultValue_3_0= ruleDefaultValues ) )
            // InternalVoice.g:801:4: (lv_defaultValue_3_0= ruleDefaultValues )
            {
            // InternalVoice.g:801:4: (lv_defaultValue_3_0= ruleDefaultValues )
            // InternalVoice.g:802:5: lv_defaultValue_3_0= ruleDefaultValues
            {

            					newCompositeNode(grammarAccess.getSysvariableAccess().getDefaultValueDefaultValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_defaultValue_3_0=ruleDefaultValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSysvariableRule());
            					}
            					set(
            						current,
            						"defaultValue",
            						lv_defaultValue_3_0,
            						"org.xtext.example.mydsl.Voice.DefaultValues");
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
    // $ANTLR end "ruleSysvariable"


    // $ANTLR start "entryRuleDefaultValues"
    // InternalVoice.g:823:1: entryRuleDefaultValues returns [String current=null] : iv_ruleDefaultValues= ruleDefaultValues EOF ;
    public final String entryRuleDefaultValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultValues = null;


        try {
            // InternalVoice.g:823:53: (iv_ruleDefaultValues= ruleDefaultValues EOF )
            // InternalVoice.g:824:2: iv_ruleDefaultValues= ruleDefaultValues EOF
            {
             newCompositeNode(grammarAccess.getDefaultValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultValues=ruleDefaultValues();

            state._fsp--;

             current =iv_ruleDefaultValues.getText(); 
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
    // $ANTLR end "entryRuleDefaultValues"


    // $ANTLR start "ruleDefaultValues"
    // InternalVoice.g:830:1: ruleDefaultValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'number' | kw= 'date-time' | kw= 'date' | kw= 'duration' | kw= 'address' | kw= 'email' | kw= 'phone-number' | kw= 'date-period' | kw= 'time-period' | kw= 'url' | kw= 'any' | kw= 'color' | kw= 'language' ) ;
    public final AntlrDatatypeRuleToken ruleDefaultValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVoice.g:836:2: ( (kw= 'number' | kw= 'date-time' | kw= 'date' | kw= 'duration' | kw= 'address' | kw= 'email' | kw= 'phone-number' | kw= 'date-period' | kw= 'time-period' | kw= 'url' | kw= 'any' | kw= 'color' | kw= 'language' ) )
            // InternalVoice.g:837:2: (kw= 'number' | kw= 'date-time' | kw= 'date' | kw= 'duration' | kw= 'address' | kw= 'email' | kw= 'phone-number' | kw= 'date-period' | kw= 'time-period' | kw= 'url' | kw= 'any' | kw= 'color' | kw= 'language' )
            {
            // InternalVoice.g:837:2: (kw= 'number' | kw= 'date-time' | kw= 'date' | kw= 'duration' | kw= 'address' | kw= 'email' | kw= 'phone-number' | kw= 'date-period' | kw= 'time-period' | kw= 'url' | kw= 'any' | kw= 'color' | kw= 'language' )
            int alt12=13;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 31:
                {
                alt12=6;
                }
                break;
            case 32:
                {
                alt12=7;
                }
                break;
            case 33:
                {
                alt12=8;
                }
                break;
            case 34:
                {
                alt12=9;
                }
                break;
            case 35:
                {
                alt12=10;
                }
                break;
            case 36:
                {
                alt12=11;
                }
                break;
            case 37:
                {
                alt12=12;
                }
                break;
            case 38:
                {
                alt12=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalVoice.g:838:3: kw= 'number'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getNumberKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVoice.g:844:3: kw= 'date-time'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getDateTimeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalVoice.g:850:3: kw= 'date'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getDateKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalVoice.g:856:3: kw= 'duration'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getDurationKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalVoice.g:862:3: kw= 'address'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getAddressKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalVoice.g:868:3: kw= 'email'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getEmailKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalVoice.g:874:3: kw= 'phone-number'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getPhoneNumberKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalVoice.g:880:3: kw= 'date-period'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getDatePeriodKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalVoice.g:886:3: kw= 'time-period'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getTimePeriodKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalVoice.g:892:3: kw= 'url'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getUrlKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalVoice.g:898:3: kw= 'any'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getAnyKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalVoice.g:904:3: kw= 'color'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getColorKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalVoice.g:910:3: kw= 'language'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getLanguageKeyword_12());
                    		

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
    // $ANTLR end "ruleDefaultValues"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007FFD011010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007FFD051010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});

}