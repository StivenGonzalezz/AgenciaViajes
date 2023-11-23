package model;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import static model.Serializable.*;

public class Cliente extends Persona{
    private String email;
    private String telefono;
    private String direccion;
    private String contraseña;
    ArrayList<Reserva> reservas = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();


    /**
     * Constructor
     * @param id
     * @param nombre
     * @param email
     * @param telefono
     * @param direccion
     */
public Cliente (int id, String nombre, String email, String telefono, String direccion, String contraseña){
        super(id, nombre);
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contraseña = contraseña;
    }

    public Cliente(){
        super();
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

//--------------------------------MÉTODOS-----------------------------

    /**
     * Método que sirve para registrarse
     * @param cliente
     */
    public void registrarse(Cliente cliente){
            clientes.add(cliente);
            try {
                registrarDatos("archivos\\Clientes.txt", clientes, true);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Registrado éxitosamente");
    }

    public void modificarPerfil(Cliente cliente){

        if (getId() == cliente.getId()){
            try {
                actualizarDatos("archivos\\Clientes.txt", clientes, true);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Actualizado éxitosamente");
        }



    }


    /**
     * Método que permite crear una reserva
     * @param id
     * @param fecha_solicitud
     * @param fecha_viaje
     * @param cliente
     * @param cantidad_personas
     * @param paquete_turistico
     * @param guia_turistico
     * @param estado_reserva
     */
    public void crearReservas(int id, LocalDate fecha_solicitud, LocalDate fecha_viaje, Cliente cliente, int cantidad_personas, PaqueteTuristico paquete_turistico,
        GuiaTuristico guia_turistico, Reserva estado_reserva){

        int id_reserva = (int) Math.random()*1000+100; //Número id de la reserva
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
        try {
            registrarReserva("archivos\\Reservas.txt", reservas, true);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Reservado éxitosamente");
    }

    /**
     * Método que invoca la serialización para mostrar las reservas
     * @throws IOException
     */
    public void listarReserva() throws IOException{
        try{
            System.out.println("\t LISTADO DE RESERVAS");
            ArrayList<String>salida = listarDatos("archivos\\Reservas.txt");
            System.out.println(salida.toString()+"\n");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    /**
     * Método que permite eliminar reservas
     * @param id
     */
    public void eliminarReservas(int id){

        /*int contador = 0;
        if(reservas.get(contador).getId() == id){
            reservas.remove(reservas.get(contador)); //Elimino objeto del arraylist
            Reserva.eliminarReserva("archivos\\Reservas.txt", reservas);
        }else {
           contador = Integer.parseInt(1+eliminarReservas(id));
        }*/
        //return Reserva.eliminarReserva("archivos\\Reservas.txt", reservas);
    }

    @Override
    public String toString(){
        return  "\nId: "+getId()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Email: "+this.email+"\n" +
                "Telefono: "+this.telefono+"\n" +
                "Dirección: "+this.direccion+"\n" +
                "Contraseña: "+this.contraseña+"\n";
    }
}