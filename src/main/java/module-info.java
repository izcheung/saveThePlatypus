module savetheplatypus {
    requires javafx.controls;
    requires javafx.fxml;


    opens JavaFXGame to javafx.fxml;
    exports JavaFXGame;
}