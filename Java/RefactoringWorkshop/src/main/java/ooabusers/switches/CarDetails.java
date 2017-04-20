package ooabusers.switches;

public class CarDetails {

    public String fuelCapacity(Car car) {
        switch(car.type()) {
            case Car.SPORTS:
                return "100 liters";
            case Car.FAMILY:
                return "40 liters";
            case Car.SMALL:
                return "20 liters";
            default:
                return "50 liters";
        }
    }

    public String fuelAverage(Car car) {
        switch(car.type()) {
            case Car.SPORTS:
                return "3 Km/Liter";
            case Car.FAMILY:
                return "10 Km/Liter";
            case Car.SMALL:
                return "15 Km/Liter";
            default:
                return "12 Km/Liter";
        }
    }

    public String features(Car car) {
        switch(car.type()) {
            case Car.SPORTS:
                return "Sports car limited edition";
            case Car.FAMILY:
                return "Best family car in the segment";
            case Car.SMALL:
                return "Very small car";
            default:
                return "default car";
        }
    }

}
