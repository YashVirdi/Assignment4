package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.assignment4.R;

public class item_KPU extends AppCompatActivity {
Button btn_home_kpu,btn_home_sfu,btn_home_ubc,btn_ubc,btn_sfu,btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void goToHomeButton (View view){
        setContentView(R.layout.activity_main);
    }
    public void goToNextScreen (View view){
        setContentView(R.layout.activity_item_sfu);
    }
}