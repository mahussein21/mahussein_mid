package servlets;

import dao.TeacherDAO;
import model.Teacher;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AddTeacherServlet extends HttpServlet {

    private TeacherDAO teacherDAO;

    public void init() {
        teacherDAO = new TeacherDAO();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("teacher-form.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String qualification = request.getParameter("qualification");
        int courseId = Integer.parseInt(request.getParameter("courseId"));

        Teacher newTeacher = new Teacher(0, firstName, lastName, qualification, courseId);
        teacherDAO.teacherSave(newTeacher);

        response.sendRedirect("login.jsp");
    }
}
