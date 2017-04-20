package ooabusers.switches;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarDetailsTest {

    @Test public void
    should_return_the_fuel_capacity_of_the_sports_car() {
        Car car = new Car(Car.SPORTS);
        CarDetails details = new CarDetails();
        assertEquals("100 liters", details.fuelCapacity(car));
    }

    @Test public void
    should_return_the_fuel_capacity_of_the_family_car() {
        Car car = new Car(Car.FAMILY);
        CarDetails details = new CarDetails();
        assertEquals("40 liters", details.fuelCapacity(car));
    }

    @Test public void
    should_return_the_fuel_capacity_of_the_small_car() {
        Car car = new Car(Car.SMALL);
        CarDetails details = new CarDetails();
        assertEquals("20 liters", details.fuelCapacity(car));
    }

    @Test public void
    should_return_the_fuel_capacity_of_the_default_car() {
        Car car = new Car(Car.DEFAULT);
        CarDetails details = new CarDetails();
        assertEquals("50 liters", details.fuelCapacity(car));
    }

    @Test public void
    should_return_the_fuel_average_of_the_sports_car() {
        Car car = new Car(Car.SPORTS);
        CarDetails details = new CarDetails();
        assertEquals("3 Km/Liter", details.fuelAverage(car));
    }

    @Test public void
    should_return_the_fuel_average_of_the_family_car() {
        Car car = new Car(Car.FAMILY);
        CarDetails details = new CarDetails();
        assertEquals("10 Km/Liter", details.fuelAverage(car));
    }

    @Test public void
    should_return_the_fuel_average_of_the_small_car() {
        Car car = new Car(Car.SMALL);
        CarDetails details = new CarDetails();
        assertEquals("15 Km/Liter", details.fuelAverage(car));
    }

    @Test public void
    should_return_the_fuel_average_of_the_default_car() {
        Car car = new Car(Car.DEFAULT);
        CarDetails details = new CarDetails();
        assertEquals("12 Km/Liter", details.fuelAverage(car));
    }

    @Test public void
    should_return_the_features_of_the_sports_car() {
        Car car = new Car(Car.SPORTS);
        CarDetails details = new CarDetails();
        assertEquals("Sports car limited edition", details.features(car));
    }

    @Test public void
    should_return_the_features_of_the_family_car() {
        Car car = new Car(Car.FAMILY);
        CarDetails details = new CarDetails();
        assertEquals("Best family car in the segment", details.features(car));
    }

    @Test public void
    should_return_the_features_of_the_small_car() {
        Car car = new Car(Car.SMALL);
        CarDetails details = new CarDetails();
        assertEquals("Very small car", details.features(car));
    }

    @Test public void
    should_return_the_features_of_the_default_car() {
        Car car = new Car(Car.DEFAULT);
        CarDetails details = new CarDetails();
        assertEquals("default car", details.features(car));
    }
}