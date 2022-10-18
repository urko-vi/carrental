package com.globalpayment.carrental.service;

import com.globalpayment.carrental.model.Rental;

import java.math.BigDecimal;

public interface RentalService extends DataService<Rental> {

    public BigDecimal calculateRentalPrice(Rental rental);
}
