package com.kaczaf.passwordcheckapp;

public class User {
   private String name;
   private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean passwordCheck(String password){
        if(this.password.equals(password)){
            return true;
        }
        return false;
    }

    public boolean userNameCheck(String userName){
        if(this.name.equals(userName)){
            return true;
        }
        return false;
    }
}
