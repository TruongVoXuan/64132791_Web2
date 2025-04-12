package thiGK.ntu64132791.VoXuanTruong_thiGK;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import thiGK.ntu64132791.VoXuanTruong_thiGK.Model.Page;
import thiGK.ntu64132791.VoXuanTruong_thiGK.Model.Post;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private List<Page> pages;
    private List<Post> posts;

    public HomeController() {
        // Danh sách Page
        pages = new ArrayList<>();
        pages.add(new Page(1, "Home", "home, main", "Welcome to the homepage!"));
        pages.add(new Page(2, "About", "about, info", "This is the about page."));
        pages.add(new Page(3, "Contact", "contact, reach", "Contact us at truong@gmail.com"));

        // Danh sách Post
        posts = new ArrayList<>();
        posts.add(new Post(1, "First Post", "This is the content of the first post.", 1));
        posts.add(new Post(2, "Second Post", "This is the content of the second post.", 2));
        posts.add(new Post(3, "Third Post", "This is the content of the third post.", 1));
    }

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
   

    @GetMapping("/posts")
    public String getPosts(Model model) {
        model.addAttribute("posts", posts);
        return "post-list";
    }
}
