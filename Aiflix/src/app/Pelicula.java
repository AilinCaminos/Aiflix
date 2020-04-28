package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.*;


public class Pelicula extends Contenido implements INominable {

   public Pelicula(String nombre, int duracionEnMinutos, int anio) {

        this.setNombre(nombre);
        this.duracionEnMinutos = duracionEnMinutos;
        this.setAnio(anio);
    }

    private List<Director> director = new ArrayList<>();
    private int duracionEnMinutos;

    public List<Director> getDirector() {
        return this.director;
    }

    public void setDirector(List<Director> director) {
        this.director = director;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        // TODO Auto-generated method stub
        System.out.println("Reproduciendo trailer de " + this.getNombre());

    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean estaNominada() {
        // TODO Auto-generated method stub
        return false;
    }



}