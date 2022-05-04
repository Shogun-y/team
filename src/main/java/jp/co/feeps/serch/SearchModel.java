package jp.co.feeps.serch;


//検索条件の受け渡しに使う
//数字はint型ではなくInteger型にしないといけない
//Integer型はnullを表現できる(実際に検索を行うServiceで使用)
public class SearchModel {


	
	private Integer id;

	private String name;

	private Integer age;

	private String live;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLive() {
		return live;
	}
	public void setLive(String live) {
		this.live = live;
	}	

}
