package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(List<Car> list, Integer param) {

        return carDAO.getCars(list, param);
    }

    @Override
    public List<Car> setCars() {
        return carDAO.setCars();
    }
}
