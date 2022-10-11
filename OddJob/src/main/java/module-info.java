module com.example.oddjob {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oddjob to javafx.fxml;
    exports com.example.oddjob;
}