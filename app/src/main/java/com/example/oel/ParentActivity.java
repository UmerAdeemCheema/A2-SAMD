package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ParentActivity extends AppCompatActivity {
    static TextView logMessagestxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        logMessagestxt = (TextView) findViewById(R.id.logMessagestxt);
        this.logMessagestxt.setMovementMethod(new ScrollingMovementMethod());
        logMessagestxt.setText(Users.logforparent);
        this.setTitle("APP OEL");
    }

    public void onBtnClear(View view) {
        Users.logforparent = "Activity of Child";
    }
}