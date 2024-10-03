package lab1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lab1")
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1313042948945742233L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/view/lab1/home_lab1.html").forward(req, resp);;
	}
}
