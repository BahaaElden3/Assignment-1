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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import view.MainPageScane;

/**
 * FXML Controller class
 *
 * @author Bahaa El-Den
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private Button loginButton;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ImageView imageUs;
     @FXML
    private Label statesLable;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    void loginB(ActionEvent event) {
        
        String username = "admin";
        String password = "adimn";
        
        if(username.equals(usernameField.getText())&&
                password.equals(passwordField.getText())){
            //here 
                statesLable.setText("OK!");
                new MainPageScane().show();
                
            
        }else{
           statesLable.setText("Username or password is wrong!");
        }
        
    
    }
    
}
