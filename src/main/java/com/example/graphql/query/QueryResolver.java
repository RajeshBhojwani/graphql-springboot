package com.example.graphql.query;

import java.util.List;
import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.dao.entity.Student;
import com.example.graphql.dao.entity.StudentClass;
import com.example.graphql.service.ClassService;
import com.example.graphql.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ClassService classService;

    @Autowired
    private StudentService studentService;

    public List<StudentClass> getClasses(final int count) {
        return this.classService.getAllClasses(count);
    }

    public Optional<StudentClass> getClass(final String id) {
        return this.classService.getClass(id);
    }
    

    public List<Student> getStudents(final int count) {
        return this.studentService.getAllStudents(count);
    }
}
