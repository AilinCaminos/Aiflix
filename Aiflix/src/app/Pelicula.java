package app;

public class Pelicula extends Contenido {

    public Pelicula(Director director,int duracionEnMinutos){

        this.director = director;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private Director director;
    private int duracionEnMinutos;

    public Director getDirector(){
        return this.director;
    }
    public void setDirector(Director director){
        this.director = director;
    }

    public int getDuracionEnMinutos(){
        return this.duracionEnMinutos;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }



}