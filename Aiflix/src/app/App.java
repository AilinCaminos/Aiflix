package app;

import java.util.Scanner;

public class App {

    public static Scanner Entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Aiflix miAiflix = new Aiflix();

        System.out.println("Iniciando Catalogo");

        miAiflix.inicializarCatalogo();

        Serie spn = miAiflix.buscarSerie("Supernatural");

        Temporada laMejorTemporada = spn.getTemporada(2);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(2);

        elTop.reproducir();

        //websodio 
        
        elTop = laMejorTemporada.getEpisodio(44);

        elTop.reproducir();

        System.out.println("Empezando otra cosa");

        Episodio epiDemo;

        int posicion = 0;

        /// En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Entrada.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        if (epiDemo instanceof Websodio) {
            
            Websodio webi = (Websodio)epiDemo;
            webi.enviarAlertaDeQueEstaOnline();

            
        }
        else {
            System.out.println("No hay que hacer nada con un Episodio");
        }

        miAiflix.inicializarListaNominados();

        miAiflix.reproducirTrailersDeNominacion();






    }
}