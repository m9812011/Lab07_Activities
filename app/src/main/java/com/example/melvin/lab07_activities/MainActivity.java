package com.example.melvin.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_color;
    int colorInt;
//    String colorName;
//    String colorContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_color = (TextView)findViewById(R.id.tv_color);
    }


    public void submit(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.selectColor:
                intent = new Intent(MainActivity.this,ColorPickerActivity.class);
                startActivityForResult(intent,IntentKey.SET_COLOR);
                break;
            case R.id.inputText:
                intent = new Intent(MainActivity.this,TextPickerActivity.class);
                startActivityForResult(intent,IntentKey.SET_CONTEXT);
                break;
            case R.id.next:
                intent = new Intent(MainActivity.this,OneActivity.class);
//                intent.putExtra(IntentKey.SET_BUNDLE_KEY_COLOR_INT,colorInt);
//                startActivityForResult(intent, IntentKey.PAGR_1_SELECT_COLOR_REQUEST);
                startActivity(intent);
                break;
        }


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle bundle = data.getExtras();

        switch (requestCode){
            case IntentKey.SET_COLOR:
                if(resultCode == RESULT_OK){
                    colorInt = bundle.getInt(IntentKey.SET_BUNDLE_KEY_COLOR_INT);
                    String colorName = bundle.getString(IntentKey.SET_BUNDLE_KEY_COLOR_NAME);
                    tv_color.setText(colorName);
                    tv_color.setBackgroundColor(colorInt);
                }
                break;
            case IntentKey.SET_CONTEXT:
                if(resultCode == RESULT_OK){
                    String colorContext = bundle.getString(IntentKey.SET_BUNDLE_KEY_COLOR_CONTEXT);
                    tv_color.setText(colorContext);
                }
        }

    }


}
