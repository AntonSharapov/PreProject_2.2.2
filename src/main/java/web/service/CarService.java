package web.service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAlllist();

    public List<Car> getByID(int id);
}
