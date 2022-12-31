module com.example.shubham_brickbreakergame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shubham_brickbreakergame to javafx.fxml;
    exports com.example.shubham_brickbreakergame;
}