package reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
// Importación de paquetes para la gestión y visualización de reportes
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author oabm77
 */
public class GestorReportes {
    
    public static Connection conexion;
    
    /**
     * Constructor de la clase, donde se crea la conexión con la base de datos,
     * la cual queda almacenada en la variable conexion
     */
    public GestorReportes() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url,"citas", "citas");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión con la base de datos");
        }
    }
    
    public void ejecutarReporte(String archivo) {
        try {
            // Se obtiene la ubicación y el nombre del reporte que se desea presentar
            String reporte = System.getProperty("user.dir") + "/src/reportes/" + archivo;
            // Carga del reporte seleccionado
            JasperReport masterReport = (JasperReport) JRLoader.loadObject(reporte);
            // Se llenan los datos en el reporte con la información obtenida de la base de datos
            // y de acuerdo a algún parámetro, en este caso no existen parámetros null
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, null, conexion);
            // Se llama al visor del reporte, asignando el reporte y sus datos
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            // Se hace visible el reporte
            jviewer.setVisible(true);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
