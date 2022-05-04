package jp.co.feeps.lesson4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Forward {

	@GetMapping("/RequestLogin")
	public String RequestLogin() {
		return "lesson4/RequestLogin";
	}
	
	@PostMapping("RequestLogin")
	public String ToLogin() {
		return "forward:/login";
	}
}
