package com.example.gstock;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.gstock.SharedHelper.sha256;

public class Recherche extends AppCompatActivity {

    Cursor cur;
    EditText _txtComposant;
    Button _btnDeconnexion,_btnRetour, _btnChercherC;
    SQLiteDatabase db;
    ListView _lsvComposantR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);

        _txtComposant = (EditText) findViewById(R.id.txtComposant);
        _btnDeconnexion = (Button) findViewById(R.id.btnDec);
        _btnRetour = (Button) findViewById(R.id.btnRetour);
        _btnChercherC = (Button) findViewById(R.id.btnChercherC);
        _lsvComposantR = (ListView) findViewById(R.id.lsvComposantR);

        // ouverture d'une connexion vers la base de données
        db = openOrCreateDatabase("Composants",MODE_PRIVATE,null);
        // Création de la table comptes
        db.execSQL("CREATE TABLE IF NOT EXISTS COMPTES (id integer primary key autoincrement, nom VARCHAR, famille VARCHAR, quantite INTEGER, dateacquisiton VARCHAR);");

        final ArrayList<composant> composants = new ArrayList<composant>();
        AdaptateurComposant adaptcomposant = new AdaptateurComposant(this,composants);
        _lsvComposantR.setAdapter(adaptcomposant);


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

        _btnChercherC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                composants.add(new composant("Circuits logiques",null,25,"01/03/2021",R.drawable.onec ));
                composants.add(new composant("Circuits electriques",null,25,"01/03/2021",R.drawable.onec ));
                composants.add(new composant("Circuits divers",null,50,"02/01/2021",R.drawable.onec ));
                _lsvComposantR.invalidateViews();
                _lsvComposantR.refreshDrawableState();


            }
        });
    }
}