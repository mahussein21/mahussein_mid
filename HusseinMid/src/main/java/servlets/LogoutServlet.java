package servlets;
import java.io.*;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        HttpSession session = request.getSession(false); // Don't create a new session
        if (session != null) {
            session.invalidate();
        }
        response.sendRedirect("login.jsp");
    }
}
