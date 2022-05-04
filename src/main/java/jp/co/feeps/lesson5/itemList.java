package jp.co.feeps.lesson5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class itemList {
	
	@GetMapping("/list")
	public String list(Model model) {
		List<String> itemList = new ArrayList<>();
		itemList.add("くるみ");
		itemList.add("ミルク");
		
		model.addAttribute("itemList",itemList);
		return "lesson5/item_list";
		
	}

}
