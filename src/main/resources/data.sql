DROP TABLE IF EXISTS  RENTING_CARS.types;
DROP TABLE IF EXISTS  RENTING_CARS.cars;
DROP TABLE IF EXISTS  RENTING_CARS.brands;
DROP TABLE IF EXISTS  RENTING_CARS.models;
DROP TABLE IF EXISTS  RENTING_CARS.rental;
CREATE SCHEMA IF NOT EXISTS RENTING_CARS AUTHORIZATION SA;

CREATE TABLE RENTING_CARS.TYPES (
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    price NUMERIC(5,2) NOT NULL,
    extra NUMERIC(0,2) NOT NULL
);
CREATE TABLE RENTING_CARS.CARS (
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    plate VARCHAR(8) NOT NULL,
    brandId BIGINT NOT NULL,
    modelId BIGINT NOT NULL,
    typeId BIGINT NOT NULL,
    foreign key (typeId) references RENTING_CARS.TYPES(id),
    foreign key (brandId) references RENTING_CARS.BRANDS(id),
    foreign key (modelId) references RENTING_CARS.MODELS(id)
);
CREATE TABLE RENTING_CARS.BRANDS (
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(50) NOT NULL,

);
CREATE TABLE RENTING_CARS.MODELS (
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    year DATE NOT NUll
);
CREATE TABLE RENTING_CARS.CUSTOMERS (
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    points LONG
);
CREATE TABLE RENTING_CARS.RENTALS (
    id BIGINT auto_increment PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    price NUMERIC(5,2) NOT NULL,
    rentalFrom DATE NOT NULL,
    rentalTill DATE,
    carId BIGINT NOT NULL,
    customerId BIGINT NOT NULL,
    foreign key (carId) references RENTING_CARS.CARS(id),
    foreign key (customerId) references RENTING_CARS.CUSTOMERS(id)
);

INSERT INTO RENTING_CARS.TYPES (id, name, price,extra) VALUES (1, 'Premium',300,0.2);
INSERT INTO RENTING_CARS.TYPES (id, name, price,extra) VALUES (2, 'SUV',150,0.6);
INSERT INTO RENTING_CARS.TYPES (id, name, price,extra) VALUES (3, 'Small cars',50,0.3);

