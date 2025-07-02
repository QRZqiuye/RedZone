package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import dao.UserDAO;
import model.UserDTO;

@WebServlet("/RedZone_JoinController")
public class RedZone_JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDTO user = new UserDTO(username, email, password);

        try {
            UserDAO dao = new UserDAO();
            boolean result = dao.insertUser(user);

            if (result) {
                request.setAttribute("username", username);
                RequestDispatcher rd = request.getRequestDispatcher("JSP/RedZone_JoinSuccess.jsp");
                rd.forward(request, response);
            } else {
                response.sendRedirect("JSP/RedZone_JoinFail.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", e.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("JSP/RedZone_JoinFail.jsp");
            rd.forward(request, response);
        }
    }
}
