package model;

import java.util.ArrayList;
import java.util.Date;

public class PaqueteTuristico {
    private String nombre;
    private double duracion;
    private String servicios_adicionales;
    private double precio;
    private int cupo_maximo;
    private Date fecha;
    private boolean disponible;
    ArrayList<PaqueteTuristico>paquete = new ArrayList<>();

    /**
     * Constructor
     * @param nombre
     * @param duracion
     * @param servicios_adicionales
     * @param precio
     * @param cantidad_personas
     * @param fecha
     * @param disponible
     */
    public PaqueteTuristico(String nombre, double duracion, String servicios_adicionales, double precio, int cantidad_personas, Date fecha, boolean disponible) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.servicios_adicionales = servicios_adicionales;
        this.precio = precio;
        this.cupo_maximo = cantidad_personas;
        this.fecha = fecha;
        this.disponible = disponible;
    }

    public PaqueteTuristico() {

    }

    //-----------------------------GETTERS AND SETTERS------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getServicios_adicionales() {
        return servicios_adicionales;
    }

    public void setServicios_adicionales(String servicios_adicionales) {
        this.servicios_adicionales = servicios_adicionales;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCupo_maximo() {
        return cupo_maximo;
    }

    public void setCupo_maximo(int cupo_maximo) {
        this.cupo_maximo = cupo_maximo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //---------------------------------------------MÉTODOS-----------------------------------------
    /**
     * Método que determina la disponibilidad
     * @param cupo_maximo
     * @param fecha
     * @return
     */
    public boolean determinarDisponibilidad(int cupo_maximo, Date fecha){

        return false;
    }

    public void conformarConjuntosDestinos(Destino destino, ArrayList<PaqueteTuristico>paquete){

        if (paquete.isEmpty()){

            PaqueteTuristico paqueteTuristico = new PaqueteTuristico();


            paqueteTuristico.setNombre(nombre);
            paqueteTuristico.setDuracion(duracion);
            paqueteTuristico.setServicios_adicionales(servicios_adicionales);
            paqueteTuristico.setPrecio(precio);

            paquete.add(paqueteTuristico);

        }

    }
}
