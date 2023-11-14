package model;

public abstract class Persona {
    private int id;
    private String nombre;


    //-------------------------------MÉTODOS GETTERS AND SETTERS-----------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return "Nombre: "+this.nombre;
    }

}
