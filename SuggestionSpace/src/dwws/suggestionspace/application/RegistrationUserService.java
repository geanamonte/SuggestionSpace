package dwws.suggestionspace.application;

import java.io.*;
import javax.ejb.*;
import javax.persistence.*;

@Stateless @LocalBean
public class RegistrationUserService implements Serializable{
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager entityManager;
	
}
