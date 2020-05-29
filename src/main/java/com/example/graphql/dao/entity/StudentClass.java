package com.example.graphql.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "classes")
public class StudentClass implements Serializable {

    private static final long serialVersionUID = 1L;
    public StudentClass(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String _id;
    private String grade;
    private String sections;
    private List<Student> students;

    public StudentClass(String grade, String sections, ArrayList<Student> students) {
		this.grade = grade;
    this.sections = sections;
    this.students = students;
        
        
	}
}
