package com.amin.indusuniversity.LabManual_4;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.amin.indusuniversity.R;

public class LoginActivity extends AppCompatActivity {
    EditText edtName, edtPassword;
    Button btnSubmit;
    String name, password;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edtName.getText().toString();
                password = edtPassword.getText().toString();
                if(name.equals("admin") && password.equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this, ResultActivity.class);
                    intent.putExtra("Wrong Attempt", String.valueOf(counter));
                    startActivity(intent);
                    counter = 0;
                } else {
                    counter++;
                }
            }
        });

    }
}
