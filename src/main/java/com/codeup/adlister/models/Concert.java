package com.codeup.adlister.models;

import java.util.Date;

public class Concert {
    public float getPrice;
    private long user_id;
    private long id;
    private String group_name;
    private String title;

    public Concert(float getPrice, long user_id, long id, String group_name, String title, String location, Date date, float price) {
        this.getPrice = getPrice;
        this.user_id = user_id;
        this.id = id;
        this.group_name = group_name;
        this.title = title;
        this.location = location;
        this.date = date;
        this.price = price;
    }

    private String location;

    public void setGetPrice(float getPrice) {
        this.getPrice = getPrice;
    }

    public float getGetPrice() {
        return getPrice;
    }

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
        return group_name;
    }

    public void setGroupname(String groupname) {
        this.group_name = groupname;
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
        this.group_name = groupname;
        this.title = title;
        this.location = location;
        this.date = date;
        this.price = price;
    }

    private float price;


    public String getGroup_name() {
        return group_name;
    }
}

