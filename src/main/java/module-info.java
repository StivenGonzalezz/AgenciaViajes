module recursos.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.hotspot.agent;

    opens recursos.controladores to javafx.fxml;
    exports recursos.controladores;
}