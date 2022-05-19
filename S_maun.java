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

public class S_maun extends AppCompatActivity {
    Button button,button1,button2;
    TextView textView,textView1;

    MediaPlayer mp;
    Button font1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_maun);

        font1 = (Button)findViewById(R.id.btn1_maun);


        textView = (TextView)findViewById(R.id.text_maun);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        textView.setTypeface(myCustomFont);


        button = (Button) findViewById(R.id.btn_maun);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        button.setTypeface(myCustomFont2);

        textView1 = (TextView)findViewById(R.id.text1_maun);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        textView1.setTypeface(myCustomFont3);


        button1 = (Button) findViewById(R.id.btn1_maun);
        Typeface myCustomFont4 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        button1.setTypeface(myCustomFont4);

        button2 = (Button) findViewById(R.id.btn2_maun);
        Typeface myCustomFont5 = Typeface.createFromAsset(getAssets(),"Indie_Flower/IndieFlower.ttf");
        button2.setTypeface(myCustomFont5);



        //play music
        font1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(S_maun.this, R.raw.maun);
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
