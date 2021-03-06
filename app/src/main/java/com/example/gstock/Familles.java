package com.example.gstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Familles extends AppCompatActivity {

    ListView _lsvFamilles;
    Button _btnFamille;
    Button _btnDeconnexion,_btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familles);

        _lsvFamilles = (ListView) findViewById(R.id.lsvFamilles);
        _btnDeconnexion = (Button) findViewById(R.id.btnDeco);
        _btnRetour = (Button) findViewById(R.id.btnRetour);

        final ArrayList<famille> familles = new ArrayList<famille>();
        familles.add(new famille("Circuits",R.drawable.onef));
        familles.add(new famille("Moteurs",R.drawable.twof));



        AdaptateurFamille adaptfamille = new AdaptateurFamille(this,familles);
        _lsvFamilles.setAdapter(adaptfamille);

        _lsvFamilles.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                Intent appInfo = new Intent(getApplicationContext(), Composants.class);
                startActivity(appInfo);
            }
        });

        _btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Home.class);
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