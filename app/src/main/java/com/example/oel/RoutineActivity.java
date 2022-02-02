package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RoutineActivity extends AppCompatActivity {

    static ListView TodoList;
    static String dayName;
    Intent AddTodoActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
        TodoList = (ListView) findViewById(R.id.routineList);
        dayName = getIntent().getStringExtra("dayName");
        this.AddTodoActivity = new Intent(this, AddRoutineActivity.class);
        this.setTitle("APP OEL");
        loadList();
    }


    @Override
    protected void onResume() {
        super.onResume();
        loadList();
    }

    public void loadList(){
        ArrayAdapter<String> adapter;
        if(dayName.equals("user1")){
            adapter = new ArrayAdapter<String>(this, R.layout.activity_view_list, R.id.textView, MessageUsers.user1);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("user2")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, MessageUsers.user2);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("user3")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, MessageUsers.user3);
            TodoList.setAdapter(adapter);
        }
        if(dayName.equals("user4")){
            adapter = new ArrayAdapter<String>(this,R.layout.activity_view_list, R.id.textView, MessageUsers.user4);
            TodoList.setAdapter(adapter);
        }
    }

    public void add(View view) {
        AddTodoActivity.putExtra("dayName", dayName);
        startActivity(AddTodoActivity);
        loadList();
    }

    public void call(View view) {
        Toast.makeText(getApplicationContext(),"Called "+dayName, Toast.LENGTH_SHORT).show();
        Users.logforparent = Users.logforparent+"\n Called :"+dayName;
    }
}