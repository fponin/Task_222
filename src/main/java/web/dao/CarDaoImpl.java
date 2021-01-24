package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDAO {

    @Override
    public List<Car> getCars(List<Car> list, Integer count) {
        if (count == null || count >= 5) {
            return list;
        } else {
            return list.subList(0, count);
        }
    }

    @Override
    public List<Car> setCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("LADA", "Black", 2012));
        cars.add(new Car("Mazda", "Red", 2020));
        cars.add(new Car("KIA", "Green", 2000));
        cars.add(new Car("Opel", "Silver", 1998));
        cars.add(new Car("Honda", "Black", 2015));
        return cars;
    }
}
