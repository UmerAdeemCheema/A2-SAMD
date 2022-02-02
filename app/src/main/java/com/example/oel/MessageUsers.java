package com.example.oel;

public class MessageUsers {
    public static String user1[] = new String[0];
    public static String user2[] = new String[0];
    public static String user3[] = new String[0];
    public static String user4[] = new String[0];

    public static void addTodo(String dayName, String toDo){
        if(dayName.equals("user1")){
            int newlength = user1.length + 1;
            String mon[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    mon[i]= toDo;
                }
                else{
                    mon[i]=user1[i];
                }
            }
            user1 =mon;
        }
        if(dayName.equals("user2")){
            int newlength = user2.length + 1;
            String tue[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    tue[i]= toDo;
                }
                else{
                    tue[i]=user2[i];
                }
            }
            user2 =tue;
        }
        if(dayName.equals("user3")){
            int newlength = user3.length + 1;
            String wed[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    wed[i]= toDo;
                }
                else{
                    wed[i]=user3[i];
                }
            }
            user3 =wed;
        }
        if(dayName.equals("user4")){
            int newlength = user3.length + 1;
            String thu[] = new String[newlength];
            for (int i=0; i<newlength;i++){
                if(i==newlength-1){
                    thu[i]= toDo;
                }
                else{
                    thu[i]=user4[i];
                }
            }
            user4 =thu;
        }
    }
}
