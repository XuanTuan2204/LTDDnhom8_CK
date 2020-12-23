package com.example.nhom8_ltdd_ck;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Firstpage extends AppCompatActivity {

    private static  int SPLASH_SCREEN = 5000;
    //variables
    Animation topAnim , bottonAnim,midAnim;
    ImageView img;
    TextView tv_app,solgan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);

        //Animations
        bottonAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        midAnim = AnimationUtils.loadAnimation(this,R.anim.mid_animation);
        // hooks
//        tv_app = findViewById(R.id.tv_app);
        solgan = findViewById(R.id.solgan);
//        tv_app.setAnimation(midAnim);
        solgan.setAnimation(bottonAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Firstpage.this,ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}