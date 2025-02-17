package truongVo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BMI() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Tính BMI</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #e8f4f8; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".container { background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 15px rgba(0,0,0,0.1); max-width: 400px; width: 100%; text-align: center; }");
        out.println("h2 { color: #4CAF50; }");
        out.println("input { width: calc(100% - 20px); padding: 10px; margin: 10px 0; border: 1px solid #ddd; border-radius: 5px; }");
        out.println("button { padding: 10px 20px; background-color: #4CAF50; color: white; border: none; border-radius: 5px; cursor: pointer; }");
        out.println("button:hover { background-color: #45a049; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Tính chỉ số BMI</h2>");
        out.println("<form action='BMI' method='post'>");
        out.println("<input type='text' name='height' placeholder='Chiều cao (m)' required><br>");
        out.println("<input type='text' name='weight' placeholder='Cân nặng (kg)' required><br>");
        out.println("<button type='submit'>Tính BMI</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String heightStr = request.getParameter("height");
        String weightStr = request.getParameter("weight");
        
        try {
            double height = Double.parseDouble(heightStr);
            double weight = Double.parseDouble(weightStr);
            double bmi = weight / (height * height);
            String result;
            
            if (bmi < 18.5) {
                result = "Gầy";
            } else if (bmi < 24.9) {
                result = "Bình thường";
            } else if (bmi < 29.9) {
                result = "Thừa cân";
            } else {
                result = "Béo phì";
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Kết quả BMI</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #e8f4f8; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
            out.println(".container { background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 15px rgba(0,0,0,0.1); max-width: 400px; width: 100%; text-align: center; }");
            out.println("h2 { color: #4CAF50; }");
            out.println("a { color: #4CAF50; text-decoration: none; }");
            out.println("a:hover { text-decoration: underline; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h2>Kết quả BMI</h2>");
            out.println("<p>Chiều cao: " + height + " m</p>");
            out.println("<p>Cân nặng: " + weight + " kg</p>");
            out.println("<p><strong>BMI: " + String.format("%.2f", bmi) + "</strong></p>");
            out.println("<p>Phân loại: " + result + "</p>");
            out.println("<a href='BMI'>Tính lại</a>");
            out.println("</div>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Lỗi</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #e8f4f8; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
            out.println(".container { background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 15px rgba(0,0,0,0.1); max-width: 400px; width: 100%; text-align: center; }");
            out.println("h2 { color: red; }");
            out.println("a { color: #4CAF50; text-decoration: none; }");
            out.println("a:hover { text-decoration: underline; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h2 style='color:red;'>Vui lòng nhập số hợp lệ!</h2>");
            out.println("<a href='BMI'>Quay lại</a>");
            out.println("</div>");
            out.println("</body></html>");
        }
    }
}
