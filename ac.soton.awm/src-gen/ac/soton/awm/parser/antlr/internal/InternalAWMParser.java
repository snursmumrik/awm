package ac.soton.awm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.awm.services.AWMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAWMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PROC", "RULE_COMMENT", "RULE_ADDR", "RULE_INT", "RULE_REG", "RULE_IMPLY", "RULE_OR", "RULE_AND", "RULE_NOT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'ld'", "','", "'st'", "'d_ld'", "'d_st'", "'wait'", "'fence'", "'outcome:'", "'('", "')'", "'='", "'.'"
    };
    public static final int RULE_ID=13;
    public static final int T__29=29;
    public static final int RULE_ADDR=6;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_OR=10;
    public static final int RULE_IMPLY=9;
    public static final int RULE_AND=11;
    public static final int RULE_COMMENT=5;
    public static final int RULE_SL_COMMENT=16;
    public static final int EOF=-1;
    public static final int RULE_NOT=12;
    public static final int RULE_REG=8;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=14;
    public static final int RULE_INT=7;
    public static final int RULE_PROC=4;
    public static final int RULE_WS=17;

    // delegates
    // delegators


        public InternalAWMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAWMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAWMParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g"; }



     	private AWMGrammarAccess grammarAccess;
     	
        public InternalAWMParser(TokenStream input, AWMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AWMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_processes_0_0= ruleProcess ) )* ( (lv_outcomes_1_0= ruleOutcome ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_processes_0_0 = null;

        EObject lv_outcomes_1_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:79:28: ( ( ( (lv_processes_0_0= ruleProcess ) )* ( (lv_outcomes_1_0= ruleOutcome ) )* ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:80:1: ( ( (lv_processes_0_0= ruleProcess ) )* ( (lv_outcomes_1_0= ruleOutcome ) )* )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:80:1: ( ( (lv_processes_0_0= ruleProcess ) )* ( (lv_outcomes_1_0= ruleOutcome ) )* )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:80:2: ( (lv_processes_0_0= ruleProcess ) )* ( (lv_outcomes_1_0= ruleOutcome ) )*
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:80:2: ( (lv_processes_0_0= ruleProcess ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_PROC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:81:1: (lv_processes_0_0= ruleProcess )
            	    {
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:81:1: (lv_processes_0_0= ruleProcess )
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:82:3: lv_processes_0_0= ruleProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcess_in_ruleModel131);
            	    lv_processes_0_0=ruleProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"processes",
            	            		lv_processes_0_0, 
            	            		"Process");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:98:3: ( (lv_outcomes_1_0= ruleOutcome ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:99:1: (lv_outcomes_1_0= ruleOutcome )
            	    {
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:99:1: (lv_outcomes_1_0= ruleOutcome )
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:100:3: lv_outcomes_1_0= ruleOutcome
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getOutcomesOutcomeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutcome_in_ruleModel153);
            	    lv_outcomes_1_0=ruleOutcome();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"outcomes",
            	            		lv_outcomes_1_0, 
            	            		"Outcome");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcess"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:124:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:125:2: (iv_ruleProcess= ruleProcess EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:126:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess190);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess200); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:133:1: ruleProcess returns [EObject current=null] : ( ( (lv_name_0_0= RULE_PROC ) ) otherlv_1= ':' ( (lv_instructions_2_0= ruleInstruction ) )* ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:136:28: ( ( ( (lv_name_0_0= RULE_PROC ) ) otherlv_1= ':' ( (lv_instructions_2_0= ruleInstruction ) )* ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:137:1: ( ( (lv_name_0_0= RULE_PROC ) ) otherlv_1= ':' ( (lv_instructions_2_0= ruleInstruction ) )* )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:137:1: ( ( (lv_name_0_0= RULE_PROC ) ) otherlv_1= ':' ( (lv_instructions_2_0= ruleInstruction ) )* )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:137:2: ( (lv_name_0_0= RULE_PROC ) ) otherlv_1= ':' ( (lv_instructions_2_0= ruleInstruction ) )*
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:137:2: ( (lv_name_0_0= RULE_PROC ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:138:1: (lv_name_0_0= RULE_PROC )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:138:1: (lv_name_0_0= RULE_PROC )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:139:3: lv_name_0_0= RULE_PROC
            {
            lv_name_0_0=(Token)match(input,RULE_PROC,FOLLOW_RULE_PROC_in_ruleProcess242); 

            			newLeafNode(lv_name_0_0, grammarAccess.getProcessAccess().getNamePROCTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PROC");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleProcess259); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:159:1: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20||(LA3_0>=22 && LA3_0<=26)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:160:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:160:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:161:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleProcess280);
            	    lv_instructions_2_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_2_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleInstruction"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:185:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:186:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:187:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction317);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction327); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:194:1: ruleInstruction returns [EObject current=null] : ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_DLoad_2= ruleDLoad | this_DStore_3= ruleDStore | this_Wait_4= ruleWait | this_Fence_5= ruleFence ) (this_COMMENT_6= RULE_COMMENT )? ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token this_COMMENT_6=null;
        EObject this_Load_0 = null;

        EObject this_Store_1 = null;

        EObject this_DLoad_2 = null;

        EObject this_DStore_3 = null;

        EObject this_Wait_4 = null;

        EObject this_Fence_5 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:197:28: ( ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_DLoad_2= ruleDLoad | this_DStore_3= ruleDStore | this_Wait_4= ruleWait | this_Fence_5= ruleFence ) (this_COMMENT_6= RULE_COMMENT )? ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:198:1: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_DLoad_2= ruleDLoad | this_DStore_3= ruleDStore | this_Wait_4= ruleWait | this_Fence_5= ruleFence ) (this_COMMENT_6= RULE_COMMENT )? )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:198:1: ( (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_DLoad_2= ruleDLoad | this_DStore_3= ruleDStore | this_Wait_4= ruleWait | this_Fence_5= ruleFence ) (this_COMMENT_6= RULE_COMMENT )? )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:198:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_DLoad_2= ruleDLoad | this_DStore_3= ruleDStore | this_Wait_4= ruleWait | this_Fence_5= ruleFence ) (this_COMMENT_6= RULE_COMMENT )?
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:198:2: (this_Load_0= ruleLoad | this_Store_1= ruleStore | this_DLoad_2= ruleDLoad | this_DStore_3= ruleDStore | this_Wait_4= ruleWait | this_Fence_5= ruleFence )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 25:
                {
                alt4=5;
                }
                break;
            case 26:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:199:5: this_Load_0= ruleLoad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction375);
                    this_Load_0=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:209:5: this_Store_1= ruleStore
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction402);
                    this_Store_1=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:219:5: this_DLoad_2= ruleDLoad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getDLoadParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleDLoad_in_ruleInstruction429);
                    this_DLoad_2=ruleDLoad();

                    state._fsp--;

                     
                            current = this_DLoad_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:229:5: this_DStore_3= ruleDStore
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getDStoreParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleDStore_in_ruleInstruction456);
                    this_DStore_3=ruleDStore();

                    state._fsp--;

                     
                            current = this_DStore_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:239:5: this_Wait_4= ruleWait
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getWaitParserRuleCall_0_4()); 
                        
                    pushFollow(FOLLOW_ruleWait_in_ruleInstruction483);
                    this_Wait_4=ruleWait();

                    state._fsp--;

                     
                            current = this_Wait_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:249:5: this_Fence_5= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction510);
                    this_Fence_5=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:257:2: (this_COMMENT_6= RULE_COMMENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:257:3: this_COMMENT_6= RULE_COMMENT
                    {
                    this_COMMENT_6=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleInstruction522); 
                     
                        newLeafNode(this_COMMENT_6, grammarAccess.getInstructionAccess().getCOMMENTTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleLoad"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:269:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:270:2: (iv_ruleLoad= ruleLoad EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:271:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad559);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad569); 

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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:278:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;
        EObject lv_register_1_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:281:28: ( (otherlv_0= 'ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:282:1: (otherlv_0= 'ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:282:1: (otherlv_0= 'ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:282:3: otherlv_0= 'ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleLoad606); 

                	newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLdKeyword_0());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:286:1: ( (lv_register_1_0= ruleRegister ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:287:1: (lv_register_1_0= ruleRegister )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:287:1: (lv_register_1_0= ruleRegister )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:288:3: lv_register_1_0= ruleRegister
            {
             
            	        newCompositeNode(grammarAccess.getLoadAccess().getRegisterRegisterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRegister_in_ruleLoad627);
            lv_register_1_0=ruleRegister();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadRule());
            	        }
                   		set(
                   			current, 
                   			"register",
                    		lv_register_1_0, 
                    		"Register");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleLoad639); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getCommaKeyword_2());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:308:1: ( (lv_address_3_0= RULE_ADDR ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:309:1: (lv_address_3_0= RULE_ADDR )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:309:1: (lv_address_3_0= RULE_ADDR )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:310:3: lv_address_3_0= RULE_ADDR
            {
            lv_address_3_0=(Token)match(input,RULE_ADDR,FOLLOW_RULE_ADDR_in_ruleLoad656); 

            			newLeafNode(lv_address_3_0, grammarAccess.getLoadAccess().getAddressADDRTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_3_0, 
                    		"ADDR");
            	    

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleStore"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:334:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:335:2: (iv_ruleStore= ruleStore EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:336:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore697);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore707); 

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:343:1: ruleStore returns [EObject current=null] : (otherlv_0= 'st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;

         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:346:28: ( (otherlv_0= 'st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:347:1: (otherlv_0= 'st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:347:1: (otherlv_0= 'st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:347:3: otherlv_0= 'st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleStore744); 

                	newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStKeyword_0());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:351:1: ( (lv_value_1_0= RULE_INT ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:352:1: (lv_value_1_0= RULE_INT )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:352:1: (lv_value_1_0= RULE_INT )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:353:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore761); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStoreAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStoreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleStore778); 

                	newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getCommaKeyword_2());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:373:1: ( (lv_address_3_0= RULE_ADDR ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:374:1: (lv_address_3_0= RULE_ADDR )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:374:1: (lv_address_3_0= RULE_ADDR )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:375:3: lv_address_3_0= RULE_ADDR
            {
            lv_address_3_0=(Token)match(input,RULE_ADDR,FOLLOW_RULE_ADDR_in_ruleStore795); 

            			newLeafNode(lv_address_3_0, grammarAccess.getStoreAccess().getAddressADDRTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStoreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_3_0, 
                    		"ADDR");
            	    

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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleDLoad"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:399:1: entryRuleDLoad returns [EObject current=null] : iv_ruleDLoad= ruleDLoad EOF ;
    public final EObject entryRuleDLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLoad = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:400:2: (iv_ruleDLoad= ruleDLoad EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:401:2: iv_ruleDLoad= ruleDLoad EOF
            {
             newCompositeNode(grammarAccess.getDLoadRule()); 
            pushFollow(FOLLOW_ruleDLoad_in_entryRuleDLoad836);
            iv_ruleDLoad=ruleDLoad();

            state._fsp--;

             current =iv_ruleDLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDLoad846); 

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
    // $ANTLR end "entryRuleDLoad"


    // $ANTLR start "ruleDLoad"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:408:1: ruleDLoad returns [EObject current=null] : (otherlv_0= 'd_ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) ;
    public final EObject ruleDLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;
        EObject lv_register_1_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:411:28: ( (otherlv_0= 'd_ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:412:1: (otherlv_0= 'd_ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:412:1: (otherlv_0= 'd_ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:412:3: otherlv_0= 'd_ld' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDLoad883); 

                	newLeafNode(otherlv_0, grammarAccess.getDLoadAccess().getD_ldKeyword_0());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:416:1: ( (lv_register_1_0= ruleRegister ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:417:1: (lv_register_1_0= ruleRegister )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:417:1: (lv_register_1_0= ruleRegister )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:418:3: lv_register_1_0= ruleRegister
            {
             
            	        newCompositeNode(grammarAccess.getDLoadAccess().getRegisterRegisterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRegister_in_ruleDLoad904);
            lv_register_1_0=ruleRegister();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDLoadRule());
            	        }
                   		set(
                   			current, 
                   			"register",
                    		lv_register_1_0, 
                    		"Register");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDLoad916); 

                	newLeafNode(otherlv_2, grammarAccess.getDLoadAccess().getCommaKeyword_2());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:438:1: ( (lv_address_3_0= RULE_ADDR ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:439:1: (lv_address_3_0= RULE_ADDR )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:439:1: (lv_address_3_0= RULE_ADDR )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:440:3: lv_address_3_0= RULE_ADDR
            {
            lv_address_3_0=(Token)match(input,RULE_ADDR,FOLLOW_RULE_ADDR_in_ruleDLoad933); 

            			newLeafNode(lv_address_3_0, grammarAccess.getDLoadAccess().getAddressADDRTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDLoadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_3_0, 
                    		"ADDR");
            	    

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
    // $ANTLR end "ruleDLoad"


    // $ANTLR start "entryRuleDStore"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:464:1: entryRuleDStore returns [EObject current=null] : iv_ruleDStore= ruleDStore EOF ;
    public final EObject entryRuleDStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStore = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:465:2: (iv_ruleDStore= ruleDStore EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:466:2: iv_ruleDStore= ruleDStore EOF
            {
             newCompositeNode(grammarAccess.getDStoreRule()); 
            pushFollow(FOLLOW_ruleDStore_in_entryRuleDStore974);
            iv_ruleDStore=ruleDStore();

            state._fsp--;

             current =iv_ruleDStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDStore984); 

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
    // $ANTLR end "entryRuleDStore"


    // $ANTLR start "ruleDStore"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:473:1: ruleDStore returns [EObject current=null] : (otherlv_0= 'd_st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) ;
    public final EObject ruleDStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;

         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:476:28: ( (otherlv_0= 'd_st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:477:1: (otherlv_0= 'd_st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:477:1: (otherlv_0= 'd_st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:477:3: otherlv_0= 'd_st' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleDStore1021); 

                	newLeafNode(otherlv_0, grammarAccess.getDStoreAccess().getD_stKeyword_0());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:481:1: ( (lv_value_1_0= RULE_INT ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:482:1: (lv_value_1_0= RULE_INT )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:482:1: (lv_value_1_0= RULE_INT )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:483:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDStore1038); 

            			newLeafNode(lv_value_1_0, grammarAccess.getDStoreAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDStoreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDStore1055); 

                	newLeafNode(otherlv_2, grammarAccess.getDStoreAccess().getCommaKeyword_2());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:503:1: ( (lv_address_3_0= RULE_ADDR ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:504:1: (lv_address_3_0= RULE_ADDR )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:504:1: (lv_address_3_0= RULE_ADDR )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:505:3: lv_address_3_0= RULE_ADDR
            {
            lv_address_3_0=(Token)match(input,RULE_ADDR,FOLLOW_RULE_ADDR_in_ruleDStore1072); 

            			newLeafNode(lv_address_3_0, grammarAccess.getDStoreAccess().getAddressADDRTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDStoreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_3_0, 
                    		"ADDR");
            	    

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
    // $ANTLR end "ruleDStore"


    // $ANTLR start "entryRuleWait"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:529:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:530:2: (iv_ruleWait= ruleWait EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:531:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_ruleWait_in_entryRuleWait1113);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWait1123); 

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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:538:1: ruleWait returns [EObject current=null] : (otherlv_0= 'wait' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) otherlv_4= ',' ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        EObject lv_register_1_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:541:28: ( (otherlv_0= 'wait' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) otherlv_4= ',' ( (lv_value_5_0= RULE_INT ) ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:542:1: (otherlv_0= 'wait' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) otherlv_4= ',' ( (lv_value_5_0= RULE_INT ) ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:542:1: (otherlv_0= 'wait' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) otherlv_4= ',' ( (lv_value_5_0= RULE_INT ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:542:3: otherlv_0= 'wait' ( (lv_register_1_0= ruleRegister ) ) otherlv_2= ',' ( (lv_address_3_0= RULE_ADDR ) ) otherlv_4= ',' ( (lv_value_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleWait1160); 

                	newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWaitKeyword_0());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:546:1: ( (lv_register_1_0= ruleRegister ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:547:1: (lv_register_1_0= ruleRegister )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:547:1: (lv_register_1_0= ruleRegister )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:548:3: lv_register_1_0= ruleRegister
            {
             
            	        newCompositeNode(grammarAccess.getWaitAccess().getRegisterRegisterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRegister_in_ruleWait1181);
            lv_register_1_0=ruleRegister();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWaitRule());
            	        }
                   		set(
                   			current, 
                   			"register",
                    		lv_register_1_0, 
                    		"Register");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleWait1193); 

                	newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getCommaKeyword_2());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:568:1: ( (lv_address_3_0= RULE_ADDR ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:569:1: (lv_address_3_0= RULE_ADDR )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:569:1: (lv_address_3_0= RULE_ADDR )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:570:3: lv_address_3_0= RULE_ADDR
            {
            lv_address_3_0=(Token)match(input,RULE_ADDR,FOLLOW_RULE_ADDR_in_ruleWait1210); 

            			newLeafNode(lv_address_3_0, grammarAccess.getWaitAccess().getAddressADDRTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_3_0, 
                    		"ADDR");
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleWait1227); 

                	newLeafNode(otherlv_4, grammarAccess.getWaitAccess().getCommaKeyword_4());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:590:1: ( (lv_value_5_0= RULE_INT ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:591:1: (lv_value_5_0= RULE_INT )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:591:1: (lv_value_5_0= RULE_INT )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:592:3: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWait1244); 

            			newLeafNode(lv_value_5_0, grammarAccess.getWaitAccess().getValueINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleFence"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:616:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:617:2: (iv_ruleFence= ruleFence EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:618:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence1285);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence1295); 

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
    // $ANTLR end "entryRuleFence"


    // $ANTLR start "ruleFence"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:625:1: ruleFence returns [EObject current=null] : ( () otherlv_1= 'fence' ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:628:28: ( ( () otherlv_1= 'fence' ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:629:1: ( () otherlv_1= 'fence' )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:629:1: ( () otherlv_1= 'fence' )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:629:2: () otherlv_1= 'fence'
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:629:2: ()
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:630:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFenceAccess().getFenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleFence1341); 

                	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getFenceKeyword_1());
                

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
    // $ANTLR end "ruleFence"


    // $ANTLR start "entryRuleRegister"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:647:1: entryRuleRegister returns [EObject current=null] : iv_ruleRegister= ruleRegister EOF ;
    public final EObject entryRuleRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegister = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:648:2: (iv_ruleRegister= ruleRegister EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:649:2: iv_ruleRegister= ruleRegister EOF
            {
             newCompositeNode(grammarAccess.getRegisterRule()); 
            pushFollow(FOLLOW_ruleRegister_in_entryRuleRegister1377);
            iv_ruleRegister=ruleRegister();

            state._fsp--;

             current =iv_ruleRegister; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegister1387); 

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
    // $ANTLR end "entryRuleRegister"


    // $ANTLR start "ruleRegister"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:656:1: ruleRegister returns [EObject current=null] : ( (lv_name_0_0= RULE_REG ) ) ;
    public final EObject ruleRegister() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:659:28: ( ( (lv_name_0_0= RULE_REG ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:660:1: ( (lv_name_0_0= RULE_REG ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:660:1: ( (lv_name_0_0= RULE_REG ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:661:1: (lv_name_0_0= RULE_REG )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:661:1: (lv_name_0_0= RULE_REG )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:662:3: lv_name_0_0= RULE_REG
            {
            lv_name_0_0=(Token)match(input,RULE_REG,FOLLOW_RULE_REG_in_ruleRegister1428); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRegisterAccess().getNameREGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegisterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"REG");
            	    

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
    // $ANTLR end "ruleRegister"


    // $ANTLR start "entryRuleOutcome"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:686:1: entryRuleOutcome returns [EObject current=null] : iv_ruleOutcome= ruleOutcome EOF ;
    public final EObject entryRuleOutcome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutcome = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:687:2: (iv_ruleOutcome= ruleOutcome EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:688:2: iv_ruleOutcome= ruleOutcome EOF
            {
             newCompositeNode(grammarAccess.getOutcomeRule()); 
            pushFollow(FOLLOW_ruleOutcome_in_entryRuleOutcome1468);
            iv_ruleOutcome=ruleOutcome();

            state._fsp--;

             current =iv_ruleOutcome; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutcome1478); 

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
    // $ANTLR end "entryRuleOutcome"


    // $ANTLR start "ruleOutcome"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:695:1: ruleOutcome returns [EObject current=null] : (otherlv_0= 'outcome:' this_State_1= ruleState (this_COMMENT_2= RULE_COMMENT )? ) ;
    public final EObject ruleOutcome() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_COMMENT_2=null;
        EObject this_State_1 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:698:28: ( (otherlv_0= 'outcome:' this_State_1= ruleState (this_COMMENT_2= RULE_COMMENT )? ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:699:1: (otherlv_0= 'outcome:' this_State_1= ruleState (this_COMMENT_2= RULE_COMMENT )? )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:699:1: (otherlv_0= 'outcome:' this_State_1= ruleState (this_COMMENT_2= RULE_COMMENT )? )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:699:3: otherlv_0= 'outcome:' this_State_1= ruleState (this_COMMENT_2= RULE_COMMENT )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleOutcome1515); 

                	newLeafNode(otherlv_0, grammarAccess.getOutcomeAccess().getOutcomeKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getOutcomeAccess().getStateParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleState_in_ruleOutcome1537);
            this_State_1=ruleState();

            state._fsp--;

             
                    current = this_State_1; 
                    afterParserOrEnumRuleCall();
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:712:1: (this_COMMENT_2= RULE_COMMENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:712:2: this_COMMENT_2= RULE_COMMENT
                    {
                    this_COMMENT_2=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOutcome1548); 
                     
                        newLeafNode(this_COMMENT_2, grammarAccess.getOutcomeAccess().getCOMMENTTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleOutcome"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:724:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:725:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:726:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1585);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1595); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:733:1: ruleState returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:736:28: (this_Implication_0= ruleImplication )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:738:5: this_Implication_0= ruleImplication
            {
             
                    newCompositeNode(grammarAccess.getStateAccess().getImplicationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleImplication_in_ruleState1641);
            this_Implication_0=ruleImplication();

            state._fsp--;

             
                    current = this_Implication_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleImplication"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:754:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:755:2: (iv_ruleImplication= ruleImplication EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:756:2: iv_ruleImplication= ruleImplication EOF
            {
             newCompositeNode(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication1675);
            iv_ruleImplication=ruleImplication();

            state._fsp--;

             current =iv_ruleImplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication1685); 

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
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:763:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_op_2_0= RULE_IMPLY ) ) ( (lv_right_3_0= ruleImplication ) ) )? ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Disjunction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:766:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_op_2_0= RULE_IMPLY ) ) ( (lv_right_3_0= ruleImplication ) ) )? ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:767:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_op_2_0= RULE_IMPLY ) ) ( (lv_right_3_0= ruleImplication ) ) )? )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:767:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_op_2_0= RULE_IMPLY ) ) ( (lv_right_3_0= ruleImplication ) ) )? )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:768:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_op_2_0= RULE_IMPLY ) ) ( (lv_right_3_0= ruleImplication ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication1732);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;

             
                    current = this_Disjunction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:776:1: ( () ( (lv_op_2_0= RULE_IMPLY ) ) ( (lv_right_3_0= ruleImplication ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IMPLY) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:776:2: () ( (lv_op_2_0= RULE_IMPLY ) ) ( (lv_right_3_0= ruleImplication ) )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:776:2: ()
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:777:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getImplicationAccess().getBinaryLeftAction_1_0(),
                                current);
                        

                    }

                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:782:2: ( (lv_op_2_0= RULE_IMPLY ) )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:783:1: (lv_op_2_0= RULE_IMPLY )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:783:1: (lv_op_2_0= RULE_IMPLY )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:784:3: lv_op_2_0= RULE_IMPLY
                    {
                    lv_op_2_0=(Token)match(input,RULE_IMPLY,FOLLOW_RULE_IMPLY_in_ruleImplication1758); 

                    			newLeafNode(lv_op_2_0, grammarAccess.getImplicationAccess().getOpIMPLYTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImplicationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"IMPLY");
                    	    

                    }


                    }

                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:800:2: ( (lv_right_3_0= ruleImplication ) )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:801:1: (lv_right_3_0= ruleImplication )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:801:1: (lv_right_3_0= ruleImplication )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:802:3: lv_right_3_0= ruleImplication
                    {
                     
                    	        newCompositeNode(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImplication_in_ruleImplication1784);
                    lv_right_3_0=ruleImplication();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImplicationRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Implication");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:826:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:827:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:828:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction1822);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction1832); 

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:835:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleDisjunction ) ) )? ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:838:28: ( (this_Conjunction_0= ruleConjunction ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleDisjunction ) ) )? ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:839:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleDisjunction ) ) )? )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:839:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleDisjunction ) ) )? )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:840:5: this_Conjunction_0= ruleConjunction ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleDisjunction ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction1879);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;

             
                    current = this_Conjunction_0; 
                    afterParserOrEnumRuleCall();
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:848:1: ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleDisjunction ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OR) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:848:2: () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleDisjunction ) )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:848:2: ()
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:849:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getDisjunctionAccess().getBinaryLeftAction_1_0(),
                                current);
                        

                    }

                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:854:2: ( (lv_op_2_0= RULE_OR ) )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:855:1: (lv_op_2_0= RULE_OR )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:855:1: (lv_op_2_0= RULE_OR )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:856:3: lv_op_2_0= RULE_OR
                    {
                    lv_op_2_0=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleDisjunction1905); 

                    			newLeafNode(lv_op_2_0, grammarAccess.getDisjunctionAccess().getOpORTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisjunctionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"OR");
                    	    

                    }


                    }

                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:872:2: ( (lv_right_3_0= ruleDisjunction ) )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:873:1: (lv_right_3_0= ruleDisjunction )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:873:1: (lv_right_3_0= ruleDisjunction )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:874:3: lv_right_3_0= ruleDisjunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleDisjunction1931);
                    lv_right_3_0=ruleDisjunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Disjunction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:898:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:899:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:900:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1969);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1979); 

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:907:1: ruleConjunction returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleConjunction ) ) )? ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:910:28: ( (this_Negation_0= ruleNegation ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleConjunction ) ) )? ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:911:1: (this_Negation_0= ruleNegation ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleConjunction ) ) )? )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:911:1: (this_Negation_0= ruleNegation ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleConjunction ) ) )? )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:912:5: this_Negation_0= ruleNegation ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleConjunction ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNegation_in_ruleConjunction2026);
            this_Negation_0=ruleNegation();

            state._fsp--;

             
                    current = this_Negation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:920:1: ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleConjunction ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_AND) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:920:2: () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleConjunction ) )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:920:2: ()
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:921:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getConjunctionAccess().getBinaryLeftAction_1_0(),
                                current);
                        

                    }

                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:926:2: ( (lv_op_2_0= RULE_AND ) )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:927:1: (lv_op_2_0= RULE_AND )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:927:1: (lv_op_2_0= RULE_AND )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:928:3: lv_op_2_0= RULE_AND
                    {
                    lv_op_2_0=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleConjunction2052); 

                    			newLeafNode(lv_op_2_0, grammarAccess.getConjunctionAccess().getOpANDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConjunctionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"AND");
                    	    

                    }


                    }

                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:944:2: ( (lv_right_3_0= ruleConjunction ) )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:945:1: (lv_right_3_0= ruleConjunction )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:945:1: (lv_right_3_0= ruleConjunction )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:946:3: lv_right_3_0= ruleConjunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConjunction_in_ruleConjunction2078);
                    lv_right_3_0=ruleConjunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Conjunction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:970:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:971:2: (iv_ruleNegation= ruleNegation EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:972:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation2116);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation2126); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:979:1: ruleNegation returns [EObject current=null] : ( (this_NOT_0= RULE_NOT this_Negated_1= ruleNegated ) | this_Primary_2= rulePrimary ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        EObject this_Negated_1 = null;

        EObject this_Primary_2 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:982:28: ( ( (this_NOT_0= RULE_NOT this_Negated_1= ruleNegated ) | this_Primary_2= rulePrimary ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:983:1: ( (this_NOT_0= RULE_NOT this_Negated_1= ruleNegated ) | this_Primary_2= rulePrimary )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:983:1: ( (this_NOT_0= RULE_NOT this_Negated_1= ruleNegated ) | this_Primary_2= rulePrimary )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NOT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_PROC||LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:983:2: (this_NOT_0= RULE_NOT this_Negated_1= ruleNegated )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:983:2: (this_NOT_0= RULE_NOT this_Negated_1= ruleNegated )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:983:3: this_NOT_0= RULE_NOT this_Negated_1= ruleNegated
                    {
                    this_NOT_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleNegation2163); 
                     
                        newLeafNode(this_NOT_0, grammarAccess.getNegationAccess().getNOTTerminalRuleCall_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleNegated_in_ruleNegation2184);
                    this_Negated_1=ruleNegated();

                    state._fsp--;

                     
                            current = this_Negated_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:998:5: this_Primary_2= rulePrimary
                    {
                     
                            newCompositeNode(grammarAccess.getNegationAccess().getPrimaryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimary_in_ruleNegation2212);
                    this_Primary_2=rulePrimary();

                    state._fsp--;

                     
                            current = this_Primary_2; 
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleNegated"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1014:1: entryRuleNegated returns [EObject current=null] : iv_ruleNegated= ruleNegated EOF ;
    public final EObject entryRuleNegated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegated = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1015:2: (iv_ruleNegated= ruleNegated EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1016:2: iv_ruleNegated= ruleNegated EOF
            {
             newCompositeNode(grammarAccess.getNegatedRule()); 
            pushFollow(FOLLOW_ruleNegated_in_entryRuleNegated2247);
            iv_ruleNegated=ruleNegated();

            state._fsp--;

             current =iv_ruleNegated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegated2257); 

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
    // $ANTLR end "entryRuleNegated"


    // $ANTLR start "ruleNegated"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1023:1: ruleNegated returns [EObject current=null] : ( () ( (lv_not_1_0= rulePrimary ) ) ) ;
    public final EObject ruleNegated() throws RecognitionException {
        EObject current = null;

        EObject lv_not_1_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1026:28: ( ( () ( (lv_not_1_0= rulePrimary ) ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1027:1: ( () ( (lv_not_1_0= rulePrimary ) ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1027:1: ( () ( (lv_not_1_0= rulePrimary ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1027:2: () ( (lv_not_1_0= rulePrimary ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1027:2: ()
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1028:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNegatedAccess().getNotAction_0(),
                        current);
                

            }

            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1033:2: ( (lv_not_1_0= rulePrimary ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1034:1: (lv_not_1_0= rulePrimary )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1034:1: (lv_not_1_0= rulePrimary )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1035:3: lv_not_1_0= rulePrimary
            {
             
            	        newCompositeNode(grammarAccess.getNegatedAccess().getNotPrimaryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrimary_in_ruleNegated2312);
            lv_not_1_0=rulePrimary();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNegatedRule());
            	        }
                   		set(
                   			current, 
                   			"not",
                    		lv_not_1_0, 
                    		"Primary");
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
    // $ANTLR end "ruleNegated"


    // $ANTLR start "entryRulePrimary"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1059:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1060:2: (iv_rulePrimary= rulePrimary EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1061:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2348);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2358); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1068:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_State_1= ruleState otherlv_2= ')' ) | this_RegState_3= ruleRegState ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_State_1 = null;

        EObject this_RegState_3 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1071:28: ( ( (otherlv_0= '(' this_State_1= ruleState otherlv_2= ')' ) | this_RegState_3= ruleRegState ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1072:1: ( (otherlv_0= '(' this_State_1= ruleState otherlv_2= ')' ) | this_RegState_3= ruleRegState )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1072:1: ( (otherlv_0= '(' this_State_1= ruleState otherlv_2= ')' ) | this_RegState_3= ruleRegState )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_PROC) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1072:2: (otherlv_0= '(' this_State_1= ruleState otherlv_2= ')' )
                    {
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1072:2: (otherlv_0= '(' this_State_1= ruleState otherlv_2= ')' )
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1072:4: otherlv_0= '(' this_State_1= ruleState otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePrimary2396); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getStateParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleState_in_rulePrimary2418);
                    this_State_1=ruleState();

                    state._fsp--;

                     
                            current = this_State_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePrimary2429); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1091:5: this_RegState_3= ruleRegState
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getRegStateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRegState_in_rulePrimary2458);
                    this_RegState_3=ruleRegState();

                    state._fsp--;

                     
                            current = this_RegState_3; 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleRegState"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1107:1: entryRuleRegState returns [EObject current=null] : iv_ruleRegState= ruleRegState EOF ;
    public final EObject entryRuleRegState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegState = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1108:2: (iv_ruleRegState= ruleRegState EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1109:2: iv_ruleRegState= ruleRegState EOF
            {
             newCompositeNode(grammarAccess.getRegStateRule()); 
            pushFollow(FOLLOW_ruleRegState_in_entryRuleRegState2493);
            iv_ruleRegState=ruleRegState();

            state._fsp--;

             current =iv_ruleRegState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegState2503); 

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
    // $ANTLR end "entryRuleRegState"


    // $ANTLR start "ruleRegState"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1116:1: ruleRegState returns [EObject current=null] : ( ( ( ruleRQN ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRegState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1119:28: ( ( ( ( ruleRQN ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1120:1: ( ( ( ruleRQN ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1120:1: ( ( ( ruleRQN ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1120:2: ( ( ruleRQN ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1120:2: ( ( ruleRQN ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1121:1: ( ruleRQN )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1121:1: ( ruleRQN )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1122:3: ruleRQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegStateRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRegStateAccess().getRegisterRegisterCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRQN_in_ruleRegState2551);
            ruleRQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleRegState2563); 

                	newLeafNode(otherlv_1, grammarAccess.getRegStateAccess().getEqualsSignKeyword_1());
                
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1139:1: ( (lv_value_2_0= RULE_INT ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1140:1: (lv_value_2_0= RULE_INT )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1140:1: (lv_value_2_0= RULE_INT )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1141:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRegState2580); 

            			newLeafNode(lv_value_2_0, grammarAccess.getRegStateAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleRegState"


    // $ANTLR start "entryRuleRQN"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1165:1: entryRuleRQN returns [String current=null] : iv_ruleRQN= ruleRQN EOF ;
    public final String entryRuleRQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRQN = null;


        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1166:2: (iv_ruleRQN= ruleRQN EOF )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1167:2: iv_ruleRQN= ruleRQN EOF
            {
             newCompositeNode(grammarAccess.getRQNRule()); 
            pushFollow(FOLLOW_ruleRQN_in_entryRuleRQN2622);
            iv_ruleRQN=ruleRQN();

            state._fsp--;

             current =iv_ruleRQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRQN2633); 

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
    // $ANTLR end "entryRuleRQN"


    // $ANTLR start "ruleRQN"
    // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1174:1: ruleRQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PROC_0= RULE_PROC kw= '.' this_REG_2= RULE_REG ) ;
    public final AntlrDatatypeRuleToken ruleRQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PROC_0=null;
        Token kw=null;
        Token this_REG_2=null;

         enterRule(); 
            
        try {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1177:28: ( (this_PROC_0= RULE_PROC kw= '.' this_REG_2= RULE_REG ) )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1178:1: (this_PROC_0= RULE_PROC kw= '.' this_REG_2= RULE_REG )
            {
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1178:1: (this_PROC_0= RULE_PROC kw= '.' this_REG_2= RULE_REG )
            // ../ac.soton.awm/src-gen/ac/soton/awm/parser/antlr/internal/InternalAWM.g:1178:6: this_PROC_0= RULE_PROC kw= '.' this_REG_2= RULE_REG
            {
            this_PROC_0=(Token)match(input,RULE_PROC,FOLLOW_RULE_PROC_in_ruleRQN2673); 

            		current.merge(this_PROC_0);
                
             
                newLeafNode(this_PROC_0, grammarAccess.getRQNAccess().getPROCTerminalRuleCall_0()); 
                
            kw=(Token)match(input,31,FOLLOW_31_in_ruleRQN2691); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRQNAccess().getFullStopKeyword_1()); 
                
            this_REG_2=(Token)match(input,RULE_REG,FOLLOW_RULE_REG_in_ruleRQN2706); 

            		current.merge(this_REG_2);
                
             
                newLeafNode(this_REG_2, grammarAccess.getRQNAccess().getREGTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleRQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleModel131 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_ruleOutcome_in_ruleModel153 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROC_in_ruleProcess242 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleProcess259 = new BitSet(new long[]{0x0000000007D00002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleProcess280 = new BitSet(new long[]{0x0000000007D00002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction375 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction402 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDLoad_in_ruleInstruction429 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDStore_in_ruleInstruction456 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleWait_in_ruleInstruction483 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction510 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleInstruction522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLoad606 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleRegister_in_ruleLoad627 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLoad639 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ADDR_in_ruleLoad656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStore744 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore761 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStore778 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ADDR_in_ruleStore795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDLoad_in_entryRuleDLoad836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDLoad846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDLoad883 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleRegister_in_ruleDLoad904 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDLoad916 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ADDR_in_ruleDLoad933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDStore_in_entryRuleDStore974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDStore984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDStore1021 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDStore1038 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDStore1055 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ADDR_in_ruleDStore1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWait_in_entryRuleWait1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWait1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWait1160 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleRegister_in_ruleWait1181 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWait1193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ADDR_in_ruleWait1210 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWait1227 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWait1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence1285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFence1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegister_in_entryRuleRegister1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegister1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REG_in_ruleRegister1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutcome_in_entryRuleOutcome1468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutcome1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOutcome1515 = new BitSet(new long[]{0x0000000010001010L});
    public static final BitSet FOLLOW_ruleState_in_ruleOutcome1537 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOutcome1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleState1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication1675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication1732 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_IMPLY_in_ruleImplication1758 = new BitSet(new long[]{0x0000000010001010L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleImplication1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction1822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction1879 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleDisjunction1905 = new BitSet(new long[]{0x0000000010001010L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleDisjunction1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleConjunction2026 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleConjunction2052 = new BitSet(new long[]{0x0000000010001010L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConjunction2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleNegation2163 = new BitSet(new long[]{0x0000000010001010L});
    public static final BitSet FOLLOW_ruleNegated_in_ruleNegation2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNegation2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_entryRuleNegated2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegated2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNegated2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimary2396 = new BitSet(new long[]{0x0000000010001010L});
    public static final BitSet FOLLOW_ruleState_in_rulePrimary2418 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePrimary2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegState_in_rulePrimary2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegState_in_entryRuleRegState2493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegState2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRQN_in_ruleRegState2551 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRegState2563 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRegState2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRQN_in_entryRuleRQN2622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRQN2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROC_in_ruleRQN2673 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRQN2691 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_REG_in_ruleRQN2706 = new BitSet(new long[]{0x0000000000000002L});

}