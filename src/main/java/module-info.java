module com.example.mvc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.mvc to javafx.fxml;
    exports com.example.mvc;
    exports com.example.mvc.controlador;
    opens com.example.mvc.controlador to javafx.fxml;
}