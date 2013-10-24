package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TB_AVIAO database table.
 * 
 */
@Entity
@Table(name="TB_AVIAO")
public class Aviao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_AVIAO_IDAVIAO_GENERATOR", sequenceName="SEQ_AVIAO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_AVIAO_IDAVIAO_GENERATOR")
	@Column(name="ID_AVIAO", unique=true, nullable=false, precision=22)
	private long idAviao;

	@Column(name="DS_FABRICANTE_AVIAO", nullable=false, length=30)
	private String dsFabricanteAviao;

	@Column(name="DS_MODELO_AVIAO", nullable=false, length=30)
	private String dsModeloAviao;

	//bi-directional many-to-one association to Assento
	@OneToMany(mappedBy="tbAviao")
	private List<Assento> tbAssentos;

	//bi-directional many-to-one association to Piloto
    @ManyToOne
	@JoinColumn(name="CD_PILOTO", nullable=false)
	private Piloto tbPiloto;

    public Aviao() {
    }

	public long getIdAviao() {
		return this.idAviao;
	}

	public void setIdAviao(long idAviao) {
		this.idAviao = idAviao;
	}

	public String getDsFabricanteAviao() {
		return this.dsFabricanteAviao;
	}

	public void setDsFabricanteAviao(String dsFabricanteAviao) {
		this.dsFabricanteAviao = dsFabricanteAviao;
	}

	public String getDsModeloAviao() {
		return this.dsModeloAviao;
	}

	public void setDsModeloAviao(String dsModeloAviao) {
		this.dsModeloAviao = dsModeloAviao;
	}

	public List<Assento> getTbAssentos() {
		return this.tbAssentos;
	}

	public void setTbAssentos(List<Assento> tbAssentos) {
		this.tbAssentos = tbAssentos;
	}
	
	public Piloto getTbPiloto() {
		return this.tbPiloto;
	}

	public void setTbPiloto(Piloto tbPiloto) {
		this.tbPiloto = tbPiloto;
	}
	
}