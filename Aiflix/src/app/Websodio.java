package app;

public class Websodio extends Episodio {

    public Websodio(int numero,String nombre,int duracionEnMinutos,String url){
        
        super(numero,nombre,duracionEnMinutos);

        this.url = url;
    }

    private String url;

    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    @Override /// Anotacion que indica que el metodo se sobre escribe(redefinicion)
    public void reproducir(){
        super.reproducir();
        System.out.println("Se esta reproduciendo el websodio numero " + this.getNumero() + " " + this.getNombre() + " url: " + this.getUrl());
        
    }
        /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.getUrl());
    }


}