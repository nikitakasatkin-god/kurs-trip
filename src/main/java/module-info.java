module org.example.kurstrip {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kurstrip to javafx.fxml;
    exports org.example.kurstrip;
}