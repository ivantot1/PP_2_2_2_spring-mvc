package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarServiceImpl implements CarService{

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "black", 300));
        cars.add(new Car("MC", "white", 300));
        cars.add(new Car("Opel", "red", 200));
        cars.add(new Car("Chery", "yellow", 140));
        cars.add(new Car("Lada", "black", 90));
    }

    @Override
    public List<Car> cars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }



}

