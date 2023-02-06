module com.example.backgammonapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.backgammonapplication to javafx.fxml;
    exports com.example.backgammonapplication;
}