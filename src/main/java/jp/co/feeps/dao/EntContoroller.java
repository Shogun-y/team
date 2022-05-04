package jp.co.feeps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntContoroller {

	@Autowired
	EntRepository repository;
	
	@RequestMapping(path = "/sammm", method = RequestMethod.GET)
	public List<sam> FindAll() {
		List<sam> EntList=repository.findAll();
		return EntList;
	}
}
