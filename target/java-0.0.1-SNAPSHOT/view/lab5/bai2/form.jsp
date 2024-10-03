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
        <h1>Bài tập lab 3</h1>
        <form action="/java4/staff" method="post" enctype="multipart/form-data">
            <div>
                <b>Họ và tên:<input type="text" name="fullname"></b><br>
                <b>Hình ảnh: <input type="file" name="photo"></b><br>
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
                <input type="checkbox" name="hobbies" value="R">Đọc sách
                <input type="checkbox" name="hobbies" value="T">Du lịch
                <input type="checkbox" name="hobbies" value="M">Âm nhạc
                <input type="checkbox" name="hobbies" value="O">Khác<br>
                Ghi chú: <<textarea name="notes" rows="3" cols="30"></textarea>
                <hr><!-- comment -->
                <button>Thêm mới</button>
            </div>
        </form>
    </body>
</html>
