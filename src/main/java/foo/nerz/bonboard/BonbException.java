package foo.nerz.bonboard;

import java.io.Serializable;
//biagio culo
public class BonbException extends Exception implements Serializable {
	
	private String message;
	
	public BonbException(String m){
		message=m;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String mess) {
		this.message = mess;
	}

}
