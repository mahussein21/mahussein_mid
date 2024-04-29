package servlets;

import dao.TeacherDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import model.Teacher;

import java.io.IOException;

public class DeleteTeacherServlet extends HttpServlet {

    private TeacherDAO teacherDAO;

    public void init() {
        teacherDAO = new TeacherDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        teacherDAO.teacherdelete(new Teacher(id));
        response.sendRedirect("list");
    }
}
