package com.multipledatabase.test.contoller;

import com.multipledatabase.test.repository.CityRepository;
import com.multipledatabase.test.model.City;
import com.multipledatabase.test.model.State;
import com.multipledatabase.test.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private StateRepository stateRepository;

    @PostMapping("/city")
    public void createCity(@RequestBody City city){
         this.cityRepository.save(city);
    }

    @PostMapping("/state")
    public void createState(@RequestBody State state){
        this.stateRepository.save(state);
    }

}
