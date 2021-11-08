package SoftUni;

public class Seat implements Car{
    private final String color;
    private final String model;
    private final Integer horsePower;
    private final String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduce) {
        this.color = color;
        this.model = model;
        this.horsePower = horsePower;
        this.countryProduced = countryProduce;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.model, this.countryProduced, TIRES);
    }
}
