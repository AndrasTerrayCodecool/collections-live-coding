package hu.terray.andras.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarSet {

    public static void main(String[] args) {
        Set<Car> cars = new LinkedHashSet<>();

        Car car1 = new Car("abc", 1000);
        Car car2 = new Car("def", 2000);
        Car car3 = new Car("def", 2000);

        System.out.println(cars.add(car1));
        System.out.println(cars.add(car2));
        System.out.println(cars.add(car3));

        System.out.println(cars);
    }

}
