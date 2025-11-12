package edu.innotech;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepo {
    int  getRaintingForGradeSum(int sum);

    boolean addNewGrade(int x);

    long count();
    void delete(Student entity);
    void deleteAll(Iterable<Student>entities);

    Iterable<Student > findAll();
    Student save(Student entityy);
    Iterable<Student> saveAll(Iterable<Student> entities);
}
