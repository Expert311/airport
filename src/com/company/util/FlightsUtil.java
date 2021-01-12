package com.company.util;

import com.company.entity.Flights;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightsUtil {
    public static Flights toObject(String line){
        String[] flightsArgs = line.split(";");

        int id = Integer.parseInt(flightsArgs[0]);
        int planeId = Integer.parseInt(flightsArgs[1]);
        int pilotId = Integer.parseInt(flightsArgs[2]);
        String flightDate = flightsArgs[3];
        String flightTime = flightsArgs[4];
        int flightNumber = Integer.parseInt(flightsArgs[5]);

        return new Flights(id, planeId, pilotId, flightDate, flightTime, flightNumber);
    }

    public static Flights toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        int planeId = resultSet.getInt("plane_id");
        int pilotId = resultSet.getInt("pilot_id");
        String flightDate = resultSet.getString("flight_date");
        String flightTime = resultSet.getString("flight_time");
        int flightNumber = resultSet.getInt("flight_number");

        return new Flights(id, planeId, pilotId, flightDate, flightTime, flightNumber);
    }
}
