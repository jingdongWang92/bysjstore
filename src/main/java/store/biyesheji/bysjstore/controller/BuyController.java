package store.biyesheji.bysjstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyController {
	
	@GetMapping("/buy")
	public String index(ModelMap map) {
		
		return "buy";
		
	}

}
