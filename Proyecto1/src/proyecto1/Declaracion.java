/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import proyecto1.Instruccion;
import proyecto1.Errores;
import proyecto1.Arbol;
import proyecto1.Simbolo;
import proyecto1.Tipo;
import proyecto1.tablaSimbolos;

/**
 *
 * @author CLARO
 */
public class Declaracion extends Instruccion {
     private String identificador;
    private Instruccion valor;

    public Declaracion(String identificador, Instruccion valor, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.identificador = identificador;
        this.valor = valor;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        var valorInterpretado = this.valor.interpretar(arbol, tabla);
        if (valorInterpretado instanceof Errores) {
            return valorInterpretado;
        }

        if (this.valor.tipo.getTipo() != this.tipo.getTipo()) {
            return new Errores("SEMANTICO", "Tipos erroneos", this.linea, this.col);
        }
        
        if(tabla.setVariable(new Simbolo(this.tipo, this.identificador, valorInterpretado))){
            return null;
        }
        return new Errores("SEMANTICO", "La variable "+ this.identificador+ " ya existe", this.linea, this.col);

    }
}
