package hu.terray.andras.collections;

import java.util.*;

public class SortedCars {

    public static void main(String[] args) {
        // unordered / ordered / sorted collection
        Set<String> words = new TreeSet<>();

        words.add("a");
        words.add("x");
        words.add("y");
        words.add("k");
        words.add("l");

        System.out.println(words);

        Car car1 = new Car("abc", 1000);
        Car car2 = new Car("def", 2000);
        Car car3 = new Car("ghi", 3000);

        Set<Car> cars = new TreeSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        // System.out.println(cars);

        List<Car> carList = new ArrayList<>();
        carList.add(car3);
        carList.add(car2);
        carList.add(car1);
        System.out.println(carList);
        Collections.sort(carList);



    }
}
