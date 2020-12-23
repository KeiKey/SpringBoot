package com.example.demo.service;

import com.example.demo.repositories.contracts.StudentRepositoryContract;
import com.example.demo.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/*TODO
* naming conventions for the functions?
* proper functions?
* */
@Service
public class StudentService {
    private final StudentRepositoryContract studentRepositoryContract;

    @Autowired
    public StudentService(@Qualifier("StudentRepository") StudentRepositoryContract studentRepositoryContract) {
        this.studentRepositoryContract = studentRepositoryContract;
    }

    public int persistNewStudent(UUID studentId, Student student) {
        UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;
        student.setId(studentUid);
        return studentRepositoryContract.create(studentUid, student);
    }

    public Student getStudentById(UUID studentId) {
        return studentRepositoryContract.find(studentId);
    }

    public List<Student> getAllStudents() {
        return studentRepositoryContract.all();
    }

    public int updateStudent(UUID studentId, Student studentUpdate) {
        return studentRepositoryContract.update(studentId, studentUpdate);
    }

    public int deleteStudentById(UUID studentId) {
        return studentRepositoryContract.destroy(studentId);
    }
}
