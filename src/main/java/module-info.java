module ca.bcit.comp2522.termproject.flappyplatypus {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.bcit.comp2522.termproject.JavaFXGame to javafx.fxml;
    exports ca.bcit.comp2522.termproject.JavaFXGame;
}