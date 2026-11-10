module org.example.authfxown {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.authfxown to javafx.fxml;
    exports org.example.authfxown;
}