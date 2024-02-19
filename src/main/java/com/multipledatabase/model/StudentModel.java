package com.multipledatabase.model;

import com.multipledatabase.document.Course;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentModel {
    private String firstName;
    private String lastName;
    private String email;
    private List<CourseModel> courses;
}
