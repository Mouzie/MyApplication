package com.example.admin.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by admin on 2017/08/23.
 */

public class UserLocalStorage {
    public final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    //Constructor for UserLocalStorage
    public UserLocalStorage(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user){
        //Used to store and edit user information
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();

        //Using the spEditor to get and edit values of the properties in the POJO
        spEditor.putString("name", user.getName());
        spEditor.putString("surname", user.getSurname());
        spEditor.putString("email", user.getEmail());
        spEditor.putString("password", user.getPassword());
        spEditor.putString("cPassword", user.getCPassword());
        //Commit changes after data has been stored
        spEditor.commit();
    }

    public User getLoggedInUser() {
        //Gets the name of the current logged in user or uses the default name of the user
        String name = userLocalDatabase.getString("name","");
        String surname = userLocalDatabase.getString("surname", "");
        String email = userLocalDatabase.getString("email", "");
        String password = userLocalDatabase.getString("password", "");
        String cPassword = userLocalDatabase.getString("cPassword", "");


        User storedUser = new User(name, surname, email, password, cPassword);

        return storedUser;
    }

    public void setUserLoggedIn(Boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public void clearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
