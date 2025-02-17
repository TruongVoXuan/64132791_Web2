package TruongVo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class aboutMe
 */
@WebServlet("/aboutMe")
public class aboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public aboutMe() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Thông tin cá nhân
        String hoTen = "Võ Xuân Trường";
        String hocLop = "Lớp 64-CNTT_CLC";
        String maSoSinhVien = "64132791";
        String noiO = "Phường Vĩnh Phước, Khánh Hòa, Việt Nam";
        String soDienThoai = "0345338980";
    
        out.println("<html>");
        out.println("<head>");
        out.println("<title>About Me</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f9; }");
        out.println("h2 { color: #4CAF50; }");
        out.println(".container { display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".info { background-color: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); width: 80%; max-width: 600px; border: 2px solid #ddd; }");
        out.println(".info p { font-size: 18px; margin-bottom: 10px; }");
        out.println(".info strong { color: #333; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<div class='info'>");
        out.println("<h2>Thông tin cá nhân</h2>");
        out.println("<p><strong>Họ tên:</strong> " + hoTen + "</p>");
        out.println("<p><strong>Học lớp:</strong> " + hocLop + "</p>");
        out.println("<p><strong>Mã số sinh viên:</strong> " + maSoSinhVien + "</p>");
        out.println("<p><strong>Nơi ở:</strong> " + noiO + "</p>");
        out.println("<p><strong>Số điện thoại:</strong> " + soDienThoai + "</p>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}
}
