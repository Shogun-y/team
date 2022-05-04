package jp.co.feeps.serch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIReservationController<T> {

    @Autowired
    private ReservationService reservationService;
    
    //引数のSearchModelにパラメータを格納してる
	@RequestMapping(path = "/reservation/search/result", method = RequestMethod.GET)
	public  List<T> searchResult(SearchModel target) {
		return (List<T>)reservationService.getSearchReservations(target); 
		
		
		
	}
	
}
