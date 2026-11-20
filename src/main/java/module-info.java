module org.example.gymfitfix {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gymfitfix to javafx.fxml;
    exports org.example.gymfitfix;
}