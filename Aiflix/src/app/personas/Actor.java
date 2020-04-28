package app.personas;

import java.util.List;

import app.INominable;

public class Actor extends Persona implements INominable {

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        // TODO Auto-generated method stub
        System.out.println("Reproduciendo escenas mas memorables de " + this.getNombre());

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

    public void decirDiscurso() {
        System.out.println("Quiero agradecer a todos los que hicieron esto posible");
    }

}