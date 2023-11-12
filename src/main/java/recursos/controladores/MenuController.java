package recursos.controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class MenuController {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    void destinos(MouseEvent event) {
    cargarPagina("destinos-view");
    }

    @FXML
    void miperfil(MouseEvent event) {
        cargarPagina("miperfil-view");
    }

    @FXML
    void paquetes(MouseEvent event) {
    bp.setCenter(ap);
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