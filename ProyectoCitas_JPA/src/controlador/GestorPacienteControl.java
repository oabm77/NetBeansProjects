package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Omar Augusto Bautista Mora
 */
public class GestorPacienteControl implements ActionListener {
    // Declaración del objeto de tipo JpaController que permite realizar operaciones
    // contra la base de datos
    modelo.PacientesJpaController pacientesModelo;
    vista.ConsPacienteInternalFrame consultarPacienteVista;
    
    public GestorPacienteControl(vista.ConsPacienteInternalFrame consultarPacienteVista) {
        this.consultarPacienteVista = consultarPacienteVista;
        // Definición de la unidad de persistencia empleada
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
        // Creación del objeto de tipo JpaController que realizará operaciones contra
        // la base de datos
        pacientesModelo = new modelo.PacientesJpaController(emf);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String valor = consultarPacienteVista.ValorTxt.getText();
        int parametro = 0;
        consultarPacienteVista.getTableModel().setRowCount(0);
        consultarPacienteVista.getTableModel().fireTableDataChanged();
        if(consultarPacienteVista.IdentificacionOpt.isSelected())
            parametro = 1;
        if(consultarPacienteVista.NombresOpt.isSelected())
            parametro = 2;
        if(consultarPacienteVista.ApellidosOpt.isSelected())
            parametro = 3;
        if(consultarPacienteVista.SexoOpt.isSelected())
            parametro = 4;
        // Se obtienen todos los pacientes de la base de datos haciendo uso del método
        // findPacientesEntities() de la clase PacientesJpaController
        List<modelo.Pacientes> pacientes = pacientesModelo.findPacientesEntities();
        // Recorrido de cada paciente obtenido y si coincide con el criterio y valor de
        // búsqueda, se envía al método mostrarEnTabla para que sea presentado en
        // el JTable del formulario Consulta de Pacientes
        for(modelo.Pacientes p: pacientes) {
            switch (parametro) {
                case 1: if(p.getPacidentificacion().equals(valor))
                    mostrarEnTabla(p);
                break;
                case 2: if(p.getPacnombres().equals(valor))
                    mostrarEnTabla(p);
                break;
                case 3: if(p.getPacapellidos().equals(valor))
                    mostrarEnTabla(p);
                break;
                case 4: if(p.getPacsexo().toString().equals(valor))
                    mostrarEnTabla(p);
                break;
            }
            
        }
    }

    /**
     * Método que recibe un paciente y presenta su información en el formulario
     * Consulta de Pacientes
     * @param p 
     */
    private void mostrarEnTabla(modelo.Pacientes p) {
        String registro[] = new String[5];
        registro[0]=p.getPacidentificacion();
            registro[1]=p.getPacnombres();
            registro[2]=p.getPacapellidos();
            registro[3]=p.getPacfechanacimiento().toString();
            registro[4]=p.getPacsexo().toString();
            consultarPacienteVista.getTableModel().addRow(registro);
            consultarPacienteVista.getTableModel().fireTableDataChanged();
    }
}
