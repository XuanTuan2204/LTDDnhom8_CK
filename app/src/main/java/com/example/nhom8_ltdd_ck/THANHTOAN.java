package com.example.nhom8_ltdd_ck;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class THANHTOAN extends AppCompatActivity {

    private Button btnthanhtoan,btn_back3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan);
        btnthanhtoan = (Button) findViewById(R.id.btn_thanhtoan);
        btn_back3 = (Button) findViewById(R.id.btn_cancel3);
        btnthanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(THANHTOAN.this, HTTT.class);
                startActivity(intent);
            }
        });
        btn_back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(THANHTOAN.this, TTKH.class);
                startActivity(intent);
            }
        });
    }
}