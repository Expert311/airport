package com.company.entity;

public class Pilots {

    private int id;
    private String firstName;
    private String lastName;
    private int pilotRank;
    private int idPilot;

    public Pilots(int id, String firstName, String lastName, int pilotRank, int idPilot) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pilotRank = pilotRank;
        this.idPilot = idPilot;
    }

    public int getId() {
        return id;
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

    public int getPilotRank() {
        return pilotRank;
    }

    public void setPilotRank(int pilotRank) {
        this.pilotRank = pilotRank;
    }

    public int getIdPilot() {
        return idPilot;
    }

    public void setIdPilot(int idPilot) {
        this.idPilot = idPilot;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pilotRank=" + pilotRank +
                ", idPilot=" + idPilot +
                '}';
    }
}
