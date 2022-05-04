package jp.co.feeps.serch;




import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;




public class UsrSpecification<T> {

	//以下，ラムダ式で記述した
	
    //id検索
	//数値での検索はequalで同値のみ検索
   public Specification<T> idEqual(Integer id) {

       return id == null ? null : (root, query, builder) -> {
           return builder.equal(root.get("id"), id);
       };
   }
   //name検索
   //文字列での検索はPredicateでOR検索
   public Specification<T> nameContains(String name) {
	   
	      return name.isEmpty() ? null : (root, query, builder) -> {
	            Predicate[] predicates = {
	                    builder.like(root.get("name"), "%" + name + "%")
	            };
	            return builder.or(predicates);
	        };
	  }
	  //age検索
	 public Specification<T> ageEqual(Integer age) {
	
	     return age == null ? null : (root, query, builder) -> {
	         return builder.equal(root.get("age"), age);
	     };
	 }
	 //live検索
	public Specification<T> liveContains(String live) {
	
	      return live.isEmpty() ? null : (root, query, builder) -> {
	            Predicate[] predicates = {
	                    builder.like(root.get("live"), "%" + live + "%")
	            };
	            return builder.or(predicates);
	        };
	  }
}
