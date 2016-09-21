package mx.edu.utng.ovni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtOrigen;
    private EditText edtPeso;
    private Button btnClonar;
    private GridView grvOvni;
    private ArrayList<Ovni>ovnis;
    private Ovni ovni;
    private OvniAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = (EditText)findViewById(R.id.edt_nombre);
        edtOrigen = (EditText)findViewById(R.id.edt_origen);
        edtPeso = (EditText)findViewById(R.id.edt_peso);

        btnClonar = (Button)findViewById(R.id.btn_clonar);

        grvOvni = (GridView)findViewById(R.id.grv_ovni);

        ovnis = new ArrayList<Ovni>();
        ovni = new Ovni();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ovni.setNombre(edtNombre.getText().toString());
                ovni.setOrigen(edtOrigen.getText().toString());
                ovni.setPeso(
                        Float.parseFloat(
                                edtPeso.getText().toString()));
                Ovni clon = (Ovni)ovni.clonar();
                ovnis.add(clon);

                adapter = new OvniAdapter(MainActivity.this,(ArrayList)ovnis);
                grvOvni.setAdapter(adapter);

            }
        });
    }
}
