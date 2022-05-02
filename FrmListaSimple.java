package capaInterfaz;
import capaEstructuras.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sigrid
 */
public class FrmListaSimple extends javax.swing.JFrame {

    private ListaSimple lista = new ListaSimple();
    public FrmListaSimple() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtDato = new javax.swing.JTextField();
        jTxtPosicion = new javax.swing.JTextField();
        jTxtValorEliminar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtResult = new javax.swing.JTextArea();
        jBtnInsertarInicio = new javax.swing.JButton();
        jBtnInsertarFinal = new javax.swing.JButton();
        jBtnInsertarMedio = new javax.swing.JButton();
        jBtneliminarInicio = new javax.swing.JButton();
        jBtnEliminarFinal = new javax.swing.JButton();
        jBtnEliminarValor = new javax.swing.JButton();
        jBtnLongitudLista = new javax.swing.JButton();
        jBtnOrdenarLista = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Dato");

        jLabel2.setText("Posicion donde insertar");

        jLabel3.setText("Valor a elimiar");

        jLabel4.setText("Lista");

        jTxtDato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtDatoFocusGained(evt);
            }
        });

        jTxtPosicion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtPosicionFocusGained(evt);
            }
        });

        jTxtValorEliminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtValorEliminarFocusGained(evt);
            }
        });

        jTxtResult.setColumns(20);
        jTxtResult.setRows(5);
        jScrollPane1.setViewportView(jTxtResult);

        jBtnInsertarInicio.setText("Insertar al Inicio");
        jBtnInsertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertarInicioActionPerformed(evt);
            }
        });

        jBtnInsertarFinal.setText("Insertar al Final");
        jBtnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertarFinalActionPerformed(evt);
            }
        });

        jBtnInsertarMedio.setText("Insertar en el Medio");
        jBtnInsertarMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertarMedioActionPerformed(evt);
            }
        });

        jBtneliminarInicio.setText("Eliminar al Inicio");
        jBtneliminarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtneliminarInicioActionPerformed(evt);
            }
        });

        jBtnEliminarFinal.setText("Eliminar al Final");
        jBtnEliminarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarFinalActionPerformed(evt);
            }
        });

        jBtnEliminarValor.setText("Eliminar Valor");
        jBtnEliminarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarValorActionPerformed(evt);
            }
        });

        jBtnLongitudLista.setText("Longitud Lista");
        jBtnLongitudLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLongitudListaActionPerformed(evt);
            }
        });

        jBtnOrdenarLista.setText("Ordenar Lista");
        jBtnOrdenarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOrdenarListaActionPerformed(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtValorEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jTxtPosicion)
                                    .addComponent(jTxtDato)))
                            .addComponent(jLabel4))
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnInsertarFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnInsertarMedio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jBtneliminarInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnEliminarValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnEliminarFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnLongitudLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnOrdenarLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnInsertarInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnInsertarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtValorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBtnInsertarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnInsertarMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtneliminarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEliminarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBtnEliminarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLongitudLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnOrdenarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnInsertarMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarMedioActionPerformed
        int posicion, dato;
        try{
            dato= Integer.parseInt(this.jTxtDato.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Debe digitar el valor a inserta");
            this.jTxtValorEliminar.requestFocus();
            return;
        }
        try{
            posicion = Integer.parseInt(this.jTxtPosicion.getText());
        }catch(Exception e1){
            JOptionPane.showMessageDialog(null,"debe digitar la posicion donde insertara el dato");
            this.jTxtPosicion.requestFocus();
            return;
        }
        
        lista.insertarMedio(dato, posicion);
        this.jTxtResult.setText(lista.toString());
        this.jTxtPosicion.setText("");
        this.jTxtDato.requestFocus();               
    }//GEN-LAST:event_jBtnInsertarMedioActionPerformed

    private void jBtnEliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarFinalActionPerformed
        Integer dato = (Integer)lista.eliminarFinal();
        JOptionPane.showMessageDialog(this,"El valor eliminado es: "+(dato != null?dato:"La lista esta vacia"));
        this.jTxtResult.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtnEliminarFinalActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarInicioActionPerformed
        int dato = Integer.parseInt(this.jTxtDato.getText());
        lista.inseratrInicio(dato);
        this.jTxtResult.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtnInsertarInicioActionPerformed

    private void jBtnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarFinalActionPerformed
        int dato = Integer.parseInt(this.jTxtDato.getText());
        lista.insertarFinal(dato);
        this.jTxtResult.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtnInsertarFinalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lista = new ListaSimple();
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jBtneliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtneliminarInicioActionPerformed
        Integer dato = (Integer)lista.eliminarInicio();
        JOptionPane.showMessageDialog(this,"El valor eliminado es: "+(dato != null?dato:"La lista esta vacia"));
        this.jTxtResult.setText(lista.toString());
        this.jTxtDato.requestFocus();
    }//GEN-LAST:event_jBtneliminarInicioActionPerformed

    private void jBtnEliminarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarValorActionPerformed
        int valor;
        
        try{
            valor = Integer.parseInt(this.jTxtValorEliminar.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Debe digitar el valor a eliminar");
            this.jTxtValorEliminar.requestFocus();
            return;           
        }
        this.jTxtResult.setText(lista.toString());
        this.jTxtValorEliminar.setText("");
        this.jTxtValorEliminar.requestFocus();
    }//GEN-LAST:event_jBtnEliminarValorActionPerformed

    private void jBtnLongitudListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLongitudListaActionPerformed
        JOptionPane.showMessageDialog(null, "Longitud de la lista: "+lista.longitudLista());
    }//GEN-LAST:event_jBtnLongitudListaActionPerformed

    private void jBtnOrdenarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOrdenarListaActionPerformed
        this.jTxtResult.setText(lista.toString());
    }//GEN-LAST:event_jBtnOrdenarListaActionPerformed

    private void jTxtDatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDatoFocusGained
        this.jTxtDato.selectAll();
    }//GEN-LAST:event_jTxtDatoFocusGained

    private void jTxtPosicionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtPosicionFocusGained
       this.jTxtPosicion.selectAll();
    }//GEN-LAST:event_jTxtPosicionFocusGained

    private void jTxtValorEliminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtValorEliminarFocusGained
        this.jTxtValorEliminar.selectAll();
    }//GEN-LAST:event_jTxtValorEliminarFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminarFinal;
    private javax.swing.JButton jBtnEliminarValor;
    private javax.swing.JButton jBtnInsertarFinal;
    private javax.swing.JButton jBtnInsertarInicio;
    private javax.swing.JButton jBtnInsertarMedio;
    private javax.swing.JButton jBtnLongitudLista;
    private javax.swing.JButton jBtnOrdenarLista;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtneliminarInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtDato;
    private javax.swing.JTextField jTxtPosicion;
    private javax.swing.JTextArea jTxtResult;
    private javax.swing.JTextField jTxtValorEliminar;
    // End of variables declaration//GEN-END:variables
}
