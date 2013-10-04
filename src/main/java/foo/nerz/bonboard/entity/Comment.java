package foo.nerz.bonboard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_comment")
	private Long idComment;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_post", referencedColumnName="id_post")
	private Post post;
	
	private String body;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="username", referencedColumnName="username")
	private Users username;
	
	private Date time;
	
	

	public Comment() {
		super();
	}

	public Comment(Post post, String body, Users username, Date time) {
		super();
		this.post = post;
		this.body = body;
		this.username = username;
		this.time = time;
	}

	public Long getIdComment() {
		return idComment;
	}

	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Users getUsername() {
		return username;
	}

	public void setUsername(Users username) {
		this.username = username;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
}
