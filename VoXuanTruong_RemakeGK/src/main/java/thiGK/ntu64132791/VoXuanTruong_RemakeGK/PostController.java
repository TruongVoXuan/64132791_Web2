package thiGK.ntu64132791.VoXuanTruong_RemakeGK;

import java.util.ArrayList;
import java.util.List;
import thiGK.ntu64132791.VoXuanTruong_RemakeGK.Model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

	private List<Post> posts = new ArrayList<>();;
	public PostController() {
        posts.add(new Post(1, "First Post", "This is the first post", 1));
        posts.add(new Post(2, "Second Post", "This is the second post", 2));
    }
	
	@GetMapping("/post/all")
    public String listPosts(Model model) {
        model.addAttribute("posts", posts);
        return "post-list";
    }
	
	@GetMapping("/post/new")
    public String showAddPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post-addnew";
    }
	
	 @PostMapping("/post/new")
	    public String addNewPost(@ModelAttribute Post post) {
	        post.setId(posts.size() + 1);
	        posts.add(post);
	        return "redirect:/post/all";
	    }

	
	
	
	
}
