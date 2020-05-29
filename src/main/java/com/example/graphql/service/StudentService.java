package com.example.graphql.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.graphql.dao.entity.Student;
import com.example.graphql.dao.entity.StudentClass;
import com.example.graphql.dao.repository.StudentRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    private final StudentRepository studentRepository ;

    public StudentService(final StudentRepository studentRepository) {
        this.studentRepository = studentRepository ;
    }

    @Transactional
    public Student addStudent(final String name,final String dresscode, final String classid) {
        final Student student = new Student();
        student.setName(name);
        student.setDresscode(dresscode);
        student.setClassid(classid);
       
        return this.studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public List<Student> getAllStudents(StudentClass classObj) {
        return this.studentRepository.findStudentsByClassid(classObj.get_id()).stream().collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<Student> getAllStudents(final int count) {
        return this.studentRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Student> getStudent(final String id) {
        return this.studentRepository.findById(id);
    }
}
