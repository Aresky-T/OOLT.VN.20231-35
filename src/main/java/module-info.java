module org.example.oop_project_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    opens OOP.GUI.Home to javafx.fxml;
    opens OOP.GUI.Lipid to javafx.fxml;
    opens OOP.GUI.Lipid.Covid to javafx.fxml;
    opens OOP.GUI.Lipid.HIV to javafx.fxml;
    opens OOP.GUI to javafx.fxml;
    opens org.example.oop_project_1 to javafx.fxml;
    exports org.example.oop_project_1;
    exports OOP;

}