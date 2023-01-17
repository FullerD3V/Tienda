/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class Informe {
   
    private String nombreInforme;
    
	public Informe(String nombreInforme){
    		this.nombreInforme=nombreInforme;
    	}
    
//	public void generarInforme() throws SQLException, JRException{
//
//		Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/tienda","alumno", "pass");
//
//		InputStream dir = getClass().getResourceAsStream(this.nombreInforme +".jrxml");
//
//		JasperReport jasperReport = JasperCompileManager.compileReport(dir);
//        	JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conexion);
//
//		//------- INTRODUCIR LÍNEA PARA GENERAR PDF EN UBICACIÓN INDICADA ---------------
//	}
}
