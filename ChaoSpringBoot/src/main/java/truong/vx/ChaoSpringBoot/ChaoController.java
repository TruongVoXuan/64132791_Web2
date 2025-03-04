package truong.vx.ChaoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Bao? rang` day la` 1 lop' controller
public class ChaoController {
	
	//action method
	//URL goi action nay`

	@RequestMapping("/chao")
	public String xin_Chao() {
		//code xu? ly' o? day
		return "helloView";
	}
}
