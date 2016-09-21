package mx.edu.utng.artista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    private ImageView fondo;
    private Button jakeBugg,bts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fondo = (ImageView) findViewById(R.id.fondo);
        jakeBugg=(Button)findViewById(R.id.jake_bugg);
        bts =(Button)findViewById(R.id.bts);
        bts.setOnClickListener(this);
        jakeBugg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fondo.setImageResource(R.drawable.jake);
            }
        });
    }


    public void mieventoclick(View view) {

        fondo.setImageResource(R.drawable.grimes);
    }

    @Override
    public void onClick(View v) {
        fondo.setImageResource(R.drawable.bts);
    }
}
