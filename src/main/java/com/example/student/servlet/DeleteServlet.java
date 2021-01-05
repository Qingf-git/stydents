package com.example.student.servlet;

import com.example.student.dao.StudentDao;
import com.example.student.dao.impl.StudentDaoImpl;
import com.example.student.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
   private StudentDao studentDao=new  StudentDaoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        studentDao.deleteStudentById(id);
        resp.sendRedirect("/");
    }
}
