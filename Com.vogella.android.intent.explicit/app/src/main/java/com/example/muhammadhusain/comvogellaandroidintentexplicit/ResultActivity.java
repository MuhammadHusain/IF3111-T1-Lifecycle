package com.example.muhammadhusain.comvogellaandroidintentexplicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Muhammad Husain on 2/8/2015.
 */
public class ResultActivity extends Activity{
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Send");
        TextView text = (TextView) findViewById(R.id.displayintentextra);
        text.setText(value1);
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        EditText text = (EditText) findViewById(R.id.returnValue);
        String value = text.getText().toString();
        intent.putExtra("reply", value);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
