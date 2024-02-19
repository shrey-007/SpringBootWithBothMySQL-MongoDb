package com.multipledatabase.test.repository;

import com.multipledatabase.test.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
    public City findByName(String name);
}
