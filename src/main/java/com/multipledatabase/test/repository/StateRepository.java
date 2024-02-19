package com.multipledatabase.test.repository;

import com.multipledatabase.test.model.State;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StateRepository extends MongoRepository<State,Integer> {
    public State findByName(String name);
}
