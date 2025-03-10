package truong.vx.SB_TruyenDuLieuSangView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
    @GetMapping("/SV")
    public String sinh_Vien(ModelMap m) {
        m.addAttribute("mssv", "64132791");
        m.addAttribute("hoten", "Võ Xuân Trường ");
        m.addAttribute("namsinh", "25/01/2004");
        m.addAttribute("gioitinh", "Nam");
        return "sinhvienView";
    }
}