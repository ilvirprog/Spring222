package web.service.car;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static final int MAX_COUNT_VALUE = 5;

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Mers", "Black", 200));
        cars.add(new Car("Tesla", "Green", 250));
        cars.add(new Car("Porsche", "Grey", 300));
        cars.add(new Car("Bugatti", "Blue", 400));
        cars.add(new Car("Lada", "Red", 180));
    }

    public static List<Car> getCars(Integer count)
    {
        if (count == null || count >= MAX_COUNT_VALUE) {
            return cars;
        }

        return cars
                .stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
