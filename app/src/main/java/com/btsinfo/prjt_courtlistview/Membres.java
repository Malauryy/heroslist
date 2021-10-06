package com.btsinfo.prjt_courtlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Membres extends AppCompatActivity {

    ListView lvListMembre;
    ArrayList<Superh> listeMembre;
    Superh m1 = new Superh(1,1,"Captain America", "C'est un mec chaud","avengers/capamerica.png");
    Superh m2 = new Superh(2,2, "aquaman","il va dans l'eau","jla/aquaman.png");
    Superh m3 = new Superh(3,3,"angel","cet homme est inconu au bataillon c'est qui ?", "xmen/angel.png");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membres);

        lvListMembre = (ListView)findViewById(R.id.lvListeMembre);
        listeMembre = new ArrayList<Superh>();


        Intent intent = getIntent();
        int numEquipe = intent.getIntExtra("idE",0);

        if (numEquipe == 1){
            listeMembre.add(m1);
        }
        if(numEquipe == 2){
            listeMembre.add(m2);
        }
        if(numEquipe == 3){
            listeMembre.add(m3);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        ListeAdapterSuper listeAdapterSuper = new ListeAdapterSuper(this, listeMembre);
        lvListMembre.setAdapter(listeAdapterSuper);
    }
}