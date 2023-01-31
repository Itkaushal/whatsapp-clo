package com.kaushal.firebasspractice.Models;

public class Users {
    String profile , username, mail, userId, lastMessage, password;

    public Users(String profile, String username, String mail, String userId, String lastMessage, String password) {
        this.profile = profile;
        this.username = username;
        this.mail = mail;
        this.userId = userId;
        this.lastMessage = lastMessage;
        this.password = password;
    }
    public Users(String s, String toString, String string){}
    //Signup constructor
    public Users( String username, String mail, String userId, String lastMessage, String password) {
        this.username = username;
        this.mail = mail;
        this.password = password;
    }


    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

