package hu.terray.andras.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // collection VS Collection VS Collections
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("abc", 1000);
        Car car2 = new Car("def", 2000);
        Car car3 = new Car("ghi", 3000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        Collections.shuffle(cars);

    }
}
