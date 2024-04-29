package servlets;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class DeleteStudentServlet extends HttpServlet {

    private StudentDAO studentDAO;

    public void init() {
        studentDAO = new StudentDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        studentDAO.studDelete(new Student(id));
        response.sendRedirect("list");
    }
}
