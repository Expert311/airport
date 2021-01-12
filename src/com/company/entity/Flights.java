package com.company.entity;

public class Flights {
    private int id;
    private int planeId;
    private int pilotId;
    private String flightDate;
    private String flightTime;
    private int flightNumber;

    public Flights(int id, int planeId, int pilotId, String flightDate, String flightTime, int flightNumber) {
        this.id = id;
        this.planeId = planeId;
        this.pilotId = pilotId;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.flightNumber = flightNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public int getPilotId() {
        return pilotId;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", planeId=" + planeId +
                ", pilotId=" + pilotId +
                ", flightDate='" + flightDate + '\'' +
                ", flightTime='" + flightTime + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
