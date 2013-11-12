grammar greetings;

@members {
	GreetingsLoader helper;
	public void reportError(RecognitionException e) {
		helper.reportError(e);
	}
}

script		: greeting* EOF;
greeting	: 'hello' Name;
 
Name		: ('a'..'z' | 'A'..'Z')+;

WS			: (' '|'\t'|'\r'|'\n')+ {skip();};
COMMENT		: '#'(~'\n')* {skip();};

ILLEGAL		: .;
