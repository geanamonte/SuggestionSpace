package dwws.suggestionspace.domain;

import dwws.suggestionspace.util.PersistentObjectImpl_;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-05-05T16:22:48.073-0300")
@StaticMetamodel(User.class)
public class User_ extends PersistentObjectImpl_ {
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> pwd;
	public static volatile SingularAttribute<User, Date> birthDate;
	public static volatile SetAttribute<User, Content> favorites;
}
