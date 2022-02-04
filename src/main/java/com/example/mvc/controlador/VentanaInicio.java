package com.example.mvc.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class VentanaInicio {
    private Stage stage;
    @FXML
    Button btncomenzar;

    @FXML
    public void abrirVentana(ActionEvent event) throws IOException {

        System.out.println("Boton comenzar presionado¿¿¿¿");

        ((Node) (event.getSource())).getScene().getWindow().hide();


        URL fxmlLocation = getClass().getResource("com/example/mvc/VistaPrincipal.fxml");
        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        System.out.println(loader.getLocation());
/*

        FXMLLoader loader = new FXMLLoader(getClass().getResource("VistaPrincipal.fxml"));
        Parent root = loader.load();
        VistaPrincipal controlador = loader.getController();
        Scene scene =  new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        */

    }



}
