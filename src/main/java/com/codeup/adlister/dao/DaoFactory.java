package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
//import com.codeup.adlister.models.Artist;

public class DaoFactory {
    private static Concerts concertDao;
    private static Users usersDao;
    private static Artists artistsDao;
    private static Config config = new Config();

    public static Concerts getConcertDao() {
        if (concertDao == null) {
            concertDao = new MySQLAdsDao(config);
        }
        return concertDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

    public static Artists getArtistsDao(){
        if(artistsDao == null){
            artistsDao = new MySQLArtistDao(config);
        }
        return artistsDao;
    }
}
