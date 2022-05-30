module com.example.filaaejercicios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filaaejercicios to javafx.fxml;
    exports com.example.filaaejercicios;
}