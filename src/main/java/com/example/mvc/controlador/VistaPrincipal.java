package com.example.mvc.controlador;

import com.example.mvc.modelo.ConexionHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class VistaPrincipal implements Initializable {


    @FXML
    public Button boton;

    @FXML
    public ProgressBar barravox, barrapsoe, barrapp, barraiu;



    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }

    public ProgressBar getBarravox() {
        return barravox;
    }

    public void setBarravox(ProgressBar barravox) {
        this.barravox = barravox;
    }

    public ProgressBar getBarrapsoe() {
        return barrapsoe;
    }

    public void setBarrapsoe(ProgressBar barrapsoe) {
        this.barrapsoe = barrapsoe;
    }

    public ProgressBar getBarrapp() {
        return barrapp;
    }

    public void setBarrapp(ProgressBar barrapp) {
        this.barrapp = barrapp;
    }

    public ProgressBar getBarraiu() {
        return barraiu;
    }

    public void setBarraiu(ProgressBar barraiu) {
        this.barraiu = barraiu;
    }

    Boolean activ = false;
    ConexionHelper ch = new ConexionHelper();


    double v = 0;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void iniciarSimulacion(ActionEvent actionEvent) throws InterruptedException {





        barravox.setProgress(v);
        if(activ == false){
            boton.setText("Contando votos...");
            System.out.println("Simulación en proceso");
            ch.empezarVotacion();
            activ = true;
        }else if (true){
            boton.setText("Recuento pausado");
            activ = false;

        }


    }


}
