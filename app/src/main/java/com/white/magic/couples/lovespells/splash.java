package com.white.magic.couples.lovespells;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.growthyourapp.sdk.GYASDK;
import com.growthyourapp.sdk.IResponseResult;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //gya carga

        Application gya=(gyasingleton)getApplicationContext();
        GYASDK sdk =((gyasingleton)gya).getSdk();
        sdk.Init(this, new IResponseResult() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onFailure() {

            }
        });

        // tiempo de splash
     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent intent=new Intent(splash.this,MainActitvity.class);
             startActivity(intent);

         }
     },3000);


    }
}
