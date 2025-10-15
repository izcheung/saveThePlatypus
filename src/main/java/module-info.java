module ca.bcit.comp2522.termproject.flappyplatypus {
    requires javafx.controls;
    requires javafx.fxml;


    opens JavaFXGame to javafx.fxml;
    exports JavaFXGame;
}