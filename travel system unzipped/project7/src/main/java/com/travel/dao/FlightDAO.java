package com.travel.dao;

import com.travel.config.DBUtil;
import com.travel.model.Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    public List<Flight> getAllFlights() {
        String sql = "SELECT id, source, destination, date, price FROM flights ORDER BY date";
        List<Flight> list = new ArrayList<>();
        try (Connection c = DBUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Flight f = new Flight();
                f.setId(rs.getInt("id"));
                f.setSource(rs.getString("source"));
                f.setDestination(rs.getString("destination"));
                f.setDate(rs.getDate("date"));
                f.setPrice(rs.getDouble("price"));
                list.add(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
