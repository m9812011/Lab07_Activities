package com.example.melvin.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OneActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

    }

    public void submit(View view){
        switch (view.getId()){
            case R.id.next:
                Intent intent = new Intent(OneActivity.this,TwoActivity.class);
                startActivity(intent);
                break;
        }
    }



}
