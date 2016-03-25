package com.example.melvin.lab07_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class TextPickerActivity extends AppCompatActivity {

    private String mText;
    private EditText ed_mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_picker);

        ed_mText = (EditText)findViewById(R.id.et_context);
    }

    public void submit(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.cancel:
                ed_mText.setText("");
                setResult(Activity.RESULT_CANCELED);
                break;

            case R.id.ok:
                intent = new Intent(TextPickerActivity.this,MainActivity.class);
                mText = ed_mText.getText().toString();
                intent.putExtra(IntentKey.SET_BUNDLE_KEY_COLOR_CONTEXT,mText);
                setResult(RESULT_OK, intent);
                finish();
                break;
        }


    }
}
