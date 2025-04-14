package thiGK.ntu64132791.VoXuanTruong_RemakeGK;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu64132791.VoXuanTruong_RemakeGK.Model.Page;

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

    @GetMapping("/page/new")
    public String showAddPageForm(Model model) {
        model.addAttribute("page", new Page());
        return "page-addnew";
    }
    @PostMapping("/page/new")
    public String addNewPage(@ModelAttribute Page page) {
        page.setId(pages.size() + 1);
        pages.add(page);
        return "redirect:/page/all";
    }

    @GetMapping("/page/view/{id}")
    public String viewPage(@PathVariable int id, Model model) {
        for (Page p : pages) {
            if (p.getId() == id) {
                model.addAttribute("page", p);
                return "page-view";
            }
        }
        return "redirect:/page/all";
    }

    @GetMapping("/page/delete/{id}") 
    public String deletePage(@PathVariable int id) {
        pages.removeIf(p -> p.getId() == id);
        return "redirect:/page/all";
    }

}
