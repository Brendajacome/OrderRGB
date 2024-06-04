module com.example.orderrgb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.orderrgb to javafx.fxml;
    exports com.example.orderrgb;
}