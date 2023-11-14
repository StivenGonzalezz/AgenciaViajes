package model;

import java.io.*;
import java.util.ArrayList;

public class Serializable {

    /**
     * Método que permite registrar los datos de una reserva en un archivo llamado Reservas
     * @param nombreArchivo
     * @param contenido
     */
    public static void registrarDatos(String nombreArchivo, ArrayList<Reserva> contenido, boolean adicionar) throws IOException {
        File archivo = new File(nombreArchivo);
        FileWriter file = new FileWriter(archivo, adicionar);
        BufferedWriter buffered = new BufferedWriter(file);

        for (Reserva linea : contenido) {
            buffered.write(linea + "\n");
        }

        buffered.close();
        file.close();
    }



    /**
     * Método que sirve para mostrar datos
     * @param nombre_archivo
     * @throws IOException
     */
    public static void listarDatos(String nombre_archivo) throws IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder hacer una lectura.
            archivo = new File (nombre_archivo);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{   // En el finally cerramos el fichero.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }


}

     /*
    public static String eliminarReserva(String nombre_archivo) {
        File archivo = new File(nombre_archivo);

        if (archivo.exists() == true) { //Comprueba que exista en el archivo
            archivo.delete();           //Elimina del archivo
            return "Reserva cancelada éxitosamente";
        } else {
            return "La reserva no existe, intente nuevamente";
        }
    }*/

