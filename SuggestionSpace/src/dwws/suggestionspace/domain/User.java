package dwws.suggestionspace.domain;

import java.util.*;
import javax.persistence.*;

import dwws.suggestionspace.util.PersistentObjectImpl;

@Entity
public class User extends PersistentObjectImpl{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, email,pwd;
	private Date birthDate;
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
	public Set<Content> getFavorites() {
		return favorites;
	}
	public void setFavorites(Set<Content> favorites) {
		this.favorites = favorites;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
