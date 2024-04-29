package servlets;

import dao.CourseDAO;
import model.Course;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class DeleteCourseServlet extends HttpServlet {

    private CourseDAO courseDAO;

    public void init() {
        courseDAO = new CourseDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        courseDAO.coursedelete(new Course(id));
        response.sendRedirect("list");
    }
}
