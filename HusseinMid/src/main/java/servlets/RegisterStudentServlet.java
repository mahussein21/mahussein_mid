package servlets;

import java.io.IOException;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/RegisterStudentServlet")
public class RegisterStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String name = request.getParameter("name");
        String program = request.getParameter("program");

        // Create a Student object with the retrieved data
        Student student = new Student();
        student.setNames(name);
        student.setPrograms(program);

        // Insert the student into the database using your DAO class
        StudentDAO dao = new StudentDAO();
        dao.studSave(student);

        // Set success message as a request attribute
        request.setAttribute("successMessage", "Student registered successfully.");

        // Forward the request to registration-success.jsp
        request.getRequestDispatcher("registration-success.jsp").forward(request, response);
    }
}
