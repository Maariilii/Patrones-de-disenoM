package mx.edu.utng.peliculadvd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtTitulo;
    private EditText edtGenero;
    private EditText edtPeso;
    private Button btnClonar;
    private GridView grvPelicula;
    private ArrayList<Pelicula>peliculas;
    private Pelicula pelicula;
    private PeliculaAdapter adpater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       edtTitulo = (EditText)findViewById(R.id.edt_titulo);
        edtGenero = (EditText)findViewById(R.id.edt_genero);
        edtPeso = (EditText)findViewById(R.id.edt_peso);

        btnClonar = (Button)findViewById(R.id.btn_clonar);

        grvPelicula = (GridView)findViewById(R.id.grv_pelicula);

        peliculas = new ArrayList<Pelicula>();
        pelicula = new Pelicula();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pelicula.setTitulo(edtTitulo.getText().toString());
                pelicula.setGenero(edtGenero.getText().toString());
                pelicula.setPeso(
                        Float.parseFloat(
                                edtPeso.getText().toString()));
                Pelicula clon = (Pelicula)pelicula.clonar();
                peliculas.add(clon);

                adpater = new PeliculaAdapter(MainActivity.this,(ArrayList)peliculas);
                grvPelicula.setAdapter(adpater);





            }
        });



    }
}
