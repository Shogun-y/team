package jp.co.feeps.lesson5;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemAdd {
	@GetMapping("/itemAdd")
	public String inputItem() {
		return "lesson5/input_item";
	}
	
	@PostMapping("/itemAdd")
	public String itemAdd(String item,HttpSession session) {
		List<String> itemList=(List<String>)session.getAttribute("itemList");
		
		if(itemList==null) {
			itemList=new ArrayList<>();
		}
		itemList.add(item);
		session.setAttribute("itemList",itemList);
		return "lesson5/item_list2";
		
	}

}