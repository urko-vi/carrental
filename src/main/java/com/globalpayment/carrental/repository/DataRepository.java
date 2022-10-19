package com.globalpayment.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface DataRepository<T> extends JpaRepository<T, BigInteger> {
}
