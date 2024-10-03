package lab4.lab4_2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/lab4/cal")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/lab4/lab4_2/calculator.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double number1 = Double.parseDouble(request.getParameter("num1"));
		Double number2 = Double.parseDouble(request.getParameter("num2"));
		String operation = request.getParameter("operation");
		double result = 0;
		
		if (operation.equals("+")) {
			result = number1 + number2;
		} else {
			result = number1 - number2;
		}
		
		request.setAttribute("result", result);
		request.getRequestDispatcher("/view/lab4/lab4_2/calculator.jsp").forward(request, response);
	}

}
