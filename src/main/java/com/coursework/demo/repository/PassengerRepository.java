package com.coursework.demo.repository;

import com.coursework.demo.entity.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {
}