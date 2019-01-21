package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import modelo.exceptions.PreexistingEntityException;
/**
 * 
 * @author Omar Augusto Bautista Mora
 */
public class PacienteControl implements ActionListener {
    vista.RegPacienteInternalFrame pacienteVista;
    modelo.Pacientes pacienteModelo;
    // Declaración del objeto de tipo JpaController que permite realizar
    // operaciones contra la base de datos
    modelo.PacientesJpaController gestorPacienteModelo;
    
    public PacienteControl(vista.RegPacienteInternalFrame pacienteVista) {
        this.pacienteVista = pacienteVista;
        // Definición de la unidad de persistencia empleada
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
        // Creación del objeto de tipo JpaController que realizará operaciones contra
        // la base de datos
        gestorPacienteModelo = new modelo.PacientesJpaController(emf);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(pacienteVista.RegistrarBtn)) {
            String identificacion = pacienteVista.IdentificacionTxt.getText();
            String nombres = pacienteVista.NombresTxt.getText();
            String apellidos = pacienteVista.AppellidosTxt.getText();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = formato.format(pacienteVista.FechaNacimientoDtc.getDate());
            char sexo = '\0';
            if(pacienteVista.MasculinoOpt.isSelected())
                sexo = 'm';
            else
                sexo = 'f';
            // Creación de un objeto de la clase Pacientes que se encuentra mapeada
            // con la tabla Pacientes de la base de datos
            pacienteModelo = new modelo.Pacientes();
            // Asignación de valores a los atributos de la clase Pacientes
            pacienteModelo.setPacidentificacion(identificacion);
            pacienteModelo.setPacapellidos(apellidos);
            pacienteModelo.setPacnombres(nombres);
            pacienteModelo.setPacfechanacimiento(new Date(fechaNacimiento));
            pacienteModelo.setPacsexo(sexo);
            
            try {
                // Uso del objeto de tipo PacientesJpaController para insertar un nuevo
                // paciente en la tabla PACIENTES a través del método create
                gestorPacienteModelo.create(pacienteModelo);
                JOptionPane.showMessageDialog(pacienteVista, "Paciente registrado correctamente");
            } catch (PreexistingEntityException ex) {
                JOptionPane.showMessageDialog(pacienteVista, "El paciente ya existe");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(pacienteVista, ex.getMessage());
            }
        }
        if(e.getSource().equals(pacienteVista.NuevoBtn)) {
            pacienteVista.IdentificacionTxt.setText(null);
            pacienteVista.NombresTxt.setText(null);
            pacienteVista.AppellidosTxt.setText(null);
            pacienteVista.FechaNacimientoDtc.setDate(null);
            pacienteVista.MasculinoOpt.setSelected(false);
            pacienteVista.FemeninoOpt.setSelected(false);
            pacienteVista.IdentificacionTxt.requestFocus();
        }
    }
    
}
