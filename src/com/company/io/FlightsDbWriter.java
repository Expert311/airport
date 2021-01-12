package com.company.io;

import com.company.entity.Flights;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightsDbWriter {
    private List<Flights> flights;

    private static final String ADD = "INSERT INTO flights (id, plane_id, pilot_id, flight_date, flight_time, flight_number) VALUES(?, ?, ?, ?, ?, ?)";

    public FlightsDbWriter(List<Flights> flights) {
        this.flights = flights;
    }

    public void saveAll() {
        for (Flights flights : flights){
            save(flights);
        }
    }

    private void save(Flights flights){
        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, flights.getId());
            statement.setInt(1, flights.getPlaneId());
            statement.setInt(1, flights.getPilotId());
            statement.setString(2, flights.getFlightDate());
            statement.setString(3, flights.getFlightTime());
            statement.setInt(4, flights.getFlightNumber());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
