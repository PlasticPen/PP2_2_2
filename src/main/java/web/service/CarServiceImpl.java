package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 3, 1999));
        cars.add(new Car("AUDI", 7, 2000));
        cars.add(new Car("Mercedes", 600, 1990));
        cars.add(new Car("Mazda", 3, 2003));
        cars.add(new Car("Toyota", 999, 2035));
    }

    @Override
    public List<Car> getCars(int count) {
        return (count >= 5 ? cars : cars.subList(0, count));
    }
}
