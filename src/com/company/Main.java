package com.company;

import com.company.entity.Flights;
import com.company.entity.Pilots;
import com.company.entity.Planes;
import com.company.io.*;

import java.util.List;

import static com.company.io.FilePathConstants.PILOTS_SOURCE_FILE;
import static com.company.io.FilePathConstants.PLANES_SOURCE_FILE;
import static com.company.io.FilePathConstants.FLIGHTS_SOURCE_FILE;

public class Main {

    public static void main(String[] args) {
        PilotsFileReader fileReader = new PilotsFileReader(PILOTS_SOURCE_FILE);
        List<Pilots> pilots = fileReader.readItems();

        PilotsDbWriter pilotsDbWriter = new PilotsDbWriter(pilots);
        pilotsDbWriter.saveAll();


        PlanesFileReader planesFileReader = new PlanesFileReader(PLANES_SOURCE_FILE);
        List<Planes> planes = planesFileReader.readItems();

        PlanesDbWriter planesDbWriter = new PlanesDbWriter(planes);
        planesDbWriter.saveAll();


        FlightsFileReader flightsFileReader = new FlightsFileReader(FLIGHTS_SOURCE_FILE);
        List<Flights> flights = flightsFileReader.readItems();

        FlightsDbWriter flightsDbWriter = new FlightsDbWriter(flights);
        flightsDbWriter.saveAll();

    }
}
