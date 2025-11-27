package com.travel.servlet;

import com.travel.dao.HotelDAO;
import com.travel.model.Hotel;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/hotels")
public class HotelListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Hotel> hotels = new HotelDAO().getAllHotels();
        req.setAttribute("hotels", hotels);

        req.getRequestDispatcher("hotels.jsp").forward(req, resp);
    }
}
