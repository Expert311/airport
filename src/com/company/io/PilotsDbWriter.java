package com.company.io;

import com.company.entity.Pilots;
import com.company.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotsDbWriter {
    private List<Pilots> pilots;

    private static final String ADD = "INSERT INTO pilots (id, first_name, last_name, pilot_rank, id_pilot) VALUES(?, ?, ?, ?, ?)";

    public PilotsDbWriter(List<Pilots> pilots) {
        this.pilots = pilots;
    }

    public void saveAll() {
        for (Pilots pilots : pilots){
            save(pilots);
        }
    }

    private void save(Pilots pilots){
        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, pilots.getId());
            statement.setString(2, pilots.getFirstName());
            statement.setString(3, pilots.getLastName());
            statement.setInt(4, pilots.getPilotRank());
            statement.setInt(5, pilots.getIdPilot());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    }
