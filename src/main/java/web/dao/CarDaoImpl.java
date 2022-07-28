package web.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Service
public class CarDaoImpl implements CarDao {

    @Autowired
    private CarServiceImpl carService;

    @Override
    public List<Car> getCars(int value) {
        return carService.getCars(value);
    }
}
