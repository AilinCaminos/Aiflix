package app;

import java.util.ArrayList;
import java.util.List;

public class Aiflix {

    public List<Pelicula> pelicula = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
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

        Serie serie1 = new Serie();
        serie1.nombre = "Supernatural";

        Actor actor1 = new Actor();
        actor1.nombre = "Jared Padalecki";
        actor1.edad = 37;

        Actor actor2 = new Actor();
        actor2.nombre = "Jensen Ackles";
        actor2.edad = 42;

        serie1.elenco.add(actor1);
        serie1.elenco.add(actor2);

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.descripcion = "Mayores de 18";
        clasificacion.edadMin = 18;
        clasificacion.tipo = "Mayores";

        serie1.clasificacion = clasificacion;

        serie1.calificacion = 8.4;

        Genero genero = new Genero();
        genero.nombre = "Urban Fantasy";
        serie1.genero = genero;

        serie1.descripcion = "Two brothers follow their father's footsteps as hunters, fighting evil supernatural beings of many kinds, including monsters, demons and gods that roam the earth.";

        Temporada serie1T1 = new Temporada();
        serie1T1.numero = 1;
        serie1T1.anio = 2005;
        Temporada serie1T2 = new Temporada();
        serie1T2.numero = 2;
        serie1T2.anio = 2006;

        serie1.temporada.add(serie1T1);
        serie1.temporada.add(serie1T2);

        Episodio serie1T1E1 = new Episodio();
        serie1T1E1.nombre = "Pilot";
        serie1T1E1.numero = 1;
        serie1T1E1.duracionEnMinutos = 45;

        serie1T1.episodios.add(serie1T1E1);

        Episodio serie1T1E2 = new Episodio();
        serie1T1E2.nombre = "Wendigo";
        serie1T1E2.numero = 2;
        serie1T1E2.duracionEnMinutos = 41;

        serie1T1.episodios.add(serie1T1E2);

        Episodio serie1T1E3 = new Episodio();
        serie1T1E3.nombre = "Dead in the Water";
        serie1T1E3.numero = 3;
        serie1T1E3.duracionEnMinutos = 43;

        serie1T1.episodios.add(serie1T1E3);

        Episodio serie1T2E1 = new Episodio();
        serie1T2E1.nombre = "In My Time of Dying";
        serie1T2E1.numero = 1;
        serie1T2E1.duracionEnMinutos = 46;

        serie1T2.episodios.add(serie1T2E1);

        Episodio serie1T2E2 = new Episodio();
        serie1T2E2.nombre = "Everybody Loves a Clown";
        serie1T2E2.numero = 2;
        serie1T2E2.duracionEnMinutos = 42;

        serie1T2.episodios.add(serie1T2E2);

        Episodio serie1T2E3 = new Episodio();
        serie1T2E3.nombre = "Bloodlust";
        serie1T2E3.numero = 3;
        serie1T2E3.duracionEnMinutos = 44;

        serie1T2.episodios.add(serie1T2E3);

        Websodio webi = new Websodio();
        webi.nombre = "GYork+Angel_102311.m4v";
        webi.numero = 44;
        webi.duracionEnMinutos = 11;
        webi.url = "https://www.youtube.com/watch?v=SBod5vxOCyE";

        serie1T2.episodios.add(webi);

        this.series.add(serie1);

    }

    public void inicializarBokuNoHero() {

        Serie serie2 = new Serie();
        serie2.nombre = "My Hero Academia";

        Actor voiceactor1 = new Actor();
        voiceactor1.nombre = "Akeno Watanabe";
        voiceactor1.edad = 37;

        Actor voiceactor2 = new Actor();
        voiceactor2.nombre = "Kenta Miyake";
        voiceactor2.edad = 42;

        serie2.elenco.add(voiceactor1);
        serie2.elenco.add(voiceactor2);

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.descripcion = "Mayores de 12";
        clasificacion.edadMin = 12;
        clasificacion.tipo = "Menores";

        serie2.clasificacion = clasificacion;

        serie2.calificacion = 8.9;

        Genero genero = new Genero();
        genero.nombre = "Anime";
        serie2.genero = genero;

        serie2.descripcion = "The story follows Izuku Midoriya, a boy born without superpowers in a world where they are the norm, but who still dreams of becoming a superhero himself, and is scouted by the world's greatest hero who shares his powers with Izuku after recognizing his value and enrolls him in a high school for heroes in training.";

        Temporada serie2T1 = new Temporada();
        serie2T1.numero = 1;
        serie2T1.anio = 2016;
        Temporada serie2T2 = new Temporada();
        serie2T2.numero = 2;
        serie2T2.anio = 2017;

        serie2.temporada.add(serie2T1);
        serie2.temporada.add(serie2T2);

        Episodio serie2T1E1 = new Episodio();
        serie2T1E1.nombre = "Izuku Midoriya: Origin";
        serie2T1E1.numero = 1;
        serie2T1E1.duracionEnMinutos = 25;

        serie2T1.episodios.add(serie2T1E1);

        Episodio serie2T1E2 = new Episodio();
        serie2T1E2.nombre = "What It Takes to Be a Hero";
        serie2T1E2.numero = 2;
        serie2T1E2.duracionEnMinutos = 24;

        serie2T1.episodios.add(serie2T1E2);

        Episodio serie2T1E3 = new Episodio();
        serie2T1E3.nombre = "Roaring Muscles";
        serie2T1E3.numero = 3;
        serie2T1E3.duracionEnMinutos = 25;

        serie2T1.episodios.add(serie2T1E3);

        Episodio serie2T2E1 = new Episodio();
        serie2T2E1.nombre = "Hero Notebook";
        serie2T2E1.numero = 1;
        serie2T2E1.duracionEnMinutos = 24;

        serie2T1.episodios.add(serie2T2E1);

        Episodio serie2T2E2 = new Episodio();
        serie2T2E2.nombre = "That's the Idea, Ochaco";
        serie2T2E2.numero = 2;
        serie2T2E2.duracionEnMinutos = 25;

        serie2T2.episodios.add(serie2T2E2);

        Episodio serie2T2E3 = new Episodio();
        serie2T2E3.nombre = "Roaring Sports Festival";
        serie2T2E3.numero = 3;
        serie2T2E3.duracionEnMinutos = 23;

        serie2T2.episodios.add(serie2T2E3);

        this.series.add(serie2);

    }

    public void inicializarDark() {

        Serie serie3 = new Serie();
        serie3.nombre = "Dark";

        Actor actor01 = new Actor();
        actor01.nombre = "Louis Hofmann";
        actor01.edad = 22;

        Actor actor02 = new Actor();
        actor02.nombre = "Andreas Pietschmann";
        actor02.edad = 51;

        serie3.elenco.add(actor01);
        serie3.elenco.add(actor02);

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.descripcion = "Mayores de 18";
        clasificacion.edadMin = 18;
        clasificacion.tipo = "Mayores";

        serie3.clasificacion = clasificacion;

        serie3.calificacion = 8.8;

        Genero genero = new Genero();
        genero.nombre = "Thriller";
        serie3.genero = genero;

        serie3.descripcion = "Dark concerns the aftermath of a child's disappearance which exposes the secrets of, and hidden connections among, four estranged families as they slowly unravel a sinister time travel conspiracy which spans three generations. Throughout the series, Dark explores the existential implications of time and its effects upon human nature.";

        Temporada serie3T1 = new Temporada();
        serie3T1.numero = 1;
        serie3T1.anio = 2017;
        Temporada serie3T2 = new Temporada();
        serie3T2.numero = 2;
        serie3T2.anio = 2019;

        serie3.temporada.add(serie3T1);
        serie3.temporada.add(serie3T2);

        Episodio serie3T1E1 = new Episodio();
        serie3T1E1.nombre = "Secrets";
        serie3T1E1.numero = 1;
        serie3T1E1.duracionEnMinutos = 51;

        serie3T1.episodios.add(serie3T1E1);

        Episodio serie3T1E2 = new Episodio();
        serie3T1E2.nombre = "Lies";
        serie3T1E2.numero = 2;
        serie3T1E2.duracionEnMinutos = 44;

        serie3T1.episodios.add(serie3T1E2);

        Episodio serie3T1E3 = new Episodio();
        serie3T1E3.nombre = "Past and Present";
        serie3T1E3.numero = 3;
        serie3T1E3.duracionEnMinutos = 45;

        serie3T1.episodios.add(serie3T1E3);

        Episodio serie3T2E1 = new Episodio();
        serie3T2E1.nombre = "Beginnings and Endings";
        serie3T2E1.numero = 1;
        serie3T2E1.duracionEnMinutos = 53;

        serie3T1.episodios.add(serie3T2E1);

        Episodio serie3T2E2 = new Episodio();
        serie3T2E2.nombre = "Dark Matter";
        serie3T2E2.numero = 2;
        serie3T2E2.duracionEnMinutos = 54;

        serie3T2.episodios.add(serie3T2E2);

        Episodio serie3T2E3 = new Episodio();
        serie3T2E3.nombre = "Ghosts";
        serie3T2E3.numero = 3;
        serie3T2E3.duracionEnMinutos = 56;

        serie3T2.episodios.add(serie3T2E3);

        this.series.add(serie3);

    }

}