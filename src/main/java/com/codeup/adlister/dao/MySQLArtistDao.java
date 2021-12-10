package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.Artist;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.sql.*;

public class MySQLArtistDao implements Artists {
        private Connection connection;

        public MySQLArtistDao(Config config){
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to the database!", e);
            }
        }



    @Override
    public Artist findByTitle(String title) {
        String query = "SELECT * FROM concert WHERE title = ? LIMIT 5";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, title);
            return extractArtist(stmt.executeQuery());
        } catch (SQLException e) {
            throw new RuntimeException("Error finding that title", e);
        }
    }

    private Artist extractArtist(ResultSet result) throws SQLException {
            if(! result.next()){
                return null;
            }
            return new Artist(
            result.getLong("id"),
            result.getString("firstName"),
            result.getString("lastName"),
            result.getString("bandName")
            );
    }

    @Override
    public Long insert(Artist artists) {
        return null;
    }

}
