package servlets;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AddStudentServlet extends HttpServlet {

    private StudentDAO studentDAO;

    public void init() {
        studentDAO = new StudentDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("add-student.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String names = request.getParameter("names");
        String programs = request.getParameter("programs");

        Student newStudent = new Student(0, names, programs);
        studentDAO.studSave(newStudent);

        response.sendRedirect("list");
    }
}
