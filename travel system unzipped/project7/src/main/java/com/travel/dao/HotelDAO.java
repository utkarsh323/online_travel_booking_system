package com.travel.dao;

import com.travel.config.DBUtil;
import com.travel.model.Hotel;
import java.sql.*;
import java.util.*;

public class HotelDAO {

    public List<Hotel> getAllHotels() {
        String sql = "SELECT id, name, location, price FROM hotels ORDER BY price";
        List<Hotel> list = new ArrayList<>();

        try (Connection c = DBUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Hotel h = new Hotel();
                h.setId(rs.getInt("id"));
                h.setName(rs.getString("name"));
                h.setLocation(rs.getString("location"));
                h.setPrice(rs.getDouble("price"));
                list.add(h);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
