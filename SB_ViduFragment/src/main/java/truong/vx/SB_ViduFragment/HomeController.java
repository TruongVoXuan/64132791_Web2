package truong.vx.SB_ViduFragment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String trangChu() {
        return "FontEndView/index";  
    }
    @GetMapping("/about")
	public String gioiThieu() {
		return "FontEndView/about";
	}
}