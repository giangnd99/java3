package lab2;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lab2/bai5")
public class Calculator extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7270383381163888865L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/view/lab2/may-tinh.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String num1 = req.getParameter("num1");
			String num2 = req.getParameter("num2");
			String errorNullNumber = "Không được bỏ trống ô nhập";
			double number1 = 0, number2 = 0;

			boolean flag = false;
			if ((num1 == null || num1.equals("")) & (num2 == null || num2.equals(""))) {
				req.setAttribute("num1", errorNullNumber);
				req.setAttribute("num2", errorNullNumber);
			} else if (num1 == null || num1.equals("")) {
				req.setAttribute("num1", errorNullNumber);
			} else if (num2 == null || num2.equals("")) {
				req.setAttribute("num2", errorNullNumber);
			} else if(num1.equals(errorNullNumber) || num2.equals(errorNullNumber)){ 
				req.setAttribute("message", "Vui lòng điền vào ô nhập số");
			}else {
				flag = true;
				number1 = Double.parseDouble(num1);
				number2 = Double.parseDouble(num2);
			}

			String operation = req.getParameter("operation");

			if (flag) {
				var result = switch (operation) {
				case "add" -> {
					yield number1 + number2;
				}
				case "subtract" -> {
					yield number1 - number2;
				}
				case "multiply" -> {
					yield number1 * number2;
				}
				case "divide" -> {
					if (number2 == 0) {
						req.setAttribute("message", "Vui lòng không nhập số 0");
						yield null;
					}
					yield number1 / number2;
				}
				case "reset" -> {
					req.setAttribute("message", "");
					yield null;
				}
				default -> {
					req.setAttribute("message", "Phép toán không hợp lệ");
					yield null;
				}
				};

				if (result != null) {
					req.setAttribute("message", result);
					req.setAttribute("num1", number1);
					req.setAttribute("num2", number2);
				}
			}
		} catch (NumberFormatException e) {
			req.setAttribute("message", "Nhập không đúng định dạng số");
		} catch (NullPointerException e) {
			req.setAttribute("message", "Nhập không đúng định dạng số");
		}
		req.getRequestDispatcher("/view/lab2/may-tinh.jsp").forward(req, resp);
	}
}
