

import java.util.List;
%%

%class Flexer
%unicode
/*%debug*/
%int
/*%line*/
/*%column*/

%{
    Solution sol = new Solution();
    State startEdge = new State();
    char edge;
%}

LineTerminator = \r|\n|\r\n
WS = {LineTerminator} | [ \t\f]
special = "`"|"-"|"="|"["|"]"|";"|"'"|"\\"|"."|"/"|"~"|"!"|"@"|"#"|"$"|"%"|"^"|"&"|"*"|"_"|"+"|":"|"\""|"|"|"<"|">"|"?"
Symbol = [:uppercase:] | [:lowercase:] | [:digit:] | {special}
Name = ([:uppercase:] | [:lowercase:] | [:digit:] | "_")+

%state STARTK ELEMK STOPK SEPKS STARTS INITS ELEMS STOPS SEPSD STARTD INITD ELEMD SRCT SEPSST SYMT SEPSDT DESTT ENDT ENDD STOPD SEPDS SS SEPSF STARTF INITF ELEMF STOPF ENDDFA FINAL

%state DFA STATES STSEP ALPHABET ALSEP DELTA DSEP START STASE STOP STOSE

%%
{WS}	{}
<YYINITIAL>"(" {
    yybegin(STARTK);
}

<STARTK> "{" {
    yybegin(ELEMK);
}

<ELEMK> {Name} {
    // DONE: process state
    State state = new State();
    state.name = yytext();
    sol.stateList.add(state);
	yybegin(STOPK);
}

<STOPK> {
    "}" {
        yybegin(SEPKS);
    }
    ","	{
        yybegin(ELEMK);
    }
}

<SEPKS> "," {
    yybegin(STARTS);
}

<STARTS> "{" {
    // DONE: Done K, starting Sigma
    yybegin(INITS);
}

<INITS> "}" {
    yybegin(SEPSD);
}

<ELEMS, INITS> {Symbol}	{
    // DONE: Process symbol
	sol.alphabet.add(yycharat(0));
    yybegin(STOPS);
}

<STOPS> {
    ","	{
        yybegin(ELEMS);
    }
    "}" {
        yybegin(SEPSD);
    }
}

<SEPSD> "," {
    // DONE: Done Sigma, starting delta
    yybegin(STARTD);
}

<STARTD> "(" {
    yybegin(INITD);
}

<INITD> ")" {
    yybegin(SEPDS);
}

<ELEMD,INITD> "(" {
    yybegin(SRCT);
}

<SRCT> {Name} {
    // DONE: Process source
    startEdge.name = yytext();
    yybegin(SEPSST);
}


<SEPSST> "," {
    yybegin(SYMT);
}

<SYMT> {Symbol} {
    // DONE: process symbol
    edge = yycharat(0);
    yybegin(SEPSDT);
}

<SEPSDT> "," {
    yybegin(DESTT);
}

<DESTT> {Name} {
    // DONE: Process destination
    sol.adjMap.put(new Pair<State, Character>(new State(startEdge), edge), new State(yytext()));
    yybegin(ENDT);
}

<ENDT> ")" {
    yybegin(STOPD);
}

<STOPD> {
    "," {
        yybegin(ELEMD);
    }
    ")" {
        yybegin(SEPDS);
    }
}

<SEPDS> "," {
    yybegin(SS);
}

<SS> {Name} {
    //DONE: Process start state
    sol.start.name = yytext();
    yybegin(SEPSF);
}

<SEPSF> "," {
    yybegin(STARTF);
}

<STARTF> "{" {
    yybegin(INITF);
}

<INITF> "}" {
    yybegin(ENDDFA);
}

<INITF,ELEMF> {Name} {
    //DONE: Process final state
    sol.end.add(new State(yytext()));
    yybegin(STOPF);
}

<STOPF> {
    "," {
        yybegin(ELEMF);
    }
    "}" {
        yybegin(ENDDFA);
    }
}
<ENDDFA> ")" {
    return 0;
}

. {
    System.err.println("Syntax error");
    System.exit(0);
}
