package truong.vx.SB_FormDangNhap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    
    // Handle GET request to display the login page
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login"; // Return login.jsp (or equivalent view)
    }

    // Handle POST request for login form submission
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String taikhoan, String matkhau, Model model) {
        // Validate login credentials
        if ("ABC".equals(taikhoan) && "123".equals(matkhau)) {
            return "redirect:/userProfile"; // Redirect to userProfile page
        } else {
            // Add error message to the model
            model.addAttribute("errorMessage", "Sai thông tin đăng nhập");
            return "login"; // Return to the login page
        }
    }

    // Handle GET request for user profile
    @RequestMapping(value = "/userProfile", method = RequestMethod.GET)
    public String showUserProfile() {
        return "userProfile"; // Return to userProfile page
    }
}
