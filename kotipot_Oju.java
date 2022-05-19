package com.islamic.jakirliton.namazoduya;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.islamic.jakirliton.namazoduya.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class kotipot_Oju extends AppCompatActivity {

    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotipot__oju);

        //text

        textView = (TextView) findViewById(R.id.text_oju);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "Indie_Flower/IndieFlower.ttf");
        textView.setTypeface(myCustomFont);


        button = (Button) findViewById(R.id.btn_oju);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(), "Indie_Flower/IndieFlower.ttf");
        button.setTypeface(myCustomFont2);


    }

}
