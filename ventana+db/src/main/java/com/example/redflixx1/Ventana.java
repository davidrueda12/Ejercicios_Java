/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.redflixx1;

import com.example.redflixx1.Repositorios.PeliculasRepositorio;
import com.example.redflixx1.modelos.Peliculas;
import java.util.Optional;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Usuario
 */
public class Ventana extends javax.swing.JFrame {
   
    PeliculasRepositorio peliculasRepositorio;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        
        Redflixx1Application.iniciarSpring();
        peliculasRepositorio = SpringContext.getBean(PeliculasRepositorio.class);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        campoResumen = new javax.swing.JTextField();
        campoResultado = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        campoId = new javax.swing.JFormattedTextField();
        campoAnio = new javax.swing.JFormattedTextField();
        campoDirector = new javax.swing.JFormattedTextField();
        Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PELICULAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Titulo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Resumen");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("A??o");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Director");

        campoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoResultadoActionPerformed(evt);
            }
        });

        botonAgregar.setText("CREAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonActualizar.setText("ACTUALIZAR");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        Limpiar.setText("LIMPIAR CAMPOS");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(campoResumen)
                            .addComponent(campoAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(campoDirector)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Limpiar)
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(botonAgregar)
                        .addGap(35, 35, 35)
                        .addComponent(botonBuscar)
                        .addGap(29, 29, 29)
                        .addComponent(botonActualizar)
                        .addGap(27, 27, 27)
                        .addComponent(botonEliminar)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Limpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(campoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonBuscar)
                    .addComponent(botonActualizar)
                    .addComponent(botonEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        String idTexto = campoId.getText();
        Integer id; 
        if (idTexto.isEmpty()){
        id=0;
        }else{
            id=Integer.parseInt(idTexto);
        }
        String titulo = campoTitulo.getText();
        String resumen = campoResumen.getText();
        Long anio = Long.parseLong(campoAnio.getText());
        Integer director = Integer.parseInt(campoDirector.getText());
        Peliculas nuevo = new Peliculas();
        if (id.equals(0)){
        nuevo.setTitulo(titulo);
        nuevo.setResumen(resumen);
        nuevo.setAnio(anio);
        nuevo.setIddirectores(director);
        peliculasRepositorio.save(nuevo);
        campoResultado.setText("Se agrego correctamente la pelicula"); 
        }else{
        nuevo.setidpeliculas(id);
        nuevo.setTitulo(titulo);
        nuevo.setResumen(resumen);
        nuevo.setAnio(anio);
        nuevo.setIddirectores(director);
        peliculasRepositorio.save(nuevo);
        campoResultado.setText("Se agrego correctamente la pelicula");
        }
      
        
        campoId.setText("");
        campoTitulo.setText("");
        campoResumen.setText("");
        campoAnio.setText("");
        campoDirector.setText("");
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void campoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoResultadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campoResultadoActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        Integer id =Integer.parseInt(campoId.getText());
        Optional<Peliculas> resultado = peliculasRepositorio.findById(id);
        if(resultado.isPresent()){
            Peliculas encontrado = resultado.get();
            campoTitulo.setText(encontrado.getTitulo());
            campoResumen.setText(encontrado.getResumen());
            campoAnio.setText(String.valueOf(encontrado.getAnio()));
            campoDirector.setText(String.valueOf(encontrado.getIddirectores()));
            campoResultado.setText("");
        } else{
            campoResultado.setText("id no encontrado");
            
            campoTitulo.setText("");
            campoResumen.setText("");
            campoAnio.setText("");
            campoDirector.setText("");
            
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        Integer id =Integer.parseInt(campoId.getText());
        Optional<Peliculas> eliminar = peliculasRepositorio.findById(id);
        if(JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminarlo")==0){
            if(eliminar.isPresent()){
            Peliculas borrar = eliminar.get();
            peliculasRepositorio.delete(borrar);
            System.out.println("Se a eliminado la pelicula");
            campoResultado.setText("Se a eliminado la pelicula");
            
            campoId.setText("");
            campoTitulo.setText("");
            campoResumen.setText("");
            campoAnio.setText("");
            campoDirector.setText("");
            }else{
               campoResultado.setText("No se puede eliminar una pelicula que no existe");
               campoId.setText("");
               campoTitulo.setText("");
               campoResumen.setText("");
               campoAnio.setText("");
               campoDirector.setText("");
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
        Integer id =Integer.parseInt(campoId.getText());
        Optional<Peliculas> editar = peliculasRepositorio.findById(id);
            if(JOptionPane.showConfirmDialog(this, "Esta seguro que desea actualizar")==0){
            if(editar.isPresent()){
            Peliculas cambiar = editar.get();
            
            cambiar.setTitulo(campoTitulo.getText());
            cambiar.setResumen(campoResumen.getText());
            cambiar.setAnio(Long.parseLong(campoAnio.getText()));
            cambiar.setIddirectores(Integer.parseInt(campoDirector.getText()));
            peliculasRepositorio.save(cambiar);
            campoResultado.setText("Se actualizo correctamente la pelicula");
            
            campoId.setText("");
            campoTitulo.setText("");
            campoResumen.setText("");
            campoAnio.setText("");
            campoDirector.setText("");
            }else{
                campoResultado.setText("No se puede modificar una pelicula que no existe");
                campoId.setText("");
                campoTitulo.setText("");
                campoResumen.setText("");
                campoAnio.setText("");
                campoDirector.setText("");
            }
            
            }
            
        
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
            campoId.setText("");
            campoTitulo.setText("");
            campoResumen.setText("");
            campoAnio.setText("");
            campoDirector.setText("");
            campoResultado.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JFormattedTextField campoAnio;
    private javax.swing.JFormattedTextField campoDirector;
    private javax.swing.JFormattedTextField campoId;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JTextField campoResumen;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
