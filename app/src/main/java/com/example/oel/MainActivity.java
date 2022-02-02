package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent registerIntent;
    Intent userIntent;
    EditText username;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.lUserId);
        pass = findViewById(R.id.lPass);
        registerIntent = new Intent(getBaseContext(), RegisterActivity.class);
        userIntent = new Intent(getBaseContext(), UserActivity.class);
        this.setTitle("APP OEL");
        Users.initializeUsers();
    }

    public void login(View view) {
        User u = Users.login(username.getText().toString(), pass.getText().toString());
        if (u == null){
            Toast.makeText(getApplicationContext(), "Incorrect credentials ", Toast.LENGTH_SHORT).show();
            return;
        }
        if (u.type.equals("parent")){
            Intent parentIntent = new Intent(getBaseContext(), ParentActivity.class);
            parentIntent.putExtra("user",u);
            startActivity(parentIntent);
        }
        else{
            userIntent.putExtra("user",u);
            startActivity(userIntent);
        }
    }

    public void register(View view) {
        startActivity(registerIntent);
    }
}