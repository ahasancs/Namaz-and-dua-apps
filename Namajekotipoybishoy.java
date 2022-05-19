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

public class Namajekotipoybishoy extends AppCompatActivity {


    Button tid1,tid2,tid3,tid4,tid5,tid6,tid7,tid8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namajekotipoybishoy);

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
                Intent intent = new Intent(Namajekotipoybishoy.this,kotipoy_foroj.class);
                startActivity(intent);
            }
        });
        tid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajekotipoybishoy.this,kotipot_Oju.class);
                startActivity(intent);
            }
        });
        tid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajekotipoybishoy.this,kotipoy_ahkam.class);
                startActivity(intent);
            }
        });
        tid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajekotipoybishoy.this,koripoy_wajib.class);
                startActivity(intent);
            }
        });
        tid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajekotipoybishoy.this,kotipoy_sunnat.class);
                startActivity(intent);
            }
        });
        tid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajekotipoybishoy.this,kotipoy_mustahab.class);
                startActivity(intent);
            }
        });
        tid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajekotipoybishoy.this,kotipoy_makru.class);
                startActivity(intent);
            }
        });
        tid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Namajekotipoybishoy.this,kotipoy_namjvongo.class);
                startActivity(intent);
            }
        });
    }


}
