package hu.terray.andras.collections;

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
}
