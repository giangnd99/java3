<%-- 
    Document   : form
    Created on : Apr 18, 2024, 5:40:44 PM
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bài tập lab 5</h1>
        <form action="staff" method="post">
            <div>
                <b>Họ và tên:<input type="text" name="fullname"></b><br>
                <b>Ngày sinh: <input type="date" name="birthday"></b><br>
                <b>Giới tính:</b><br>
                <input type="radio" name="gender" value="true">Nam<br>
                <input type="radio" name="gender" value="false">Nữ<br>
                Quốc tịch
                <select name="country">
                    <option value="Việt Nam">VN</option>
                    <option value="United State">US</option>
                </select><br>
                Tình trạng hôn nhân: <input type="checkbox" name="married"><br>
                Sở thích: 
                <input type="checkbox" name="hobbies" value="Read">Đọc sách
                <input type="checkbox" name="hobbies" value="Travel">Du lịch
                <input type="checkbox" name="hobbies" value="Music">Âm nhạc
                <input type="checkbox" name="hobbies" value="Others">Khác<br>
                Ghi chú: <<textarea name="notes" rows="3" cols="30"></textarea>
                <hr><!-- comment -->
                <button>Thêm mới</button>
            </div>
        </form>
    </body>
</html>
