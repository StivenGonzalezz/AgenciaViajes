package model;
import java.awt.*;

public class Destino {
    private String nombre;
    private String ciudad;
    private String descripcion;
    private enum Clima {CALIDO, TEMPLADO, POLAR};
    private Clima clima;
    private Image image;

    /**
     * Constructor
     * @param nombre
     * @param ciudad
     * @param descripcion
     * @param clima
     * @param image
     */
    public Destino(String nombre, String ciudad, String descripcion, Clima clima, Image image) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.clima = clima;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
