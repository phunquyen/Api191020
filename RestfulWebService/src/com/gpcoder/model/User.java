package com.gpcoder.model;
 
//import javax.xml.bind.annotation.XmlRootElement;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "user")
public class User {
 
    private Integer id;
    private String username;
	public User(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setUsername(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setId(Integer id2) {
		// TODO Auto-generated method stub
		
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
}