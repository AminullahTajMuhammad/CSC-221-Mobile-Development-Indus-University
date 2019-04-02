package com.amin.indusuniversity.AssignmentsOne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.amin.indusuniversity.R;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtEmail, edtPassword;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        btnLogin = findViewById(R.id.btnLogin);
        edtEmail = findViewById(R.id.edtLogin);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if(email.matches(emailPattern) && !password.equals("")) {
                    Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                    intent.putExtra("Email", email);
                    intent.putExtra("Password", password);
                    startActivity(intent);
                } else {
                    edtEmail.setError("Fill Correct Email");
                    edtPassword.setError("Password is empty");
                }

            }
        });
    }

}
