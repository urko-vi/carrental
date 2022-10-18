package com.globalpayment.carrental.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "RENTALS")
public class Rental implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    @ManyToOne()
    @JoinColumn(name = "carId")
    private Car car;
    @ManyToOne()
    @JoinColumn(name = "customerId")
    private Customer customer;
    private BigDecimal price;
    private LocalDate rentalFrom;
    private LocalDate rentalTill;
}
