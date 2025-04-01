package thiGK.ntu64132791.VoXuanTruong_thiGK;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thiGK.ntu64132791.VoXuanTruong_thiGK.Model.Page;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
    
    private List<Page> pages;

    public PageController() {
 
        pages = new ArrayList<>();
        pages.add(new Page(1, "Home", "home, main", "Welcome to the homepage!"));
        pages.add(new Page(2, "About", "about, info", "This is the about page."));
        pages.add(new Page(3, "Contact", "contact, reach", "Contact us at truong@gmail.com"));
    }

    @GetMapping("/page/all")
    public String listPages(Model model) {
        model.addAttribute("pages", pages);
        return "page-list";
    }
}
