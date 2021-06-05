package com.example.gstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Composants extends AppCompatActivity {

    ListView _lsvComposants;
    Button _btnDeconnexion,_btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composants);

        _lsvComposants = (ListView) findViewById(R.id.lsvcomposants);
        _btnDeconnexion = (Button) findViewById(R.id.btnDeco);
        _btnRetour = (Button) findViewById(R.id.btnRetour);

        final ArrayList<composant> composants = new ArrayList<composant>();
        composants.add(new composant("Circuits logiques",null,25,"01/03/2021",R.drawable.onec ));
        composants.add(new composant("Circuits electriques",null,25,"01/03/2021",R.drawable.onec ));
        composants.add(new composant("Circuits divers",null,50,"02/01/2021",R.drawable.onec ));



        AdaptateurComposant adaptcomposant = new AdaptateurComposant(this,composants);
        _lsvComposants.setAdapter(adaptcomposant);

        _btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Familles.class);
                startActivity(i);
            }
        });

        _btnDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}