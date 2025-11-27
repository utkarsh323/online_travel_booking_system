package com.travel.servlet;

import com.travel.dao.UserDAO;
import com.travel.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pass = req.getParameter("password");

        User u = new User(name, email, pass);
        UserDAO dao = new UserDAO();
        boolean success = dao.registerUser(u);

        if (success) resp.sendRedirect("login.html");
        else resp.getWriter().println("Registration Failed");
    }
}
