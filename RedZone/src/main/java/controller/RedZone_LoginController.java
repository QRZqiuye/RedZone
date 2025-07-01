package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import dao.UserDAO;
import model.UserDTO;

@WebServlet("/RedZone_LoginController")
public class RedZone_LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDAO dao = new UserDAO();
        UserDTO user = dao.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", user);
            response.sendRedirect("/RedZone/JSP/RedZone_GameStart.jsp"); // 로그인 성공 페이지
        } else {
            request.setAttribute("errorMessage", "아이디 또는 비밀번호가 잘못되었습니다.");
            RequestDispatcher rd = request.getRequestDispatcher("/RedZone/JSP/RedZone_LoginFail.jsp");
            rd.forward(request, response);
        }
    }
}
