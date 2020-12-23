package com.example.demo.repositories.contracts;

import com.example.demo.model.student.Student;

import java.util.List;
import java.util.UUID;

/*TODO
* dont pass the student as an argument but maybe array?
* */
public interface StudentRepositoryContract extends BaseRepositoryContract {

    int create(UUID studentId, Student student);

    /*TODO
    * make a function findBY(attribute, value)
    * */
    Student find(UUID studentId);

    List<Student> all();

    int update(UUID studentId, Student studentUpdate);

    int destroy(UUID studentId);

}
