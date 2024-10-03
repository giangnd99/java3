package lab4.lab4_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lab4/form")
public class HandleFormServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "Bạn chưa đăng nhập");
        request.getRequestDispatcher("/view/lab4/lab4_1/handle_form.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usernameString = request.getParameter("username");
        String passwordString = request.getParameter("password").trim();
        if (usernameString.equalsIgnoreCase("admin") && passwordString.length() > 5) {
            request.setAttribute("message", "Login sucessfull !");
        } else {
            request.setAttribute("message", "Wrong password");
        }
        request.getRequestDispatcher("/view/lab4/lab4_1/handle_form.jsp").forward(request, response);
    }

}
