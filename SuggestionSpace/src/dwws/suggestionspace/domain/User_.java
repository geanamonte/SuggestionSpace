package dwws.suggestionspace.domain;

import java.util.*;

import javax.persistence.metamodel.*;

@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Date> birthDate;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> pwd;
}
