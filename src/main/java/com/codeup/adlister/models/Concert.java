package com.codeup.adlister.models;

public class Concert {
    private long user_id;
    private long id;
    private String username;
    private String bandName;
    private String title;
    private String description;
    private String location;
    private float ticketPrice;

    public Concert(long user_id, String username, String title, String description) {
        this.user_id = user_id;
        this.username = username;
        this.title = title;
        this.description = description;

    }

    public Concert(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Concert(long user_id, String username, String location, String title, String description, float ticketPrice) {
        this.user_id = user_id;
        this.username = username;
        this.location = location;
        this.title = title;
        this.description = description;
        this.ticketPrice = ticketPrice;
    }

    public Concert(String artistname, String genre, String concert_date, String location, String ticketprice) {
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

    public void setId(long userId) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
