package com.multipledatabase.service;

import com.multipledatabase.document.Course;
import com.multipledatabase.entity.Student;
import com.multipledatabase.model.StudentModel;
import com.multipledatabase.repository.CourseRepository;
import com.multipledatabase.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public String createResource(StudentModel studentModel){
        if(!studentRepository.existsByEmail(studentModel.getEmail())){
            Student student=new Student();
            BeanUtils.copyProperties(studentModel,student);
            try {
                studentRepository.save(student);
                studentModel.getCourses().stream().forEach(c -> {
                    Course course=new Course();
                    c.setEmail(studentModel.getEmail());
                    BeanUtils.copyProperties(c,course);
                    try{
                        courseRepository.save(course);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                });
            }
            catch (Exception e){System.out.println(e);}

            return "Resource added successfully";
        }

        else {
            return "Duplicate Resource";
        }
    }


}
