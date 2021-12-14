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
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");

        }
//        User current = (User) request.getSession().getAttribute("user");
//        long userId = current.getId();
//        request.setAttribute("ads", DaoFactory.getAdsDao().usersAds(int) userId));
//        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String genre = request.getParameter("genre");
        String concert_date = request.getParameter("concert_date");
        String location = request.getParameter("location");
        String ticketprice = request.getParameter("ticketprice");

//        Concert concert = new Concert(username,genre,concert_date,location,ticketprice);
//        DaoFactory.getConcertDao().insert(concert);
//        response.sendRedirect("/profile");
    }

}
