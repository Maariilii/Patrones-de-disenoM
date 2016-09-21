package mx.edu.utng.paises;

/**
 * Created by ELENA on 12/09/2016.
 */
public class Pais {
    private static Pais unicaInstancia;
    private String NombrePais;

    private Pais() {
        this.NombrePais = "";

    }

    public void setNombrePais(String NombrePais){this.NombrePais = NombrePais;}
    public String getNombrePais (){return NombrePais;}

    public static Pais getUnicaInstancia(){
        if (unicaInstancia == null){
            unicaInstancia = new Pais();
        }
        return  unicaInstancia;
    }

}
