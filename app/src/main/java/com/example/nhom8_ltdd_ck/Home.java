package com.example.nhom8_ltdd_ck;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Home extends AppCompatActivity implements View.OnClickListener{
    Button btnsearch;
    ImageButton imDatePicker1, imDatePicker2;
    EditText txtDate1, txtDate2,ednl,edte,edeb;
    Button t_nl,t_te,t_eb,c_nl,c_te,c_eb;
    private TextView tv_306;
    private Integer count_306 = 1,count2 = 1 ,count3 =1;
    private String val1,val2,val3;
    private int mYear, mMonth, mDay, mHour, mMinute;

    TextView tvhome, tvaccount, tvlogout;
    ListView lv;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        imDatePicker1=(ImageButton)findViewById(R.id.imtime1);
        imDatePicker2=(ImageButton) findViewById(R.id.imtime2);
        txtDate1=(EditText)findViewById(R.id.editTextDate1);
        txtDate2=(EditText)findViewById(R.id.editTextDate2);

        ednl = findViewById(R.id.edit_nl);
        edte = findViewById(R.id.edit_te);
        edeb = findViewById(R.id.edit_eb);
        t_nl = findViewById(R.id.btntrunl);
        t_te = findViewById(R.id.btntrute);
        t_eb = findViewById(R.id.btntrueb);
        c_nl = findViewById(R.id.btncongnl);
        c_te = findViewById(R.id.btncongte);
        c_eb = findViewById(R.id.btncongeb);
        c_nl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_306++;
                val1 = Integer.toString(count_306);
                ednl.setText(val1);

            }
        });

        t_nl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count_306--;
                val1 = Integer.toString(count_306);
                ednl.setText(val1);


            }
        });
        c_te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                val2 = Integer.toString(count2);
                edte.setText(val2);

            }
        });

        t_te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2--;
                val2 = Integer.toString(count2);
                edte.setText(val2);


            }
        });
        c_eb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;
                val3 = Integer.toString(count3);
                edeb.setText(val3);

            }
        });

        t_eb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3--;
                val3 = Integer.toString(count3);
                edeb.setText(val3);


            }
        });

        imDatePicker1.setOnClickListener(this);
        imDatePicker2.setOnClickListener(this);

        ProgressDialog csprogress=new ProgressDialog(Home.this);
        btnsearch = (Button)findViewById(R.id.btn_timkiem);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                csprogress.setMessage("Loading...");
                csprogress.show();
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        csprogress.dismiss();
//whatever you want just you have to launch overhere.


                    }
                }, 1000);
                Intent intent=new Intent(Home.this, DanhSachActivity.class);
                startActivity(intent);
            }
        });
        tvlogout = (TextView)findViewById(R.id.logout);
        tvhome = (TextView)findViewById(R.id.home);
        tvaccount = (TextView)findViewById(R.id.account);
        tvlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,ActivityLogin.class);
                startActivity(intent);
            }
        });
        tvhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this, HomeMain.class);
                startActivity(intent);
            }
        });
        tvaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Profile.class);
                startActivity(intent);
            }
        });
        drawerLayout = findViewById(R.id.activity_main_drawer);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        //list hiển thị list nơi đi
        final ListView listView = new ListView(this);
        final ListView listView1 = new ListView(this);
        final List<String> data = new ArrayList<>();
        data.add("Hà Nội");
        data.add("Hồ Chí Minh");
        data.add("Đà Nẵng");
        data.add("Cần Thơ");
        data.add("Gia Lai");
        data.add("Quảng Bình");
        data.add("Quảng Trị");
        data.add("Huế");
        data.add("Nghệ An");
        data.add("Hải Phòng");

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,data);
        listView.setAdapter(adapter);
        final ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,data);
        listView1.setAdapter(adapter1);
        AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
        builder.setCancelable(false);
        builder.setView(listView);
        final AlertDialog dialog = builder.create();
        AlertDialog.Builder builder1 = new AlertDialog.Builder(Home.this);
        builder1.setCancelable(false);
        builder1.setView(listView1);
        final AlertDialog dialog1 = builder1.create();

        final EditText noidi = (EditText)findViewById(R.id.noidi_Textview);
        final EditText noiden = (EditText)findViewById(R.id.noiden_Textview);
        noidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                noidi.setText(adapter.getItem(position));
                dialog.dismiss();

            }
        });

        noiden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.show();
            }
        });
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                noiden.setText(adapter1.getItem(position));
                dialog1.dismiss();

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

                            txtDate1.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

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

                            txtDate2.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
    }



    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {

        }

        return super.onOptionsItemSelected(item);
    }
}