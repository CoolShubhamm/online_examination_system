package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdmitCardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int studentId = Integer.parseInt(request.getParameter("studentId"));
            
            DAO dao = new DAO();
            boolean success = dao.issueAdmitCard(studentId);
            
            if (success) {
                request.setAttribute("message", "Admit Card Issued!");
            } else {
                request.setAttribute("message", "Error issuing admit card.");
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("admitCard.jsp");
            dispatcher.forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid Student ID.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("admitCard.jsp");
            dispatcher.forward(request, response);
        }
    }
}
