package com.travel.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        // Simple hard-coded admin for demo. Replace with DB check for production.
        if ("admin".equals(user) && "admin123".equals(pass)) {
            resp.sendRedirect(req.getContextPath() + "/admin/dashboard.jsp");
        } else {
            resp.getWriter().println("Invalid Admin Login");
        }
    }
}
