package com.example.student.dao;

import com.example.student.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudent();
    int deleteStudentById(int id);
    Student findStudentById(int id);
    int updateStudentById(Student student);
    int insertStudent(Student student);
}
