package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.Concert;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Concerts {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
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
    public List<Concert> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM concert");
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }



    public Long insert(Concert concert) {
        try {
            String insertQuery = "INSERT INTO concert(userId, groupName, title, description, ticketPrice, concertDate) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, concert.getUser_id());
            stmt.setString(2, concert.getGroupName());
            stmt.setString(3, concert.getTitle());
            stmt.setString(4, concert.getDescription());
//            stmt.setString(5, String.valueOf(concert.getTicketPrice()));
//            stmt.setString(6, String.valueOf(concert.getconcertDate()));
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new concert.", e);
        }
    }

    @Override
    public List<Concert> searchAds(String name) {
        PreparedStatement stmt;
        try {
            String searchQuery = "SELECT * FROM artist WHERE username LIKE ?";
            String  searchName = "%" + name + "%";
            stmt = connection.prepareStatement(searchQuery);
            stmt.setString(1, searchName);
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving searched names.", e);
        }
    }

    private Concert extractConcert(ResultSet rs) throws SQLException {
        return new Concert(
            rs.getLong("id"),
            rs.getString("groupName"),
//            rs.getString(String.valueOf(Float.parseFloat(("ticketPrice")))),
//            rs.getDate(String.valueOf("concertDate")),
            rs.getString("title"),
            rs.getString("description")
        );
    }

    private List<Concert> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Concert> concerts = new ArrayList<>();
        while (rs.next()) {
            concerts.add(extractConcert(rs));
        }
        return concerts;
    }
}
