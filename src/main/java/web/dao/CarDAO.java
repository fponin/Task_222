package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {

    List<Car> getCars(List<Car> list, Integer param);

    List<Car> setCars();
}
