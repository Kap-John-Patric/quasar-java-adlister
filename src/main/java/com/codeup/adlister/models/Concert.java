package com.codeup.adlister.models;

import java.util.Date;

public class Concert {
    public float getPrice;
    private long user_id;
    private long id;
    private String groupname;
    private String title;
    private String location;
    private Date date;

    public Concert(int user_id, String groupname, String title, String location, String date, String price) {
    }

    public Concert(long id, String groupName, String title, String location, java.sql.Date date, float price) {
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Concert(long user_id, long id, String groupname, String title, String location, Date date, float price) {
        this.user_id = user_id;
        this.id = id;
        this.groupname = groupname;
        this.title = title;
        this.location = location;
        this.date = date;
        this.price = price;
    }

    private float price;


}

