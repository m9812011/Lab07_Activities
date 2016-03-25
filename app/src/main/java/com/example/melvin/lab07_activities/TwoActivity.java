package com.example.melvin.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TwoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    public void submit(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.next:
                intent = new Intent(TwoActivity.this,ThreeActivity.class);
                startActivity(intent);
                break;
            case R.id.back:
                intent = new Intent(TwoActivity.this,OneActivity.class);
                startActivity(intent);
                break;
        }
    }

}
