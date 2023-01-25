/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.Main;

import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import modelos.Informe;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author alumno
 */
public class MainController implements Initializable {
        
    @FXML TextField txtNombre;
    Informe reporte;
    String nombreEmpresa;
   
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException, JRException, FileNotFoundException {
        System.out.println("You clicked me!");
        reporte = new Informe("ventas", nombreEmpresa);
        reporte.generarInforme();
    }
    
    @FXML
    public void txtNombreOnKeyReleased(KeyEvent event){
     nombreEmpresa = txtNombre.getText();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
