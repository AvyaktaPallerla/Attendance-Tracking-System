package com.example.s528162.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.button);

        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText3);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                login();
            }
        });
    }
    public void login(){
        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("S528162")&& pass.equals("Northwest")){
            Toast.makeText(this,"username and password matches", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        else if (user.equals("S528149")&&pass.equals("Northwest")){
            Toast.makeText(this,"username and password matches", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"username and password donot match", Toast.LENGTH_LONG).show();
        }
    }
}
