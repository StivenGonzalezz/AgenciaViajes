package model;
import javax.swing.*;

public class Destino extends JFrame {
    JLabel imagen;
    private String nombre;
    private String ciudad;
    private String descripcion;
    enum Clima {CALIDO, TEMPLADO, POLAR};
    private Clima clima;
    private String image;

    /**
     * Constructor
     * @param nombre
     * @param ciudad
     * @param descripcion
     * @param clima
     * @param
     */
    public Destino(String nombre, String ciudad, String descripcion, Clima clima, String image) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.clima = clima;
        this.image = image;

        imagen = new JLabel(); //Espacio para colocar la imagen
        ImageIcon icono = new ImageIcon("img/images.jpg"); //llamamos la imagen
        imagen.setIcon(icono);
        imagen.setBounds(15, 40,200, 200);

        add(imagen);
    }

   public Destino(){
        imagen = new JLabel(); //Espacio para colocar la imagen
        ImageIcon icono = new ImageIcon("resources/img/images.jpg"); //llamamos la imagen
        imagen.setIcon(icono);
        imagen.setBounds(15, 40,300, 300);

        add(imagen);
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString(){
        return "Destino: "+this.nombre+"\n" +
                "Ciudad: "+this.ciudad+"\n" +
                "Descripción: "+this.descripcion+"\n" +
                "Clima: "+this.clima+"\n"+image;
    }
}
