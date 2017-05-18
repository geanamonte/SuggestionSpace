package br.ufes.inf.nemo.marvin.core.domain;

import br.ufes.inf.nemo.marvin.people.domain.Person_;
import br.ufes.inf.nemo.marvin.people.domain.Telephone;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-05-17T23:43:57.578-0300")
@StaticMetamodel(User.class)
public class User_ extends Person_ {
	public static volatile SingularAttribute<User, String> shortName;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SetAttribute<User, Telephone> telephones;
	public static volatile SingularAttribute<User, Date> creationDate;
	public static volatile SingularAttribute<User, Date> lastUpdateDate;
	public static volatile SingularAttribute<User, Date> lastLoginDate;
	public static volatile SetAttribute<User, Content> favorites;
}
