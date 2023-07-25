package com.white.magic.couples.lovespells;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.robertsimoes.shareable.Shareable;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hechizo_activity extends AppCompatActivity {
    private TextView tvtitulo,tvdescription,tvmateriales;
    Button mahechizos;
    Button fb_re;
    Button Tw_re;
    Button Defauld_action;
    private AdView mAdView;
    String url = "https://play.google.com/store/apps/details?id=com.white.magic.couples.lovespells";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechizo_activity);
        tvtitulo= findViewById(R.id.txttitle);
        tvmateriales= findViewById(R.id.txtmater);
        tvdescription= findViewById(R.id.txtDescp);
        //banner
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //recibiendo los datos
        Intent intent =getIntent();
        String Title =intent.getExtras().getString("Title");
        String Materiales =intent.getExtras().getString("Materiales");
        String Description =intent.getExtras().getString("Description");
        // setting values
        tvtitulo.setText(Title);
        tvmateriales.setText(Materiales);
        tvdescription.setText(Description);
        // boton mas hechizos
        mahechizos =findViewById(R.id.btn_mashechizos);
        mahechizos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mahechizos = new Intent(Hechizo_activity.this,spells.class);
                startActivity(mahechizos);
            }
        });
        // compartir Fb
        fb_re = findViewById(R.id.id_fb_re);
        // compartir TW
        Tw_re = findViewById(R.id.twiter_R_id);
        //compartir default
        Defauld_action=findViewById(R.id.id_share);




    }
    public void facebook(View v) {
        Shareable shareInstance = new Shareable.Builder(this)
                .message(getString(R.string.share_strin))
                .socialChannel(Shareable.Builder.FACEBOOK)
                .url(url)
                .build();
        shareInstance.share();
    }

    public void twitter(View v) {
        Shareable shareInstance = new Shareable.Builder(this)
                .message(getString(R.string.share_strin))
                .socialChannel(Shareable.Builder.TWITTER)
                .url(url)
                .build();
        shareInstance.share();
    }
    public void defaultAction(View v) {
        Shareable shareInstance = new Shareable.Builder(this)
                .message(getString(R.string.share_strin))
                .url(url)
                .build();
        shareInstance.share();
    }
}
