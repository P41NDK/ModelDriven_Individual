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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Intent'", "'extends'", "'Entity'", "'['", "']'", "'get'", "'='", "'with'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'IsFollowup'", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'"
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
    // InternalVoice.g:143:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_questions_5_0= ruleQuestionReference ) )+ ( (lv_training_6_0= ruleTraining ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_isFollowup_4_0 = null;

        EObject lv_questions_5_0 = null;

        EObject lv_training_6_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:149:2: ( (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_questions_5_0= ruleQuestionReference ) )+ ( (lv_training_6_0= ruleTraining ) ) ) )
            // InternalVoice.g:150:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_questions_5_0= ruleQuestionReference ) )+ ( (lv_training_6_0= ruleTraining ) ) )
            {
            // InternalVoice.g:150:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_questions_5_0= ruleQuestionReference ) )+ ( (lv_training_6_0= ruleTraining ) ) )
            // InternalVoice.g:151:3: otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_isFollowup_4_0= ruleIsFollowup ) )? ( (lv_questions_5_0= ruleQuestionReference ) )+ ( (lv_training_6_0= ruleTraining ) )
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

            if ( (LA4_0==25) ) {
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

            // InternalVoice.g:211:3: ( (lv_questions_5_0= ruleQuestionReference ) )+
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
            	    // InternalVoice.g:212:4: (lv_questions_5_0= ruleQuestionReference )
            	    {
            	    // InternalVoice.g:212:4: (lv_questions_5_0= ruleQuestionReference )
            	    // InternalVoice.g:213:5: lv_questions_5_0= ruleQuestionReference
            	    {

            	    					newCompositeNode(grammarAccess.getIntentAccess().getQuestionsQuestionReferenceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_questions_5_0=ruleQuestionReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"questions",
            	    						lv_questions_5_0,
            	    						"org.xtext.example.mydsl.Voice.QuestionReference");
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


    // $ANTLR start "entryRuleQuestionReference"
    // InternalVoice.g:328:1: entryRuleQuestionReference returns [EObject current=null] : iv_ruleQuestionReference= ruleQuestionReference EOF ;
    public final EObject entryRuleQuestionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionReference = null;


        try {
            // InternalVoice.g:328:58: (iv_ruleQuestionReference= ruleQuestionReference EOF )
            // InternalVoice.g:329:2: iv_ruleQuestionReference= ruleQuestionReference EOF
            {
             newCompositeNode(grammarAccess.getQuestionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionReference=ruleQuestionReference();

            state._fsp--;

             current =iv_ruleQuestionReference; 
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
    // $ANTLR end "entryRuleQuestionReference"


    // $ANTLR start "ruleQuestionReference"
    // InternalVoice.g:335:1: ruleQuestionReference returns [EObject current=null] : ( ( (lv_question_0_0= ruleQuestion ) ) | (otherlv_1= 'get' ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleQuestionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_question_0_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:341:2: ( ( ( (lv_question_0_0= ruleQuestion ) ) | (otherlv_1= 'get' ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalVoice.g:342:2: ( ( (lv_question_0_0= ruleQuestion ) ) | (otherlv_1= 'get' ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalVoice.g:342:2: ( ( (lv_question_0_0= ruleQuestion ) ) | (otherlv_1= 'get' ( (otherlv_2= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=26 && LA7_0<=38)) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVoice.g:343:3: ( (lv_question_0_0= ruleQuestion ) )
                    {
                    // InternalVoice.g:343:3: ( (lv_question_0_0= ruleQuestion ) )
                    // InternalVoice.g:344:4: (lv_question_0_0= ruleQuestion )
                    {
                    // InternalVoice.g:344:4: (lv_question_0_0= ruleQuestion )
                    // InternalVoice.g:345:5: lv_question_0_0= ruleQuestion
                    {

                    					newCompositeNode(grammarAccess.getQuestionReferenceAccess().getQuestionQuestionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_question_0_0=ruleQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuestionReferenceRule());
                    					}
                    					set(
                    						current,
                    						"question",
                    						lv_question_0_0,
                    						"org.xtext.example.mydsl.Voice.Question");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVoice.g:363:3: (otherlv_1= 'get' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalVoice.g:363:3: (otherlv_1= 'get' ( (otherlv_2= RULE_ID ) ) )
                    // InternalVoice.g:364:4: otherlv_1= 'get' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuestionReferenceAccess().getGetKeyword_1_0());
                    			
                    // InternalVoice.g:368:4: ( (otherlv_2= RULE_ID ) )
                    // InternalVoice.g:369:5: (otherlv_2= RULE_ID )
                    {
                    // InternalVoice.g:369:5: (otherlv_2= RULE_ID )
                    // InternalVoice.g:370:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionReferenceRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getQuestionReferenceAccess().getQuestionReferenceQuestionCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleQuestionReference"


    // $ANTLR start "entryRuleQuestion"
    // InternalVoice.g:386:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalVoice.g:386:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalVoice.g:387:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalVoice.g:393:1: ruleQuestion returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_prompt_4_0=null;
        EObject lv_questionEntity_2_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:399:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) ) )
            // InternalVoice.g:400:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) )
            {
            // InternalVoice.g:400:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) ) )
            // InternalVoice.g:401:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_questionEntity_2_0= ruleQuestionEntity ) ) otherlv_3= 'with' ( (lv_prompt_4_0= RULE_STRING ) )
            {
            // InternalVoice.g:401:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==17) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalVoice.g:402:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // InternalVoice.g:402:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalVoice.g:403:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalVoice.g:403:5: (lv_name_0_0= RULE_ID )
                    // InternalVoice.g:404:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getEqualsSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalVoice.g:425:3: ( (lv_questionEntity_2_0= ruleQuestionEntity ) )
            // InternalVoice.g:426:4: (lv_questionEntity_2_0= ruleQuestionEntity )
            {
            // InternalVoice.g:426:4: (lv_questionEntity_2_0= ruleQuestionEntity )
            // InternalVoice.g:427:5: lv_questionEntity_2_0= ruleQuestionEntity
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getWithKeyword_2());
            		
            // InternalVoice.g:448:3: ( (lv_prompt_4_0= RULE_STRING ) )
            // InternalVoice.g:449:4: (lv_prompt_4_0= RULE_STRING )
            {
            // InternalVoice.g:449:4: (lv_prompt_4_0= RULE_STRING )
            // InternalVoice.g:450:5: lv_prompt_4_0= RULE_STRING
            {
            lv_prompt_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_prompt_4_0, grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_3_0());
            				

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
    // InternalVoice.g:470:1: entryRuleQuestionEntity returns [EObject current=null] : iv_ruleQuestionEntity= ruleQuestionEntity EOF ;
    public final EObject entryRuleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionEntity = null;


        try {
            // InternalVoice.g:470:55: (iv_ruleQuestionEntity= ruleQuestionEntity EOF )
            // InternalVoice.g:471:2: iv_ruleQuestionEntity= ruleQuestionEntity EOF
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
    // InternalVoice.g:477:1: ruleQuestionEntity returns [EObject current=null] : ( (lv_withEntity_0_0= ruleReference ) ) ;
    public final EObject ruleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_withEntity_0_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:483:2: ( ( (lv_withEntity_0_0= ruleReference ) ) )
            // InternalVoice.g:484:2: ( (lv_withEntity_0_0= ruleReference ) )
            {
            // InternalVoice.g:484:2: ( (lv_withEntity_0_0= ruleReference ) )
            // InternalVoice.g:485:3: (lv_withEntity_0_0= ruleReference )
            {
            // InternalVoice.g:485:3: (lv_withEntity_0_0= ruleReference )
            // InternalVoice.g:486:4: lv_withEntity_0_0= ruleReference
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
    // InternalVoice.g:506:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalVoice.g:506:50: (iv_ruleReference= ruleReference EOF )
            // InternalVoice.g:507:2: iv_ruleReference= ruleReference EOF
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
    // InternalVoice.g:513:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sysvar_1_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:519:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) )
            // InternalVoice.g:520:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            {
            // InternalVoice.g:520:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=26 && LA9_0<=38)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVoice.g:521:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalVoice.g:521:3: ( (otherlv_0= RULE_ID ) )
                    // InternalVoice.g:522:4: (otherlv_0= RULE_ID )
                    {
                    // InternalVoice.g:522:4: (otherlv_0= RULE_ID )
                    // InternalVoice.g:523:5: otherlv_0= RULE_ID
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
                    // InternalVoice.g:535:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    {
                    // InternalVoice.g:535:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    // InternalVoice.g:536:4: (lv_sysvar_1_0= ruleSysvariable )
                    {
                    // InternalVoice.g:536:4: (lv_sysvar_1_0= ruleSysvariable )
                    // InternalVoice.g:537:5: lv_sysvar_1_0= ruleSysvariable
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
    // InternalVoice.g:558:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalVoice.g:558:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalVoice.g:559:2: iv_ruleTraining= ruleTraining EOF
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
    // InternalVoice.g:565:1: ruleTraining returns [EObject current=null] : ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) ;
    public final EObject ruleTraining() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trainingref_2_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:571:2: ( ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) )
            // InternalVoice.g:572:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            {
            // InternalVoice.g:572:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            // InternalVoice.g:573:3: () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            {
            // InternalVoice.g:573:3: ()
            // InternalVoice.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingAccess().getTrainingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
            		
            // InternalVoice.g:584:3: ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVoice.g:585:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    {
            	    // InternalVoice.g:585:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    // InternalVoice.g:586:5: lv_trainingref_2_0= ruleTrainingRef
            	    {

            	    					newCompositeNode(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalVoice.g:607:1: entryRuleTrainingRef returns [EObject current=null] : iv_ruleTrainingRef= ruleTrainingRef EOF ;
    public final EObject entryRuleTrainingRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingRef = null;


        try {
            // InternalVoice.g:607:52: (iv_ruleTrainingRef= ruleTrainingRef EOF )
            // InternalVoice.g:608:2: iv_ruleTrainingRef= ruleTrainingRef EOF
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
    // InternalVoice.g:614:1: ruleTrainingRef returns [EObject current=null] : ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' ) ;
    public final EObject ruleTrainingRef() throws RecognitionException {
        EObject current = null;

        Token lv_phrase_0_0=null;
        Token otherlv_2=null;
        EObject lv_declarations_1_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:620:2: ( ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' ) )
            // InternalVoice.g:621:2: ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' )
            {
            // InternalVoice.g:621:2: ( ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.' )
            // InternalVoice.g:622:3: ( (lv_phrase_0_0= RULE_STRING ) ) ( (lv_declarations_1_0= ruleDeclaration ) ) otherlv_2= '.'
            {
            // InternalVoice.g:622:3: ( (lv_phrase_0_0= RULE_STRING ) )
            // InternalVoice.g:623:4: (lv_phrase_0_0= RULE_STRING )
            {
            // InternalVoice.g:623:4: (lv_phrase_0_0= RULE_STRING )
            // InternalVoice.g:624:5: lv_phrase_0_0= RULE_STRING
            {
            lv_phrase_0_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalVoice.g:640:3: ( (lv_declarations_1_0= ruleDeclaration ) )
            // InternalVoice.g:641:4: (lv_declarations_1_0= ruleDeclaration )
            {
            // InternalVoice.g:641:4: (lv_declarations_1_0= ruleDeclaration )
            // InternalVoice.g:642:5: lv_declarations_1_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getTrainingRefAccess().getDeclarationsDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalVoice.g:667:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalVoice.g:667:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalVoice.g:668:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalVoice.g:674:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_trainingstring_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalVoice.g:680:2: ( (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) )
            // InternalVoice.g:681:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            {
            // InternalVoice.g:681:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            // InternalVoice.g:682:3: otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalVoice.g:686:3: ( (lv_trainingstring_1_0= RULE_STRING ) )
            // InternalVoice.g:687:4: (lv_trainingstring_1_0= RULE_STRING )
            {
            // InternalVoice.g:687:4: (lv_trainingstring_1_0= RULE_STRING )
            // InternalVoice.g:688:5: lv_trainingstring_1_0= RULE_STRING
            {
            lv_trainingstring_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getIsKeyword_2());
            		
            // InternalVoice.g:708:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalVoice.g:709:4: (lv_reference_3_0= ruleReference )
            {
            // InternalVoice.g:709:4: (lv_reference_3_0= ruleReference )
            // InternalVoice.g:710:5: lv_reference_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVoice.g:735:1: entryRuleEntityExample returns [EObject current=null] : iv_ruleEntityExample= ruleEntityExample EOF ;
    public final EObject entryRuleEntityExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityExample = null;


        try {
            // InternalVoice.g:735:54: (iv_ruleEntityExample= ruleEntityExample EOF )
            // InternalVoice.g:736:2: iv_ruleEntityExample= ruleEntityExample EOF
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
    // InternalVoice.g:742:1: ruleEntityExample returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleEntityExample() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVoice.g:748:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalVoice.g:749:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalVoice.g:749:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalVoice.g:750:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalVoice.g:750:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVoice.g:751:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVoice.g:751:4: (lv_name_0_0= RULE_ID )
            // InternalVoice.g:752:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalVoice.g:768:3: (otherlv_1= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVoice.g:769:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

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
    // InternalVoice.g:778:1: entryRuleIsFollowup returns [EObject current=null] : iv_ruleIsFollowup= ruleIsFollowup EOF ;
    public final EObject entryRuleIsFollowup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsFollowup = null;


        try {
            // InternalVoice.g:778:51: (iv_ruleIsFollowup= ruleIsFollowup EOF )
            // InternalVoice.g:779:2: iv_ruleIsFollowup= ruleIsFollowup EOF
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
    // InternalVoice.g:785:1: ruleIsFollowup returns [EObject current=null] : (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleIsFollowup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVoice.g:791:2: ( (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVoice.g:792:2: (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVoice.g:792:2: (otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) ) )
            // InternalVoice.g:793:3: otherlv_0= 'IsFollowup' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIsFollowupAccess().getIsFollowupKeyword_0());
            		
            // InternalVoice.g:797:3: ( (otherlv_1= RULE_ID ) )
            // InternalVoice.g:798:4: (otherlv_1= RULE_ID )
            {
            // InternalVoice.g:798:4: (otherlv_1= RULE_ID )
            // InternalVoice.g:799:5: otherlv_1= RULE_ID
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
    // InternalVoice.g:814:1: entryRuleSysvariable returns [EObject current=null] : iv_ruleSysvariable= ruleSysvariable EOF ;
    public final EObject entryRuleSysvariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSysvariable = null;


        try {
            // InternalVoice.g:814:52: (iv_ruleSysvariable= ruleSysvariable EOF )
            // InternalVoice.g:815:2: iv_ruleSysvariable= ruleSysvariable EOF
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
    // InternalVoice.g:821:1: ruleSysvariable returns [EObject current=null] : ( () ( ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) ) ) ) ;
    public final EObject ruleSysvariable() throws RecognitionException {
        EObject current = null;

        Token lv_defaultValue_1_1=null;
        Token lv_defaultValue_1_2=null;
        Token lv_defaultValue_1_3=null;
        Token lv_defaultValue_1_4=null;
        Token lv_defaultValue_1_5=null;
        Token lv_defaultValue_1_6=null;
        Token lv_defaultValue_1_7=null;
        Token lv_defaultValue_1_8=null;
        Token lv_defaultValue_1_9=null;
        Token lv_defaultValue_1_10=null;
        Token lv_defaultValue_1_11=null;
        Token lv_defaultValue_1_12=null;
        Token lv_defaultValue_1_13=null;


        	enterRule();

        try {
            // InternalVoice.g:827:2: ( ( () ( ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) ) ) ) )
            // InternalVoice.g:828:2: ( () ( ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) ) ) )
            {
            // InternalVoice.g:828:2: ( () ( ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) ) ) )
            // InternalVoice.g:829:3: () ( ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) ) )
            {
            // InternalVoice.g:829:3: ()
            // InternalVoice.g:830:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSysvariableAccess().getSysvariableAction_0(),
            					current);
            			

            }

            // InternalVoice.g:836:3: ( ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) ) )
            // InternalVoice.g:837:4: ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) )
            {
            // InternalVoice.g:837:4: ( (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' ) )
            // InternalVoice.g:838:5: (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' )
            {
            // InternalVoice.g:838:5: (lv_defaultValue_1_1= 'number' | lv_defaultValue_1_2= 'date-time' | lv_defaultValue_1_3= 'date' | lv_defaultValue_1_4= 'duration' | lv_defaultValue_1_5= 'address' | lv_defaultValue_1_6= 'email' | lv_defaultValue_1_7= 'phone-number' | lv_defaultValue_1_8= 'date-period' | lv_defaultValue_1_9= 'time-period' | lv_defaultValue_1_10= 'url' | lv_defaultValue_1_11= 'any' | lv_defaultValue_1_12= 'color' | lv_defaultValue_1_13= 'language' )
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
                    // InternalVoice.g:839:6: lv_defaultValue_1_1= 'number'
                    {
                    lv_defaultValue_1_1=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_1, grammarAccess.getSysvariableAccess().getDefaultValueNumberKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalVoice.g:850:6: lv_defaultValue_1_2= 'date-time'
                    {
                    lv_defaultValue_1_2=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_2, grammarAccess.getSysvariableAccess().getDefaultValueDateTimeKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalVoice.g:861:6: lv_defaultValue_1_3= 'date'
                    {
                    lv_defaultValue_1_3=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_3, grammarAccess.getSysvariableAccess().getDefaultValueDateKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalVoice.g:872:6: lv_defaultValue_1_4= 'duration'
                    {
                    lv_defaultValue_1_4=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_4, grammarAccess.getSysvariableAccess().getDefaultValueDurationKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalVoice.g:883:6: lv_defaultValue_1_5= 'address'
                    {
                    lv_defaultValue_1_5=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_5, grammarAccess.getSysvariableAccess().getDefaultValueAddressKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalVoice.g:894:6: lv_defaultValue_1_6= 'email'
                    {
                    lv_defaultValue_1_6=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_6, grammarAccess.getSysvariableAccess().getDefaultValueEmailKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalVoice.g:905:6: lv_defaultValue_1_7= 'phone-number'
                    {
                    lv_defaultValue_1_7=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_7, grammarAccess.getSysvariableAccess().getDefaultValuePhoneNumberKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalVoice.g:916:6: lv_defaultValue_1_8= 'date-period'
                    {
                    lv_defaultValue_1_8=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_8, grammarAccess.getSysvariableAccess().getDefaultValueDatePeriodKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalVoice.g:927:6: lv_defaultValue_1_9= 'time-period'
                    {
                    lv_defaultValue_1_9=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_9, grammarAccess.getSysvariableAccess().getDefaultValueTimePeriodKeyword_1_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalVoice.g:938:6: lv_defaultValue_1_10= 'url'
                    {
                    lv_defaultValue_1_10=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_10, grammarAccess.getSysvariableAccess().getDefaultValueUrlKeyword_1_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalVoice.g:949:6: lv_defaultValue_1_11= 'any'
                    {
                    lv_defaultValue_1_11=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_11, grammarAccess.getSysvariableAccess().getDefaultValueAnyKeyword_1_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalVoice.g:960:6: lv_defaultValue_1_12= 'color'
                    {
                    lv_defaultValue_1_12=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_12, grammarAccess.getSysvariableAccess().getDefaultValueColorKeyword_1_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalVoice.g:971:6: lv_defaultValue_1_13= 'language'
                    {
                    lv_defaultValue_1_13=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_1_13, grammarAccess.getSysvariableAccess().getDefaultValueLanguageKeyword_1_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSysvariableRule());
                    						}
                    						setWithLastConsumed(current, "defaultValue", lv_defaultValue_1_13, null);
                    					

                    }
                    break;

            }


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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007FFE011010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007FFE091010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007FFC000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});

}