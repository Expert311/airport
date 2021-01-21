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

        System.out.println("Старт записи в таблицу pilots");
        PilotsDbWriter pilotsDbWriter = new PilotsDbWriter(pilots);
        pilotsDbWriter.saveAll();
        System.out.println("Запись в таблицу pilots завершена");


        PlanesFileReader planesFileReader = new PlanesFileReader(PLANES_SOURCE_FILE);
        List<Planes> planes = planesFileReader.readItems();

        System.out.println("Старт записи в таблицу planes");
        PlanesDbWriter planesDbWriter = new PlanesDbWriter(planes);
        planesDbWriter.saveAll();
        System.out.println("Запись в таблицу planes завершена");


        FlightsFileReader flightsFileReader = new FlightsFileReader(FLIGHTS_SOURCE_FILE);
        List<Flights> flights = flightsFileReader.readItems();

        System.out.println("Старт записи в flights planes");
        FlightsDbWriter flightsDbWriter = new FlightsDbWriter(flights);
        flightsDbWriter.saveAll();
        System.out.println("Запись в таблицу flights завершена");


        FullInfoDbReader fullInfoDbReader = new FullInfoDbReader();
        fullInfoDbReader.readAll();

        fullInfoDbReader.writeResult();

    }
}
