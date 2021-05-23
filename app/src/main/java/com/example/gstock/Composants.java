package com.example.gstock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Composants extends AppCompatActivity {

    ListView _lsvComposants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composants);

        _lsvComposants = (ListView) findViewById(R.id.lsvcomposants);

        final ArrayList<composant> composants = new ArrayList<composant>();
        composants.add(new composant("x",null,10,"11/05/2021",R.drawable.onec ));
        composants.add(new composant("y",null,10,"20/05/2021",R.drawable.twoc ));



        AdaptateurComposant adaptcomposant = new AdaptateurComposant(this,composants);
        _lsvComposants.setAdapter(adaptcomposant);
    }
}