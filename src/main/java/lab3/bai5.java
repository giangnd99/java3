package lab3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/lab3/bai5")
public class bai5 extends HttpServlet {
    List<Country> countryList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        countryList.add(new Country("US", "United State"));
        countryList.add(new Country("VN", "VietNam"));
        countryList.add(new Country("CN", "China"));
        req.setAttribute("countries", countryList);
        req.getRequestDispatcher("/view/lab3/bai5.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("countries", countryList);
        CountryDAO countryDAO = new CountryDAO();
        countryDAO.setCountries(countryList);

        boolean isEdit = req.getParameter("edit") != null;
        boolean isDelete = req.getParameter("delete") != null;
        boolean isAdd = req.getParameter("add") != null;
        String id = req.getParameter("id");
        Country country = countryDAO.getCountry(id);

        if (isEdit) {
            id = req.getParameter("id");
            String name = req.getParameter("name");
            country.setId(id);
            country.setName(name);
            countryDAO.updateCountry(country);
            req.setAttribute("message", "Ban da sua thanh cong");
        } else if (isDelete) {
            countryDAO.deleteCountry(country);
            req.setAttribute("message", "Ban da xoa thanh cong");
        } else if (isAdd) {
            String name = req.getParameter("name");
            id = req.getParameter("id");
            Country newCountry = new Country(id, name);
            countryDAO.addCountry(newCountry);
            req.setAttribute("message", "Ban da them quoc gia thanh cong");
        }

        req.getRequestDispatcher("/view/lab3/bai5.jsp").forward(req, resp);
    }

}
