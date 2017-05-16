package dwws.suggestionspace.domain;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;


@Entity
public class User extends PersistentObjectSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, email,pwd,shortName;
	private Date birthDate;
	@OneToMany
	Set<Content> favorites;

	/** The timestamp of the moment this academic was created. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	/** The last time the data about the user was updated. */
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date lastUpdateDate;

	/** The last time the user logged in the system. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginDate;
	
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
}
