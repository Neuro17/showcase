package foo.nerz.bonboard.entity;

import java.io.Serializable;
import java.util.Date;

public class Content  implements Serializable {
	
	private String title;
	
	private String body;
	
	private String user;
	
	private int nComments;
	
	private Date time;

	public Content(Post p,String lang) {
		super();
		if(lang=="it"){
			setBody(p.getBodyIta());
			setnComments(p.getCountComments());
			setTitle(p.getTitoloIta());
			setUser(p.getUsername().getUsername());
			setTime(p.getTime());
		}
		if(lang=="en"){
			setBody(p.getBodyEn());
			setnComments(p.getCountComments());
			setTitle(p.getTitoloEn());
			setUser(p.getUsername().getUsername());
			setTime(p.getTime());
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getnComments() {
		return nComments;
	}

	public void setnComments(int nComments) {
		this.nComments = nComments;
	}
	
	

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
