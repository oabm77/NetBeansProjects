package vista;

import controlador.PacienteControl;

/**
 *
 * @author Omar Augusto Bautista Mora
 */
public class RegPacienteInternalFrame extends javax.swing.JInternalFrame {
    // Declaración del objeto que controla el formulario
    private controlador.PacienteControl pacienteControlador;

    /**
     * Creates new form RegPacienteInternalFrame
     */
    public RegPacienteInternalFrame() {
        initComponents();
        // Instanciación del objeto que controla el formulario y gestiona sus eventos
        pacienteControlador = new controlador.PacienteControl(this);
        // Indica que el objeto pacienteControlador es el encargado de gestionar
        // los eventos que se generen en los botones Registrar y Nuevo
        RegistrarBtn.addActionListener(pacienteControlador);
        NuevoBtn.addActionListener(pacienteControlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IdentificacionTxt = new javax.swing.JTextField();
        NombresTxt = new javax.swing.JTextField();
        AppellidosTxt = new javax.swing.JTextField();
        MasculinoOpt = new javax.swing.JRadioButton();
        FemeninoOpt = new javax.swing.JRadioButton();
        RegistrarBtn = new javax.swing.JButton();
        NuevoBtn = new javax.swing.JButton();
        FechaNacimientoDtc = new com.toedter.calendar.JDateChooser();

        setTitle("Registro de Pacientes");

        jLabel1.setText("Identificación:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Fecha de Nacimiento:");

        jLabel5.setText("Sexo:");

        IdentificacionTxt.setName("IdentificacionTxt"); // NOI18N

        NombresTxt.setName("NombresTxt"); // NOI18N

        AppellidosTxt.setName("ApellidosTxt"); // NOI18N
        AppellidosTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppellidosTxtActionPerformed(evt);
            }
        });

        buttonGroup1.add(MasculinoOpt);
        MasculinoOpt.setText("M");

        buttonGroup1.add(FemeninoOpt);
        FemeninoOpt.setText("F");

        RegistrarBtn.setText("Registrar");
        RegistrarBtn.setName("RegistrarBtn"); // NOI18N
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });

        NuevoBtn.setText("Nuevo");
        NuevoBtn.setName("NuevoBtn"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdentificacionTxt)
                            .addComponent(NombresTxt)
                            .addComponent(AppellidosTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MasculinoOpt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FemeninoOpt)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(FechaNacimientoDtc, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RegistrarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NuevoBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AppellidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(FechaNacimientoDtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MasculinoOpt)
                    .addComponent(FemeninoOpt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarBtn)
                    .addComponent(NuevoBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppellidosTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppellidosTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppellidosTxtActionPerformed

    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField AppellidosTxt;
    public com.toedter.calendar.JDateChooser FechaNacimientoDtc;
    public javax.swing.JRadioButton FemeninoOpt;
    public javax.swing.JTextField IdentificacionTxt;
    public javax.swing.JRadioButton MasculinoOpt;
    public javax.swing.JTextField NombresTxt;
    public javax.swing.JButton NuevoBtn;
    public javax.swing.JButton RegistrarBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
