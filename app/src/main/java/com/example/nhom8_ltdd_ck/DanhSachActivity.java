package com.example.nhom8_ltdd_ck;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DanhSachActivity extends AppCompatActivity {
    final String DATABASE_NAME = "Datvemaybay.sqlite";
    SQLiteDatabase database;

    ListView listView;
    ArrayList<Datve_data> list;
    Adapter_Datve adapter;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach);
        addControls();
        readData();

    }
    private void addControls() {
        listView = (ListView) findViewById(R.id.listView);
        list = new ArrayList<>();
        adapter = new Adapter_Datve(this, list);
        listView.setAdapter(adapter);
    }

    private void readData(){
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM Datve",null);
        list.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            String Noidi = cursor.getString(0);
            String Noive = cursor.getString(1);
            String Timestart = cursor.getString(2);
            String Timeend = cursor.getString(3);
            String Gia = cursor.getString(4);
            byte[] Image = cursor.getBlob(5);
            list.add(new Datve_data(Noidi, Noive, Timestart, Timeend, Gia, Image));
        }
        adapter.notifyDataSetChanged();
    }
}