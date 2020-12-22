package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository ("fakeStudentDao")
public class FakeStudentDaoImpl implements StudentDao{
    private Map<UUID, Student> database;

    public FakeStudentDaoImpl() {
        database = new HashMap<>();

        //Adding a dummy student
        UUID studentId = UUID.randomUUID();
        database.put(studentId, new Student(studentId, "Kei", "Selami", 22));
    }

    @Override
    public int insetNewStudent(UUID studentId, Student student) {
        database.put(studentId, student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudent(UUID studentId, Student studentUpdate) {
        database.put(studentId, studentUpdate);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
