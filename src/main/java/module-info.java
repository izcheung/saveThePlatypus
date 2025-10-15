module savetheplatypus {
    requires transitive javafx.controls; 
    requires javafx.fxml;


    opens JavaFXGame to javafx.fxml;
    exports JavaFXGame;
}