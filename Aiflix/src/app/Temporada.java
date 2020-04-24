package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public Temporada(int numero,int anio){

       this.numero = numero;
       this.anio = anio;
    
    }

    private int numero;
    private int anio;
    private List<Episodio> episodios = new ArrayList<>();

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAnio(){
        return this.anio;
     }
     public void setAnio(int anio){
         this.anio = anio;
     }

    public List<Episodio> getEpisodios(){
        return this.episodios;
    }
    public void setEpisodios(List<Episodio> episodios){
        this.episodios = episodios;
    }

    public Episodio getEpisodio(int nro) {
        for (Episodio ep : this.episodios) {
            if (ep.getNumero() == nro) {
                return ep;
            }
        }
        return null;
    }

    public Episodio getEpisodioAtPosicion (int pos){
        return this.episodios.get(pos);
    }
    public List<Websodio> obtenerWebsodios() {
        List<Websodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Websodio)
                lista.add((Websodio) epi);
        }
        return lista;
    }


}