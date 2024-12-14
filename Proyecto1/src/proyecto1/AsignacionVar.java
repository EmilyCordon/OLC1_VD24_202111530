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


/**
 *
 * @author CLARO
 */
public class AsignacionVar extends Instruccion{
    
    private String id;
    private Instruccion exp;

    public AsignacionVar(String id, Instruccion exp, int linea, int col) {
        super(new Tipo(tipoDato.VOID), linea, col);
        this.id = id;
        this.exp = exp;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        var variable = tabla.getVariable(id);
        if (variable == null) {
            return new Errores("SEMANTICO", "Variable no existente",
                    this.linea, this.col);
        }
        
        var newValor = this.exp.interpretar(arbol, tabla);
        if (newValor instanceof Errores) {
            return newValor;
        }

        // tipos -> 
        if (variable.getTipo().getTipo() != this.exp.tipo.getTipo()) {
            return new Errores("SEMANTICO", "Tipos no compartibles",
                    this.linea, this.col);
        }

        this.tipo.setTipo(variable.getTipo().getTipo());
        variable.setValor(newValor);
        return null;
    }
    
}
