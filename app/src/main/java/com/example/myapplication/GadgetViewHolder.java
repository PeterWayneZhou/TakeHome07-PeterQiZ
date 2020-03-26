package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class GadgetViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView gadgetName;
    public TextView gadgetType;
    public ImageView gadgetPhoto;

    public GadgetViewHolder(View itemView, final Context context){
        super(itemView);
        cardView=itemView.findViewById(R.id.card_view);
        gadgetName=itemView.findViewById(R.id.gadget_name);
        gadgetType=itemView.findViewById(R.id.gadget_type);
        gadgetPhoto=itemView.findViewById(R.id.gadget_photo);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(context,gadgetName.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
