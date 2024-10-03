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
@WebServlet(urlPatterns = {"/lab1/bai1","/lab1/bai1/crud/create", "/lab1/bai1/crud/update", "/lab1/bai1/crud/delete", "/lab1/bai1/crud/edit/2024"})
public class CrudServlet extends HttpServlet {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -3554717030891766488L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("bai1")) {
        	resp.getWriter().print("<a href='http://localhost:8080/java/lab1/bai1/crud/create'>create</a><br>");
        	resp.getWriter().print("<a href='http://localhost:8080/java/lab1/bai1/crud/update'>update</a><br>");
        	resp.getWriter().print("<a href='http://localhost:8080/java/lab1/bai1/crud/delete'>delete</a><br>");
        	resp.getWriter().print("<a href='http://localhost:8080/java/lab1/bai1/crud/edit/2024'>edit</a>");
        }
        if (uri.contains("create")) {
            resp.getWriter().print("<p>The create-page</p>");
        }else if (uri.contains("update")){
            resp.getWriter().print("<p>The update-page</p>");
        }else if (uri.contains("delete")){
            resp.getWriter().print("<p>The delete-page</p>");
        }else if (uri.contains("edit")){
            resp.getWriter().print("<p>The edit-page</p>");
        }
    }
}
