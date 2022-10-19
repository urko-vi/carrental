package com.globalpayment.carrental.service;

import java.math.BigInteger;
import java.util.List;

public interface DataService<T,I> {

    public List<I> getAll();
    public I getById(BigInteger id);
    public I update(I t);
    public void remove(BigInteger id);
}
