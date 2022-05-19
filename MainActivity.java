package com.islamic.jakirliton.namazoduya;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.telecom.Connection;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Toast;

import com.islamic.jakirliton.namazoduya.R;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    Button namaz,duya;
    connection cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button namaz = (Button) findViewById(R.id.namaz);
        final Button duya = (Button) findViewById(R.id.duya);

        cd = new connection(this);


        namaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cd.isConnect()){
                    Intent intent = new Intent(MainActivity.this,Namaz.class);
                    startActivity(intent);

                    Animation animation = new AlphaAnimation(1.0f,0.0f);
                    animation.setDuration(1000);
                    namaz.startAnimation(animation);
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, InternetConnection.class);
                    startActivity(intent);
                }
            }
        });

        duya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cd.isConnect()) {
                    Intent intent = new Intent(MainActivity.this, duya.class);
                    startActivity(intent);

                    Animation animation = new AlphaAnimation(1.0f, 0.0f);
                    animation.setDuration(1000);
                    duya.startAnimation(animation);
                }else
                {
                    Intent intent = new Intent(MainActivity.this, InternetConnection.class);
                    startActivity(intent);
                }
            }
        });





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Thank you for downloading this app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_rate) {

            try {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.islamic.jakirliton.namazoduya")));
            }catch (ActivityNotFoundException e)
            {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.islamic.jakirliton.namazoduya;")));
            }


            return true;
        }
        if (id == R.id.action_shars) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("Text/Plain");
            String shareBody = "Your Body here";
            String shareSub = "Your Subject here";
            i.putExtra(Intent.EXTRA_TEXT, shareBody);
            i.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            startActivity(Intent.createChooser(i, "Sending"));

        }




        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_namaj) {

            Intent intent = new Intent(this,Namaz.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_Duya) {

            Intent intent = new Intent(this,duya.class);
            startActivity(intent);

        }else if (id == R.id.nav_rate) {

            try {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.islamic.jakirliton.namazoduya")));
            }catch (ActivityNotFoundException e)
            {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.islamic.jakirliton.namazoduya;")));
            }

        } else if (id == R.id.nav_share) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("Text/Plain");
            String shareBody = "Your Body here";
            String shareSub = "Your Subject here";
            i.putExtra(Intent.EXTRA_TEXT, shareBody);
            i.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            startActivity(Intent.createChooser(i, "Sending"));

        }
        else if (id == R.id.nav_send) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("Text/Plain");
            String shareBody = "Your Body here";
            String shareSub = "Your Subject here";
            i.putExtra(Intent.EXTRA_TEXT, shareBody);
            i.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            startActivity(Intent.createChooser(i, "Sending"));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
