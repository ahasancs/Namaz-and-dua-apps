
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

public class duya extends AppCompatActivity {




    Button tid0,tid1,tid2,tid3,tid4,tid5,tid7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duya);

        tid0 = (Button) findViewById(R.id.tid0);
        tid1 = (Button) findViewById(R.id.tid1);
        tid2 = (Button) findViewById(R.id.tid2);
        tid3 = (Button) findViewById(R.id.tid3);
        tid4 = (Button) findViewById(R.id.tid4);
        tid5 = (Button) findViewById(R.id.tid5);
        tid7 = (Button) findViewById(R.id.tid7);


        //taxt

        tid0 = (Button) findViewById(R.id.tid0);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid0.setTypeface(myCustomFont);


        tid1 = (Button) findViewById(R.id.tid1);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid1.setTypeface(myCustomFont2);
        //taxt

        tid2 = (Button) findViewById(R.id.tid2);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid2.setTypeface(myCustomFont);


        tid3 = (Button) findViewById(R.id.tid3);
        Typeface myCustomFont24 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid3.setTypeface(myCustomFont2);
        //taxt

        tid4 = (Button) findViewById(R.id.tid4);
        Typeface myCustomFont5 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid4.setTypeface(myCustomFont);


        tid5 = (Button) findViewById(R.id.tid5);
        Typeface myCustomFont6 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid5.setTypeface(myCustomFont2);
        //taxt

        tid7 = (Button) findViewById(R.id.tid7);
        Typeface myCustomFont7 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        tid7.setTypeface(myCustomFont);







        tid0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(duya.this,Duya_nittodin.class) ;
                startActivity(intent);
            }
        });
        tid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(duya.this,Duya_ghum.class) ;
                startActivity(intent);
            }
        });
        tid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(duya.this,Duya_samajik.class) ;
                startActivity(intent);
            }
        });
        tid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(duya.this,Duya_haj.class) ;
                startActivity(intent);
            }
        });
        tid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(duya.this,Duya_quran.class) ;
                startActivity(intent);
            }
        });
        tid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(duya.this,Duya_onuviti.class) ;
                startActivity(intent);
            }
        });


        tid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(duya.this,Duya_osustota.class) ;
                startActivity(intent);
            }
        });

    }


}
