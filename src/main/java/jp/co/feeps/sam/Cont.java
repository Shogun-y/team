package jp.co.feeps.sam;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sam")
public class Cont {

	@GetMapping
//	public Map<String,String> namejun(){
//		Map<String,String> name=new HashMap<String,String>();
//		name.put("name", "プロテイン");
//		return name;
//		
//	}
//	@PostMapping
	public String nameju(){
		
		String name= "'プロテイン'";
		return name;
		
	}

}
