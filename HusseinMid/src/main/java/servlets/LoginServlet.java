package servlets;//package servlets;
//
//import dao.SignupDao;
//import dao.*;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import model.Signup;
//
//
//import java.io.IOException;
//import java.util.List;
////
////@WebServlet("/login")
////public class LoginServlet extends HttpServlet {
////    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        Signup up = new Signup();
////        SignupDao dao = new SignupDao();
////
////        String role = request.getParameter("role");
////        String username = request.getParameter("email");
////        String password = request.getParameter("password");
////        up.setEmail(username);
////        up.setPassword(password);
////        List<Object[]> signups = (dao.Search(username, password));
////
////
////        if (signups.isEmpty()) {
////
////            request.setAttribute("message", "Invalid Credintials!");
////            request.getRequestDispatcher("login.jsp").forward(request, response);
////        } else {
////
////
////            for (Object[] signup : signups) {
////                String UsrRole = (String) signup[2];
////                System.out.println(UsrRole);
////
////
////                HttpSession session = request.getSession(true); // Create a new session
////                session.setAttribute("userId", signup[0]); // Store user ID in session
////                session.setAttribute("userRole", UsrRole); // Store user role in session
////
////
////                if (UsrRole.equals("admin")) {
////                    response.sendRedirect("Admin.jsp");
////                } else if (UsrRole.equals("student")) {
////                    response.sendRedirect("Student.jsp");
////                } else if (UsrRole.equals("teacher")) {
////                    response.sendRedirect("Teacher.jsp");
////                } else {
////                    response.sendRedirect("login.jsp?error=1");
////                }
////            }
////        }
////
////}}
//
////@WebServlet("/login")
////public class LoginServlet extends HttpServlet {
////    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        Signup up = new Signup();
////        SignupDao dao = new SignupDao();
////
////        String username = request.getParameter("email");
////        String password = request.getParameter("password");
////
////        // Assuming dao.Search returns a single Signup object
////        Signup user = (Signup) dao.Search(username, password);
////
////        if (user == null) {
////            request.setAttribute("message", "Invalid Credentials!");
////            request.getRequestDispatcher("login.jsp").forward(request, response);
////        } else {
////            String userRole = user.getRole();
////
////            HttpSession session = request.getSession(true); // Create a new session
////            session.setAttribute("userId", user.getId()); // Store user ID in session
////            session.setAttribute("userRole", userRole); // Store user role in session
////
////            if (userRole.equals("admin")) {
////                request.getRequestDispatcher("Admin.jsp").forward(request, response);
////            } else if (userRole.equals("student")) {
////                request.getRequestDispatcher("Student.jsp").forward(request, response);
////            } else if (userRole.equals("teacher")) {
////                request.getRequestDispatcher("Teacher.jsp").forward(request, response);
////            } else {
////                response.sendRedirect("login.jsp?error=1");
////            }
////        }
////    }
////}
//
//
//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        SignupDao dao = new SignupDao();
//
//        String username = request.getParameter("email");
//        String password = request.getParameter("password");
//
//        List<Object[]> signups = dao.Search(username, password);
//
//        if (signups.isEmpty()) {
//            // Handle case when no user is found
//            request.setAttribute("message", "Invalid Credentials!");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        } else {
//            for (Object[] signup : signups) {
//                // Extract fields from the array and create a new Signup object
//                Signup user = new Signup();
//                user.setEmail((String) signup[0]);
//                user.setPassword((String) signup[1]);
//                user.setRole((String) signup[2]);
//
//                HttpSession session = request.getSession(true); // Create a new session
//                session.setAttribute("userId", user.getId()); // Store user ID in session
//                session.setAttribute("userRole", user.getRole()); // Store user role in session
//
//                if (user.getRole().equals("admin")) {
//                    request.getRequestDispatcher("Admin.jsp").forward(request, response);
//                } else if (user.getRole().equals("student")) {
//                    request.getRequestDispatcher("Student.jsp").forward(request, response);
//                } else if (user.getRole().equals("teacher")) {
//                    request.getRequestDispatcher("Teacher.jsp").forward(request, response);
//                } else {
//                    response.sendRedirect("login.jsp?error=1");
//                }
//            }
//        }
//    }
//}




import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import dao.SignupDao;
import model.Signup;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Signup up = new Signup();
        SignupDao dao = new SignupDao();

        String username = request.getParameter("email");
        String password = request.getParameter("password");
        up.setEmail(username);
        up.setPassword(password);
        List<Object[]> signups = dao.Search(username, password);

        if (signups.isEmpty()) {
            request.setAttribute("message", "Invalid Credentials!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            for (Object[] signup : signups) {
                String role = (String) signup[2];

                HttpSession session = request.getSession(true);
                session.setAttribute("userId", signup[0]);
                session.setAttribute("userRole", role);

                // Creating and adding cookie upon successful login
                Cookie userCookie = new Cookie("userId", String.valueOf(signup[0]));
                userCookie.setMaxAge(24 * 60 * 60); // Cookie lasts for 1 day (in seconds)
                response.addCookie(userCookie);

                // Redirect based on role
                if (role.equals("admin")) {
                    response.sendRedirect("Admin.jsp");
                } else if (role.equals("student")) {
                    response.sendRedirect("Student.jsp");
                } else if (role.equals("teacher")) {
                    response.sendRedirect("Teacher.jsp");
                } else {
                    response.sendRedirect("login.jsp?error=1");
                }
                return; // Exit the loop after the first successful login
            }
        }
    }
}
