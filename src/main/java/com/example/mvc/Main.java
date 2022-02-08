package com.example.mvc;

import com.example.mvc.controlador.VentanaInicio;
import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    public static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("VentanaInicio.fxml"));
        //System.out.println(fxmlLoader.getLocation().toString());
        scene = new Scene(fxmlLoader.load(), 746, 550);
        stage.setScene(scene);

        //stage.setIconified(true);
        stage.setResizable(false);
        stage.show();






        /*
        ProgressBar barravox = (ProgressBar) Main.scene.lookup("#barravox"),
                barrapp = (ProgressBar) Main.scene.lookup("#barrapp"),
                barrapsoe = (ProgressBar) Main.scene.lookup("#barrapsoe"),
                barraiu = (ProgressBar) Main.scene.lookup("#barraiu")
        ;

        barravox.setStyle("-fx-accent: green;");
        barrapp.setStyle("-fx-accent: blue;");
        barrapsoe.setStyle("-fx-accent: red;");
        barraiu.setStyle("-fx-accent: yellow;");

*/


        boolean supported = Platform.isSupported(ConditionalFeature.GRAPHICS);
        System.out.println(supported);
    }

    public static void main(String[] args) {
        launch();
    }
/*
    public void showBirthdayStatistics() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("grafico.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Birthday Statistics");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            Window primaryStage = null;
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);


            // Set the persons into the controller.
            //com.example.mvc.controlador.Grafico controller = loader.getController();
          //  controller.setPersonData(personData);

            dialogStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

}