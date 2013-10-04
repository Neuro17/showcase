package foo.nerz.bonboard.validator;
	
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;

import foo.nerz.bonboard.constraints.FieldMatch;

public class UserValidation {

//	@NotEmpty 
//	@Size(min = 1, max = 20) 
//	private String username;
	
	@NotEmpty  
	private String firstName;
	
	@NotEmpty  
	private String lastName;
	
	@NotEmpty  
	@Email(message="Invalid Email Format")
	private String email;
	
	@NotEmpty  
	@Size(min = 6, max = 20)
	private String password;
	
	@NotEmpty
	@Size(min = 6, max = 20)
	@FieldMatch(first = "password", second = "cPassword", message = "The password fields must match")
	private String cpassword;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
}