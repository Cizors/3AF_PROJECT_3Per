module com.example.project3af {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.project3af to javafx.fxml;
    exports com.example.project3af;
    exports com.example.project3af.controllers;
    opens com.example.project3af.controllers to javafx.fxml;
}