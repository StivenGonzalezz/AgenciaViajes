package model;

public class GuiaTuristico extends Persona{
    private int lenguajes;
    private double experiencia;

    /**
     * Constructor
     * @param id
     * @param nombre
     * @param lenguajes
     * @param experiencia
     */
    public GuiaTuristico(int id, String nombre, int lenguajes, double experiencia){
        super(id, nombre);
        this.lenguajes = lenguajes;
        this.experiencia = experiencia;
    }

    //--------------------------MÉTODOS GETTERS AND SETTERS----------------------------
    public int getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(int lenguajes) {
        this.lenguajes = lenguajes;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return null;
    }
}
