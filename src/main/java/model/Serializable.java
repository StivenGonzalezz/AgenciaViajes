package model;

import java.io.*;
import java.util.ArrayList;

public class Serializable {

    //---------------------------------------ADMINISTRADOR---------------------------------------
    public static void registrarGuia(String nombreArchivo, ArrayList<GuiaTuristico> contenido, boolean adicionar) throws IOException {
        File archivo = new File(nombreArchivo);
        FileWriter file = new FileWriter(archivo, adicionar);
        BufferedWriter buffered = new BufferedWriter(file);

        for (GuiaTuristico linea : contenido) {
            buffered.write(linea + "\n");
        }

        buffered.close();
        file.close();
    }

    public static void registrarDestino(String nombreArchivo, ArrayList<Destino> contenido, boolean adicionar) throws IOException {
        File archivo = new File(nombreArchivo);
        FileWriter file = new FileWriter(archivo, adicionar);
        BufferedWriter buffered = new BufferedWriter(file);

        for (Destino linea : contenido) {
            buffered.write(linea + "\n");
        }

        buffered.close();
        file.close();
    }

    public static void registrarPaquetesTuristicos(String nombreArchivo, ArrayList<PaqueteTuristico> contenido, boolean adicionar) throws IOException {
        File archivo = new File(nombreArchivo);
        FileWriter file = new FileWriter(archivo, adicionar);
        BufferedWriter buffered = new BufferedWriter(file);

        for (PaqueteTuristico linea : contenido) {
            buffered.write(linea + "\n");
        }

        buffered.close();
        file.close();
    }
    //----------------------------------------------CLIENTE--------------------------------------

    /**
     * Método que permite almacenar los datos de los clientes registrados.
     * @param nombreArchivo
     * @param contenido
     * @param adicionar
     * @throws IOException
     */
    public static void registrarDatos(String nombreArchivo, ArrayList<Cliente> contenido, boolean adicionar) throws IOException {
        File archivo = new File(nombreArchivo);
        FileWriter file = new FileWriter(archivo, adicionar);
        BufferedWriter buffered = new BufferedWriter(file);

        for (Cliente linea : contenido) {
            buffered.write(linea + "\n");
        }

        buffered.close();
        file.close();
    }

    public static void actualizarDatos(String nombreArchivo, ArrayList<Cliente> contenido, boolean adicionar) throws IOException {
        try {

            File archivo = new File(nombreArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            // Pedir al usuario la palabra a buscar y la palabra de reemplazo
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese la palabra a buscar: ");
            String buscar = entrada.readLine();
            System.out.print("Ingrese la palabra de reemplazo: ");
            String reemplazar = entrada.readLine();

            // Reemplazar la palabra
            String linea;
            String nuevaLinea = "";
            while ((linea = br.readLine()) != null) {
                nuevaLinea += linea.replace(buscar, reemplazar) + "\n";
            }

            // Guardar el resultado en un nuevo archivo
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nuevaLinea);

            // Cerrar los archivos
            br.close();
            fr.close();
            bw.close();
            fw.close();

            System.out.println("El archivo se ha modificado correctamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Método que permite registrar los datos de una reserva en un archivo llamado Reservas
     * @param nombreArchivo
     * @param contenido
     */
    public static void registrarReserva(String nombreArchivo, ArrayList<Reserva> contenido, boolean adicionar) throws IOException {
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
     * @param ruta
     * @throws IOException
     */
    public static ArrayList<String> listarDatos(String ruta) throws IOException {

        File archivo = new File(ruta);
        FileReader leer = new FileReader(archivo);
        BufferedReader br = new BufferedReader(leer);
        String linea;
        ArrayList<String> lineas = new ArrayList<>();

        while ((linea = br.readLine()) != null) {
            lineas.add(linea);
        }

        br.close();
        leer.close();
        return lineas;
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

