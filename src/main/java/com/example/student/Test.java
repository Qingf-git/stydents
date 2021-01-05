package com.example.student;

import com.example.student.dao.StudentDao;
import com.example.student.dao.impl.StudentDaoImpl;
import com.example.student.domain.Sex;
import com.example.student.domain.Student;

import java.sql.Date;


public class Test {
    public static void main(String[] args) {
         StudentDao studentDao = new StudentDaoImpl();
        studentDao.updateStudentById(
                new Student(5,"gg",Sex.F,new Date(1), "fsf")
        );
    }
}
