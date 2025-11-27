package com.travel.servlet;

import com.travel.dao.FlightDAO;
import com.travel.model.Flight;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/flights")
public class FlightListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        FlightDAO dao = new FlightDAO();
        List<Flight> flights = dao.getAllFlights();

        req.setAttribute("flights", flights);
        req.getRequestDispatcher("/flights.jsp").forward(req, resp);
    }
}
