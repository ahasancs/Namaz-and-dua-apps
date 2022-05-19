package com.islamic.jakirliton.namazoduya;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.islamic.jakirliton.namazoduya.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Sura extends AppCompatActivity {


  Button tid1,tid2,tid3,tid4,tid5,tid6,tid7,tid8,tid9,tid10,tid11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura);

        tid1 = (Button) findViewById(R.id.tid1);
        tid3 = (Button) findViewById(R.id.tid3);
        tid4 = (Button) findViewById(R.id.tid4);
        tid5 = (Button) findViewById(R.id.tid5);
        tid6 = (Button) findViewById(R.id.tid6);
        tid7 = (Button) findViewById(R.id.tid7);
        tid8 = (Button) findViewById(R.id.tid8);
        tid9 = (Button) findViewById(R.id.tid9);
        tid10 = (Button) findViewById(R.id.tid10);
        tid11 = (Button) findViewById(R.id.tid11);






        tid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_fatiha.class);
                startActivity(intent);
            }
        });

        tid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_qurais.class);
                startActivity(intent);
            }
        });
        tid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_maun.class);
                startActivity(intent);
            }
        });
        tid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_kushar.class);
                startActivity(intent);
            }
        });
        tid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_kafirun.class);
                startActivity(intent);
            }
        });
        tid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_nasor.class);
                startActivity(intent);
            }
        });
        tid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_lahab.class);
                startActivity(intent);
            }
        });
        tid9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_iklas.class);
                startActivity(intent);
            }
        });
        tid10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_falak.class);
                startActivity(intent);
            }
        });
        tid11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sura.this,S_nas.class);
                startActivity(intent);
            }
        });

    }


}
