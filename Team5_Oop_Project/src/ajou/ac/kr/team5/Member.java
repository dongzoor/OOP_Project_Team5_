package ajou.ac.kr.team5;

import java.io.Serializable;

public class Member implements Serializable {

	
	 private String id;
	 private String password;
	 private String name;
	 private String age;
	 
	 public Member(){}
	 public Member(String id,String password, String name, String age){
		 super();
		 this.id = id;
		 this.password = password;
		 this.name = name;
		 this.age = age;
	 }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	 
}
