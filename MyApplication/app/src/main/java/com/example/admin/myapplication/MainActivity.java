package com.example.admin.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    UserLocalStorage userLocalDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.Invoke);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
        userLocalDatabase = new UserLocalStorage(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(authenticate() == true){
            displayDetails();
        }
    }

    private void displayDetails(){
        
    }

    private boolean authenticate(){
        return userLocalDatabase.getUserLoggedIn();
    }
}
