package lab3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/lab3/bai3")
public class bai3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Object> product = new HashMap<>();
        product.put("name", "iPhone 2024");
        product.put("price", 12345.678);
        product.put("date", new Date());
        req.setAttribute("item", product);
        req.getRequestDispatcher("/view/lab3/bai3.jsp").forward(req, resp);
    }
}
