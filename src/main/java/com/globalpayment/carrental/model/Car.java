package com.globalpayment.carrental.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CARS")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    private String name;
    private String plate;
    @ManyToOne()
    @JoinColumn(name = "modelId")
    private Model model;
    @ManyToOne()
    @JoinColumn(name = "brandId")
    private Brand brand;
    @ManyToOne()
    @JoinColumn(name = "typeId")
    private Type type;

}
