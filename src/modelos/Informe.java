/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperExportManager;
/**
 *
 * @author alumno
 */

public class Informe {

    private String nombreInforme;
    private String paramNombre;

	public Informe(String nombreInforme, String paramNombre){
            this.nombreInforme=nombreInforme;
            this.paramNombre=paramNombre;
    	}
        
	public void generarInforme() throws SQLException, JRException, FileNotFoundException{

            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/tienda", "alumno", "pass");

            Map<String, Object> parametros = new HashMap<>();
            
            parametros.put("TITLE", paramNombre);

            InputStream dir = new FileInputStream("src/reporte/"+ nombreInforme +".jrxml");

            JasperReport jasperReport = JasperCompileManager.compileReport(dir);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, conexion);

            // Visualizando el Reporte
            JasperViewer viewer = new JasperViewer(jasperPrint);

            viewer.setVisible(true);
            //------- INTRODUCIR LÍNEA PARA GENERAR PDF EN UBICACIÓN INDICADA ---------------
            JasperExportManager.exportReportToPdfFile(jasperPrint, "src/reporte/ventas.pdf");
	}
}
