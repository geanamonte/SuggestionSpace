package dwws.suggestionspace.util;


public interface PersistentObject extends DomainObject {
	Long getId();

	Long getVersion();

	boolean isPersistent();
}
