package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.Artist;
import com.codeup.adlister.models.Concert;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.sql.*;
import java.util.List;

public class MySQLArtistDao implements Artists {
    private Connection connection;

    public MySQLArtistDao(Config config) {
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
            result.getString("groupName")
            );
    }

    @Override
    public Long insert(Artist artists) {
        String query = "INSERT INTO artist(user_id, username, firstName,lastName, email, password) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, artists.getUser_id());
            stmt.setString(2, artists.getUsername());
            stmt.setString(3, artists.getFirstName());
            stmt.setString(4, artists.getLastName());
            stmt.setString(5, artists.getEmail());
            stmt.setString(6, artists.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating new user", e);
        }
    }

    @Override
    public List<Concert> searchAds(String name) {
        return null;
    }

}
