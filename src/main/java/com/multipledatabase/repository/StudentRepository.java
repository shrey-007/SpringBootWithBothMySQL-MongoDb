package com.multipledatabase.repository;

import com.multipledatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public boolean existsByEmail(String email);
    public List<Student> findByEmail(String email);
    public void deleteByEmail(String email);
}
