package mx.edu.utng.peliculadvd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ELENA on 12/09/2016.
 */
public class PeliculaAdapter extends ArrayAdapter<Pelicula> {

    public PeliculaAdapter(Context context, ArrayList<Pelicula>peliculas){super(context,0,peliculas);}

    public View getView(int position, View convertView, ViewGroup parent){

        Pelicula pelicula = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.pelicula,parent,false);
        }

        TextView txtPelicula = (TextView)convertView.findViewById(R.id.txv_pelicula);
        txtPelicula.setText(pelicula.getTitulo()+" "+pelicula.getGenero()+" "+pelicula.getPeso());

        return convertView;
    }

}
