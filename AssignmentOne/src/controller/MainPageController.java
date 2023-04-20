/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import view.loginScene;

/**
 * FXML Controller class
 *
 * @author Bahaa El-Den
 */
public class MainPageController implements Initializable {

    @FXML
    private TextField usdField;
    @FXML
    private Button convertButton;
    @FXML
    private TextField nisField;
    @FXML
    private Button logoutButton;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    void logoutB(ActionEvent event) {
        //here 
    }
    @FXML
    void convertB(ActionEvent event) {
        String usd = usdField.getText(); 
        double newUsd = Double.parseDouble(usd);
        
        double convertToNis = newUsd*3.2;
        String newConvertToNis = Double.toString(convertToNis);
       
        nisField.setText(newConvertToNis);
    }

  
    
}
