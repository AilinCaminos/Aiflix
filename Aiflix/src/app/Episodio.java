package app;

public class Episodio {

    public int numero;
    public String nombre;
    public int duracionEnMinutos;
    public String descripcion;

    public void reproducir(){
        System.out.println("Se esta reproduciendo el episodio numero " + this.numero + " " + this.nombre);
        
    }

}