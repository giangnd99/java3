package lab5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lab5.util.CookieUtils;

@WebServlet("/lab5/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = CookieUtils.get("username", req);
        String password = CookieUtils.get("password", req);

        // Chuyển tiếp cookies vào form đăng nhập nếu có
        req.setAttribute("username", username);
        req.setAttribute("password", password);

        req.getRequestDispatcher("/view/lab5/bai3/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String remember = req.getParameter("remember");

        // Kiểm tra xem cookie đã tồn tại chưa
        String usernameCk = CookieUtils.get("username", req);
        String passwordCk = CookieUtils.get("password", req);
        boolean checkCookie = usernameCk != null && !usernameCk.isBlank() && passwordCk != null && !passwordCk.isBlank();
        boolean checkRemember = remember == null;

        if (checkCookie && !checkRemember) {
            resp.sendRedirect(req.getContextPath()+"/lab5");
            return; // Ngăn không cho tiếp tục xử lý sau khi đã sendRedirect
        }

        // Kiểm tra đăng nhập
        if (!"poly".equals(username)) {
            req.setAttribute("message", "Wrong username");
        } else if (password == null || password.length() < 6 || !"giangnd".equals(password)) {
            req.setAttribute("message", "Wrong password");
        } else {
            req.setAttribute("message", "Login successful");

            // Xử lý tùy chọn "remember me"
            int hours = checkRemember ? 0 : 30 * 24;
            CookieUtils.add("username", username, hours, resp);
            CookieUtils.add("password", password, hours, resp);
        }

        req.getRequestDispatcher("/view/lab5/bai3/login.jsp").forward(req, resp);
    }
}
