package com.company.entity;

public class Result {

    private String flightNumber;
    private String flightDate;
    private String flightTime;
    private int idNumber;
    private String mark;
    private String model;
    private int passengersCount;
    private String firstName;
    private String lastName;
    private String idPilot;
    private int pilotRank;

    public Result(String flightNumber, String flightDate, String flightTime, int idNumber, String mark, String model, int passengersCount, String firstName, String lastName, String idPilot, int pilotRank) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.idNumber = idNumber;
        this.mark = mark;
        this.model = model;
        this.passengersCount = passengersCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPilot = idPilot;
        this.pilotRank = pilotRank;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdPilot() {
        return idPilot;
    }

    public void setIdPilot(String idPilot) {
        this.idPilot = idPilot;
    }

    public int getPilotRank() {
        return pilotRank;
    }

    public void setPilotRank(int pilotRank) {
        this.pilotRank = pilotRank;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flightNumber='" + flightNumber + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", flightTime='" + flightTime + '\'' +
                ", idNumber=" + idNumber +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", passengersCount=" + passengersCount +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idPilot='" + idPilot + '\'' +
                ", pilotRank=" + pilotRank +
                '}';
    }
}
