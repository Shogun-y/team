package jp.co.feeps.serch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//検索機能テスト用のContoroller

@Controller
public class ReservationController {

    @GetMapping("/reservation/search")
    public String search(Model model) {

        model.addAttribute("target", new SearchModel());

        return "search";
    }
}
