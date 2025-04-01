package thiGK.ntu64132791.VoXuanTruong_thiGK;

import thiGK.ntu64132791.VoXuanTruong_thiGK.Model.Page;
import thiGK.ntu64132791.VoXuanTruong_thiGK.Model.Post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller  
@RequestMapping("/api")
public class HomeController {

    private List<Page> pages;
    private List<Post> posts;

    public HomeController() {
        pages = new ArrayList<>();
        pages.add(new Page(1, "Home", "home, main", "Welcome to the homepage!"));
        pages.add(new Page(2, "About", "about, info", "This is the about page."));
        pages.add(new Page(3, "Contact", "contact, reach", "Contact us at truong@gmail.com"));

        posts = new ArrayList<>();
        posts.add(new Post(1, "First Post", "This is the content of the first post.", 1));
        posts.add(new Post(2, "Second Post", "This is the content of the second post.", 2));
        posts.add(new Post(3, "Third Post", "This is the content of the third post.", 1));
    }

    @GetMapping("/")
    public String trangChu(Model m) {
        String strTieuDe = "Đây là Trang chủ";
        m.addAttribute("tieudeTrang", strTieuDe);
        return "index";
    }

    @GetMapping("/admin")
    public String trangChuSB(Model m) {
        return "indexSB";
    }

    @GetMapping("/pages")
    @ResponseBody  
    public List<Page> getPages() {
        return pages;
    }

    @GetMapping("/posts")
    @ResponseBody  
    public List<Post> getPosts() {
        return posts;
    }
}
