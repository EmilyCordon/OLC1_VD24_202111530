/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import proyecto1.Instruccion;
import proyecto1.Errores;
import proyecto1.Arbol;
import proyecto1.Tipo;
import proyecto1.tablaSimbolos;
import proyecto1.tipoDato;
import static proyecto1.tipoDato.DECIMAL;
import static proyecto1.tipoDato.ENTERO;
/**
 *
 * @author CLARO
 */

public class NegacionUnaria extends Instruccion {

    private Instruccion expresion;

    public NegacionUnaria(Instruccion Expresion, int linea, int col) {
        super(new Tipo(tipoDato.VOID), linea, col);
        this.expresion = Expresion;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        var resultado = this.expresion.interpretar(arbol, tabla);
        if (resultado instanceof Errores) {
            return resultado;
        }

        switch (this.expresion.tipo.getTipo()) {
            case ENTERO -> {
                this.tipo.setTipo(ENTERO);
                return -(int) resultado;
            }
            case DECIMAL -> {
                this.tipo.setTipo(DECIMAL);
                return -(double) resultado;
            }
            default -> {
                return new Errores("SEMANTICO", "NEGACION UNVARIA INVALDIA", this.linea, this.col);
            }

        }
    }

}
