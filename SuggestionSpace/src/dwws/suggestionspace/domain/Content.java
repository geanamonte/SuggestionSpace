package dwws.suggestionspace.domain;

import javax.persistence.*;

@Entity
public class Content {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
}
