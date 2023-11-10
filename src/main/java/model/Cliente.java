package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Persona{
    private String email;
    private String telefono;
    private String direccion;
    ArrayList<Reserva> reservas = new ArrayList<>();


    /**
     * Constructor
     * @param id
     * @param nombre
     * @param email
     * @param telefono
     * @param direccion
     */
    public Cliente (int id, String nombre, String email, String telefono, String direccion){
        super();
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //-----------------------------MÉTODOS GETTERS AND SETTERS-----------------------

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //-----------------------------MÉTODOS-----------------------------

    public void crearReservas(int id, LocalDate fecha_solicitud, LocalDate fecha_viaje, Cliente cliente, int cantidad_personas, PaqueteTuristico paquete_turistico,
        GuiaTuristico guia_turistico, Reserva estado_reserva){

        int id_reserva = (int) Math.random()*1000+1; //Número id de la reserva
        Reserva reserva = new Reserva();

        reserva.setId(id_reserva);
        reserva.setFecha_solicitud(fecha_solicitud);
        reserva.setFecha_viaje(fecha_viaje);
        reserva.setCliente(cliente);
        reserva.setCantidad_personas(cantidad_personas);
        reserva.setPaquete_turistico(paquete_turistico);
        reserva.setGuia_turistico(guia_turistico);
        reserva.setEstado_reserva(estado_reserva.getEstado_reserva());

        reservas.add(reserva);
        System.out.println("Reservado éxitosamente");

        Reserva.registrarReserva("archivos\\Reservas.txt", reservas);
    }

    public void eliminarReservas(int id, LocalDate fecha_solicitud){
        int j=0;
        if(j == reservas.size()){

        }else {
            if (id == reservas.get(j).getId()){
                if(!reservas.isEmpty()){
                    Reserva.eliminarReserva("archivos\\Reservas.txt");
                }
            }
        }


    }


    public void listarReservas(){

    }
}
