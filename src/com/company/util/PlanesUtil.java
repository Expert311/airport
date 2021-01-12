package com.company.util;

import com.company.entity.Planes;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlanesUtil {
    public static Planes toObject(String line){
        String[] planesArgs = line.split(";");

        int id = Integer.parseInt(planesArgs[0]);
        String mark = planesArgs[1];
        String model = planesArgs[2];
        int passengersCount = Integer.parseInt(planesArgs[3]);
        int idNumber = Integer.parseInt(planesArgs[4]);

        return new Planes(id, mark, model, passengersCount, idNumber);
    }

    public static Planes toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String mark = resultSet.getString("mark");
        String model = resultSet.getString("model");
        int passengersCount = resultSet.getInt("passengers_count");
        int idNumber = resultSet.getInt("id_number");

        return new Planes(id, mark, model, passengersCount, idNumber);
    }
}
