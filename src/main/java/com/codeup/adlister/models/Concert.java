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
}


