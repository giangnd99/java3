package lab3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/lab3/bai4")
public class bai4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Object> news = new HashMap<>();
        news.put("title", "Tiêu đề bản tin");
        news.put("content", "Nội dung bản tin thường rất dài nhưng chúng ta sẽ hiển thị một đoạn ngắn.");
        req.setAttribute("item", news);
        req.getRequestDispatcher("/view/lab3/bai4.jsp").forward(req, resp);
    }
}
