package com.example.loginapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private String tagName="LoginActivity";
    private TextView tvTitle;
    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(tagName, "OnCreate is called");
        initViews();
        assignPageTitle();
        initLoginButtonAction();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tagName, "onStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tagName, "onResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tagName, "onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tagName, "onStop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tagName, "onDestroy is called");
    }

    private void initViews(){
        tvTitle=findViewById(R.id.tv_title);
        etEmail=findViewById(R.id.et_email);
        etPassword=findViewById(R.id.et_password);
        btnLogin=findViewById(R.id.btn_login);
    }

    private void assignPageTitle(){
        tvTitle.setText(R.string.login_title);
    }

    private void initLoginButtonAction(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginButtonClicked();

            }
        });

        btnLogin.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Log.d(tagName, "Button is long clicked.");
                return true;
            }
        });
    }

    private void onLoginButtonClicked(){
        Log.d(tagName, "Button is clicked.");
        String email=etEmail.getText().toString();
        Log.d(tagName, "Email ::: " + email );
        String password=etPassword.getText().toString();
        Log.d(tagName, "Email ::: " + password);
        if(email.equalsIgnoreCase( "urgentsering77@gmail.com") && password.equals( "Heaven740")){
            Log.d(tagName,"Login Successful.");
            Toast.makeText(this, "Login Success.",Toast.LENGTH_SHORT).show();
        }
        else{
            Log.d(tagName, "Login Failed.");
            Toast.makeText(this, "Login Failed.",Toast.LENGTH_SHORT).show();
        }
    }

}