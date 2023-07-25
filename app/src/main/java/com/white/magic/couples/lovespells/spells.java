package com.white.magic.couples.lovespells;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class spells extends AppCompatActivity {
    private AdView mAdView;
    List<Datos> lstdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spells);
        // banner
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // lista hechizos

        lstdatos=new ArrayList<>();

        lstdatos.add(new Datos(getString(R.string.Titchotalate_sp01),
                getString(R.string.sp01_mat1) +"\n"+"\n"+
                getString(R.string.sp01_mat02)+"\n"+"\n",
                getString(R.string.sp01_p1) +"\n"+"\n"+
                        getString(R.string.sp01_p2) +"\n"+"\n"+
                        getString(R.string.sp01_p3) +"\n"+"\n"+
                        getString(R.string.sp01_p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.Tiamamarre_sp02),
                getString(R.string.sp02_mat1)  +"\n"+"\n"+
                getString(R.string.sp02_mat2) + "\n"+"\n"+
                getString(R.string.sp02_mat3) +"\n"+"\n",
                getString(R.string.sp02_p1) + "\n"+"\n"+
                getString(R.string.sp02_p2) + "\n"+"\n"+
                getString(R.string.sp02_p3) + "\n"+"\n"+
                getString(R.string.sp02_p4) + "\n"+"\n"+
                getString(R.string.sp02_p5)  +"\n"+"\n"+
                getString(R.string.sp02_p6) +"\n"+"\n"
                ));
        lstdatos.add(new Datos(getString(R.string.titleAmor_sp03),
                getString(R.string.sp03_mat1) +"\n"+"\n"+
                        getString(R.string.sp03_mat2)+"\n"+"\n",
                getString(R.string.sp03_p1) +"\n"+"\n"+
                        getString(R.string.sp03_p2) +"\n"+"\n"+
                        getString(R.string.sp03_p3) +"\n"+"\n"+
                        getString(R.string.sp03_p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.titevita_sp04),
                getString(R.string.sp04_mat) +"\n"+"\n"+
                        getString(R.string.sp04_mat2) +"\n"+"\n"+
                        getString(R.string.sp04_mat3)+"\n"+"\n",
                getString(R.string.sp04_p1) +"\n"+"\n"+
                        getString(R.string.sp04_p2) +"\n"+
                        "\n"));
        lstdatos.add(new Datos(getString(R.string.tillama_sp05),
                getString(R.string.sp05_mat1) +"\n"+"\n"+
                        getString(R.string.sp05_mat2)+"\n"+"\n",
                getString(R.string.sp05_p1) +"\n"+"\n"+
                        getString(R.string.sp05_p2) +"\n"+"\n"+
                        getString(R.string.sp05_p3) +"\n"+"\n"+
                        getString(R.string.sp05_p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.titamor_sp06),
                getString(R.string.sp06_mat1) +"\n"+"\n"+
                        getString(R.string.sp06_mat2) +"\n"+"\n"+
                        getString(R.string.sp06_mat3)+"\n"+"\n",
                getString(R.string.sp06_p1) +"\n"+"\n"+
                        getString(R.string.sp06_p2) +"\n"+"\n"+
                        getString(R.string.sp06_p3) +"\n"+"\n"+
                        getString(R.string.sp06_p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.titman_sp07),
                getString(R.string.sp07_mat1) +"\n"+"\n"+
                        getString(R.string.sp07_mat2)+"\n"+"\n",
                getString(R.string.sp07_p1) +"\n"+"\n"+
                        getString(R.string.sp07_p2) +"\n"+"\n"+
                        getString(R.string.sp07_p3) +"\n"+"\n"+
                        getString(R.string.sp07_p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.titconse_sp08),
                getString(R.string.sp08_mat1) +"\n"+"\n"+
                        getString(R.string.sp08_mat2) +"\n"+"\n"+
                        getString(R.string.sp08_mat3)+"\n"+"\n",
                getString(R.string.sp08_p1) +"\n"+"\n"+
                        getString(R.string.sp08_p2) +"\n"+"\n"+
                        getString(R.string.sp08_p3) +"\n"+"\n"+
                        getString(R.string.sp08_p4) +"\n"+"\n"+
                        getString(R.string.sp08_p5)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.titolv_sp09),
                getString(R.string.sp09_mat1) +"\n"+"\n"+
                        getString(R.string.sp09_mat2) +"\n"+"\n"+
                        getString(R.string.sp09_mat3)+"\n"+"\n",
                getString(R.string.sp09_p1) +"\n"+"\n"+
                        getString(R.string.sp09_p2) +"\n"+"\n"+
                        getString(R.string.sp09_p3) +"\n"+"\n"+
                        getString(R.string.sp09_p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.sp10_tit),
                getString(R.string.sp10ma1) +"\n"+"\n"+
                getString(R.string.sp10ma2) +"\n"+"\n"+
                getString(R.string.sp10ma3)+"\n"+"\n",
                getString(R.string.sp10p1) +"\n"+"\n"+
                getString(R.string.sp10p2) +"\n"+"\n"+
                getString(R.string.sp10P3) +"\n"+"\n"+
                getString(R.string.sp10p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.sp11_tit),
                getString(R.string.sp11m1) +"\n"+"\n"+
                        getString(R.string.sp11m2) +"\n"+"\n"+
                        getString(R.string.sp11m3)+"\n"+"\n",
                getString(R.string.sp11p1) +"\n"+"\n"+
                getString(R.string.sp11p2) +"\n"+"\n"+
                getString(R.string.sp11p3) +"\n"+"\n"+
                getString(R.string.sp11p4)+"\n"+"\n"));
        lstdatos.add(new Datos(getString(R.string.sp12_tit),
                getString(R.string.sp12m1) +"\n"+"\n"+
                        getString(R.string.sp12m2) +"\n"+"\n"+
                        getString(R.string.sp12m3)+"\n"+"\n",
                getString(R.string.sp12p1) +"\n"+"\n"+
                        getString(R.string.sp12p2) +"\n"+"\n"+
                        getString(R.string.sp12p3) +"\n"+"\n"+
                        getString(R.string.sp12p4) +
                        "\n"+"\n"));


        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter =new RecyclerViewAdapter(this,lstdatos);
        myrv.setLayoutManager(new LinearLayoutManager(this));
        myrv.setAdapter(myAdapter);


    }

}
