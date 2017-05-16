package dwws.suggestionspace.application;

import java.io.Serializable;

import javax.ejb.Local;

import dwws.suggestionspace.domain.*;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
@Local
public interface InstallSystemService extends Serializable {
	/**
	 * TODO: document this method.
	 * 
	 * @param config
	 * @param admin
	 * @throws SystemInstallFailedException
	 */
	void installSystem(MarvinConfiguration config, User admin);
}
