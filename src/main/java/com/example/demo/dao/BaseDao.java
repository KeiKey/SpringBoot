package com.example.demo.dao;

import com.example.demo.dao.contracts.BaseDaoContract;
import com.example.demo.model.student.Student;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;

@Repository
public class BaseDao implements BaseDaoContract {
    private Map<UUID, Student> database;

//    @Override
//    public int create(UUID studentId, Student student) {
//        database.put(studentId, student);
//        return 1;
//    }

}
