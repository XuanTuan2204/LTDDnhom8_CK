package com.example.nhom8_ltdd_ck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Excute extends AppCompatActivity {

    private Button btnhoantat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoantat);
        btnhoantat = (Button) findViewById(R.id.btn_hoantat);
        btnhoantat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Excute.this, HomeMain.class);
                startActivity(intent);
            }
        });


    }
}