/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import proyecto1.Instruccion;
import proyecto1.Errores;
import java.util.LinkedList;

/**
 *
 * @author CLARO
 */
public class Arbol {
    private LinkedList<Instruccion> instrucciones;
    private String consola;
    private LinkedList<Errores> errores;
    //tabla simbolos

    public Arbol(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
        consola = "";
        this.errores = new LinkedList<>();
    }

    public LinkedList<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public String getConsola() {
        return consola;
    }
    

    
    public void setInstrucciones(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }
    

    public void Print(String valor) {
        this.consola += valor + "\n";
    }
}
