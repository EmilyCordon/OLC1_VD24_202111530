/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author CLARO
 */
public class Errores {
    private String tipo;
    private String desc;
    private int linea;
    private int columna;

    public Errores(String tipo, String desc, int linea, int columna) {
        this.tipo = tipo;
        this.desc = desc;
        this.linea = linea;
        this.columna = columna;
    }
}
