package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada extends Serie {

    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int nro) {
        for (Episodio ep : this.episodios) {
            if (ep.numero == nro) {
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