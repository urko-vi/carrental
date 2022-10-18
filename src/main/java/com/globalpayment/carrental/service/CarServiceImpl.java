package com.globalpayment.carrental.service;

import com.globalpayment.carrental.model.Car;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getAll() {
        return null;
    }

    @Override
    public Car getById(BigInteger id) {
        return null;
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public void remove(BigInteger id) {

    }
}
