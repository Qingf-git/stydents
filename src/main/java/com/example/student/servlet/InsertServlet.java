package com.example.student.servlet;

import com.example.student.dao.StudentDao;
import com.example.student.dao.impl.StudentDaoImpl;
import com.example.student.domain.Sex;
import com.example.student.domain.Student;
import com.example.student.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
    private StudentDao studentDao=new StudentDaoImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        Date birthday = Date.valueOf(req.getParameter("birthday"));
        String address = req.getParameter("address");
        Student student = new Student(0,name,Sex.valueOf(sex),birthday,address);
        studentDao.insertStudent(student);
        resp.sendRedirect("/");

    }
}
