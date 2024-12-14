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

public class Resta extends Instruccion{
    private Instruccion opIzq;
    private Instruccion opDer;

    public Resta(Instruccion opIzq, Instruccion opDer, int linea, int col) {
        super(new Tipo(tipoDato.VOID), linea, col);
        this.opIzq = opIzq;
        this.opDer = opDer;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
var valorIzq = this.opIzq.interpretar(arbol, tabla);
        if (valorIzq instanceof Errores) {
            return valorIzq;
        }

        var valorDer = this.opDer.interpretar(arbol, tabla);
        if (valorDer instanceof Errores) {
            return valorDer;
        }

        var tipoIzq = opIzq.tipo.getTipo();
        var tipoDer = opDer.tipo.getTipo();

        switch (tipoIzq) {
            case ENTERO -> {
                switch (tipoDer) {
                    case ENTERO -> {
                        this.tipo.setTipo(tipoDato.ENTERO);
                        return (int) valorIzq - (int) valorDer;
                    }
                    case DECIMAL -> {
                        this.tipo.setTipo(tipoDato.DECIMAL);
                        return (int) valorIzq - (double) valorDer;
                    }
                    default -> {
                        return new Errores("SEMANTICO", "SUMA ENTRE TIPOS INVALIDA",
                                this.linea, this.col);
                    }
                }
            }

            case DECIMAL -> {
                switch (tipoDer) {
                    case ENTERO -> {
                        this.tipo.setTipo(tipoDato.ENTERO);
                        return (double) valorIzq - (int) valorDer;
                    }
                    case DECIMAL -> {
                        this.tipo.setTipo(tipoDato.DECIMAL);
                        return (double) valorIzq - (double) valorDer;
                    }
                    default -> {
                        return new Errores("SEMANTICO", "SUMA ENTRE TIPOS INVALIDA",
                                this.linea, this.col);
                    }
                }
            }

            default -> {
                return new Errores("SEMANTICO", "SUMA ENTRE TIPOS INVALIDA",
                        this.linea, this.col);
            }
        }    }
    
    
    
    
}
