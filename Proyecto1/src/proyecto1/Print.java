/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import proyecto1.Instruccion;
import proyecto1.Errores;
import  proyecto1.Simbolo;
import proyecto1.tipoDato;
import proyecto1.Arbol;
import proyecto1.Tipo;
import proyecto1.tablaSimbolos;

/**
 *
 * @author CLARO
 */
public class Print extends Instruccion {

    private Instruccion expresion;

    public Print(Instruccion expresion, int linea, int col) {
        super(new Tipo(tipoDato.VOID), linea, col);
        this.expresion = expresion;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        var valor = this.expresion.interpretar(arbol, tabla);
        if (valor instanceof Errores) {
            return valor;
        }
        arbol.Print(valor.toString());
        return null;
    }

}