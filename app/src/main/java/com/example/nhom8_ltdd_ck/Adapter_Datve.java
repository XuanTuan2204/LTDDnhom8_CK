package com.example.nhom8_ltdd_ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_Datve extends BaseAdapter{
    Activity context;
    ArrayList<Datve_data> list;
    Button btn_chon;
    LinearLayout ln1;

    public Adapter_Datve(Activity context, ArrayList<Datve_data> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.listview_row, null);
        btn_chon = row.findViewById(R.id.btn_chon);
        btn_chon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TTLH.class);
                context.startActivity(intent);
            }
        });
        ln1 = row.findViewById(R.id.btn_quatrang);
        ln1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TTLH.class);
                context.startActivity(intent);
            }
        });


        ImageView imgHinhDaiDien = (ImageView) row.findViewById(R.id.image);
        TextView noidi = (TextView) row.findViewById(R.id.noidi);
        TextView noive = (TextView) row.findViewById(R.id.noive);
        TextView timeend = (TextView) row.findViewById(R.id.timeend);
        TextView timestart = (TextView) row.findViewById(R.id.timestart);
        TextView gia = (TextView) row.findViewById(R.id.gia);


        final Datve_data datvedata = list.get(position);
        noidi.setText(datvedata.Noidi);
        noive.setText(datvedata.Noive);
        timeend.setText(datvedata.Timeend);
        timestart.setText(datvedata.Timestart);
        gia.setText(datvedata.Gia);

        Bitmap bmHinhDaiDien = BitmapFactory.decodeByteArray(datvedata.Image, 0, datvedata.Image.length);
        imgHinhDaiDien.setImageBitmap(bmHinhDaiDien);
        return row;
    }
}
