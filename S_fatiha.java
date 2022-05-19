package com.islamic.jakirliton.namazoduya;

import android.graphics.Typeface;
import android.media.MediaPlayer;
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

public class S_fatiha extends AppCompatActivity {

    Button button,button1,button2;
    TextView textView,textView1;
    MediaPlayer mp;
    Button font1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_fatiha);

        textView = (TextView)findViewById(R.id.text_fatiha);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        textView.setTypeface(myCustomFont);


        button = (Button) findViewById(R.id.btn_fatiha);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        button.setTypeface(myCustomFont2);

        textView1 = (TextView)findViewById(R.id.text1_fatiha);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        textView1.setTypeface(myCustomFont3);


        button1 = (Button) findViewById(R.id.btn1_fatiha);
        Typeface myCustomFont4 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        button1.setTypeface(myCustomFont4);

        button2 = (Button) findViewById(R.id.btn2_fatiha);
        Typeface myCustomFont5 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        button2.setTypeface(myCustomFont5);

        font1 = (Button)findViewById(R.id.btn1_fatiha);




        font1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(S_fatiha.this, R.raw.fatiha);
                mp.start();
            }
        });


    }
    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    @Override
    public void onPause ()
    {
        if (mp != null)
        {
            mp.pause();
            mp.stop();
        }
        super.onPause();


    }





}
