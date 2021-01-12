package com.company.entity;

public class Planes {
    private int id;
    private String mark;
    private String model;
    private int passengersCount;
    private int idNumber;

    public Planes(int id, String mark, String model, int passengersCount, int idNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.passengersCount = passengersCount;
        this.idNumber = idNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", passengers_count=" + passengersCount +
                ", id_number=" + idNumber +
                '}';
    }
}
