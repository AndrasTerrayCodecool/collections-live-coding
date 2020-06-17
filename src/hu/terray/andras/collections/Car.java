package hu.terray.andras.collections;

import java.util.Objects;

public class Car {
    private String licensePlate;
    private int price;

    public Car(String licensePlate, int price) {
        this.licensePlate = licensePlate;
        this.price = price;
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
}
