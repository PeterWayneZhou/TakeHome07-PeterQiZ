package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    private List<Gadget>gadgets;
    private GadgetsAdapter gadgetsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setTitle("Utility Belt");

       initiateData();

        RecyclerView recyclerView= findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        gadgetsAdapter=new GadgetsAdapter(gadgets,this);
        recyclerView.setAdapter(gadgetsAdapter);
    }



    private void initiateData(){
        gadgets=new ArrayList<>();
        gadgets.add(new Gadget("Batarang","Projectile", R.drawable.batarang));
        gadgets.add(new Gadget("Grapple Gun", "Movement", R.drawable.grapple_gun));
        gadgets.add(new Gadget("Smoke Grenade", "Stealth", R.drawable.smoke_grenade));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.third_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.add:
                gadgets.add(getRandomGadget());
                gadgetsAdapter.notifyDataSetChanged();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private Gadget getRandomGadget(){
        int num=(int)(Math.random()*3);
        if(num==0){
            return new Gadget("Batarang", "Projectile", R.drawable.batarang);
        }else if(num==1){
            return new Gadget("Grapple Gun", "Movement", R.drawable.grapple_gun);
        }else{
            return new Gadget("Smoke Grenade", "Stealth", R.drawable.smoke_grenade);
        }
    }
}