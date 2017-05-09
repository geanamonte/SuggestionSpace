package dwws.suggestionspace.persistence;

import java.util.*;

import javax.ejb.*;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.nemo.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.nemo.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import dwws.suggestionspace.domain.*;
@Local
public interface UserDAO extends BaseDAO<User> {
	List<User> findByName(String name);
	List<User> findByEmail(String email);
	User retrieveByEmail(String email) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException;
}
