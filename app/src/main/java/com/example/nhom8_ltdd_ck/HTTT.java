package com.example.nhom8_ltdd_ck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HTTT extends AppCompatActivity {

    private Button btn_TTTT,btn_TTTT1,btn_TTTT2;
    private Button btn_backTT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.httt);
        btn_TTTT = (Button) findViewById(R.id.btn_tttt);
        btn_TTTT1 = (Button) findViewById(R.id.btn_ttairpay);
        btn_TTTT2 = (Button) findViewById(R.id.btn_ttquathe);
        btn_backTT = (Button) findViewById(R.id.btn_back4);
        btn_TTTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HTTT.this, Excute.class);
                startActivity(intent);
            }
        });
        btn_TTTT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HTTT.this, Excute.class);
                startActivity(intent);
            }
        });
        btn_TTTT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HTTT.this, Excute.class);
                startActivity(intent);
            }
        });
        btn_backTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HTTT.this, THANHTOAN.class);
                startActivity(intent);
            }
        });
    }
}

