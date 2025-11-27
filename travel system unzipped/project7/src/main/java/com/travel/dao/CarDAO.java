package com.travel.dao;

import com.travel.config.DBUtil;
import com.travel.model.Car;

import java.sql.*;
import java.util.*;

public class CarDAO {

    public List<Car> getAllCars() {
        String sql = "SELECT id, company, model, price FROM cars ORDER BY price";
        List<Car> list = new ArrayList<>();

        try (Connection c = DBUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getInt("id"));
                car.setCompany(rs.getString("company"));
                car.setModel(rs.getString("model"));
                car.setPrice(rs.getDouble("price"));
                list.add(car);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
