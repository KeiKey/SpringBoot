package com.example.demo.dao.contracts;

import com.example.demo.model.student.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDaoContract extends BaseDaoContract{

    int create(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> all();

    int update(UUID studentId, Student studentUpdate);

    int destroy(UUID studentId);

}
