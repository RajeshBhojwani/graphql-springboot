package com.example.graphql.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.graphql.dao.entity.StudentClass;
import com.example.graphql.dao.repository.StudentClassRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClassService {

    private final StudentClassRepository classRepository ;

    public ClassService(final StudentClassRepository classRepository) {
        this.classRepository = classRepository ;
    }

    @Transactional
    public StudentClass addClass(final String grade,final String sections) {
        final StudentClass classobj = new StudentClass();
        classobj.setGrade(grade);
        classobj.setSections(sections);
       
        return this.classRepository.save(classobj);
    }

    @Transactional(readOnly = true)
    public List<StudentClass> getAllClasses(final int count) {
        return this.classRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<StudentClass> getClass(final String id) {
        return this.classRepository.findById(id);
    }
}
