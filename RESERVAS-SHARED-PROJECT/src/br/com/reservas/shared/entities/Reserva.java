package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_RESERVA database table.
 * 
 */
@Entity
@Table(name="TB_RESERVA")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_RESERVA_IDRESERVA_GENERATOR", sequenceName="SEQ_TB_RESERVA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_RESERVA_IDRESERVA_GENERATOR")
	@Column(name="ID_RESERVA", unique=true, nullable=false, precision=22)
	private long idReserva;

	@Column(name="CD_QUANTIDADE_ADULTOS", nullable=false, precision=22)
	private BigDecimal cdQuantidadeAdultos;

	@Column(name="CD_QUANTIDADE_BEBES", nullable=false, precision=22)
	private BigDecimal cdQuantidadeBebes;

	@Column(name="CD_QUANTIDADE_CRIANCAS", nullable=false, precision=22)
	private BigDecimal cdQuantidadeCriancas;

	@Column(name="CD_STATUS_RESERVA", nullable=false, precision=22)
	private BigDecimal cdStatusReserva;

	@Column(name="DS_LOCALIZADOR_VOUCHER", length=8)
	private String dsLocalizadorVoucher;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_ABERTURA_RESERVA")
	private Date dtAberturaReserva;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_FECHAMENTO_RESERVA")
	private Date dtFechamentoReserva;

	//bi-directional many-to-one association to Boleto
    @ManyToOne
	@JoinColumn(name="CD_BOLETO", nullable=false)
	private Boleto tbBoleto;

	//bi-directional many-to-one association to Cliente
    @ManyToOne
	@JoinColumn(name="CD_CLIENTE", nullable=false)
	private Cliente tbCliente;

    public Reserva() {
    }

	public long getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}

	public BigDecimal getCdQuantidadeAdultos() {
		return this.cdQuantidadeAdultos;
	}

	public void setCdQuantidadeAdultos(BigDecimal cdQuantidadeAdultos) {
		this.cdQuantidadeAdultos = cdQuantidadeAdultos;
	}

	public BigDecimal getCdQuantidadeBebes() {
		return this.cdQuantidadeBebes;
	}

	public void setCdQuantidadeBebes(BigDecimal cdQuantidadeBebes) {
		this.cdQuantidadeBebes = cdQuantidadeBebes;
	}

	public BigDecimal getCdQuantidadeCriancas() {
		return this.cdQuantidadeCriancas;
	}

	public void setCdQuantidadeCriancas(BigDecimal cdQuantidadeCriancas) {
		this.cdQuantidadeCriancas = cdQuantidadeCriancas;
	}

	public BigDecimal getCdStatusReserva() {
		return this.cdStatusReserva;
	}

	public void setCdStatusReserva(BigDecimal cdStatusReserva) {
		this.cdStatusReserva = cdStatusReserva;
	}

	public String getDsLocalizadorVoucher() {
		return this.dsLocalizadorVoucher;
	}

	public void setDsLocalizadorVoucher(String dsLocalizadorVoucher) {
		this.dsLocalizadorVoucher = dsLocalizadorVoucher;
	}

	public Date getDtAberturaReserva() {
		return this.dtAberturaReserva;
	}

	public void setDtAberturaReserva(Date dtAberturaReserva) {
		this.dtAberturaReserva = dtAberturaReserva;
	}

	public Date getDtFechamentoReserva() {
		return this.dtFechamentoReserva;
	}

	public void setDtFechamentoReserva(Date dtFechamentoReserva) {
		this.dtFechamentoReserva = dtFechamentoReserva;
	}

	public Boleto getTbBoleto() {
		return this.tbBoleto;
	}

	public void setTbBoleto(Boleto tbBoleto) {
		this.tbBoleto = tbBoleto;
	}
	
	public Cliente getTbCliente() {
		return this.tbCliente;
	}

	public void setTbCliente(Cliente tbCliente) {
		this.tbCliente = tbCliente;
	}
	
}