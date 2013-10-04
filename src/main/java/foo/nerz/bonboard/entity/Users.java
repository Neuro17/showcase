package foo.nerz.bonboard.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name="users")
public class Users {
	
	@Id	
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private boolean enabled;
	
	private String email;
	
	
	private String fname;
	
	private String lname;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	private GenderEnum gender;
	
	@OneToMany(orphanRemoval=true,cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="username")
	private List<Authorities> auth;
	
	public void addAuth(Authorities a){
		auth.add(a);
	}

	public List<Authorities> getAuth() {
		return auth;
	}


	public void setAuth(List<Authorities> auth) {
		this.auth = auth;
	}


	public Users() {
		super();
	}
	

	public Users(String username) {
		super();
		this.username = username;
	}


	public Users(String username, String password, boolean enabled,
			String email, String fname, String lname) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
	}



	public Users(String username, String password, boolean enabled,
			String email, String fname, String lname, GenderEnum gender) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

}
