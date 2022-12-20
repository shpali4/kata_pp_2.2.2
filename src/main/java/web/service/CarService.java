package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    public List<Car> showListOfCars(List<Car> cars, int count) {
        if (count == 0 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
