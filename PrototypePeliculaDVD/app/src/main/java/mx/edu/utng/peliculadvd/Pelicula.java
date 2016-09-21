package mx.edu.utng.peliculadvd;

/**
 * Created by ELENA on 12/09/2016.
 */
public class Pelicula implements Clonable {
    private String titulo;
    private String genero;
    private float peso;

    public Pelicula(){
        this.titulo = "";
        this.genero = "";
        this.peso = 0.0f;

    }

    public Pelicula(String titulo, String genero, float peso ){
        this.titulo = titulo;
        this.genero = genero;
        this.peso = peso;
    }


    public Clonable clonar(){
        Pelicula clon = new Pelicula();
        clon.setTitulo(titulo);
        clon.setGenero(genero);
        clon.setPeso(peso);
        return clon;
    }


    public String getTitulo() {
        return titulo;}

    public String getGenero() {
        return genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
