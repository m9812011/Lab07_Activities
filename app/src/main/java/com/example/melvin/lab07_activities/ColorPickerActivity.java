package com.example.melvin.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class ColorPickerActivity extends AppCompatActivity {

    private RadioButton radio;
    private int mColorInt;
    private String mColorName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);

        initColorData();
    }

    private void initColorData(){
        radio = (RadioButton)findViewById(R.id.holo_red_light);
        mColorInt = radio.getCurrentTextColor();
        mColorName = radio.getText().toString();
    }

    public void clickColor(View view){
        RadioButton radio= (RadioButton)view;
        mColorInt = radio.getCurrentTextColor();
        mColorName = radio.getText().toString();
    }
    public void submit(View view){
        switch (view.getId()){
            case R.id.cancel:
                initColorData();
                setResult(RESULT_CANCELED);
                break;
            case R.id.ok:
                Intent intent = new Intent(ColorPickerActivity.this,MainActivity.class);
                intent.putExtra(IntentKey.SET_BUNDLE_KEY_COLOR_INT, mColorInt);
                intent.putExtra(IntentKey.SET_BUNDLE_KEY_COLOR_NAME, mColorName);
                setResult(RESULT_OK, intent);
                finish();
                break;
        }

    }

}
