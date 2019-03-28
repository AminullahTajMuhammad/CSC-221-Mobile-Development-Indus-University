package com.amin.indusuniversity.LabManual_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.amin.indusuniversity.R;

public class ResultActivity extends AppCompatActivity {
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String counter;
        tvResult = findViewById(R.id.tvResult);
        counter = getIntent().getStringExtra("Wrong Attempt");
        //counter = intent.getStringExtra();
        tvResult.setText("Wrong Attempt is: "+ counter.toString());
    }
}
