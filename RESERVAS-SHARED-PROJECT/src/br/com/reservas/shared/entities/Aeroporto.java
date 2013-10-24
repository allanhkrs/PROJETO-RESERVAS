package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TB_AEROPORTO database table.
 * 
 */
@Entity
@Table(name="TB_AEROPORTO")
public class Aeroporto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_AEROPORTO_IDAEROPORTO_GENERATOR", sequenceName="SEQ_AEROPORTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_AEROPORTO_IDAEROPORTO_GENERATOR")
	@Column(name="ID_AEROPORTO", unique=true, nullable=false, precision=22)
	private long idAeroporto;

	@Column(name="NM_AEROPORTO", nullable=false, length=42)
	private String nmAeroporto;

	//bi-directional many-to-one association to Cidade
    @ManyToOne
	@JoinColumn(name="CD_CIDADE", nullable=false)
	private Cidade tbCidade;

	//bi-directional many-to-one association to Voo
	@OneToMany(mappedBy="tbAeroporto1")
	private List<Voo> tbVoos1;

	//bi-directional many-to-one association to Voo
	@OneToMany(mappedBy="tbAeroporto2")
	private List<Voo> tbVoos2;

    public Aeroporto() {
    }

	public long getIdAeroporto() {
		return this.idAeroporto;
	}

	public void setIdAeroporto(long idAeroporto) {
		this.idAeroporto = idAeroporto;
	}

	public String getNmAeroporto() {
		return this.nmAeroporto;
	}

	public void setNmAeroporto(String nmAeroporto) {
		this.nmAeroporto = nmAeroporto;
	}

	public Cidade getTbCidade() {
		return this.tbCidade;
	}

	public void setTbCidade(Cidade tbCidade) {
		this.tbCidade = tbCidade;
	}
	
	public List<Voo> getTbVoos1() {
		return this.tbVoos1;
	}

	public void setTbVoos1(List<Voo> tbVoos1) {
		this.tbVoos1 = tbVoos1;
	}
	
	public List<Voo> getTbVoos2() {
		return this.tbVoos2;
	}

	public void setTbVoos2(List<Voo> tbVoos2) {
		this.tbVoos2 = tbVoos2;
	}
	
}