package com.codeup.adlister.dao;

import com.codeup.adlister.models.Artist;

public interface Artists {
    Artist findByTitle(String title);
    Long insert(Artist artists);
}
