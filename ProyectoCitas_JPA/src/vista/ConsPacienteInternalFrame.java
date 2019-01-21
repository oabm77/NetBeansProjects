package vista;

// Importación de la clase DefaultTableModel que se emplea para establecer
// la configuración del objeto JTable
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar Augusto Bautista Mora
 */
public class ConsPacienteInternalFrame extends javax.swing.JInternalFrame {
    
    // Declaración del objeto que controla el formulario Consulta de Pacientes
    private controlador.GestorPacienteControl gestorPacientesControl;
    // Declaración del objeto que configura y gestiona la información del JTable
    private DefaultTableModel tabla;

    /**
     * Creates new form ConsPacienteInternalFrame
     */
    public ConsPacienteInternalFrame() {
        initComponents();
        // Instanciación del objeto que controla el formulario y gestiona sus eventos
        gestorPacientesControl = new controlador.GestorPacienteControl(this);
        // Creación del arreglo que contiene los títulos del JTable donde se presentan
        // los resultados de las consultas
        String titulosTabla[] = {"Identificación", "Nombres", "Apellidos", "Fecha Nac", "Sexo"};
        // Instanciación del TableModel con los títulos requeridos
        tabla = new DefaultTableModel(null, titulosTabla);
        // Asignación del TableModel al JTable
        ResultadosTbl.setModel(tabla);
        // Indica que el objeto gestorpacienteControl es el encargado de gestionar
        // los eventos que se generen en el botón Aceptar del formulario Consulta
        // de Pacientes
        AceptarBtn.addActionListener(gestorPacientesControl);
    }
    
    /**
     * Método que retorna el objeto TableModel asociado al JTable para ser
     * manipulado desde la clase controladora
     * 
     * @return objeto DefaultTableModel
     */
    public DefaultTableModel getTableModel() {
        return tabla;
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
        IdentificacionOpt = new javax.swing.JRadioButton();
        NombresOpt = new javax.swing.JRadioButton();
        ApellidosOpt = new javax.swing.JRadioButton();
        SexoOpt = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        ValorTxt = new javax.swing.JTextField();
        AceptarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultadosTbl = new javax.swing.JTable();

        setTitle("Consulta De Pacientes");

        buttonGroup1.add(IdentificacionOpt);
        IdentificacionOpt.setText("Identificación");
        IdentificacionOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificacionOptActionPerformed(evt);
            }
        });

        buttonGroup1.add(NombresOpt);
        NombresOpt.setText("Nombres");

        buttonGroup1.add(ApellidosOpt);
        ApellidosOpt.setText("Apellidos");

        buttonGroup1.add(SexoOpt);
        SexoOpt.setText("Sexo");

        jLabel1.setText("Valor a buscar");

        ValorTxt.setName("ValorTxt"); // NOI18N

        AceptarBtn.setText("Aceptar");
        AceptarBtn.setName("AceptarBtn"); // NOI18N

        jScrollPane1.setName("ResultadosTbl"); // NOI18N

        ResultadosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ResultadosTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValorTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AceptarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IdentificacionOpt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombresOpt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ApellidosOpt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SexoOpt))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentificacionOpt)
                    .addComponent(NombresOpt)
                    .addComponent(ApellidosOpt)
                    .addComponent(SexoOpt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ValorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AceptarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdentificacionOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificacionOptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificacionOptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AceptarBtn;
    public javax.swing.JRadioButton ApellidosOpt;
    public javax.swing.JRadioButton IdentificacionOpt;
    public javax.swing.JRadioButton NombresOpt;
    public javax.swing.JTable ResultadosTbl;
    public javax.swing.JRadioButton SexoOpt;
    public javax.swing.JTextField ValorTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
