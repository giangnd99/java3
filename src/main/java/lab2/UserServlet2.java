package lab2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lab2/bai4")
public class UserServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("message", "Welcom to FPT Polytechnic");

		User user = new User();
		user.setFullname("Nguyen Minh Tri");
		user.setGender(true);
		user.setCountry("US");
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
