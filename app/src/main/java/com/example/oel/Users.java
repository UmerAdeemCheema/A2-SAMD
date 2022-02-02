package com.example.oel;

import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Users {
    static String logforparent = "Activity of Child";
    static List<User> userList = new ArrayList<User>();

    public static void initializeUsers(){
        register("alpha","Alpha", "parent", "abc");
        register("bravo","Bravo", "16", "abc");
        register("charlie","Charlie", "10", "abc");
    }

    public static void register(String name,String username,String age, String password){
        User u = new User(name,username,age,password);
        userList.add(u);
    }
    static int click = 1;
    public static User login(String username, String password){
        for (User u : userList) {
            if (u.username.equals(username) && u.password.equals(password)) {
                if(u.type.equals("parent") && click != 3){
                    Log.e("aaa","bbbbbbbbbbbbbbbb"+click);
                    click++;
                    return null;
                }
                click = 1;
                return u;
            }
        }
        return null;
    }
}

class User implements Serializable {
String name;
String username;
String age;
String type;
String password;
User(String name,String username,String age, String password){
    this.name = name;
    this.username = username;
    this.type = age;
    this.age = age;
    this.password = password;
}
}
