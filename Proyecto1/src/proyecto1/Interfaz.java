/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.StringReader;
import java.util.LinkedList;

//clases importadas

import proyecto1.Instruccion;
import proyecto1.parser;
import proyecto1.scanner;
import proyecto1.Errores;
import proyecto1.Arbol;
import proyecto1.Arbol;
import proyecto1.tablaSimbolos;
import proyecto1.tablaSimbolos;

/**
 *
 * @author CLARO
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSalida = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaEntrada = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevoArchivo = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardarComo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ejSintactico = new javax.swing.JMenuItem();
        ejLexico = new javax.swing.JMenuItem();
        ejecutar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        tokens = new javax.swing.JMenuItem();
        errores = new javax.swing.JMenuItem();
        ast = new javax.swing.JMenuItem();
        tablaSimbolos = new javax.swing.JMenuItem();

        jMenu12.setText("jMenu12");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaSalida.setColumns(20);
        jTextAreaSalida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSalida);

        jTextAreaEntrada.setColumns(20);
        jTextAreaEntrada.setRows(5);
        jScrollPane2.setViewportView(jTextAreaEntrada);

        jLabel1.setText("Entrada:");

        jLabel2.setText("Consola:");

        jMenu1.setText("Archivo");

        nuevoArchivo.setText("Nuevo Archivo");
        nuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(nuevoArchivo);

        abrir.setText("Abrir Archivo");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        jMenu1.add(abrir);

        guardarComo.setText("Guardar Como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(guardarComo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ejecutar");

        ejSintactico.setText("Ejecutar Sintactico");
        ejSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejSintacticoActionPerformed(evt);
            }
        });
        jMenu2.add(ejSintactico);

        ejLexico.setText("Ejecutar Lexico");
        jMenu2.add(ejLexico);

        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });
        jMenu2.add(ejecutar);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Reportes");

        tokens.setText("Reporte de Tokens");
        jMenu6.add(tokens);

        errores.setText("Reporte de Errores");
        errores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erroresActionPerformed(evt);
            }
        });
        jMenu6.add(errores);

        ast.setText("Generar AST");
        ast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astActionPerformed(evt);
            }
        });
        jMenu6.add(ast);

        tablaSimbolos.setText("Reporte de Tabla de Simbolos");
        jMenu6.add(tablaSimbolos);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        
         JFileChooser fileChooser = new JFileChooser();
    
    fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
        @Override
        public boolean accept(File f) {
            return f.isDirectory() || f.getName().toLowerCase().endsWith(".cs");
        }

        @Override
        public String getDescription() {
            return "Archivos CS (*.cs)";
        }
    });

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
            StringBuilder fileContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }

            jTextAreaEntrada.setText(fileContent.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
        archivoActual = selectedFile;
    }
        
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
        
    JFileChooser fileChooser = new JFileChooser();
    
    fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
        @Override
        public boolean accept(File f) {
            return f.isDirectory() || f.getName().toLowerCase().endsWith(".cs");
        }

        @Override
        public String getDescription() {
            return "Archivos CS (*.cs)";
        }
    });

    int result = fileChooser.showSaveDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        if (!selectedFile.getName().toLowerCase().endsWith(".cs")) {
            selectedFile = new File(selectedFile.getAbsolutePath() + ".cs");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
            
            writer.write(jTextAreaEntrada.getText());
            writer.flush();
            JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente.", "Guardar", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        archivoActual = selectedFile;
    }
    
    }//GEN-LAST:event_guardarComoActionPerformed

    private void ejSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejSintacticoActionPerformed
      
        /*
        System.out.println("\\");
        String texto = jTextArea1.getText();
        try {
            scanner s = new scanner(new BufferedReader(new StringReader(texto)));
            parser p = new parser(s);
            var resultado = p.parse();

            var ast = new Arbol((LinkedList<Instruccion>) resultado.value);
            var tabla = new tablaSimbolos();

            for (var a : ast.getInstrucciones()) {
                var res = a.interpretar(ast, tabla);
                if (res instanceof Errores) {
                    System.out.println(res.toString());
                }
                
            }
            
            jTextArea2.setText(ast.getConsola());

        } catch (Exception e) {
            System.out.println(e);
        }
        */
        
    }//GEN-LAST:event_ejSintacticoActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        
        System.out.println("\\");
        String texto = jTextAreaEntrada.getText();
        try {
            scanner s = new scanner(new BufferedReader(new StringReader(texto)));
            parser p = new parser(s);
            var resultado = p.parse();

            var ast = new Arbol((LinkedList<Instruccion>) resultado.value);
            var tabla = new tablaSimbolos();

            for (var a : ast.getInstrucciones()) {
                var res = a.interpretar(ast, tabla);
                if (res instanceof Errores) {
                    System.out.println(res.toString());
                }
            }
            
            jTextAreaSalida.setText(ast.getConsola());

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_ejecutarActionPerformed

    private void erroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erroresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_erroresActionPerformed

    private void astActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_astActionPerformed

    private void nuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoArchivoActionPerformed
       
        
       
    }//GEN-LAST:event_nuevoArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    private File archivoActual = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenuItem ast;
    private javax.swing.JMenuItem ejLexico;
    private javax.swing.JMenuItem ejSintactico;
    private javax.swing.JMenuItem ejecutar;
    private javax.swing.JMenuItem errores;
    private javax.swing.JMenuItem guardarComo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaEntrada;
    private javax.swing.JTextArea jTextAreaSalida;
    private javax.swing.JMenuItem nuevoArchivo;
    private javax.swing.JMenuItem tablaSimbolos;
    private javax.swing.JMenuItem tokens;
    // End of variables declaration//GEN-END:variables
}
