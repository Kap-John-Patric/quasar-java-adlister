package com.codeup.adlister.controllers;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Artist;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if (request.getSession().getAttribute("user") != null) {
//            response.sendRedirect("/profile");
//            return;
//        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = DaoFactory.getUsersDao().findByUsername(username);
//        if (user == null) {
//            response.sendRedirect("/login");
//        }
//        HttpSession currentSession = request.getSession();

//        boolean validAttempt = Password.check(password, user.getPassword());
//        if (validAttempt) {
////            currentSession.setAttribute("validAttempt", true);
//            request.getSession().setAttribute("user", user);
//            response.sendRedirect("/profile");
////            response.getWriter().println("Successful login");
//        } else {
//            response.sendRedirect("/login");
////            response.getWriter().println("Invalid login");
//
//        }
        response.sendRedirect("/ads");
    }
}

