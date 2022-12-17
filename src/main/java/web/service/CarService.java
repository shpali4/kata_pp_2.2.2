package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    public static List<Car> show(List<Car> cars, int count) {
        if (count == 0 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
