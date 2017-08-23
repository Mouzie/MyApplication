package com.example.admin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button btn, btnLogin;
    EditText txtName, txtSurname, txtEmail, txtPassword, txtCpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Finding each view located in the view part
        txtName = (EditText)findViewById(R.id.txtName);
        txtSurname = (EditText)findViewById(R.id.txtSurname);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        txtCpassword = (EditText)findViewById(R.id.txtCpassword);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        //Button listening to any click events
        btnLogin.setOnClickListener(this);
    }

    //Method to handle click events
    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnLogin:
                    break;
        }
    }
}
