package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TB_CIDADE database table.
 * 
 */
@Entity
@Table(name="TB_CIDADE")
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_CIDADE_IDCIDADE_GENERATOR", sequenceName="SEQ_CIDADE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CIDADE_IDCIDADE_GENERATOR")
	@Column(name="ID_CIDADE", unique=true, nullable=false, precision=22)
	private long idCidade;

	@Column(name="NM_CIDADE", nullable=false, length=40)
	private String nmCidade;

	@Column(name="NM_ESTADO", nullable=false, length=40)
	private String nmEstado;

	//bi-directional many-to-one association to Aeroporto
	@OneToMany(mappedBy="tbCidade")
	private List<Aeroporto> tbAeroportos;

    public Cidade() {
    }

	public long getIdCidade() {
		return this.idCidade;
	}

	public void setIdCidade(long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNmCidade() {
		return this.nmCidade;
	}

	public void setNmCidade(String nmCidade) {
		this.nmCidade = nmCidade;
	}

	public String getNmEstado() {
		return this.nmEstado;
	}

	public void setNmEstado(String nmEstado) {
		this.nmEstado = nmEstado;
	}

	public List<Aeroporto> getTbAeroportos() {
		return this.tbAeroportos;
	}

	public void setTbAeroportos(List<Aeroporto> tbAeroportos) {
		this.tbAeroportos = tbAeroportos;
	}
	
}