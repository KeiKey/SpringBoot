package com.example.demo.repositories.classes;

import com.example.demo.repositories.contracts.StudentRepositoryContract;
import com.example.demo.model.student.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

/*TODO
* Naming conventions same as laravel?
* Proper functions
* */
@Repository ("StudentRepository")
public class StudentRepository extends BaseRepository implements StudentRepositoryContract {
    private final Map<UUID, Student> database;

    public StudentRepository() {
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
    public Student find(UUID studentId) {
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
