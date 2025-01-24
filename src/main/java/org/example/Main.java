package org.example;

import org.example.builderMapping.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .model("Brezza")
                .year(2023)
                .create();
        System.out.print(car.getModel()+" "+car.getYear());

    }
}