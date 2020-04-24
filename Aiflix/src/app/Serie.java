package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public Serie(String nombre,int anio){

      this.setNombre(nombre);
      this.setAnio(anio);
       
    }
    public Serie(String nombre,int anio, Genero genero, Clasificacion clasificacion){

        this(nombre,anio);
        this.setGenero(genero);
        this.setClasificacion(clasificacion);
        
     }
    

    private List<Temporada> temporadas = new ArrayList<>();

    public List<Temporada> getTemporada(){
        return this.temporadas;
    }
    public void setTemporada(List<Temporada> temporadas){
        this.temporadas = temporadas;
    }

    public Temporada getTemporada(int nro){
        for (Temporada tempo : this.temporadas) {
            if (tempo.getNumero() == nro) {
                return tempo;
            }   
        }
        return null;
    }
}