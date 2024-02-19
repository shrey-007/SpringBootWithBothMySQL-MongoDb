package com.multipledatabase.repository;

import com.multipledatabase.document.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course,String> {
    public List<Course> findCourseByEmail(String email);
    public void deleteByEmail(String email);
}
