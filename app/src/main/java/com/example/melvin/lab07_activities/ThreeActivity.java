package com.example.melvin.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

    }

    public void submit(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.back:
                intent = new Intent(ThreeActivity.this,TwoActivity.class);
                startActivity(intent);
                break;
            case R.id.main:
                intent = new Intent(ThreeActivity.this,MainActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;
        }
    }
}
