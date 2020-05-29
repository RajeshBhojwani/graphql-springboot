package com.example.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.dao.entity.Student;
import com.example.graphql.dao.entity.StudentClass;
import com.example.graphql.service.ClassService;
import com.example.graphql.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

   
    @Autowired
    private ClassService classService;

    @Autowired
    private StudentService studentService;

    public Student addStudent(final String name, final String dresscode, final String classid) {
        return this.studentService.addStudent(name, dresscode, classid);
    }

   

    public StudentClass addClass(final String grade, final String sections) {
        return this.classService.addClass(grade, sections);
    }
 
}
