package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> saveCar(int count) {
        List<Car> cars = List.of(
                new Car("BMW", "black", 300),
                new Car("MC", "white", 300),
                new Car("Opel", "red", 200),
                new Car("Chery", "yellow", 140),
                new Car("Lada", "black", 90)
        );

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

