package hu.terray.andras.collections;

import java.util.HashMap;
import java.util.Map;

public class CarMap {

    public static void main(String[] args) {
        Car car1 = new Car("abc", 1000);
        Car car2 = new Car("def", 2000);
        Car car3 = new Car("ghi", 2000);

        Map<String, Car> carMap = new HashMap<>();
        carMap.put(car2.getLicensePlate(), car1);
        System.out.println(car2.hashCode());
        carMap.put(car2.getLicensePlate(), car2);
        carMap.put(null, car3);

        System.out.println(carMap);
    }
}
