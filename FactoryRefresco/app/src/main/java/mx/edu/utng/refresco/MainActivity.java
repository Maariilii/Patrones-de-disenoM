package mx.edu.utng.refresco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    private ImageView fondo;
    private Button pepsi,peñafiel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fondo = (ImageView)findViewById(R.id.fondo);
        pepsi = (Button)findViewById(R.id.pepsi);
        peñafiel = (Button)findViewById(R.id.penafiel);
        peñafiel.setOnClickListener(this);
        pepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setImageResource(R.drawable.pepsi);
            }
        });
    }
    public void mieventoclick(View view){

        fondo.setImageResource(R.drawable.coca);

    }
    public void onClick(View view){fondo.setImageResource(R.drawable.pepsi);}
}
