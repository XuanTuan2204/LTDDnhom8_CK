package com.example.nhom8_ltdd_ck;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class TTKH extends AppCompatActivity implements View.OnClickListener{

    ImageButton imDatePicker1, imDatePicker2,imDatePicker3;
    EditText ed1,ed2,ed3;
    private Button btn_TT1,btn_back1;
    private int mYear, mMonth, mDay, mHour, mMinute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttkh);
        imDatePicker1 = (ImageButton) findViewById(R.id.ngaylon);
        imDatePicker2 = (ImageButton) findViewById(R.id.ngaytreem);
        imDatePicker3 = (ImageButton) findViewById(R.id.ngayembe);
        ed1=(EditText)findViewById(R.id.et_nslon);
        ed2=(EditText)findViewById(R.id.et_nstreem);
        ed3=(EditText)findViewById(R.id.et_nsembe);
        imDatePicker1.setOnClickListener(this);
        imDatePicker2.setOnClickListener(this);
        imDatePicker3.setOnClickListener(this);

        btn_TT1 = (Button) findViewById(R.id.btn_tieptuc1);
        btn_back1 = (Button) findViewById(R.id.btn_cancel1);
        btn_TT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TTKH.this, THANHTOAN.class);
                startActivity(intent);
            }
        });
        btn_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TTKH.this, TTLH.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onClick(View v) {
        if (v == imDatePicker1) {
            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            ed1.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == imDatePicker2) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            ed2.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == imDatePicker3) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            ed3.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
    }
}