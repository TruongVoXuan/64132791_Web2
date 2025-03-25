package truong.vx.SB_TongHopGK;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SinhVienController {
	@GetMapping("/studentList")
	public String dsSinhVien(Model model)
	{
		ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
		dsSinhVien.add(new SinhVien(64132791, "Võ Xuân Trường", 8.8));
		dsSinhVien.add(new SinhVien(64132791, "Nguyễn Văn An", 6.8));
		dsSinhVien.add(new SinhVien(64132791, "Trần Nam", 7.5));
		model.addAttribute("ds",dsSinhVien);
		return "viewDsSv";
	}
	
	@GetMapping("/home")
	public String trangchu() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about(Model m) {
		m.addAttribute("mssv","64132791");
		m.addAttribute("hoten","Võ Xuân Trường");
		m.addAttribute("year","25/01/2004");
		return "about";
	}
	
	@PostMapping("/addNew")
    public String addNew(@RequestParam("mssv") int mssv, @RequestParam("hoten") String hoten, @RequestParam("diem") double diem, Model model) {
        
        SinhVien newSinhVien = new SinhVien(mssv, hoten, diem);

        ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
        dsSinhVien.add(newSinhVien);
        model.addAttribute("ds", dsSinhVien);
        return "viewDsSv";
    }

	
	
}
