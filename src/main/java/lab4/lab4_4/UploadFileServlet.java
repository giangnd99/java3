package lab4.lab4_4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Servlet implementation class UploadFileServlet
 */
@MultipartConfig
@WebServlet("/lab4/upload")
public class UploadFileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<String> imgName = new ArrayList<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/view/lab4/lab4_4/upload_file.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File fileSaveDir = new File(req.getServletContext().getRealPath("/files"));
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }
        Collection<Part> fileParts = req.getParts();
        for (Part part : fileParts) {
            String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
            if (fileName != null && !fileName.isEmpty()) {
                saveFile(part, fileSaveDir.getAbsolutePath()); 
                imgName.add(fileName);
            }
        }

        req.setAttribute("imgs", imgName);
        req.getRequestDispatcher("/view/lab4/lab4_4/upload_file.jsp").forward(req, resp);
    }

    private void saveFile(Part part, String saveDirectory) throws IOException {
        String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString(); 
        File destFile = new File(saveDirectory + File.separator + fileName);
        try (InputStream inputStream = part.getInputStream()) {
            Files.copy(inputStream, destFile.toPath(), StandardCopyOption.REPLACE_EXISTING); 
        } catch (IOException e) {
            throw new IOException("Lỗi khi lưu tệp: " + fileName, e); 
        }
    }
}
