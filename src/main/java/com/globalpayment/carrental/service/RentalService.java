package com.globalpayment.carrental.service;

import com.globalpayment.carrental.model.Rental;
import com.globalpayment.carrental.payload.RentalDto;

import java.math.BigDecimal;

public interface RentalService extends DataService<Rental, RentalDto> {

    public BigDecimal calculateRentalPrice(RentalDto rental);
}
