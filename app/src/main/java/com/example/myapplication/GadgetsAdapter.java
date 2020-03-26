package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GadgetsAdapter extends RecyclerView.Adapter<GadgetViewHolder> {

    private List<Gadget> gadgets;
    private Context context;

    public GadgetsAdapter(List<Gadget>gadgets, Context context){
        this.gadgets=gadgets;
        this.context=context;
    }

    public GadgetViewHolder onCreateViewHolder(ViewGroup parent, int position){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_gadget, parent, false);
        return new GadgetViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull GadgetViewHolder holder, int position) {
        Gadget gaget=gadgets.get(position);
        holder.gadgetName.setText(gaget.name);
        holder.gadgetType.setText(gaget.type);
        holder.gadgetPhoto.setImageResource(gaget.photoID);
    }

    public int getItemCount(){
        return gadgets.size();
    }
}
