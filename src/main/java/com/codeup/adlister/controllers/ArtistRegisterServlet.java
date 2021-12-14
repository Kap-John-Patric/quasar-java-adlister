package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Artist;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "controllers.ArtistRegisterServlet", urlPatterns = "/artist-register")
public class ArtistRegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/artist.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("FirstName");
        String lastName = request.getParameter("LastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        // validate input
        boolean inputHasErrors = firstName.isEmpty()
                || lastName.isEmpty()
                || username.isEmpty()
                || password.isEmpty()
                || (!password.equals(passwordConfirmation));


        if (inputHasErrors) {
            response.sendRedirect("/artist-register");
            return;
        }

        // create and save a new artist
        Artist artist = new Artist(firstName, lastName, username);
        DaoFactory.getArtistsDao().insert(artist);
        response.sendRedirect("/profile");
    }


}
