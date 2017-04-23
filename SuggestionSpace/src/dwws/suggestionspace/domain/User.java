package dwws.suggestionspace.domain;

import java.util.*;
import javax.persistence.*;

@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name, email,pwd;
	private int age;
	@OneToMany
	Set<Content> favorites;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<Content> getFavorites() {
		return favorites;
	}
	public void setFavorites(Set<Content> favorites) {
		this.favorites = favorites;
	}
	
}
