package mx.edu.utng.paises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private Button btn_crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = (EditText)findViewById(R.id.edtNombre);
        btn_crear = (Button)findViewById(R.id.btn_crear);

        btn_crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pais pais = Pais.getUnicaInstancia();
                pais.setNombrePais(edtNombre.getText().toString());

                Toast.makeText(MainActivity.this,"Nombre Pais " + pais.getNombrePais(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
