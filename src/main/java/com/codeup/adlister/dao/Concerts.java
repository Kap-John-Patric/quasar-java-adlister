package com.codeup.adlister.dao;

import com.codeup.adlister.models.Concert;

import java.util.List;

public interface Concerts {
    // get a list of all the ads
    List<Concert> all();
    // insert a new ad and return the new ad's id
    Long insert(Concert concert);

    List<Concert> searchAds(String name);
}
