package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TB_VOO database table.
 * 
 */
@Entity
@Table(name="TB_VOO")
public class Voo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_VOO_IDVOO_GENERATOR", sequenceName="SEQ_VOO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_VOO_IDVOO_GENERATOR")
	@Column(name="ID_VOO", unique=true, nullable=false, precision=22)
	private long idVoo;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_CHEGADA_VOO")
	private Date dtChegadaVoo;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_SAIDA_VOO")
	private Date dtSaidaVoo;

	//bi-directional many-to-one association to Aeroporto
    @ManyToOne
	@JoinColumn(name="DS_AEROPORTO_SAIDA_VOO")
	private Aeroporto tbAeroporto1;

	//bi-directional many-to-one association to Aeroporto
    @ManyToOne
	@JoinColumn(name="DS_AEROPORTO_CHEGADA_VOO")
	private Aeroporto tbAeroporto2;

	//bi-directional many-to-one association to Piloto
    @ManyToOne
	@JoinColumn(name="CD_PILOTO", nullable=false)
	private Piloto tbPiloto;

    public Voo() {
    }

	public long getIdVoo() {
		return this.idVoo;
	}

	public void setIdVoo(long idVoo) {
		this.idVoo = idVoo;
	}

	public Date getDtChegadaVoo() {
		return this.dtChegadaVoo;
	}

	public void setDtChegadaVoo(Date dtChegadaVoo) {
		this.dtChegadaVoo = dtChegadaVoo;
	}

	public Date getDtSaidaVoo() {
		return this.dtSaidaVoo;
	}

	public void setDtSaidaVoo(Date dtSaidaVoo) {
		this.dtSaidaVoo = dtSaidaVoo;
	}

	public Aeroporto getTbAeroporto1() {
		return this.tbAeroporto1;
	}

	public void setTbAeroporto1(Aeroporto tbAeroporto1) {
		this.tbAeroporto1 = tbAeroporto1;
	}
	
	public Aeroporto getTbAeroporto2() {
		return this.tbAeroporto2;
	}

	public void setTbAeroporto2(Aeroporto tbAeroporto2) {
		this.tbAeroporto2 = tbAeroporto2;
	}
	
	public Piloto getTbPiloto() {
		return this.tbPiloto;
	}

	public void setTbPiloto(Piloto tbPiloto) {
		this.tbPiloto = tbPiloto;
	}
	
}