package com.codeup.adlister.models;

import com.codeup.adlister.util.Password;

public class Artist {
    private long id;
    private String firstName;
    private String lastName;
    private String bandName;
    private String username;
    private String password;

    public Artist(){}

    public Artist(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        setPassword(password);
    }

    public Artist(long id, String firstName, String lastName, String bandName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bandName = bandName;
    }

    public Artist(String firstName, String lastName, String bandName) {
        this.bandName = bandName;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Password.hash(password);
    }
}
