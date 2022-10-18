package com.globalpayment.carrental.service;

import com.globalpayment.carrental.model.Rental;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;


public class RentalServiceImpl implements RentalService {

    @Override
    public List<Rental> getAll() {
        return null;
    }

    @Override
    public Rental getById(BigInteger id) {
        return null;
    }

    @Override
    public Rental update(Rental rental) {
        return null;
    }

    @Override
    public void remove(BigInteger id) {

    }

    @Override
    public BigDecimal calculateRentalPrice(Rental rental) {
        BigDecimal price = new BigDecimal(0.0);

        return price;
    }
    private BigDecimal calculatePremiumPrice(Rental rental){
        BigDecimal price = new BigDecimal(0.0);
        long daysBetween = ChronoUnit.DAYS.between(rental.getRentalFrom(), rental.getRentalTill());
        price = rental.getCar().getType().getPrice().multiply(BigDecimal.valueOf(daysBetween));
        if(LocalDate.now().isAfter(rental.getRentalFrom())){
            daysBetween = ChronoUnit.DAYS.between(rental.getRentalFrom(), rental.getRentalTill());
            premiumOverdue
        }
        return price;
    }
    private BigDecimal calculateSuvPrice(Rental rental){
        BigDecimal price = new BigDecimal(0.0);


        return price;
    }
    private BigDecimal calculateSmallPrice(Rental rental){
        BigDecimal price = new BigDecimal(0.0);

        return price;
    }
}
