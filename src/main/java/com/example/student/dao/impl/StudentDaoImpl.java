package com.example.student.dao.impl;

import com.example.student.domain.Sex;
import com.example.student.domain.Student;
import com.example.student.util.BaseDao;
import com.example.student.dao.StudentDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends BaseDao implements StudentDao {
    @Override
    public List<Student> findAllStudent() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from students";
        ResultSet rs = executeQuery(sql);
        try {
            while (rs.next()) {
                students.add(new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        Sex.valueOf(rs.getString(3)),
                        rs.getDate(4),
                        rs.getString(5)
                ));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return students;

    }

    @Override
    public int deleteStudentById(int id) {
        String sql = "delete from students where id=" + id;
        return executeUpdate(sql);
    }

    @Override
    public Student findStudentById(int id) {
        String sql = "select * from students where id=" + id;
        ResultSet rs = executeQuery(sql);
        Student student = null;
        try {
            if (rs.next()) {
                student = new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        Sex.valueOf(rs.getString(3)),
                        rs.getDate(4),
                        rs.getString(5)
                );
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return student;
    }

    @Override
    public int updateStudentById(Student student) {
        String sql = "update students set name=?, sex=?, birthday=?, address=? where id = ?";
        return executeUpdate(sql,
                student.getName(),
                student.getSex().toString(),
                student.getBirthday(),
                student.getAddress(),
                student.getId());
    }

    @Override
    public int insertStudent(Student student) {
        String sql = "insert into students(id, name, sex, birthday, address) values(null,?,?,?,?) ";
        return executeUpdate(sql,
                student.getName(),
                student.getSex().toString(),
                student.getBirthday(),
                student.getAddress());
    }
}
