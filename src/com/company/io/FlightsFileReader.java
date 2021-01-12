package com.company.io;

import com.company.entity.Flights;
import com.company.util.FlightsUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsFileReader {
    private final String filePath;

    public FlightsFileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Flights> readItems() {
        List<Flights> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {

                Flights flights = FlightsUtil.toObject(line);

                result.add(flights);
            }

        } catch (IOException e) {
            System.out.println("Read file error");
        }
        return result;
    }
}
