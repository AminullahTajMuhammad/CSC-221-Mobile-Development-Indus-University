package com.amin.indusuniversity.LabManual_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.amin.indusuniversity.R;

public class LabManual_Three extends AppCompatActivity {

    int ch=1;
    float font=30;

    Button btnChangeTextColor, btnChangeBackground;
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_manual__three);
        findViewbyIds();

        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch) {
                    case 1:
                        tvText.setTextColor(Color.RED);
                        break;
                    case 2:
                        tvText.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        tvText.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        tvText.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        tvText.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        tvText.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch == 7)
                    ch = 1;
            }
        });

        btnChangeTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvText.setTextSize(font);
                font = font + 5;
                if (font == 50) {
                    font = 30;
                }
            }
        });
    }

    public void findViewbyIds() {
        btnChangeTextColor = findViewById(R.id.btnChangeTextColor);
        btnChangeBackground = findViewById(R.id.btnChangeBackGround);
        tvText = findViewById(R.id.textView);
    }
}
