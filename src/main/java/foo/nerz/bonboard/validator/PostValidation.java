package foo.nerz.bonboard.validator;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PostValidation {

	@NotEmpty 
	@Size(min = 1, max = 20) 
	private String titleEng;
	@NotEmpty  
	@Size(min = 10, max = 2000)
	private String bodyEng;	
	
	public String getTitleEng() {
		return titleEng;
	}
	public void setTitleEng(String titleEng) {
		this.titleEng = titleEng;
	}
	public String getBodyEng() {
		return bodyEng;
	}
	public void setBodyEng(String bodyEng) {
		this.bodyEng = bodyEng;
	}
	
	
	
}
