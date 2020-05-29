package com.example.graphql.dao.repository;

import java.util.List;

import com.example.graphql.dao.entity.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String > {
   Student findBy_id(String id);
   List<Student> findStudentsByClassid(String id);
}
