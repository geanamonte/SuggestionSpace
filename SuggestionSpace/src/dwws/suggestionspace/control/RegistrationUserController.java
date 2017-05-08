package dwws.suggestionspace.control;

import java.io.*;

import javax.ejb.*;
import javax.enterprise.inject.*;

import dwws.suggestionspace.domain.*;
import dwws.suggestionspace.persistence.*;



@Stateful
@Model
public class RegistrationUserController implements Serializable {

	private static final long serialVersionUID = 1l;
	@EJB
	private UserDAO userDAO;

	private User user = new User();

	public User getUser() {
		return user;
	}

	public String add() {
		if (userDAO.findByEmail(user.getEmail()).isEmpty()) {
			userDAO.save(user);
			return "/succes.xhtml";
		}
		return "/fail.xhtml";

	}
}
