package mx.edu.utng.ovni;

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
public class OvniAdapter extends ArrayAdapter<Ovni> {

    public OvniAdapter(Context context, ArrayList<Ovni>ovnis){super(context,0,ovnis);}

    public View getView(int position, View convertView, ViewGroup parent){

        Ovni ovni = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.ovni,parent,false);
        }

        TextView txtOvni = (TextView)convertView.findViewById(R.id.txv_ovni);
        txtOvni.setText(ovni.getNombre()+ " " +ovni.getOrigen()+ " "+ ovni.getPeso());

        return convertView;
    }

}
