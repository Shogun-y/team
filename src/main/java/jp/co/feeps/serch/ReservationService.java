package jp.co.feeps.serch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private UsrReservationRepository usrReservationRepository;

    public List<UsrReservation> getSearchReservations(SearchModel target) {

    	Integer id = target.getId() == 0 ? null : target.getId();
    	Integer age = target.getAge() == 0 ? null : target.getAge();

    	
    	
        UsrSpecification<UsrReservation> spec = new UsrSpecification<>();
        
        List<UsrReservation> result=new ArrayList<UsrReservation>();

        return usrReservationRepository.findAll(
        		Specification.where(spec.idEqual(id))
                    .and(spec.nameEqual(target.getName()))
                    .and(spec.ageEqual(age))
                    .and(spec.liveEqual(target.getLive())));
    }
}
