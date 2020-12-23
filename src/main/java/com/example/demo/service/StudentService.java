package com.example.demo.service;

import com.example.demo.dao.contracts.StudentDaoContract;
import com.example.demo.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    private final StudentDaoContract studentDaoContract;

    @Autowired
    public StudentService(@Qualifier("StudentDao") StudentDaoContract studentDaoContract) {
        this.studentDaoContract = studentDaoContract;
    }

    public int persistNewStudent(UUID studentId, Student student) {
        UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;
        student.setId(studentUid);
        return studentDaoContract.create(studentUid, student);
    }

    public Student getStudentById(UUID studentId) {
        return studentDaoContract.selectStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentDaoContract.all();
    }

    public int updateStudent(UUID studentId, Student studentUpdate) {
        return studentDaoContract.update(studentId, studentUpdate);
    }

    public int deleteStudentById(UUID studentId) {
        return studentDaoContract.destroy(studentId);
    }
}
