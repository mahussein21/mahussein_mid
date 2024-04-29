package servlets;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta .servlet.http.HttpServletResponse;

import dao.SignupDao;
import model.Signup;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SignupDao dao = new SignupDao();
        Signup up = new Signup();

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        up.setEmail(email);
        up.setPassword(password);
        up.setRole(role);

        dao.userSave(up);

        // Creating and adding cookie upon successful signup
        Cookie userCookie = new Cookie("email", email);
        userCookie.setMaxAge(24 * 60 * 60); // Cookie lasts for 1 day (in seconds)
        response.addCookie(userCookie);

        response.sendRedirect("login.jsp");
    }

    public void destroy(){

    }
}
