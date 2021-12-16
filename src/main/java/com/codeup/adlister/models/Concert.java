package com.codeup.adlister.models;

import java.util.Date;

public class Concert {
    private long user_id;
    private long id;
    private String groupName;
    private String title;
    private String description;
    private Date concertDate;
    private float ticketPrice;

    public Concert(long user_id, long id, String groupName, String title, String description, Date concertDate, float ticketPrice) {
        this.user_id = user_id;
        this.id = id;
        this.groupName = groupName;
        this.title = title;
        this.description = description;
        this.concertDate = concertDate;
        this.ticketPrice = ticketPrice;
    }

    public Concert(long id, String groupName, String title, String description) {
        this.id = id;
        this.groupName = groupName;
        this.title = title;
        this.description = description;
    }


    public Concert(long id, String groupName, String string, java.sql.Date concertDate, String title, String description) {
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public Date getconcertDate() {
        return concertDate;
    }

    public void setconcertDate(Date concertDate) {
        this.concertDate = concertDate;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}





