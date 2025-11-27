package com.travel.dao;

import com.travel.config.DBUtil;
import com.travel.model.Booking;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookingDAO {

    public boolean createBooking(Booking b) {
        String sql = "INSERT INTO bookings (user_id, type, item_id) VALUES (?, ?, ?)";
        try (Connection c = DBUtil.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, b.getUserId());
            ps.setString(2, b.getType());
            ps.setInt(3, b.getItemId());
            int r = ps.executeUpdate();
            return r == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
