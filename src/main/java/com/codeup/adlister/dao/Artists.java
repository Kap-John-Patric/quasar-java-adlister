package com.codeup.adlister.dao;

import com.codeup.adlister.models.Artist;
import com.codeup.adlister.models.Concert;

import java.util.List;

public interface Artists {
    Artist findByTitle(String username);
    Long insert(Artist artists);

    List<Concert> searchAds(String name);

    Object all();
}
