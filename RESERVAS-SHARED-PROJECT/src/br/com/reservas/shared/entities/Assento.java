package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_ASSENTO database table.
 * 
 */
@Entity
@Table(name="TB_ASSENTO")
public class Assento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_ASSENTO_IDASSENTO_GENERATOR", sequenceName="SEQ_ASSENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_ASSENTO_IDASSENTO_GENERATOR")
	@Column(name="ID_ASSENTO", unique=true, nullable=false, precision=22)
	private long idAssento;

	@Column(name="CD_CLASSE_ASSENTO", nullable=false, precision=22)
	private BigDecimal cdClasseAssento;

	@Column(name="CD_STATUS_ASSENTO", nullable=false, precision=22)
	private BigDecimal cdStatusAssento;

	@Column(name="CD_TIPO_ASSENTO", nullable=false, precision=22)
	private BigDecimal cdTipoAssento;

	//bi-directional many-to-one association to Aviao
    @ManyToOne
	@JoinColumn(name="CD_AVIAO", nullable=false)
	private Aviao tbAviao;

    public Assento() {
    }

	public long getIdAssento() {
		return this.idAssento;
	}

	public void setIdAssento(long idAssento) {
		this.idAssento = idAssento;
	}

	public BigDecimal getCdClasseAssento() {
		return this.cdClasseAssento;
	}

	public void setCdClasseAssento(BigDecimal cdClasseAssento) {
		this.cdClasseAssento = cdClasseAssento;
	}

	public BigDecimal getCdStatusAssento() {
		return this.cdStatusAssento;
	}

	public void setCdStatusAssento(BigDecimal cdStatusAssento) {
		this.cdStatusAssento = cdStatusAssento;
	}

	public BigDecimal getCdTipoAssento() {
		return this.cdTipoAssento;
	}

	public void setCdTipoAssento(BigDecimal cdTipoAssento) {
		this.cdTipoAssento = cdTipoAssento;
	}

	public Aviao getTbAviao() {
		return this.tbAviao;
	}

	public void setTbAviao(Aviao tbAviao) {
		this.tbAviao = tbAviao;
	}
	
}