package truong.vx.SB_DanhSachSV;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DsSinhVienController {
@GetMapping("/dsSV")
public String dsSinhVien(Model model)
{
	ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
	dsSinhVien.add(new SinhVien(64132791, "Võ Xuân Trường", "25/01/2004", "Nam"));
	dsSinhVien.add(new SinhVien(64132792, "Nguyễn Văn A", "12/01/2004", "Nữ"));
	dsSinhVien.add(new SinhVien(64132793, "Nguyễn Văn B", "5/01/2004", "Nam"));
	dsSinhVien.add(new SinhVien(64132791, "Nguyễn Văn C", "15/01/2004", "Nam"));
	
	model.addAttribute("viewDsSv",dsSinhVien);
	return "viewDsSv";
}
}
