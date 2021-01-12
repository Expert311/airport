package com.company.io;

import com.company.entity.Planes;
import com.company.util.PlanesUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlanesFileReader {
    private final String filePath;

    public PlanesFileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Planes> readItems() {
        List<Planes> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {

                Planes planes = PlanesUtil.toObject(line);

                result.add(planes);
            }

        } catch (IOException e) {
            System.out.println("Read file error");
        }
        return result;
    }
}
