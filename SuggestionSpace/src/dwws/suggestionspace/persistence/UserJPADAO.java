package dwws.suggestionspace.persistence;

import java.util.*;

import javax.ejb.*;
import javax.persistence.*;
import javax.persistence.criteria.*;

import dwws.suggestionspace.domain.*;
import dwws.suggestionspace.util.*;

@Stateless
public class UserJPADAO extends BaseJPADAO<User> implements UserDAO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	@Override
	protected Class<User> getDomainClass() {
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
	
}
