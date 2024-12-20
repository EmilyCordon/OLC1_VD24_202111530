/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import proyecto1.Arbol;
import proyecto1.Tipo;
import proyecto1.tablaSimbolos;

/**
 *
 * @author CLARO
 */
public abstract class Instruccion {
    
   public Tipo tipo;
    public int linea;
    public int col;

    public Instruccion(Tipo tipo, int linea, int col) {
        this.tipo = tipo;
        this.linea = linea;
        this.col = col;
    }
    
    public abstract Object interpretar(Arbol arbol, tablaSimbolos tabla); 
    
}
