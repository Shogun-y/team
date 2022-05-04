package jp.co.feeps.serch;


import org.springframework.data.jpa.domain.Specification;




public class UsrSpecification<T> {

    //id検索
   public Specification<T> idEqual(Integer id) {

       return id == null ? null : (root, query, builder) -> {
           return builder.equal(root.get("id"), id);
       };
   }
   //検索
  public Specification<T> nameEqual(String name) {

      return name.isEmpty()  ? null : (root, query, builder) -> {
          return builder.like(root.get("name"), name);
      };
  }
	  //age検索
	 public Specification<T> ageEqual(Integer age) {
	
	     return age == null ? null : (root, query, builder) -> {
	         return builder.equal(root.get("age"), age);
	     };
	 }
	 //live検索
	public Specification<T> liveEqual(String live) {
	
	    return live.isEmpty() ? null : (root, query, builder) -> {
	        return builder.like(root.get("live"), live);
	    };
	}
}
