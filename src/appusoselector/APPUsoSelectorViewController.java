/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusoselector;

import componente_guillermoBenitez.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author usuario
 */
public class APPUsoSelectorViewController implements Initializable {

    @FXML
    private Label textLabel;
    @FXML
    private SelectorDeslizamiento SelectorArriba;
    @FXML
    private SelectorDeslizamiento SelectorAbajo;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ArrayList<String> animales = new ArrayList<String>();
       
        animales.add("caballo");
        animales.add("perro");
        animales.add("gato");
        animales.add("pajaro");
        
        
        SelectorArriba.setItems(animales);
        SelectorAbajo.setItems(animales);
    }

  
    
    @FXML
    private void SelectorDeslizamientoArriba(ActionEvent event) {
        textLabel.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void SelectorDeslizamientoAbajo(ActionEvent event) {
        textLabel.setText("Pulsado el selector de abajo");
    }

}
