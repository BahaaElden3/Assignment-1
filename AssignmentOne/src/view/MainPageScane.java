/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package view;

import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Bahaa El-Den
 */
public class MainPageScane extends Stage {
    
    public void start(Stage primaryStage) throws IOException {
        
       FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
        //loader.setController(this);
        FlowPane flowPane = loader.load();

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Conversion Page");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
