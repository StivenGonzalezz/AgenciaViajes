package recursos.controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MenuAdminController {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    void destinos(MouseEvent event) {
        cargarPagina("destinosadmin-view");
    }

    @FXML
    void guias(MouseEvent event) {
        cargarPagina("guiasadmin-view");
    }

    @FXML
    void inicio(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    void paquetes(MouseEvent event) {
        cargarPagina("paquetesadmin-view");
    }

    private void cargarPagina(String pagina){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(pagina + ".fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        bp.setCenter(root);
    }

}
