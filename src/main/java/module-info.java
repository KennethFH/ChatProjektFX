module at.fhtw.chatprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.fhtw.chatprojekt to javafx.fxml;
    exports at.fhtw.chatprojekt;
}