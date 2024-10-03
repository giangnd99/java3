package lab3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/lab3/bai2")
public class Bai2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Country> countryList = List.of(
                new Country("US", "United State"),
                new Country("VN", "VietNam"),
                new Country("CN", "China")
        );
        countryList.forEach(country -> {
            System.out.println(country.getName());
            ;
        });
        req.setAttribute("countries", countryList);
        req.getRequestDispatcher("/view/lab3/bai2.jsp").forward(req, resp);
    }
}
