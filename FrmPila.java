package capaInterfaz;
import capaEstructuras.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sigrid
 */
public class FrmPila extends javax.swing.JFrame {
    private Pila pila;
    public FrmPila() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtDatoIngresar = new javax.swing.JTextField();
        jTxtDatoExtraido = new javax.swing.JTextField();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxAResult = new javax.swing.JTextArea();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Dato Ingresar");

        jLabel2.setText("Dato Extraido");

        jTxtDatoIngresar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtDatoIngresarFocusGained(evt);
            }
        });
        jTxtDatoIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDatoIngresarActionPerformed(evt);
            }
        });

        jBtnAgregar.setText("Agregar(push)");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar(pop)");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Pila");

        jTxAResult.setColumns(20);
        jTxAResult.setRows(5);
        jScrollPane1.setViewportView(jTxAResult);

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
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtDatoIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jTxtDatoExtraido))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnAgregar)
                            .addComponent(jBtnEliminar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtDatoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnAgregar)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtDatoExtraido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEliminar))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        int dato = Integer.parseInt(this.jTxtDatoIngresar.getText());
        pila.push(dato);
        this.jTxAResult.setText(pila.toString());
        this.jTxtDatoExtraido.setText("");
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        Integer dato = (Integer) pila.pop();
        if(dato==null){
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
            this.jTxtDatoIngresar.setText("");
            this.jTxtDatoExtraido.setText("");
        }else{
            this.jTxtDatoExtraido.setText(Integer.toString(dato));
        }
        this.jTxAResult.setText(pila.toString());
        this.jTxtDatoIngresar.requestFocus();
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.pila = new Pila();
        this.jTxtDatoIngresar.requestFocus();;
    }//GEN-LAST:event_formWindowOpened

    private void jTxtDatoIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDatoIngresarActionPerformed
        this.jBtnAgregar.doClick();
        this.jTxtDatoIngresar.requestFocus();
        this.jTxtDatoIngresar.selectAll();
    }//GEN-LAST:event_jTxtDatoIngresarActionPerformed

    private void jTxtDatoIngresarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtDatoIngresarFocusGained
        this.jTxtDatoIngresar.selectAll();
    }//GEN-LAST:event_jTxtDatoIngresarFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxAResult;
    private javax.swing.JTextField jTxtDatoExtraido;
    private javax.swing.JTextField jTxtDatoIngresar;
    // End of variables declaration//GEN-END:variables
}
