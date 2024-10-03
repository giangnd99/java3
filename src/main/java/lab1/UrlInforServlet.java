package lab1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Computer
 */
@WebServlet(urlPatterns = {"/lab1/bai3"})
public class UrlInforServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1037395030739077866L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<h1>Url Infor</h1>");
        StringBuffer url = req.getRequestURL();
        resp.getWriter().print("<p>URL: " + url.toString() + "</p>");
        String uri = req.getRequestURI();
        resp.getWriter().print("<p>URI: " + uri + "</p>");
        String queryString = req.getQueryString();
        resp.getWriter().println("<p>Query String: " + queryString + "</p>");
        String servletPath = req.getServletPath();
        resp.getWriter().println("<p>Servlet path: " + servletPath + "</p>");
        String contextPath = req.getContextPath();
        resp.getWriter().println("<p>Context Path: " + contextPath + "</p>");
        String pathInfor = req.getPathInfo();
        resp.getWriter().println("<p>Path infor: " + pathInfor + "</p>");
        String method = req.getMethod();
        resp.getWriter().println("<p>Method-type: " + method + "</p>");
    }

}
