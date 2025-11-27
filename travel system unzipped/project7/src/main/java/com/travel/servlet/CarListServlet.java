package com.travel.servlet;

import com.travel.dao.CarDAO;
import com.travel.model.Car;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/cars")
public class CarListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Car> cars = new CarDAO().getAllCars();
        req.setAttribute("cars", cars);

        req.getRequestDispatcher("cars.jsp").forward(req, resp);
    }
}
