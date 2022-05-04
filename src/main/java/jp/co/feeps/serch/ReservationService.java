package jp.co.feeps.serch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

//実際に検索を行うService
@Service
public class ReservationService {

    @Autowired
    private UsrReservationRepository usrReservationRepository;

    
    public List<UsrReservation> getSearchReservations(SearchModel target) {
  	
        UsrSpecification<UsrReservation> spec = new UsrSpecification<>();
//複数検索の項目を羅列する
//数値の項目はInteger型にキャスト(空白で検索された時にnullとするため)
        return usrReservationRepository.findAll(
        		Specification.where(spec.idEqual((Integer)target.getId()))
                    .and(spec.nameContains(target.getName()))
                    .and(spec.ageEqual((Integer)target.getAge()))
                    .and(spec.liveContains(target.getLive())));
    }
}
