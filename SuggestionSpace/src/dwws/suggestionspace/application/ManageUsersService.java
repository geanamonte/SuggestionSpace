package dwws.suggestionspace.application;

import javax.ejb.Local;
import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import dwws.suggestionspace.domain.User;

@Local
public interface ManageUsersService extends CrudService<User> {

}
