package dwws.suggestionspace.domain;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport_;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-05-15T14:12:38.848-0300")
@StaticMetamodel(User.class)
public class User_ extends PersistentObjectSupport_ {
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> pwd;
	public static volatile SingularAttribute<User, Date> birthDate;
	public static volatile SetAttribute<User, Content> favorites;
	public static volatile SingularAttribute<User, String> shortName;
	public static volatile SingularAttribute<User, Date> creationDate;
	public static volatile SingularAttribute<User, Date> lastUpdateDate;
	public static volatile SingularAttribute<User, Date> lastLoginDate;
}
