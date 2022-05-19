package com.islamic.jakirliton.namazoduya;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by jakirliton on 10/25/2017.
 */

public class connection {

    Context context;

    public connection(Context context) {

        this.context = context;
    }

    public  boolean isConnect(){
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Service.CONNECTIVITY_SERVICE);

        if(connectivityManager != null){

            NetworkInfo info = connectivityManager.getActiveNetworkInfo();
            if(info != null)
            {
                if(info.getState() == NetworkInfo.State.CONNECTED)
                {
                    return true;
                }
            }
        }
        return  false;
    }
}
