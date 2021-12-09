package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.Connector;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = DaoFactory.getUsersDao().findByUsername(username);
        if (user == null) {
            response.sendRedirect("/login");
            return;
        }

        boolean validAttempt = password.equals(user.getPassword());

        if (validAttempt) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }


        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        boolean isAuthenticated = BCrypt.checkpw(password, hash);
        try {
            connection = Connector.ConnectDb();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username= '" + username + "'");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if (BCrypt.checkpw(password, resultSet.getString("Password"))) {


                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
