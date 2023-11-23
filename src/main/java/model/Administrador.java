package model;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import static model.Serializable.*;

public class Administrador {

    private String password;
    ArrayList<GuiaTuristico>guiasTuristicos = new ArrayList<>();
    ArrayList<Destino>destinos = new ArrayList<>();
    ArrayList<PaqueteTuristico>paqueteTuristicos = new ArrayList<>();

    public Administrador(String password) {
        this.password = password;
    }

    public Administrador() {
    }

    //------------------------MÉTODOS DE GESTIONAR GUÍAS TURISTICOS--------------------------------------

    /**
     * Método que registra un guía
     * @param guiaTuristico
     */
    public void crearGuiaTuristico(GuiaTuristico guiaTuristico){
        guiasTuristicos.add(guiaTuristico);
        try {
            registrarGuia("archivos\\GuiasTuristicos.txt", guiasTuristicos, true);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Guia registrado éxitosamente");
    }

    public void listarGuiaTuristico() throws IOException{
        try{
            System.out.println("\t LISTADO DE GUÍAS TÚRISTICOS");
            ArrayList<String>salida = listarDatos("archivos\\GuiasTuristicos.txt");
            System.out.println(salida.toString()+"\n");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    //------------------------MÉTODOS DE GESTIONAR DESTINOS--------------------------------------

    public void crearDestino(Destino destino){
        destinos.add(destino);
        try {
            registrarDestino("archivos\\Destinos.txt", destinos, true);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Destino guardado éxitosamente");
    }

    public void listarDestino() throws IOException{
        try{
            System.out.println("\t LISTADO DE DESTINOS");
            ArrayList<String>salida = listarDatos("archivos\\Destinos.txt");
            System.out.println(salida.toString()+"\n");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //------------------------MÉTODOS DE GESTIONAR PAQUETES TURISTICOS--------------------------------------

    public void crearPaqueteTuristico(PaqueteTuristico paqueteTuristico){
        paqueteTuristicos.add(paqueteTuristico);
        try {
            registrarPaquetesTuristicos("archivos\\PaquetesTuristicos.txt", paqueteTuristicos, true);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Destino guardado éxitosamente");
    }

    public void listarPaqueteTuristico() throws IOException{
        try{
            System.out.println("\t LISTADO DE PAQUETES TÚRISTICOS");
            ArrayList<String>salida = listarDatos("archivos\\PaquetesTuristicos.txt");
            System.out.println(salida.toString()+"\n");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
