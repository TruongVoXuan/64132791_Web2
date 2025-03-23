package truong.vx.SB_TruyenDuLieuSangController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showForm() {
        return "index"; // Trả về trang index.html
    }

    @GetMapping("/result")
    public String processForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("userName", name);
        return "result";
    }
}