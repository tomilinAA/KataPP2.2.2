package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    public CarServiceImpl(List<Car> carList) {
        this.carList = carList;
        carList.add(new Car("Niva", "red", 1));
        carList.add(new Car("Gazel", "yellow", 2));
        carList.add(new Car("Volga", "green", 3));
        carList.add(new Car("Uaz", "blue", 4));
        carList.add(new Car("Calina", "purple", 5));
    }

    @Override
    public List<Car> getCars(int value) {
        return (value > 5 || value < 1) ? carList : new ArrayList<>(carList.subList(0, value));
    }
}
