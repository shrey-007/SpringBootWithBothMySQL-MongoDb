package com.multipledatabase.controller;

import com.multipledatabase.model.StudentModel;
import com.multipledatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @RequestMapping(value = "createresource",method = RequestMethod.GET)
    public String createStudent(@RequestBody StudentModel studentModel){
        return studentService.createResource(studentModel);
    }


}
