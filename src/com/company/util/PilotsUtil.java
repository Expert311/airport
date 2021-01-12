package com.company.util;

import com.company.entity.Pilots;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PilotsUtil {

    public static Pilots toObject(String line){
        String[] pilotsArgs = line.split(";");

        int id = Integer.parseInt(pilotsArgs[0]);
        String firstName = pilotsArgs[1];
        String lastName = pilotsArgs[2];
        int pilotRank = Integer.parseInt(pilotsArgs[3]);
        int idPilot = Integer.parseInt(pilotsArgs[4]);

        return new Pilots(id, firstName, lastName, pilotRank, idPilot);
    }

    public static Pilots toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        int pilotRank = resultSet.getInt("pilot_rank");
        int idPilot = resultSet.getInt("id_pilot");

        return new Pilots(id, firstName, lastName, pilotRank, idPilot);
    }
}
