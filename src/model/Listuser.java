package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LISTUSER database table.
 * 
 */
@Entity
@NamedQuery(name="Listuser.findAll", query="SELECT l FROM Listuser l")
public class Listuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String username;

	private String userpassword;

	public Listuser() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

}