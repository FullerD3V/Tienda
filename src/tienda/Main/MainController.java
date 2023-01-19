/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.Main;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import modelos.Informe;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author alumno
 */
public class MainController implements Initializable {
    
    Informe reporte = new Informe("titulo");
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException, JRException {
        System.out.println("You clicked me!");
        reporte.generarInforme();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
