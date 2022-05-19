package com.islamic.jakirliton.namazoduya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.islamic.jakirliton.namazoduya.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Namajer_projoniyoduya extends AppCompatActivity {



    Button  tid1,tid2,tid3,tid4,tid5,tid6,tid7,tid8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namajer_projoniyoduya);

        tid1 = (Button) findViewById(R.id.tid1);
        tid2 = (Button) findViewById(R.id.tid2);
        tid3 = (Button) findViewById(R.id.tid3);
        tid4 = (Button) findViewById(R.id.tid4);
        tid5 = (Button) findViewById(R.id.tid5);
        tid6 = (Button) findViewById(R.id.tid6);
        tid7 = (Button) findViewById(R.id.tid7);
        tid8 = (Button) findViewById(R.id.tid8);


        tid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_niyot.class);
                startActivity(intent);
            }
        });
        tid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_jainamaj.class);
                startActivity(intent);
            }
        });
        tid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_chana.class);
                startActivity(intent);
            }
        });
        tid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_ruku.class);
                startActivity(intent);
            }
        });
        tid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_tasahud.class);
                startActivity(intent);
            }
        });
        tid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_durud.class);
                startActivity(intent);
            }
        });
        tid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_mashura.class);
                startActivity(intent);
            }
        });
        tid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajer_projoniyoduya.this,D_kunut.class);
                startActivity(intent);
            }
        });
    }

}
