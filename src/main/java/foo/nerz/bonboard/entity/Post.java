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
import javax.persistence.Transient;

@Entity
@Table(name="posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_post")
	private Long idPost;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo", referencedColumnName="id_tipo")
	private TipoPost idTipo;
	
	@Column(name="titolo_ita")
	private String titoloIta;
	@Column(name="titolo_en")
	private String titoloEn;
	
	@Column(name="body_ita")
	private String bodyIta;
	
	@Column(name="body_en")
	private String bodyEn;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="username", referencedColumnName="username")
	private Users username;
	
	private Date time;

	@Transient
	private Integer countComments;
	
	

	public Post() {
		super();
	}

	public Post(TipoPost idTipo, String titoloIta, String titoloEn,
			String bodyIta, String bodyEn, Users username, Date time) {
		super();
		this.idTipo = idTipo;
		this.titoloIta = titoloIta;
		this.titoloEn = titoloEn;
		this.bodyIta = bodyIta;
		this.bodyEn = bodyEn;
		this.username = username;
		this.time = time;
	}

	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}

	public TipoPost getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(TipoPost idTipo) {
		this.idTipo = idTipo;
	}

	public String getTitoloIta() {
		return titoloIta;
	}

	public void setTitoloIta(String titoloIta) {
		this.titoloIta = titoloIta;
	}

	public String getTitoloEn() {
		return titoloEn;
	}

	public void setTitoloEn(String titoloEn) {
		this.titoloEn = titoloEn;
	}

	public String getBodyIta() {
		return bodyIta;
	}

	public void setBodyIta(String bodyIta) {
		this.bodyIta = bodyIta;
	}

	public String getBodyEn() {
		return bodyEn;
	}

	public void setBodyEn(String bodyEn) {
		this.bodyEn = bodyEn;
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

	@Override
	public String toString() {
		return "Post [idPost=" + idPost + ", titoloIta="
				+ titoloIta + ", titoloEn=" + titoloEn + ", bodyIta=" + bodyIta
				+ ", bodyEn=" + bodyEn +  ", time="
				+ time + "]";
	}

	public Integer getCountComments() {
		return countComments;
	}

	public void setCountComments(Integer countComments) {
		this.countComments = countComments;
	}
	
	

}
