package com.amin.indusuniversity.AssignmentsOne;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.amin.indusuniversity.R;

public class RegisterActivity extends AppCompatActivity {
    EditText edtName, edtFatherName, edtAddress, edtEmail, edtPassword;
    String name, fatherName, address, email, password;
    RadioGroup rdGender;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtRName);
        edtFatherName = findViewById(R.id.edtRFatherName);
        edtEmail = findViewById(R.id.edtREmail);
        edtPassword = findViewById(R.id.edtRPassword);
        edtAddress = findViewById(R.id.edtRAddress);


        rdGender = findViewById(R.id.radioGroup);

        name = edtName.getText().toString();
        fatherName = edtFatherName.getText().toString();
        address = edtAddress.getText().toString();
        password = edtPassword.getText().toString();
        email = edtEmail.getText().toString();

        rdGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });

        Intent intent = new Intent();
        intent.putExtra("Name", name);
        intent.putExtra("Father_Name", fatherName);
        intent.putExtra("Address", address);
        intent.putExtra("Password", password);
        intent.putExtra("Email", email);
    }
}
