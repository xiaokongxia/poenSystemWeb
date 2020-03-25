package poem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/register")
	public String register() {
		return "register";  //   /register.jsp
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";//   login.jsp
	}
}
