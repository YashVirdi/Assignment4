package com.example.assignment4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void toast_btn(View view){
        Toast.makeText(getApplicationContext(),"Click on top right three dots for menu",Toast.LENGTH_LONG).show();
    }



    public void goToHomeButton (View view){
        setContentView(R.layout.activity_main);
    }
    public void goBackButton (View view){
        setContentView(R.layout.activity_item_sfu);
    }
    public void goToNextScreen_KPU (View view){
        setContentView(R.layout.activity_item_kpu);
    }
    public void goToNextScreen_SFU (View view){
       setContentView(R.layout.activity_item_sfu);
    }
    public void goToNextScreen_UBC(View view){
        setContentView(R.layout.activity_item_ubc);
    }

    //To create menu on the side with the three dots
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Which screen to navigate to when one of the Create Option Menu is selected
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.item_kpu:
                setContentView(R.layout.activity_item_kpu);
                break;
            case R.id.item_sfu:
                setContentView(R.layout.activity_item_sfu);
                break;
            case R.id.item_ubc:
                setContentView(R.layout.activity_item_ubc);
                break;
            case R.id.item_exit:
                finish();
        }
        return super.onOptionsItemSelected(item);

    }
}