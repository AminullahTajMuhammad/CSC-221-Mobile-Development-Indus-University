package com.amin.indusuniversity.LabManual_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.amin.indusuniversity.R;

public class LabManual_Two extends AppCompatActivity {

    TextView tvHelloAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_manual_two_activity);

        tvHelloAndroid = findViewById(R.id.tvHelloAndroid);
        tvHelloAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tvHelloAndroid.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
            tvHelloAndroid.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });

    }
}
