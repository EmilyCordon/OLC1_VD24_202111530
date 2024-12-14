/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author CLARO
 */
import proyecto1.Instruccion;
import proyecto1.Arbol;
import proyecto1.Tipo;
import proyecto1.tablaSimbolos;

/**
 *
 * @author CLARO
 */

public class Nativo extends Instruccion {

    public Object valor;

    public Nativo(Object valor, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.valor = valor;
    }
    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        return this.valor;
        
    }

}
