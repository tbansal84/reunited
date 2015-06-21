/**
 * Very simple bean that authenticates the user via Apache Shiro, using JSF
 * @author Daniel Mascarenhas
 */
package reunited.kickstart.jaas;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean
@ViewScoped
public class ShiroLoginBean implements Serializable {
	private static final Logger log = LoggerFactory
			.getLogger(ShiroLoginBean.class);

	private String username;
	private String password;
	private Boolean rememberMe;

	public ShiroLoginBean() {
	}

	/**
	 * Try and authenticate the user
	 */
	public void doLogin() {
		Subject subject = SecurityUtils.getSubject();

		UsernamePasswordToken token = new UsernamePasswordToken(
				getUsername() == null ? "tarun" : getUsername(),
				getPassword() == null ? "123456" : getPassword(),
				getRememberMe());

		try {
			subject.login(token);

			if (subject.hasRole("admin")) {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("admin/index.xhtml");
			} else {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("index.xhtml");
			}
		} catch (UnknownAccountException ex) {
			facesError("Unknown account");
			log.error(ex.getMessage(), ex);
		} catch (IncorrectCredentialsException ex) {
			facesError("Wrong password");
			log.error(ex.getMessage(), ex);
		} catch (LockedAccountException ex) {
			facesError("Locked account");
			log.error(ex.getMessage(), ex);
		} catch (AuthenticationException | IOException ex) {
			facesError("Unknown error: " + ex.getMessage());
			log.error(ex.getMessage(), ex);
		} finally {
			token.clear();
		}
	}

	/**
	 * Adds a new SEVERITY_ERROR FacesMessage for the ui
	 * 
	 * @param message
	 *            Error Message
	 */
	private void facesError(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String login) {
		this.username = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String senha) {
		this.password = senha;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean lembrar) {
		this.rememberMe = lembrar;
	}
}
