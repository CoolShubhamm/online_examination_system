package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int studentId = Integer.parseInt(request.getParameter("studentId"));
            String studentName = request.getParameter("studentName");
            String examCenter = request.getParameter("examCenter");
            
            DAO dao = new DAO();
            boolean success = dao.registerForExam(studentId, studentName, examCenter);
            
            if (success) {
                request.setAttribute("message", "Registration Successful!");
            } else {
                request.setAttribute("message", "Error during registration.");
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid Student ID.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request, response);
        }
    }
}
