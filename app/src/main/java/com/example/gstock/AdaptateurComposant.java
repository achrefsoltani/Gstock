package com.example.gstock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptateurComposant extends ArrayAdapter<composant> {

    public AdaptateurComposant(@NonNull Context context, ArrayList<composant> composants) {
        super(context, 0, composants);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View lsvElementView = convertView;
        if (lsvElementView == null){
            lsvElementView = LayoutInflater.from(getContext()).inflate(R.layout.elementcomposant,parent,false);
        }
        composant composantcourant = getItem(position);

        TextView nomTextView = (TextView) lsvElementView.findViewById(R.id.txtnom);
        nomTextView.setText(composantcourant.get_nomc());
        TextView dateTextView = (TextView) lsvElementView.findViewById(R.id.txtdate);
        dateTextView.setText(composantcourant.get_dateacquisition());
        TextView quantiteTextView = (TextView) lsvElementView.findViewById(R.id.txtquantite);
        quantiteTextView.setText(Integer.toString(composantcourant.get_quantite()));

        ImageView iconeView = (ImageView) lsvElementView.findViewById(R.id.imgf);

        if (composantcourant.AuneImage()){
            iconeView.setImageResource(composantcourant.get_ImageRessourceId());
        } else {
            iconeView.setVisibility(View.GONE);
        }
        return lsvElementView;
    }
}
