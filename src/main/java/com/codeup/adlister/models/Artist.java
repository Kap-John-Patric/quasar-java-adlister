package com.codeup.adlister.models;

import com.codeup.adlister.util.Password;

import java.util.Date;

public class Artist {
    private long userId;


    private long id;
    private String firstName;
    private String lastName;
    private String bandName;
    private String username;
    private String password;
    private String email;
    private String genre;
    private Date concertDate;
    private Float ticketPrice;

    public Artist() {
    }

    public Artist(String firstName, String lastName, String username, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getConcertDate() {
        return concertDate;
    }

    public void setConcertDate(Date concertDate) {
        this.concertDate = concertDate;
    }

    public Float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
