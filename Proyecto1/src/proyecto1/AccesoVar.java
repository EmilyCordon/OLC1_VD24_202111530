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
public class AccesoVar extends Instruccion{
    
    private String id;

    public AccesoVar(String id, int linea, int col) {
        super(new Tipo(tipoDato.VOID), linea, col);
        this.id = id;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        var valor = tabla.getVariable(id);
        if (valor == null) {
            return new Errores("SEMANTICO", "Variable no existente",
                    this.linea, this.col);
        }
        
        this.tipo.setTipo(valor.getTipo().getTipo());
        return valor.getValor();
    }
}
