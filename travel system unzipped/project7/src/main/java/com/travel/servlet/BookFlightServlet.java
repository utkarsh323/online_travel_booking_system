package com.travel.servlet;

import com.travel.dao.BookingDAO;
import com.travel.model.Booking;
import com.travel.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/bookFlight")
public class BookFlightServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String idStr = req.getParameter("id");
        int flightId = Integer.parseInt(idStr);

        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            resp.sendRedirect("login.html");
            return;
        }
        User u = (User) session.getAttribute("user");

        Booking b = new Booking();
        b.setUserId(u.getId());
        b.setType("flight");
        b.setItemId(flightId);

        BookingDAO dao = new BookingDAO();
        boolean ok = dao.createBooking(b);
        if (ok) resp.getWriter().println("Flight booked successfully. Go to your itinerary (not implemented in this template).");
        else resp.getWriter().println("Booking failed.");
    }
}
