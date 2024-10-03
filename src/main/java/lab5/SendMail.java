/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package lab5;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Computer
 */
@WebServlet("/lab5/send-mail")
public class SendMail extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/view/lab5/bai2/send.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String emailSend = req.getParameter("emailsend");
            String emailreceive = req.getParameter("emailreceive");
            String tittle = req.getParameter("tittle");
            String bodymes = req.getParameter("bodymes");
            if(sendEmail(emailSend, emailreceive, tittle, bodymes)) req.setAttribute("message", "Email sent");
            req.getRequestDispatcher("/view/lab5/bai2/send.jsp").forward(req, resp);
        } catch (Exception ex) {
            resp.getWriter().print("Erro");
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean sendEmail(String emailSend, String emailReceive, String tittle, String bodymes) throws IOException, Exception {
        try {
            Properties prop = new Properties();
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //Xác thực qua email
            String senderEmail = emailSend;
            String password = "sanz zwvp hsic qrzn";
            Session session = Session.getInstance(prop,
                    new jakarta.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, password);
                }
            });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(emailReceive));
//
//            message.setRecipients(Message.RecipientType.CC,
//                    getCCEmail(txtCcEmail.getText()));
//
//            message.setRecipients(Message.RecipientType.BCC,
//                    getCCEmail(txtBCC.getText()));
            message.setSubject(tittle);
//
//            if (count == 1) {
//                message.setContent(multipart, "text/htmls; charset=utf-8");
//                count = 0;
//            } else {
            MimeBodyPart bodymess = new MimeBodyPart();
            bodymess.setText(bodymes, "utf-8");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodymess);
            message.setContent(multipart, "text/htmls; charset=utf-8");
//            }
            message.setReplyTo(message.getFrom());
            Transport.send(message);
            System.out.println("Gửi thành công");
            return true;
        } catch (MessagingException e) {
            throw new Exception();
        }
    }
//
//    public Address[] getCCEmail(String ccEmail) throws AddressException {
//        String[] ccEmails = ccEmail.split(",");
//        Address[] listAddress = new Address[ccEmails.length];
//        for (int i = 0; i < ccEmails.length; i++) {
//            listAddress[i] = new InternetAddress(ccEmails[i]);
//        }
//        return listAddress;
//    }
//
//    public Address[] getBCCEmail(String BccEmail) throws AddressException {
//        String[] BccEmails = BccEmail.split(",");
//        Address[] listAddress = new Address[BccEmails.length];
//        for (int i = 0; i < BccEmails.length; i++) {
//            listAddress[i] = new InternetAddress(BccEmails[i]);
//        }
//        return listAddress;
//    }
//
//    public Multipart getAtatchFile(MimeBodyPart messageBodyPart) throws MessagingException, IOException {
//        MimeBodyPart attachmentPart = new MimeBodyPart();
//        Multipart multiparts = new MimeMultipart();
//        multiparts.addBodyPart(messageBodyPart);
//
//        JFileChooser fileAttach = new JFileChooser();
//        int result = fileAttach.showOpenDialog(null);
//        if (result == JFileChooser.APPROVE_OPTION) {
//            File file = fileAttach.getSelectedFile();
//            attachmentPart.attachFile(file);
//            multiparts.addBodyPart(attachmentPart);
//        }
//        return multiparts;
//    }

}
