/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mars_DB
 */
public class NewUserFXMLController implements Initializable {
    

    private String  userName;
    private Stage   stage;
    private Scene   scene;
    private Parent  root;

    @FXML
    private TextField FullName;
    @FXML
    private TextField UserName;
    @FXML
    private TextField NewPassword;
    @FXML
    private TextField RepeatPassword;
    @FXML
    private Label conferma;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void check(ActionEvent event) {
        
        userName = UserName.getText();
        conferma.setText(userName + " è disponibile!");
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void signUp(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("NewUserFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void cancel(ActionEvent event) {
        conferma.setText("");
        UserName.setText("");
    }

    @FXML
    private void submit(ActionEvent event) {
        conferma.setText("Utente confermato!");
    }
    
}
