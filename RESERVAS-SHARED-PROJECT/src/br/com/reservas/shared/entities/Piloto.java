package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TB_PILOTO database table.
 * 
 */
@Entity
@Table(name="TB_PILOTO")
public class Piloto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_PILOTO_IDPILOTO_GENERATOR", sequenceName="SEQ_PILOTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_PILOTO_IDPILOTO_GENERATOR")
	@Column(name="ID_PILOTO", unique=true, nullable=false, precision=22)
	private long idPiloto;

	@Column(name="CD_MATRICULA_PILOTO", nullable=false, precision=22)
	private BigDecimal cdMatriculaPiloto;

	@Column(name="CD_SEXO_PILOTO", nullable=false, precision=22)
	private BigDecimal cdSexoPiloto;

	@Column(name="DS_CPF_PILOTO", nullable=false, length=14)
	private String dsCpfPiloto;

	@Column(name="DS_EMAIL_PILOTO", length=80)
	private String dsEmailPiloto;

	@Column(name="DS_END_PILOTO", nullable=false, length=200)
	private String dsEndPiloto;

	@Column(name="DS_TEL_PILOTO", nullable=false, length=30)
	private String dsTelPiloto;

	@Column(name="NM_PILOTO", nullable=false, length=42)
	private String nmPiloto;

	//bi-directional many-to-one association to Aviao
	@OneToMany(mappedBy="tbPiloto")
	private List<Aviao> tbAviaos;

	//bi-directional many-to-one association to Voo
	@OneToMany(mappedBy="tbPiloto")
	private List<Voo> tbVoos;

    public Piloto() {
    }

	public long getIdPiloto() {
		return this.idPiloto;
	}

	public void setIdPiloto(long idPiloto) {
		this.idPiloto = idPiloto;
	}

	public BigDecimal getCdMatriculaPiloto() {
		return this.cdMatriculaPiloto;
	}

	public void setCdMatriculaPiloto(BigDecimal cdMatriculaPiloto) {
		this.cdMatriculaPiloto = cdMatriculaPiloto;
	}

	public BigDecimal getCdSexoPiloto() {
		return this.cdSexoPiloto;
	}

	public void setCdSexoPiloto(BigDecimal cdSexoPiloto) {
		this.cdSexoPiloto = cdSexoPiloto;
	}

	public String getDsCpfPiloto() {
		return this.dsCpfPiloto;
	}

	public void setDsCpfPiloto(String dsCpfPiloto) {
		this.dsCpfPiloto = dsCpfPiloto;
	}

	public String getDsEmailPiloto() {
		return this.dsEmailPiloto;
	}

	public void setDsEmailPiloto(String dsEmailPiloto) {
		this.dsEmailPiloto = dsEmailPiloto;
	}

	public String getDsEndPiloto() {
		return this.dsEndPiloto;
	}

	public void setDsEndPiloto(String dsEndPiloto) {
		this.dsEndPiloto = dsEndPiloto;
	}

	public String getDsTelPiloto() {
		return this.dsTelPiloto;
	}

	public void setDsTelPiloto(String dsTelPiloto) {
		this.dsTelPiloto = dsTelPiloto;
	}

	public String getNmPiloto() {
		return this.nmPiloto;
	}

	public void setNmPiloto(String nmPiloto) {
		this.nmPiloto = nmPiloto;
	}

	public List<Aviao> getTbAviaos() {
		return this.tbAviaos;
	}

	public void setTbAviaos(List<Aviao> tbAviaos) {
		this.tbAviaos = tbAviaos;
	}
	
	public List<Voo> getTbVoos() {
		return this.tbVoos;
	}

	public void setTbVoos(List<Voo> tbVoos) {
		this.tbVoos = tbVoos;
	}
	
}