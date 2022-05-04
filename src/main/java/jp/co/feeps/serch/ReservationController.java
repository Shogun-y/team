package jp.co.feeps.serch;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;





@Controller
public class ReservationController {
	

    @Autowired
    private ReservationService reservationService;
//	@RequestMapping(path = "/search", method = RequestMethod.POST)
//	public  ReservationService searchResult(SearchModel target) {
//		return (ReservationService) reservationService.getSearchReservations(target);
//		
//	}
//	
    @GetMapping("/reservation/search")
    public String search(Model model) {

        model.addAttribute("target", new SearchModel());

        return "search";
    }

    /**
     * 検索結果
     */
//    @GetMapping("/reservation/search/result")
//    public String searchResult(Model model,
//            @ModelAttribute("target") SearchModel target) {
//
//        model.addAttribute("reservations",
//            reservationService.getSearchReservations(target));
//        
//        System.out.print(reservationService.getSearchReservations(target));
//
//        return "search/result";
//    }
}
