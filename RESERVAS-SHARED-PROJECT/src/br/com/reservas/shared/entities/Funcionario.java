package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_FUNCIONARIO database table.
 * 
 */
@Entity
@Table(name="TB_FUNCIONARIO")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_FUNCIONARIO_IDFUNCIONARIO_GENERATOR", sequenceName="SEQ_FUNCIONARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_FUNCIONARIO_IDFUNCIONARIO_GENERATOR")
	@Column(name="ID_FUNCIONARIO", unique=true, nullable=false, precision=22)
	private long idFuncionario;

	@Column(name="CD_MATRICULA_FUNCIONARIO", nullable=false, precision=22)
	private BigDecimal cdMatriculaFuncionario;

	@Column(name="CD_PERFIL_FUNCIONARIO", nullable=false, precision=22)
	private BigDecimal cdPerfilFuncionario;

	@Column(name="CD_SEXO_FUNCIONARIO", nullable=false, precision=22)
	private BigDecimal cdSexoFuncionario;

	@Column(name="DS_CPF_FUNCIONARIO", nullable=false, length=14)
	private String dsCpfFuncionario;

	@Column(name="DS_EMAIL_FUNCIONARIO", length=80)
	private String dsEmailFuncionario;

	@Column(name="DS_END_FUNCIONARIO", nullable=false, length=200)
	private String dsEndFuncionario;

	@Column(name="DS_TEL_FUNCIONARIO", nullable=false, length=30)
	private String dsTelFuncionario;

	@Column(name="NM_FUNCIONARIO", nullable=false, length=42)
	private String nmFuncionario;

	@Column(name="PW_SENHA_FUNCIONARIO", length=8)
	private String pwSenhaFuncionario;

    public Funcionario() {
    }

	public long getIdFuncionario() {
		return this.idFuncionario;
	}

	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public BigDecimal getCdMatriculaFuncionario() {
		return this.cdMatriculaFuncionario;
	}

	public void setCdMatriculaFuncionario(BigDecimal cdMatriculaFuncionario) {
		this.cdMatriculaFuncionario = cdMatriculaFuncionario;
	}

	public BigDecimal getCdPerfilFuncionario() {
		return this.cdPerfilFuncionario;
	}

	public void setCdPerfilFuncionario(BigDecimal cdPerfilFuncionario) {
		this.cdPerfilFuncionario = cdPerfilFuncionario;
	}

	public BigDecimal getCdSexoFuncionario() {
		return this.cdSexoFuncionario;
	}

	public void setCdSexoFuncionario(BigDecimal cdSexoFuncionario) {
		this.cdSexoFuncionario = cdSexoFuncionario;
	}

	public String getDsCpfFuncionario() {
		return this.dsCpfFuncionario;
	}

	public void setDsCpfFuncionario(String dsCpfFuncionario) {
		this.dsCpfFuncionario = dsCpfFuncionario;
	}

	public String getDsEmailFuncionario() {
		return this.dsEmailFuncionario;
	}

	public void setDsEmailFuncionario(String dsEmailFuncionario) {
		this.dsEmailFuncionario = dsEmailFuncionario;
	}

	public String getDsEndFuncionario() {
		return this.dsEndFuncionario;
	}

	public void setDsEndFuncionario(String dsEndFuncionario) {
		this.dsEndFuncionario = dsEndFuncionario;
	}

	public String getDsTelFuncionario() {
		return this.dsTelFuncionario;
	}

	public void setDsTelFuncionario(String dsTelFuncionario) {
		this.dsTelFuncionario = dsTelFuncionario;
	}

	public String getNmFuncionario() {
		return this.nmFuncionario;
	}

	public void setNmFuncionario(String nmFuncionario) {
		this.nmFuncionario = nmFuncionario;
	}

	public String getPwSenhaFuncionario() {
		return this.pwSenhaFuncionario;
	}

	public void setPwSenhaFuncionario(String pwSenhaFuncionario) {
		this.pwSenhaFuncionario = pwSenhaFuncionario;
	}

}