package com.kaczaf.passwordcheckapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private TextView logInfo;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final User admin = new User("admin", "qwerty1234");
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.loginUsername);
        password = (EditText) findViewById(R.id.password);
        logInfo = (TextView) findViewById(R.id.loginInfo);
        btnLogin = (Button) findViewById(R.id.logButton);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(admin.userNameCheck(username.getText().toString()) && admin.passwordCheck(password.getText().toString())){
                        Intent intend = new Intent(MainActivity.this, Afterlogin.class);
                        startActivity(intend);
                }else{
                    logInfo.setText("Wrong username or password! \n Try again.");
                    logInfo.setTextColor(Color.RED);
    
                }

            }
        });

    }



}
