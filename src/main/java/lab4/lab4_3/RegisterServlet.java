package lab4.lab4_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/lab4/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    List<User> users = new ArrayList<User>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User sessionUser = (User) session.getAttribute("user");

        if (sessionUser != null) {
            request.setAttribute("user", sessionUser);
        }

        request.getRequestDispatcher("/view/lab4/lab4_3/DangKy.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            User user = new User();
            setField(user, request, response);
            users.add(user);

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            request.setAttribute("user", user);
            request.getRequestDispatcher("/view/lab4/lab4_3/Result.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setField(User user, HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = String.valueOf(request.getParameter("password").hashCode());
        String sex = request.getParameter("sex");
        boolean married = Boolean.parseBoolean(request.getParameter("married"));
        String nationally = request.getParameter("nationally");
        String[] liked = request.getParameterValues("liked");
        String note = request.getParameter("note");

        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setMarried(married);
        user.setNationally(nationally);
        user.setLiked(Arrays.asList(liked != null ? liked : new String[0]));
        user.setNote(note);
    }
}