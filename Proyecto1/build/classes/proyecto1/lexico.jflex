package proyecto1;
import java_cup.runtime.Symbol;
import proyecto1.sym;
import proyecto1.Errores;
import java.util.LinkedList;


%%

%{
    public LinkedList<Errores> erroresLexicos = new LinkedList<>();
%}

%init{
yyline = 1;
yycolumn = 1;
erroresLexicos = new LinkedList<>();
%init}



%cup
%class scanner 
%public 
%line 
%char 
%column 
%full 
%debug 
%ignorecase 


// simbolos del sistema
PAR1 = "("
PAR2 = ")"
FINCADENA = ";"
MAS = "+"
MENOS = "-"
IGUAL = "="
EQUALS = "=="
BLANCOS = [\ \r\t\f\n]+
ENTERO = [0-9]+
DECIMAL = [0-9]+"."[0-9]+
BOOLEANO = "true"|"false"
ID = [a-zA-Z][a-zA-Z0-9_]*
CADENA = [\"][^\"]*[\"]

//Comentarios
COMENTARIO = "//".*
COMENTARIO_BLOQUE = "/*" ([^*] | [*][^/])* "*/"

//palabras reservadas
IMPRIMIR = "imprimir"
INT = "int"
DOUBLE = "double"
BOOL = "bool"
CHAR = "char"
STRING = "string"

%%
<YYINITIAL> {IMPRIMIR} {return new Symbol(sym.IMPRIMIR, yyline, yycolumn, yytext());}
<YYINITIAL> {INT} {return new Symbol(sym.INT, yyline, yycolumn, yytext());}
<YYINITIAL> {DOUBLE} {return new Symbol(sym.DOUBLE, yyline, yycolumn, yytext());}
<YYINITIAL> {STRING} {return new Symbol(sym.STRING, yyline, yycolumn, yytext());}
<YYINITIAL> {BOOL} {return new Symbol(sym.BOOL, yyline, yycolumn, yytext());}
<YYINITIAL> {CHAR} {return new Symbol(sym.CHAR, yyline, yycolumn, yytext());}
<YYINITIAL> {BOOLEANO} {return new Symbol(sym.BOOLEANO, yyline, yycolumn, yytext());}
<YYINITIAL> {DECIMAL} {return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());}
<YYINITIAL> {ENTERO} {return new Symbol(sym.ENTERO, yyline, yycolumn, yytext());}
<YYINITIAL> {CADENA} {
    String cadena = yytext(); 
    cadena = cadena.substring(1, cadena.length() - 1);
    return new Symbol(sym.CADENA, yyline, yycolumn, cadena);
}
<YYINITIAL> {COMENTARIO} { /* Ignorar comentarios */ }
<YYINITIAL> {COMENTARIO_BLOQUE} { /* Ignorar comentarios de bloque */ }
<YYINITIAL> {ID} {return new Symbol(sym.ID, yyline, yycolumn, yytext());}
<YYINITIAL> {FINCADENA} {return new Symbol(sym.FINCADENA, yyline, yycolumn, yytext());}
<YYINITIAL> {PAR1} {return new Symbol(sym.PAR1, yyline, yycolumn, yytext());}
<YYINITIAL> {PAR2} {return new Symbol(sym.PAR2, yyline, yycolumn, yytext());}
<YYINITIAL> {BLANCOS} {}
<YYINITIAL> {MAS} {return new Symbol(sym.MAS, yyline, yycolumn, yytext());}
<YYINITIAL> {MENOS} {return new Symbol(sym.MENOS, yyline, yycolumn, yytext());}
<YYINITIAL> {EQUALS} {return new Symbol(sym.EQUALS, yyline, yycolumn, yytext());}
<YYINITIAL> {IGUAL} {return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());}

// Manejo de errores léxicos
<YYINITIAL> . {
    String error = "Caracter no reconocido: " + yytext();
    erroresLexicos.add(new Errores("LEXICO", error, yyline, yycolumn));
}
