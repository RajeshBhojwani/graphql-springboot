package com.example.graphql.dao.repository;

import com.example.graphql.dao.entity.StudentClass;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassRepository extends MongoRepository<StudentClass, String > {
    StudentClass findBy_id(String id);
}
