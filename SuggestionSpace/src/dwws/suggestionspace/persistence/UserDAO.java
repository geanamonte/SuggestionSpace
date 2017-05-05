package dwws.suggestionspace.persistence;

import java.util.*;

import javax.ejb.*;

import dwws.suggestionspace.domain.*;
import dwws.suggestionspace.util.*;
@Local
public interface UserDAO extends BaseDAO<User> {
	List<User> findByName(String name);
	List<User> findByEmail(String email);
}
