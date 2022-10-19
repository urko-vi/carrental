package com.globalpayment.carrental.service;

import com.globalpayment.carrental.model.Car;
import com.globalpayment.carrental.payload.CarDto;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<CarDto> getAll() {
        return null;
    }

    @Override
    public CarDto getById(BigInteger id) {
        return null;
    }

    @Override
    public CarDto update(CarDto t) {
        return null;
    }

    @Override
    public void remove(BigInteger id) {

    }
}
