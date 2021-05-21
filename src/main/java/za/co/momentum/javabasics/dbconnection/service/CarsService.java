package za.co.momentum.javabasics.dbconnection.service;

import za.co.momentum.javabasics.dbconnection.model.Cars;
import za.co.momentum.javabasics.dbconnection.repository.CarsRepository;

public class CarsService {

    CarsRepository carsRepository;

    public void addCars(Cars cars){

        //do some logic, insert into the database
    }

    public Cars getCars(int carId){

        //do some logic, read from the database

        return  null;
    }

    public void updateCars(int carId){

        //do some logic, update into the database
    }

    public void deleteCars(Cars cars){

        //do some logic, delete from the database
    }
}
