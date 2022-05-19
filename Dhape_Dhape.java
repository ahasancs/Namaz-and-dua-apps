package com.islamic.jakirliton.namazoduya;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.islamic.jakirliton.namazoduya.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Dhape_Dhape extends AppCompatActivity {





    Button tid1,tid2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhape__dhape);

        tid1 = (Button) findViewById(R.id.tid1);
        tid2 = (Button) findViewById(R.id.tid2);


        //taxt

        tid1 = (Button) findViewById(R.id.tid1);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid1.setTypeface(myCustomFont);


        tid2 = (Button) findViewById(R.id.tid2);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid2.setTypeface(myCustomFont2);



        tid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dhape_Dhape.this,Dhape_purus.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid1.startAnimation(animation);
            }
        });
        tid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dhape_Dhape.this,Dhape_nari.class);
                startActivity(intent);

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                tid2.startAnimation(animation);
            }
        });
    }


}
