package dwws.suggestionspace.persistence;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.*;
import javax.persistence.*;
import javax.persistence.criteria.*;

import dwws.suggestionspace.domain.*;
import br.ufes.inf.nemo.jbutler.ejb.persistence.*;
import br.ufes.inf.nemo.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.nemo.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;

@Stateless
public class UserJPADAO extends BaseJPADAO<User> implements UserDAO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** The logger. */
	private static final Logger logger = Logger.getLogger(UserJPADAO.class.getCanonicalName());
	
	@PersistenceContext
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	@Override
	public Class<User> getDomainClass() {
		return User.class;
	}
	@Override
	public List<User> findByName(String name) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.where(cb.like(cb.lower(root.get(User_.name)), "%" + name.toLowerCase() + "%"));
		return em.createQuery(cq).getResultList();
	}

	@Override
	public List<User> findByEmail(String email) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.where(cb.like(cb.lower(root.get(User_.email)), "%" + email.toLowerCase() + "%"));
		return em.createQuery(cq).getResultList();
	}
	
	@Override
	public User retrieveByEmail(String email) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException {
		logger.log(Level.FINE, "Retrieving the User whose e-mail is \"{0}\"...", email);

		// Constructs the query over the User class.
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);

		// Filters the query with the email.
		cq.where(cb.equal(root.get(User_.email), email));
		User result = executeSingleResultQuery(cq, email);
		logger.log(Level.INFO, "Retrieve User by the email \"{0}\" returned \"{1}\"", new Object[] { email, result });
		return result;
	}
	
}
