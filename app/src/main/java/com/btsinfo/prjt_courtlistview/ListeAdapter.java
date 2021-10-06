package com.btsinfo.prjt_courtlistview;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ListeAdapter extends ArrayAdapter<Equipe> {
    Context context;

    public ListeAdapter(@NonNull Context context, List<Equipe> listeEquipe) {
        super(context, -1, listeEquipe);

        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        Equipe uneEquipe;
        view=null;

        if(convertView==null) {

            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = layoutInflater.inflate(R.layout.ligne,parent,false);
        }
        else {
            view = convertView;
        }

        uneEquipe = getItem(position);
        TextView tv_titre = (TextView) view.findViewById(R.id.tv_titre);
        TextView tv_desc = (TextView) view.findViewById(R.id.tv_desc);
        ImageView img1 = (ImageView) view.findViewById(R.id.img1);

        tv_titre.setText(uneEquipe.getNomE());
        tv_desc.setText(uneEquipe.getDescE());

        AssetManager manager = context.getAssets();
        InputStream open = null;

        try {

            open = manager.open(uneEquipe.getImgE());
            Bitmap bitmap = BitmapFactory.decodeStream(open);
            img1.setImageBitmap(bitmap);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return view;
    }
}
