<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tính Toán</title>
</head>
<body>
<%
    double a = 0;
    double b = 0;
    double result = 0;
    String message = "";

    // Lấy tham số từ request
    String aParam = request.getParameter("a");
    String bParam = request.getParameter("b");
    String operation = request.getParameter("operation");

    try {
        a = Double.parseDouble(aParam);  // Chuyển tham số 'a' thành double
        b = Double.parseDouble(bParam);  // Chuyển tham số 'b' thành double

        // Thực hiện phép tính tùy thuộc vào lựa chọn
        switch (operation) {
            case "cong":
                result = a + b;
                message = "Kết quả của " + a + " + " + b + " = " + result;
                break;
            case "tru":
                result = a - b;
                message = "Kết quả của " + a + " - " + b + " = " + result;
                break;
            case "nhan":
                result = a * b;
                message = "Kết quả của " + a + " * " + b + " = " + result;
                break;
            case "chia":
                if (b == 0) {
                    message = "Không thể chia cho 0!";
                } else {
                    result = a / b;
                    message = "Kết quả của " + a + " / " + b + " = " + result;
                }
                break;
            default:
                message = "Phép tính không hợp lệ.";
                break;
        }
    } catch (NumberFormatException e) {
        message = "Định dạng số không hợp lệ!";
    }

%>
    <h1><%= message %></h1>
    <a href="tinhtoan.html">Quay lại trang tính toán</a>
</body>
</html>
