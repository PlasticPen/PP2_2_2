package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    public CarDaoImpl() {
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
