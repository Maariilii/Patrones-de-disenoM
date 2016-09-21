package mx.edu.utng.singletonmarcas;

/**
 * Created by ELENA on 12/09/2016.
 */
public class Marcas {
private  static Marcas unicaInstancia;
    private String NombreMarcas;


    private Marcas(){this.NombreMarcas = "  ";

    }

    public void setNombreMarcas(String NombreMarcas){this.NombreMarcas = NombreMarcas;}
    public  String getNombreMarcas(){return NombreMarcas;}

    public static Marcas getUnicaInstancia(){
        if (unicaInstancia == null){
            unicaInstancia = new Marcas();
        }
        return  unicaInstancia;
    }



}
