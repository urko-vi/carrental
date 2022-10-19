package com.globalpayment.carrental.configuration.mapper;

import com.globalpayment.carrental.model.Car;
import com.globalpayment.carrental.payload.CarDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car toEntity(CarDto source);
    CarDto toDto(Car target);
}
