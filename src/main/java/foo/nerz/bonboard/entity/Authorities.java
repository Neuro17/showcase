package foo.nerz.bonboard.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="authorities")
public class Authorities implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id_auth; 
	
	@ManyToOne
	@JoinColumn(name="username",referencedColumnName="username")
	private Users username;

	
	private String authority;

	
	public Authorities() {
		super();
	}

	public Authorities(Users username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}

	public Users getUsers() {
		return username;
	}

	public void setUsers(Users username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Long getId_auth() {
		return id_auth;
	}

	public void setId_auth(Long id_auth) {
		this.id_auth = id_auth;
	}


	
	
}
