package org.fns.springsecuity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/")
	@ResponseBody
	public String showHomePage() {
		return "MyHomePage";
	}
	
	@GetMapping("/admin")
	@ResponseBody
	public String showAdminPage() {
		return "MyAdminPage";
	}
	@GetMapping("/user")
	@ResponseBody
	public String showUserPage() {
		return "MyUserPage";
	}

}
