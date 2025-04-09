module com.example.tarea2_6_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea2_6_2 to javafx.fxml;
    exports com.example.tarea2_6_2;
}