package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Artist;
import com.codeup.adlister.models.Concert;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute(
                "artists",
                DaoFactory.getArtistsDao().all()
        );
        request.getRequestDispatcher("/WEB_INF/artists.jsp").forward(request,response);

    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String username = request.getParameter("artist");
//        String title = request.getParameter("title");
//        String location = request.getParameter("location");
//        String date = request.getParameter("date");
//        String price = request.getParameter("price");
//        User user = DaoFactory.getUsersDao().findByUsername(username);
//        response.sendRedirect("profile");
//
//    }

}
