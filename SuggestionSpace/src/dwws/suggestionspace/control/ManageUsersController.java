package dwws.suggestionspace.control;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.inf.nemo.jbutler.ejb.application.filters.LikeFilter;
import br.ufes.inf.nemo.jbutler.ejb.controller.CrudController;
import dwws.suggestionspace.application.ManageUsersService;
import dwws.suggestionspace.domain.*;
@Named
@SessionScoped
public class ManageUsersController extends CrudController<User> {
	@EJB private ManageUsersService manageUsersService;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected CrudService<User> getCrudService() {
		return manageUsersService;
	}
	@Override
	protected void initFilters() {
		addFilter(new LikeFilter("manageUsers.filter.byName", "name", getI18nMessage("msgsCore", "manageUsers.text.filter.byName")));
		
	}

}
