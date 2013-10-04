package foo.nerz.bonboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_post")
public class TipoPost {
	
	@Id
	@Column(name="id_tipo")
	private Long idTipo;
	
	private String tipo;
	
	

	public TipoPost() {
		super();
	}

	public TipoPost(Long idTipo, String tipo) {
		super();
		this.idTipo = idTipo;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	
	
}
