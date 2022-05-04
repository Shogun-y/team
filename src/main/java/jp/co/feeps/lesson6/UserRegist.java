package jp.co.feeps.lesson6;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserRegist {

	@GetMapping("/inputUser")
	public String inputUser(UserForm userForm,Model model) {
		model.addAttribute("userform",userForm);
		return "lesson6/inputUser";
	}
}
