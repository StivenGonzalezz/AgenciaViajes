package model;

import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class mainTemp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String imagen = "/img/images.jpg";
        Map parametro = new HashMap();
       Persona c = new Cliente(123, "yuri", "yuriar", "312032", "acacias", "admin");


        Cliente cliente = new Cliente(294, "yuri", "yarr", "1234", "bajo", "admin");
        //cliente.registrarse(cliente);


     //  Destino d1 = new Destino("milagro", "Armenia", "Armenia ciudad milagro", Destino.Clima.CALIDO, imagen);
        //cliente.modificarPerfil(cliente);
        Administrador a = new Administrador();


        parametro.put("logo", mainTemp.class.getResourceAsStream(imagen));
        a.listarGuiaTuristico();
        a.listarPaqueteTuristico();

    }
}
