package com.example.graphql.query;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.dao.entity.Student;
import com.example.graphql.dao.entity.StudentClass;
import com.example.graphql.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentClassResolver implements GraphQLResolver<StudentClass> {

    @Autowired
    private StudentService studentService;

    public List<Student> getStudents(StudentClass classObj) {
        return this.studentService.getAllStudents(classObj);
    }

   
}
