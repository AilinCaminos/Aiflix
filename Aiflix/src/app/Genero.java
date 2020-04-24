package app;

public class Genero {

    public Genero(String nombre){

        this.nombre = nombre;
    }

    private String nombre;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}