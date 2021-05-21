package za.co.momentum.javabasics.dbconnection.repository;

import za.co.momentum.javabasics.dbconnection.model.Cars;

public interface CarsRepository {

    void insertCars(Cars cars);
    Cars getCars(int carId);
    void updateCars(int carId);
    void delteCars(int carId);
}
