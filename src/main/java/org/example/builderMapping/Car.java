package org.example.builderMapping;

public class Car {
    private final String model;
    private final int year;

    protected Car(Car.Builder carBuilder){
        this.model = carBuilder.model;
        this.year = carBuilder.year;
    }

    public static Car.Builder builder(){
        return new Car.Builder();
    }

    public static class Builder{
        private String model;
        private int year;
        public Builder model(String model){
            this.model= model;
            return this;
        }
        public Builder year(int year){
            this.year = year;
            return this;
        }
        public Car create(){
            return new Car(this);
        }
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
