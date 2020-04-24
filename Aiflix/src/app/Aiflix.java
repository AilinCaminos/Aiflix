package app;

import java.util.ArrayList;
import java.util.List;

public class Aiflix {

    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();

    public List<Pelicula> getPelicula(){
        return this.peliculas;
    }
    public void setPelicula(List<Pelicula> pelicula){
        this.peliculas = pelicula;
    }

    public List<Serie> getSeries(){
        return this.series;
    }
    public void setSeries(List<Serie> series){
        this.series = series;
    }

    

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.getNombre().equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {

        this.inicializarSupernatural();
        this.inicializarBokuNoHero();
        this.inicializarDark();

    }

    public void inicializarSupernatural() {

        Serie serie1 = new Serie("Supernatural",2005);
        //serie1.setNombre("Supernatural");

        Actor actor1 = new Actor();
        actor1.setNombre("Jared Padalecki");
        actor1.setEdad(37);

        Actor actor2 = new Actor();
        actor2.setNombre("Jensen Ackles");
        actor2.setEdad(42);

        serie1.getElenco().add(actor1);
        serie1.getElenco().add(actor2);

        Clasificacion clasificacion = new Clasificacion("TV-14",14);
        clasificacion.setDescripcion("Mayores de 14");
        //clasificacion.setEdadMin(14);
        //clasificacion.setTipo("TV-14");

        //serie1.setClasificacion(clasificacion);

        serie1.setCalificacion(8.4);

        Genero genero = new Genero("Urban Fantasy");
        //genero.setNombre("Urban Fantasy");
        serie1.setGenero (genero);

        serie1.setDescripcion("Two brothers follow their father's footsteps as hunters, fighting evil supernatural beings of many kinds, including monsters, demons and gods that roam the earth.");

        Temporada serie1T1 = new Temporada(1,2005);
        //serie1T1.setNumero(1);
        //serie1T1.setAnio(2005);
        Temporada serie1T2 = new Temporada(2,2006);
        //serie1T2.setNumero(2);
        //serie1T2.setAnio(2006);

        serie1.getTemporada().add(serie1T1);
        serie1.getTemporada().add(serie1T2);

        Episodio ep = new Episodio(1,"Pilot",45);
        //serie1T1E1.nombre = "Pilot";
        //serie1T1E1.numero = 1;
        //serie1T1E1.duracionEnMinutos = 45;

        serie1T1.getEpisodios().add(ep);

        ep = new Episodio(2,"Wendigo",41);
        //serie1T1E2.nombre = "Wendigo";
        //serie1T1E2.numero = 2;
        //serie1T1E2.duracionEnMinutos = 41;

        serie1T1.getEpisodios().add(ep);

        ep = new Episodio(3,"Dead in the Water",43);
        //serie1T1E3.nombre = "Dead in the Water";
        //serie1T1E3.numero = 3;
        //serie1T1E3.duracionEnMinutos = 43;

        serie1T1.getEpisodios().add(ep);

        ep = new Episodio(1,"In My Time of Dying",46);
        //serie1T2E1.nombre = "In My Time of Dying";
        //serie1T2E1.numero = 1;
        //serie1T2E1.duracionEnMinutos = 46;

        serie1T2.getEpisodios().add(ep);

        ep = new Episodio(2,"Everybody Loves a Clown",42);
        //serie1T2E2.nombre = "Everybody Loves a Clown";
        //serie1T2E2.numero = 2;
        //serie1T2E2.duracionEnMinutos = 42;

        serie1T2.getEpisodios().add(ep);

        ep = new Episodio(3,"Bloodlust",44);
        //serie1T2E3.nombre = "Bloodlust";
        //serie1T2E3.numero = 3;
        //serie1T2E3.duracionEnMinutos = 44;

        serie1T2.getEpisodios().add(ep);

        Websodio webi = new Websodio(44,"GYork+Angel_102311.m4v",11,"https://www.youtube.com/watch?v=SBod5vxOCyE");
        //webi.nombre = "GYork+Angel_102311.m4v";
        //webi.numero = 44;
        //webi.duracionEnMinutos = 11;
        //webi.url = "https://www.youtube.com/watch?v=SBod5vxOCyE";

        serie1T2.getEpisodios().add(webi);

        this.series.add(serie1);

    }

    public void inicializarBokuNoHero() {

        Serie serie2 = new Serie("My Hero Academia",2016);
        //serie2.setNombre("My Hero Academia");

        Actor voiceactor1 = new Actor();
        voiceactor1.setNombre("Akeno Watanabe");
        voiceactor1.setEdad(37);

        Actor voiceactor2 = new Actor();
        voiceactor2.setNombre("Kenta Miyake");
        voiceactor2.setEdad(42);

        serie2.getElenco().add(voiceactor1);
        serie2.getElenco().add(voiceactor2);

        Clasificacion clasificacion = new Clasificacion("TV-14",14);
        //clasificacion.setDescripcion("Mayores de 14");
        //clasificacion.setEdadMin(14);
        //clasificacion.setTipo("TV-14");

        serie2.setClasificacion(clasificacion);

        serie2.setCalificacion(8.9);

        Genero genero = new Genero("Anime");
        //genero.setNombre("Anime");
        serie2.setGenero(genero);

        serie2.setDescripcion("The story follows Izuku Midoriya, a boy born without superpowers in a world where they are the norm, but who still dreams of becoming a superhero himself, and is scouted by the world's greatest hero who shares his powers with Izuku after recognizing his value and enrolls him in a high school for heroes in training.");

        Temporada serie2T1 = new Temporada(1,2016);
        //serie2T1.setNumero(1);
        //serie2T1.setAnio(2016);
        Temporada serie2T2 = new Temporada(2,2017);
        //serie2T2.setNumero(2);
        //serie2T2.setAnio(2017);

        serie2.getTemporada().add(serie2T1);
        serie2.getTemporada().add(serie2T2);

        Episodio epi = new Episodio(1,"Izuku Midoriya: Origin",25);
        //serie2T1E1.nombre = "Izuku Midoriya: Origin";
        //serie2T1E1.numero = 1;
        //serie2T1E1.duracionEnMinutos = 25;

        serie2T1.getEpisodios().add(epi);

        epi = new Episodio(2,"What It Takes to Be a Hero",24);
        //serie2T1E2.nombre = "What It Takes to Be a Hero";
        //serie2T1E2.numero = 2;
        //serie2T1E2.duracionEnMinutos = 24;

        serie2T1.getEpisodios().add(epi);

        epi = new Episodio(3,"Roaring Muscles",25);
        //serie2T1E3.nombre = "Roaring Muscles";
        //serie2T1E3.numero = 3;
        //serie2T1E3.duracionEnMinutos = 25;

        serie2T1.getEpisodios().add(epi);

        epi = new Episodio(1,"Hero Notebook",24);
        //serie2T2E1.nombre = "Hero Notebook";
        //serie2T2E1.numero = 1;
        //serie2T2E1.duracionEnMinutos = 24;

        serie2T1.getEpisodios().add(epi);

        epi = new Episodio(2,"That's the Idea, Ochaco",25);
        //serie2T2E2.nombre = "That's the Idea, Ochaco";
        //serie2T2E2.numero = 2;
        //serie2T2E2.duracionEnMinutos = 25;

        serie2T2.getEpisodios().add(epi);

        epi = new Episodio(3,"Roaring Sports Festival",23);
        //serie2T2E3.nombre = "Roaring Sports Festival";
        //serie2T2E3.numero = 3;
        //serie2T2E3.duracionEnMinutos = 23;

        serie2T2.getEpisodios().add(epi);

        this.series.add(serie2);

    }

    public void inicializarDark() {

        Serie serie3 = new Serie("Dark",2017);
        serie3.setNombre("Dark");

        Actor actor01 = new Actor();
        actor01.setNombre("Louis Hofmann");
        actor01.setEdad(22);

        Actor actor02 = new Actor();
        actor02.setNombre("Andreas Pietschmann");
        actor02.setEdad(51);

        serie3.getElenco().add(actor01);
        serie3.getElenco().add(actor02);

        Clasificacion clasificacion = new Clasificacion("TV-MA",18);
        //clasificacion.setDescripcion("Mayores de 18");
        //clasificacion.setEdadMin(18);
        //clasificacion.setTipo("TV-MA");

        serie3.setClasificacion(clasificacion);

        serie3.setCalificacion(8.8);

        Genero genero = new Genero("Thriller");
        //genero.setNombre("Thriller");
        serie3.setGenero(genero);

        serie3.setDescripcion("Dark concerns the aftermath of a child's disappearance which exposes the secrets of, and hidden connections among, four estranged families as they slowly unravel a sinister time travel conspiracy which spans three generations. Throughout the series, Dark explores the existential implications of time and its effects upon human nature.");

        Temporada serie3T1 = new Temporada(1,2017);
        //serie3T1.setNumero(1);
        //serie3T1.setAnio(2017);
        Temporada serie3T2 = new Temporada(2,2019);
        //serie3T2.setNumero(2);
        //serie3T2.setAnio(2019);

        serie3.getTemporada().add(serie3T1);
        serie3.getTemporada().add(serie3T2);

        Episodio epi = new Episodio(1,"Secrets",51);
        //serie3T1E1.nombre = "Secrets";
        //serie3T1E1.numero = 1;
        //serie3T1E1.duracionEnMinutos = 51;

        serie3T1.getEpisodios().add(epi);

        epi = new Episodio(2,"Lies",44);
        //serie3T1E2.nombre = "Lies";
        //serie3T1E2.numero = 2;
        //serie3T1E2.duracionEnMinutos = 44;

        serie3T1.getEpisodios().add(epi);

        epi = new Episodio(3,"Past and Present",45);
        //serie3T1E3.nombre = "Past and Present";
        //serie3T1E3.numero = 3;
        //serie3T1E3.duracionEnMinutos = 45;

        serie3T1.getEpisodios().add(epi);

        epi = new Episodio(1,"Beginnings and Endings",53);
        //serie3T2E1.nombre = "Beginnings and Endings";
        //serie3T2E1.numero = 1;
        //serie3T2E1.duracionEnMinutos = 53;

        serie3T1.getEpisodios().add(epi);

        epi = new Episodio(2,"Dark Matter",54);
        //serie3T2E2.nombre = "Dark Matter";
        //serie3T2E2.numero = 2;
        //serie3T2E2.duracionEnMinutos = 54;

        serie3T2.getEpisodios().add(epi);

        epi = new Episodio(3,"Ghosts",56);
        //serie3T2E3.nombre = "Ghosts";
        //serie3T2E3.numero = 3;
        //serie3T2E3.duracionEnMinutos = 56;

        serie3T2.getEpisodios().add(epi);

        this.series.add(serie3);

    }

}