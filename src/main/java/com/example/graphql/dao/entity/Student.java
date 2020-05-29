package com.example.graphql.dao.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "students")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    public Student(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String _id;
    private String name;
    private String dresscode;
    private String classid;

    public Student(String name, String dresscode, String classid) {
      this.name = name;
      this.dresscode = dresscode; 
      this.classid = classid;    
	  }
}
