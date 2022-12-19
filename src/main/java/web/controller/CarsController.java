package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private final CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String listOfCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("TESLA", 3.0, 2000));
        cars.add(new Car("BMW", 4.5, 1990));
        cars.add(new Car("AUDI", 3.5, 1993));
        cars.add(new Car("FORD ", 5.0, 1997));
        cars.add(new Car("FIAT", 2.5, 2010));
        cars = carService.showListOfCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
