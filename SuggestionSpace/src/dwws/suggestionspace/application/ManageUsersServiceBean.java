package dwws.suggestionspace.application;


import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.*;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import dwws.suggestionspace.domain.User;
import dwws.suggestionspace.persistence.UserDAO;

@Stateless
@PermitAll
public class ManageUsersServiceBean extends CrudServiceBean<User>
		implements ManageUsersService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserDAO userDAO;
	
	@Override
	public BaseDAO<User> getDAO() {
		return userDAO;
	}


}
