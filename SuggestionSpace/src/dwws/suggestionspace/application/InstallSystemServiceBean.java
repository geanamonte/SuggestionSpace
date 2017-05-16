package dwws.suggestionspace.application;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.TextUtils;
import dwws.suggestionspace.domain.MarvinConfiguration;
import dwws.suggestionspace.domain.User;
import dwws.suggestionspace.exception.SystemInstallFailedException;
import dwws.suggestionspace.persistence.MarvinConfigurationDAO;
import dwws.suggestionspace.persistence.UserDAO;


/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
@Stateless
public class InstallSystemServiceBean implements InstallSystemService {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** The logger. */
	private static final Logger logger = Logger.getLogger(InstallSystemServiceBean.class.getCanonicalName());

	/** The DAO for User objects. */
	@EJB
	private UserDAO userDAO;

	/** The DAO for MarvinConfiguration objects. */
	@EJB
	private MarvinConfigurationDAO marvinConfigurationDAO;

	/** Global information about the application. */
	@EJB
	private CoreInformation coreInformation;

	/**
	 * @see br.ufes.inf.nemo.marvin.core.application.InstallSystemService#installSystem(br.ufes.inf.nemo.marvin.core.domain.MarvinConfiguration,
	 *      br.ufes.inf.nemo.marvin.core.domain.User)
	 */
	@Override
	public void installSystem(MarvinConfiguration config, User admin) {
		logger.log(Level.FINER, "Installing system...");

		try {
			// Encodes the admin's password.
			admin.setPwd(TextUtils.produceMd5Hash(admin.getPwd()));

			// Register the last update date / creation date.
			Date now = new Date(System.currentTimeMillis());
			admin.setLastUpdateDate(now);
			admin.setCreationDate(now);
			config.setCreationDate(now);
			logger.log(Level.FINE, "Admin's last update date have been set as: {0}", new Object[] { now });

			// Saves the adminis	trator.
			logger.log(Level.FINER, "Persisting admin data...\n\t- Short name = {0}\n\t- Last update date = {1}", new Object[] { admin.getShortName(), admin.getLastUpdateDate() });
			userDAO.save(admin);
			logger.log(Level.FINE, "The administrator has been saved: {0} ({1})", new Object[] { admin.getName(), admin.getEmail() });

			// Saves Marvin's configuration.
			logger.log(Level.FINER, "Persisting configuration data...\n\t- Date = {0}\n\t- Acronym = {1}", new Object[] { config.getCreationDate(), config.getInstitutionAcronym() });
			marvinConfigurationDAO.save(config);
			logger.log(Level.FINE, "The configuration has been saved");

			// Reloads the bean that holds the configuration and determines if the system is installed.
			logger.log(Level.FINER, "Reloading core information...");
			coreInformation.init();
		}
		catch (NoSuchAlgorithmException e) {
			// Logs and rethrows the exception for the controller to display the error to the user.
			logger.log(Level.SEVERE, "Could not find MD5 algorithm for password encription!", e);
			//throw new SystemInstallFailedException(e);
		}
		catch (Exception e) {
			// Logs and rethrows the exception for the controller to display the error to the user.
			logger.log(Level.SEVERE, "Exception during system installation!", e);
			//throw new SystemInstallFailedException(e);
		}
	}

}
