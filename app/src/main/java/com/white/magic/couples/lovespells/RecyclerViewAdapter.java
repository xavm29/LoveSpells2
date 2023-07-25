package com.white.magic.couples.lovespells;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Myviewholder> {



    private Context mContext;
    private List<Datos> mData;

    public RecyclerViewAdapter(Context mContext, List<Datos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflate =LayoutInflater.from(mContext);
        view=mInflate.inflate(R.layout.item_hechizos,parent,false);
        return new Myviewholder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder , final int position) {
        holder.Tvnombre.setText(mData.get(position).getTitle());
        // interestial

        final InterstitialAd mInterstitialAd = new InterstitialAd(mContext);
        mInterstitialAd.setAdUnitId("ca-app-pub-9219532406413852/4225834018");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener(){

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.

                Intent intent =new Intent(mContext,Hechizo_activity.class);
                //passing data to book activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Materiales",mData.get(position).getMateriales());
                intent.putExtra("Description",mData.get(position).getDescription());
                // start actividad
                mContext.startActivity(intent);



            }

        });



        // Set click  listener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //interestidal
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Intent intent =new Intent(mContext,Hechizo_activity.class);
                    //passing data to book activity
                    intent.putExtra("Title",mData.get(position).getTitle());
                    intent.putExtra("Materiales",mData.get(position).getMateriales());
                    intent.putExtra("Description",mData.get(position).getDescription());
                    // start actividad
                    mContext.startActivity(intent);

                }







            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class Myviewholder extends RecyclerView.ViewHolder {
        TextView Tvnombre;
        CardView cardView;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            Tvnombre= itemView.findViewById(R.id.Tvnombre_id);
            cardView = itemView.findViewById(R.id.cardview_id);


        }
    }
}
