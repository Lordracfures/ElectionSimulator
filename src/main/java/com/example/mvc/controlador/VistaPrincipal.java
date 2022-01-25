package com.example.mvc.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class VistaPrincipal implements Initializable {


    @FXML
    Button boton;

    Boolean activ = false;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void iniciarSimulacion(ActionEvent actionEvent) {


        System.out.println("Simulación en proceso");


        if(activ == false){
            boton.setText("Contando votos...");
            activ = true;
        }else if (true){
            boton.setText("Recuento pausado");
            activ = false;

        }


    }


}
