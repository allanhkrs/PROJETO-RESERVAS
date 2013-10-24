package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TB_CLIENTE database table.
 * 
 */
@Entity
@Table(name="TB_CLIENTE")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_CLIENTE_IDCLIENTE_GENERATOR", sequenceName="SEQ_TB_CLIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CLIENTE_IDCLIENTE_GENERATOR")
	@Column(name="ID_CLIENTE", unique=true, nullable=false, precision=22)
	private long idCliente;

	@Column(name="CD_IDADE_CLIENTE", precision=22)
	private BigDecimal cdIdadeCliente;

	@Column(name="CD_NOVO_CADASTRO", nullable=false, precision=22)
	private BigDecimal cdNovoCadastro;

	@Column(name="CD_SEXO_CLIENTE", nullable=false, precision=22)
	private BigDecimal cdSexoCliente;

	@Column(name="DS_BAIRRO_CLIENTE", nullable=false, length=10)
	private String dsBairroCliente;

	@Column(name="DS_CEP_CLIENTE", nullable=false, length=10)
	private String dsCepCliente;

	@Column(name="DS_CIDADE_CLIENTE", nullable=false, length=50)
	private String dsCidadeCliente;

	@Column(name="DS_CPF_CLIENTE", nullable=false, length=14)
	private String dsCpfCliente;

	@Column(name="DS_END_CLIENTE", nullable=false, length=200)
	private String dsEndCliente;

	@Column(name="DS_TEL_CLIENTE", nullable=false, length=30)
	private String dsTelCliente;

	@Column(name="DS_UF_CLIENTE", nullable=false, length=2)
	private String dsUfCliente;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Date dtNascimento;

	@Column(name="NM_CLIENTE", nullable=false, length=42)
	private String nmCliente;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="tbCliente")
	private List<Reserva> tbReservas;

    public Cliente() {
    }

	public long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public BigDecimal getCdIdadeCliente() {
		return this.cdIdadeCliente;
	}

	public void setCdIdadeCliente(BigDecimal cdIdadeCliente) {
		this.cdIdadeCliente = cdIdadeCliente;
	}

	public BigDecimal getCdNovoCadastro() {
		return this.cdNovoCadastro;
	}

	public void setCdNovoCadastro(BigDecimal cdNovoCadastro) {
		this.cdNovoCadastro = cdNovoCadastro;
	}

	public BigDecimal getCdSexoCliente() {
		return this.cdSexoCliente;
	}

	public void setCdSexoCliente(BigDecimal cdSexoCliente) {
		this.cdSexoCliente = cdSexoCliente;
	}

	public String getDsBairroCliente() {
		return this.dsBairroCliente;
	}

	public void setDsBairroCliente(String dsBairroCliente) {
		this.dsBairroCliente = dsBairroCliente;
	}

	public String getDsCepCliente() {
		return this.dsCepCliente;
	}

	public void setDsCepCliente(String dsCepCliente) {
		this.dsCepCliente = dsCepCliente;
	}

	public String getDsCidadeCliente() {
		return this.dsCidadeCliente;
	}

	public void setDsCidadeCliente(String dsCidadeCliente) {
		this.dsCidadeCliente = dsCidadeCliente;
	}

	public String getDsCpfCliente() {
		return this.dsCpfCliente;
	}

	public void setDsCpfCliente(String dsCpfCliente) {
		this.dsCpfCliente = dsCpfCliente;
	}

	public String getDsEndCliente() {
		return this.dsEndCliente;
	}

	public void setDsEndCliente(String dsEndCliente) {
		this.dsEndCliente = dsEndCliente;
	}

	public String getDsTelCliente() {
		return this.dsTelCliente;
	}

	public void setDsTelCliente(String dsTelCliente) {
		this.dsTelCliente = dsTelCliente;
	}

	public String getDsUfCliente() {
		return this.dsUfCliente;
	}

	public void setDsUfCliente(String dsUfCliente) {
		this.dsUfCliente = dsUfCliente;
	}

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getNmCliente() {
		return this.nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public List<Reserva> getTbReservas() {
		return this.tbReservas;
	}

	public void setTbReservas(List<Reserva> tbReservas) {
		this.tbReservas = tbReservas;
	}
	
}