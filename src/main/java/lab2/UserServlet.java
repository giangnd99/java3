package lab2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/lab2/bai2")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("message", "Welcom to FPT Polytechnic");

		Map<String, Object> user = new HashMap<String, Object>();
		user.put("fullname", "Nguyen Dang Giang");
		user.put("gender", "Male");
		user.put("country", "Viet Nam");
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("/view/lab2/page.jsp").forward(request, response);
	}
}
