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

public class AdaptateurFamille extends ArrayAdapter<famille> {

    public AdaptateurFamille(@NonNull Context context, ArrayList<famille> familles) {
        super(context,0, familles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View lsvElementView = convertView;
        if (lsvElementView == null){
            lsvElementView = LayoutInflater.from(getContext()).inflate(R.layout.elementfamille,parent,false);
        }
        famille familleCourante = getItem(position);

        TextView nomFTextView = (TextView) lsvElementView.findViewById(R.id.txtnomf);
        nomFTextView.setText(familleCourante.get_nomf());

        ImageView iconeView = (ImageView) lsvElementView.findViewById(R.id.imgf);

        if (familleCourante.AuneImage()){
            iconeView.setImageResource(familleCourante.get_ImageRessourceId());
        } else {
            iconeView.setVisibility(View.GONE);
        }
        return lsvElementView;
    }
}
