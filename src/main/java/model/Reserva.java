package model;

import java.io.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva implements Serializable {
    private int id;
    private LocalDate fecha_solicitud;
    private LocalDate fecha_viaje;
    private Cliente cliente;
    private int cantidad_personas;
    private PaqueteTuristico paquete_turistico;
    private GuiaTuristico guia_turistico;
    private enum Estado{PENDIENTE, CONFIRMADA, CANCELADA};
    private Estado estado_reserva;

    /**
     * Constructor
     * @param id Número aleatorio generado cada que se cree una reserva.
     * @param fecha_solicitud
     * @param fecha_viaje
     * @param cliente
     * @param cantidad_personas
     * @param paquete_turistico
     * @param guia_turistico
     * @param estado_reserva
     */
    public Reserva(int id, LocalDate fecha_solicitud, LocalDate fecha_viaje, Cliente cliente, int cantidad_personas, PaqueteTuristico paquete_turistico, GuiaTuristico guia_turistico, Estado estado_reserva) {
        this.id = id;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_viaje = fecha_viaje;
        this.cliente = cliente;
        this.cantidad_personas = cantidad_personas;
        this.paquete_turistico = paquete_turistico;
        this.guia_turistico = guia_turistico;
        this.estado_reserva = estado_reserva;
    }

    /**
     * Constructor vacío
     */
    public Reserva() {

    }

    //---------------------------------GETTERS AND SETTERS-------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(LocalDate fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public LocalDate getFecha_viaje() {
        return fecha_viaje;
    }

    public void setFecha_viaje(LocalDate fecha_viaje) {
        this.fecha_viaje = fecha_viaje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidad_personas() {
        return cantidad_personas;
    }

    public void setCantidad_personas(int cantidad_personas) {
        this.cantidad_personas = cantidad_personas;
    }

    public PaqueteTuristico getPaquete_turistico() {
        return paquete_turistico;
    }

    public void setPaquete_turistico(PaqueteTuristico paquete_turistico) {
        this.paquete_turistico = paquete_turistico;
    }

    public GuiaTuristico getGuia_turistico() {
        return guia_turistico;
    }

    public void setGuia_turistico(GuiaTuristico guia_turistico) {
        this.guia_turistico = guia_turistico;
    }

    public Estado getEstado_reserva() {
        return estado_reserva;
    }

    public void setEstado_reserva(Estado estado_reserva) {
        this.estado_reserva = estado_reserva;
    }

    //-----------------------------------------MÉTODOS-----------------------------------------
    @Override
    public String toString(){
        return "\n" +
                "Id reserva: "+this.id+"\n" +
                "Fecha de solicitud: "+this.fecha_solicitud+"\n" +
                "Fecha de viaje: "+this.fecha_viaje+"\n" +
                "Nombre de cliente: "+this.cliente+"\n" +
                "Cantidad de personas: "+this.cantidad_personas+"\n" +
                "Paquete turistico: "+this.paquete_turistico+"\n" +
                "Guía turistico: "+this.paquete_turistico+"\n"+
                "Estado de reserva: "+this.estado_reserva;
    }
}
