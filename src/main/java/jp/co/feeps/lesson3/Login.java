package jp.co.feeps.lesson3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {

	@GetMapping("/logi")
	public String login() {
		return "lesson3/login";
	}
	
	@PostMapping("logi")
	public String loginCheck(LoginForm loginForm) {
		
		if(loginForm.getUserId()==123 && loginForm.getPassword().equals("abc")) {
			return "lesson3/success";
		}else {
			return "lesson3/login";
		}
	}
	
	
}
