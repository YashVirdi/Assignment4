package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.assignment4.R;

public class item_UBC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_ubc);
    }
    public void goToHomeButton (View view){
        setContentView(R.layout.activity_main);
    }
    public void goBackButton (View view){
        setContentView(R.layout.activity_item_sfu);
    }
}