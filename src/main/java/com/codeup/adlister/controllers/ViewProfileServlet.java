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

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/profile");
            return;
        }
//        User current =(User) request.getSession().getAttribute("user");
//        Artist current;
//        long userid = current.getId();
//        request.setAttribute("ads", DaoFactory.getAdsDao().usersAds(int) userId);
//        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String artistname = request.getParameter("artistname");
//        String genre = request.getParameter("genre");
//        Integer concert_date = Integer.valueOf(request.getParameter("concert_date"));
//        String location = request.getParameter("location");
//        Integer ticketprice = Integer.valueOf(request.getParameter("ticketprice"));
    }

}
