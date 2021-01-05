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
import java.sql.*;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("student", studentDao.findStudentById(id));
        req.getRequestDispatcher("update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        Date birthday = Date.valueOf(req.getParameter("birthday"));
        String address = req.getParameter("address");
        Student student = new Student(id, name, Sex.valueOf(sex), birthday, address);
        studentDao.updateStudentById(student);
        resp.sendRedirect("/");
    }
}
