package br.ufes.inf.nemo.marvin.core.domain;

import javax.persistence.Entity;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

@Entity
public class Type extends PersistentObjectSupport {

	/**
	 * 
	 */
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private static final long serialVersionUID = 1L;

}
