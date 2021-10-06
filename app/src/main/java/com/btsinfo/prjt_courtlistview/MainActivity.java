package com.btsinfo.prjt_courtlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Equipe> listeEquipe;

    Equipe e1 = new Equipe(1,"avengers","Super héros Marvel","avengers/Avengers.jpg");
    Equipe e2 = new Equipe(2,"JLA","Super héros DC","jla/jla.png");
    Equipe e3 = new Equipe(3,"xmen","Super héros MUtant","xmen/xmen.png");

    ListView lvliste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeEquipe = new ArrayList<Equipe>();
        listeEquipe.add(e1);
        listeEquipe.add(e2);
        listeEquipe.add(e3);
        lvliste = (ListView) findViewById(R.id.lvVisite1);

        lvliste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startViewActivity(i);

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        ListeAdapter listeAdapter = new ListeAdapter(this, listeEquipe);
        lvliste.setAdapter(listeAdapter);

    }

    /* on récupère l'id de l'equipe */
    private void startViewActivity(int i){
        Equipe uneEquipe = listeEquipe.get(i);
        Intent intent = new Intent(this,Membres.class);
        intent.putExtra("idE", uneEquipe.getIdE());
        startActivity(intent);
    }
}