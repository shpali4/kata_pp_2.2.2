package web.models;

public class Car {
    private final String model;
    private final double engine;
    private final int year;

    public Car(String model, double engine, int year) {
        this.model = model;
        this.engine = engine;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }
}
