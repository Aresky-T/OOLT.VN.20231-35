module hust.soict.hedspi.miniproject.sourcecode {
    requires javafx.controls;
    requires javafx.fxml;


    opens hust.soict.hedspi.miniproject.sourcecode to javafx.fxml;
    exports hust.soict.hedspi.miniproject.sourcecode;
}