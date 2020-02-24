package store.biyesheji.bysjstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectsController {
	
	@GetMapping("/projects")
	public String index(ModelMap map) {
		
		return "projects";
		
	}

}
