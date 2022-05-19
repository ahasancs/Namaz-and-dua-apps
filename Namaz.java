package com.islamic.jakirliton.namazoduya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.islamic.jakirliton.namazoduya.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import me.anwarshahriar.calligrapher.Calligrapher;

public class Namaz extends AppCompatActivity {



    Button tid1,tid2,tid3,tid4,tid5,tid6,tid7,tid8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);

        tid1 = (Button) findViewById(R.id.tid1);
        tid2 = (Button) findViewById(R.id.tid2);
        tid3 = (Button) findViewById(R.id.tid3);
        tid4 = (Button) findViewById(R.id.tid4);
        tid5 = (Button) findViewById(R.id.tid5);
        tid6 = (Button) findViewById(R.id.tid6);
        tid7 = (Button) findViewById(R.id.tid7);





        tid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaz.this, Namajekotipoybishoy.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid1.startAnimation(animation);
            }
        });
        tid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaz.this, Namajer_oakto_rakat.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid2.startAnimation(animation);
            }
        });
        tid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaz.this, Namajer_projoniyoduya.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid3.startAnimation(animation);

            }
        });
        tid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaz.this, Sura.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid4.startAnimation(animation);
            }
        });
        tid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaz.this, NamajerNiyom.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid5.startAnimation(animation);
            }
        });
        tid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaz.this, Dhape_Dhape.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid6.startAnimation(animation);
            }
        });
        tid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namaz.this, Gurottopurnobishoy.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid7.startAnimation(animation);

            }
        });

    }


}
