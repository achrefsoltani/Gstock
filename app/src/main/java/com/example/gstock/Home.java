package com.example.gstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button _btnChercher,_btnMembres,_btnFamilles,_btnEmprunts,_btnDeconnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        _btnChercher = (Button) findViewById(R.id.btnChercher);
        _btnFamilles = (Button) findViewById(R.id.btnFamilles);
        _btnMembres = (Button) findViewById(R.id.btnMembres);
        _btnEmprunts = (Button) findViewById(R.id.btnEmprunts);
        _btnDeconnexion = (Button) findViewById(R.id.btnDeconnexion);

        _btnChercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Recherche.class);
                startActivity(i);
            }
        });

        _btnFamilles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Familles.class);
                startActivity(i);
            }
        });

        _btnMembres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Membres.class);
                startActivity(i);
            }
        });

        _btnEmprunts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Emprunts.class);
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