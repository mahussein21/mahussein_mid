package servlets;

import dao.CourseDAO;
import model.Course;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AddCourseServlet extends HttpServlet {

    private CourseDAO courseDAO;

    public void init() {
        courseDAO = new CourseDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("course-form.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String courseCode = request.getParameter("courseCode");
        String courseName = request.getParameter("courseName");
        int semesterId = Integer.parseInt(request.getParameter("semesterId"));
        int departmentId = Integer.parseInt(request.getParameter("departmentId"));

        Course newCourse = new Course(0, courseCode, courseName, semesterId, departmentId);
        courseDAO.courseSave(newCourse);

        response.sendRedirect("list");
    }
}
