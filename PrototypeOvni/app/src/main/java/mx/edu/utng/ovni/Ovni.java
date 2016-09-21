package mx.edu.utng.ovni;

/**
 * Created by ELENA on 12/09/2016.
 */
public class Ovni implements Clonable {
    private String nombre;
    private String origen;
    private float peso;

    public Ovni(){
        this.nombre = "";
        this.origen = "";
        this.peso = 0.0f;
    }
    public Ovni(String nombre,String origen,float peso){
        this.nombre = nombre;
        this.origen = origen;
        this.peso = peso;
    }

    public Clonable clonar(){
        Ovni clon = new Ovni();
        clon.setNombre (nombre);
        clon.setOrigen (origen);
        clon.setPeso(peso);
        return clon;

    }

    public String getNombre(){return nombre;}

    public String getOrigen(){return origen;}

    public float getPeso(){return peso;}

    public void setNombre(String nombre){this.nombre = nombre;}

    public void setOrigen(String origen){this.origen = origen;}

    public void setPeso(float peso ){this.peso = peso;}

}


