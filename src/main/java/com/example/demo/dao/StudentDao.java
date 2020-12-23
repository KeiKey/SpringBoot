package com.example.demo.dao;

import com.example.demo.dao.contracts.StudentDaoContract;
import com.example.demo.model.student.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository ("StudentDao")
public class StudentDao extends BaseDao implements StudentDaoContract{
    private final Map<UUID, Student> database;

    public StudentDao() {
        database = new HashMap<>();

        //Adding a dummy student
        UUID studentId = UUID.randomUUID();
        database.put(studentId, new Student(studentId, "Kei", "Salami", 22));
    }

    @Override
    public int create(UUID studentId, Student student) {
        database.put(studentId, student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> all() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int update(UUID studentId, Student studentUpdate) {
        database.put(studentId, studentUpdate);
        return 1;
    }

    @Override
    public int destroy(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
