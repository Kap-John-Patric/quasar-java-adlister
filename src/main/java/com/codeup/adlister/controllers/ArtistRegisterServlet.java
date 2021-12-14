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
import java.util.Date;


@WebServlet(name = "controllers.ArtistRegisterServlet", urlPatterns = "/artist-register")
public class ArtistRegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/artist.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("userName");
        String email = request.getParameter("eMail");
        String password = request.getParameter("password");
        String genre = request.getParameter("genre");
        String passwordConfirmation = request.getParameter("confirmPassword");

        // validate input
//        boolean inputHasErrors = firstName.isEmpty()
//                || lastName.isEmpty()
//                || username.isEmpty()
//                || password.isEmpty()
//                || (!password.equals(passwordConfirmation));
//
//
//        if (inputHasErrors) {
//            response.sendRedirect("/artist-register");
//            return;
//        }

        // create and save a new artist
        Artist artist = new Artist(firstName, lastName, username, email, password);
        System.out.println(artist.getFirstName());
        System.out.println(artist.getLastName());
        System.out.println(artist.getPassword());
        System.out.println(artist);
        DaoFactory.getArtistsDao().insert(artist);
        response.sendRedirect("/profile");

        response.sendRedirect("/profile");


    }


}
