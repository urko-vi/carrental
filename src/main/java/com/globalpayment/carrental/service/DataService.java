package com.globalpayment.carrental.service;

import java.math.BigInteger;
import java.util.List;

public interface DataService<T> {

    public List<T> getAll();
    public T getById(BigInteger id);
    public T update(T t);
    public void remove(BigInteger id);
}
