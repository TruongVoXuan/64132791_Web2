package truong.vx.SB_TongHopGK;

import java.util.ArrayList;
import truong.vx.SB_TongHopGK.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("listSV")
public class SinhVienController {
    
    // List students (GET request)
    @RequestMapping("/students")
    public String listPage(Model model) {
        
        // Get the list of students from the session
        ArrayList<SinhVien> dsSinhVien = (ArrayList<SinhVien>) model.getAttribute("listSV");
        
        if (dsSinhVien == null) {
            dsSinhVien = new ArrayList<>();
        }
        
        // Add some default students if the list is empty
        if (dsSinhVien.isEmpty()) {
            dsSinhVien.add(new SinhVien("64132791", "Vo Xuan Truong", 8.5f));
            dsSinhVien.add(new SinhVien("64132084", "Nguyen Van An", 7.8f));
            dsSinhVien.add(new SinhVien("64132085", "Trần Thị B", 9.2f));
            dsSinhVien.add(new SinhVien("64132086", "Lê Văn C", 6.5f));
            dsSinhVien.add(new SinhVien("64132087", "Hoàng Minh D", 8.0f));
            dsSinhVien.add(new SinhVien("64132088", "Vũ Thanh E", 7.3f));
        }
        
        // Add the list of students to the model to display it in the view
        model.addAttribute("listSV", dsSinhVien);
        return "students";
    }

    // Home page (GET request)
    @RequestMapping("/home")
    public String trangchu() {
        return "home";
    }

    // About page (GET request)
    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("mssv", "64132791");
        model.addAttribute("hoten", "VÕ XUÂN TRƯỜNG");
        model.addAttribute("year", "2004");
        return "about";
    }

    // Show "Add New Student" form (GET request)
    @RequestMapping("/addNew")
    public String addNewPage() {
        return "addNew";
    }

    // Handle "Add New Student" form submission (POST request)
    @PostMapping("/addNew")
    public String addNewStudent(@RequestParam("MSSV") String MSSV,
                                @RequestParam("hoTen") String hoTen,
                                @RequestParam("diemTB") float diemTB,
                                Model model) {
        // Get the list of students from the session
        ArrayList<SinhVien> dsSinhVien = (ArrayList<SinhVien>) model.getAttribute("listSV");
        
        if (dsSinhVien == null) {
            dsSinhVien = new ArrayList<>();
        }
        
        // Add the new student to the list
        dsSinhVien.add(new SinhVien(MSSV, hoTen, diemTB));
        
        // Add the updated list to the model
        model.addAttribute("listSV", dsSinhVien);
        
        // Redirect to the student list page to display the updated list
        return "redirect:/students";
    }
}
