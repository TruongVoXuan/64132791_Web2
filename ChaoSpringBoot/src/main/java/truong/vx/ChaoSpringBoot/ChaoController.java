package truong.vx.ChaoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //Bao? rang` day la` 1 lop' controller
public class ChaoController {
	
	//action method
	//URL goi action nay`

	@GetMapping("/")
	public String xin_Chao(ModelMap m) {
		//code xu? ly' o? day
		m.addAttribute("tb","Du lieu thong bao xin chao");
		return "helloView";
	}
}
