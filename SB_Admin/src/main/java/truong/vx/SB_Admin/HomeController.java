package truong.vx.SB_Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String trangChu(Model m) {
        String strTieuDe = "Day la Trang chu";
        m.addAttribute("tieudeTrang", strTieuDe);
        return "index";
    }

    @GetMapping("/sbadmin")
    public String trangChuSB(Model m) {
        return "indexSB";
    }
}
