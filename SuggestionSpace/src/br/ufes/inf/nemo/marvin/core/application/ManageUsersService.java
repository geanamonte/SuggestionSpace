package br.ufes.inf.nemo.marvin.core.application;

import javax.ejb.*;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.marvin.core.domain.User;

@Local
public interface ManageUsersService extends CrudService<User> {
	
	
}	
