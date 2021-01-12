package com.company.io;

import com.company.entity.Planes;
import com.company.util.DbConnectionUtil;
import com.company.util.PlanesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlanesDbReader {
    private static final String SELECT_ALL = "SELECT * FROM planes";

    public List<Planes> readAll() {
        List<Planes> res = new ArrayList<>();

        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
            }
            Planes planes = PlanesUtil.toObject(result);

            res.add(planes);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
