package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;

public abstract class Contenido {

    private String nombre;
    private double calificacion;
    private Clasificacion clasificacion;
    private Genero genero;
    private int anio;
    private String descripcion;
    private List<Actor> elenco = new ArrayList<>();

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getCalificacion(){
        return this.calificacion;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }

    public Clasificacion getClasificacion(){
        return this.clasificacion;
    }
    public void setClasificacion(Clasificacion clasificacion){
        this.clasificacion = clasificacion;
    }

    public Genero getGenero(){
        return this.genero;
    }
    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public int getAnio(){
       return this.anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public List<Actor> getElenco(){
        return this.elenco;
    }
    public void setElenco(List<Actor> elenco){
        this.elenco = elenco;
    }


}