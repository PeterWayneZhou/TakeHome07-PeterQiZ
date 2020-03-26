package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Batcave");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.gotham:
                Toast.makeText(this, "Gotham Surveillance Online", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.watchTower:
                Toast.makeText(this, "Watch Tower Connected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.equipment:
                Intent checkUtilityBelt=new Intent(this, ThirdActivity.class);
                startActivity(checkUtilityBelt);
                Toast.makeText(this, "Exam Utility Belt", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
