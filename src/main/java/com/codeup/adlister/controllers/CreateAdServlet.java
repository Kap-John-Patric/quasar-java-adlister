package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Artists;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Concert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {

    private Object String;
    private Object Float;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
               String group_name = request.getParameter("group_name");
                String title = request.getParameter("title");
                String location = request.getParameter("location");
                String = request.getParameter("date");
                Float = request.getParameter("price");

        String date = "";
        String price = "";
        Concert concert = new Concert (group_name,title,location, date, price);
        DaoFactory.getConcertDao().insert(concert);

        response.sendRedirect("/ads");


    }
}
