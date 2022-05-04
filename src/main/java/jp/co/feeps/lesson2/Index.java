package jp.co.feeps.lesson2;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.feeps.serch.SearchModel;

@RestController
public class Index<T> {

	@RequestMapping(path = "/to", method = RequestMethod.GET)
	public SearchModel index(SearchModel target) {
		return target;
	}
}
