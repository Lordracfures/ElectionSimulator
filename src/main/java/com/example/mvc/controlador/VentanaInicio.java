package com.example.mvc.controlador;

import com.example.mvc.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class VentanaInicio {
    public static Scene scene;
    @FXML
    Button btncomenzar;

    @FXML
    public void abrirVentana(ActionEvent event) throws IOException {

        System.out.println("Boton comenzar presionado¿¿¿¿");

        ((Node) (event.getSource())).getScene().getWindow().hide();


        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("VistaPrincipal.fxml"));
        //System.out.println(fxmlLoader.getLocation().toString());
        scene = new Scene(fxmlLoader.load(), 746, 550);
        Stage stage = new Stage();
        stage.setScene(scene);
        //stage.setIconified(true);
        stage.setResizable(false);
        stage.show();

        ProgressBar barravox = (ProgressBar) this.scene.lookup("#barravox"),
                barrapp = (ProgressBar) this.scene.lookup("#barrapp"),
                barrapsoe = (ProgressBar) this.scene.lookup("#barrapsoe"),
                barraiu = (ProgressBar) this.scene.lookup("#barraiu")
                        ;

        barravox.setStyle("-fx-accent: green;");
        barrapp.setStyle("-fx-accent: blue;");
        barrapsoe.setStyle("-fx-accent: red;");
        barraiu.setStyle("-fx-accent: yellow;");

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
