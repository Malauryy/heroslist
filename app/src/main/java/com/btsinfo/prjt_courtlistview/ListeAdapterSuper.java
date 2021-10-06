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


public class ListeAdapterSuper extends ArrayAdapter<Superh> {
    Context context;

    public ListeAdapterSuper(@NonNull Context context, List<Superh> listeMembre) {
        super(context, -1, listeMembre);
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        Superh unmembre;
        view=null;

        if(convertView==null) {

            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = layoutInflater.inflate(R.layout.ligne2,parent,false);
        }
        else {
            view = convertView;
        }

        unmembre = getItem(position);
        TextView tv_nom = (TextView) view.findViewById(R.id.tv_nom);
        TextView tv_desc = (TextView) view.findViewById(R.id.tv_desc);
        ImageView img_img = (ImageView) view.findViewById(R.id.img_img);

        tv_nom.setText(unmembre.getNomM());
        tv_desc.setText(unmembre.getDescM());

        AssetManager manager = context.getAssets();
        InputStream open = null;

        try {

            open = manager.open(unmembre.getImgM());
            Bitmap bitmap = BitmapFactory.decodeStream(open);
            img_img.setImageBitmap(bitmap);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return view;
    }




}


