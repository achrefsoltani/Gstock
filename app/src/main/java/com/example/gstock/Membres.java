package com.example.gstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Membres extends AppCompatActivity {

    ListView _lsvMembres;
    Button _btnDeconnexion,_btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membres);

        _btnDeconnexion = (Button) findViewById(R.id.btnDeco);
        _btnRetour = (Button) findViewById(R.id.btnRetour);
        _lsvMembres = (ListView) findViewById(R.id.lsvMembres);

        final ArrayList<membre> membres = new ArrayList<membre>();
        membres.add(new membre("Soltani","Achref","achref.soltani@gmail.com",99777444,R.drawable.membre));
        membres.add(new membre("Hammami","Khouloud","hammamikh95@gmail.com",98111222,R.drawable.membre));

        //AdaptateurMembre adaptmembre = new AdaptateurMembre(this, membres);
        //_lsvMembres.setAdapter(adaptmembre);


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