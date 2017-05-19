package br.ufes.inf.nemo.marvin.core.domain;

import javax.persistence.Entity;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Genre extends PersistentObjectSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
