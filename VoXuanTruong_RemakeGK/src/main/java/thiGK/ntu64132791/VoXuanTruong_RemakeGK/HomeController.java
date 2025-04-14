package thiGK.ntu64132791.VoXuanTruong_RemakeGK;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu64132791.VoXuanTruong_RemakeGK.Model.Page;

@Controller
public class HomeController {
	 private List<Page> pages;
    @GetMapping("/")
    public String trangChu(Model m) {
        String strTieuDe = "Đây là Trang Chủ";
        m.addAttribute("tieudeTrang", strTieuDe);
        return "index";
    }

    @GetMapping("/admin")
    public String trangChuSB() {
        return "indexSB";
    }

    @GetMapping("/pages")
    public String getPages(Model model) {
        model.addAttribute("pages", pages);
        return "page-list";
    }
   
}
