package com.company.io;

import com.company.entity.Planes;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlanesDbWriter {
    private List<Planes> planes;

    private static final String ADD = "INSERT INTO planes (id, mark, model, passengers_count, id_number) VALUES(?, ?, ?, ?, ?)";

    public PlanesDbWriter(List<Planes> planes) {
        this.planes = planes;
    }

    public void saveAll() {
        for (Planes planes : planes){
            save(planes);
        }
    }

    private void save(Planes planes){
        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, planes.getId());
            statement.setString(2, planes.getMark());
            statement.setString(3, planes.getModel());
            statement.setInt(4, planes.getPassengersCount());
            statement.setInt(5, planes.getIdNumber());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
