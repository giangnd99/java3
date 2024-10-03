package lab2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lab2/bai3")
public class FormServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4444674255494565247L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("message", "Welcom to FPT Polytechnic");

		Map<String, Object> user = new HashMap<String, Object>();
		user.put("fullname", "Nguyen Dang Giang");
		user.put("gender", true);
		user.put("country", "US");
		req.setAttribute("user", user);
		req.setAttribute("editabled", true);

		req.getRequestDispatcher("/view/lab2/form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname = req.getParameter("fullname");
		System.out.println(fullname);	
		req.getRequestDispatcher("/view/lab2/form.jsp").forward(req, resp);
	}
}
