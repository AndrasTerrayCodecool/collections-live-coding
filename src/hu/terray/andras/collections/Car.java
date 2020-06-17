package hu.terray.andras.collections;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String licensePlate;
    private int price;

    public Car(String licensePlate, int price) {
        this.licensePlate = licensePlate;
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }


    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Car car) {
        return price - car.getPrice();
    }
}
