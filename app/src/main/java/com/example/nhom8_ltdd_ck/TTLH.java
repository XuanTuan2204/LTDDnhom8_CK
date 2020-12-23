package com.example.nhom8_ltdd_ck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TTLH extends AppCompatActivity {

    private Button btn_TT;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttlh);
        btn_TT = (Button) findViewById(R.id.btn_tieptuc);
        btn_back = (Button) findViewById(R.id.btn_cancel);
        btn_TT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TTLH.this, TTKH.class);
                startActivity(intent);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TTLH.this, DanhSachActivity.class);
                startActivity(intent);
            }
        });
    }
}

