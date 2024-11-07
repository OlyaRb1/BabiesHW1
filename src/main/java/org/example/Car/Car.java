package org.example.Car;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }


    @Override
    public void start() {
        System.out.println("Вы начали свой путь на автомобиле " + this.brand + " " + this.model + " " + this.year + " года выпуска");
    }

    @Override
    public void stop() {
        System.out.println("Ваш заезд окончен");

    }

    @Override
    public void distance() {
        System.out.println("Вы преодолели гонку, но автомобиль " + this.brand + " " + this.model + " вышел из строя");

    }
}
