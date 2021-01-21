package com.company.io;

import com.company.util.DbConnectionUtil;
import com.company.entity.Result;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullInfoDbReader {
    private final List<Result> resultList = new ArrayList<>();

    private static final String SELECT_ALL = "SELECT f.flight_number, f.flight_date, f.flight_time, a.id_number, a.mark, a.model,"
            + " a.passengers_count, p.last_name, p.first_name, p.id_pilot, p.pilot_rank"
            + "FROM flights f JOIN flights a ON f.flights=a.id JOIN pilots p ON f.pilots = p.id";

    public void readAll() {
        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {

            try (ResultSet result = statement.executeQuery()) {

                while (result.next()) {
                    String flightNumber = result.getString("f.flight_number");
                    String flightDate = result.getString("f.data");
                    String flightTime = result.getString("f.time");
                    int idNumber = result.getInt("a.tail_number");
                    String mark = result.getString("a.brand");
                    String model = result.getString("a.model");
                    int passengersCount = result.getInt("a.passenger_capacity");
                    String lastName = result.getString("p.last_name");
                    String firstName = result.getString("p.name");
                    String idPilot = result.getString("p.pilot_code");
                    int pilotRank = result.getInt("p.pilot_rank");

                    Result res = new Result(flightNumber, flightDate, flightTime, idNumber, mark, model, passengersCount, lastName, firstName, idPilot, pilotRank);
                    resultList.add(res);

                    System.out.println(flightNumber + ", " + flightDate + ", " + flightTime + ", " + idNumber + ", " + mark + " "
                            + model + ", " + passengersCount + ", " + lastName + " " + firstName + ", " + idPilot + " (" + pilotRank + ")");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public void writeResult() {
        try (FileWriter writer = new FileWriter("result\\Result.csv")) {

            for (Result result : resultList) {
                writer.append(result.getFlightNumber()).append(", ");
                writer.append(result.getFlightDate()).append(", ");
                writer.append(result.getFlightTime()).append(", ");
                writer.append(String.valueOf(result.getIdNumber())).append(", ");
                writer.append(result.getMark()).append(", ");
                writer.append(result.getModel()).append(", ");
                writer.append(String.valueOf(result.getPassengersCount())).append(", ");
                writer.append(result.getLastName()).append(", ");
                writer.append(result.getFirstName()).append(", ");
                writer.append(result.getIdPilot()).append(", ");
                writer.append(String.valueOf(result.getPilotRank()));
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}