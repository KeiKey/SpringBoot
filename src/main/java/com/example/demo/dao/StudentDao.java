package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {
    int insetNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudent(UUID studentId, Student studentUpdate);

    int deleteStudentById(UUID studentId);
}
