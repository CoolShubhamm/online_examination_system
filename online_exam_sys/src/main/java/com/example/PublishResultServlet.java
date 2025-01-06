package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class PublishResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int studentId = Integer.parseInt(request.getParameter("studentId"));
            
            DAO dao = new DAO();
            boolean success = dao.publishResult(studentId);
            
            if (success) {
                request.setAttribute("message", "Result Published!");
            } else {
                request.setAttribute("message", "Error publishing result.");
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("publishResult.jsp");
            dispatcher.forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid Student ID.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("publishResult.jsp");
            dispatcher.forward(request, response);
        }
    }
}
