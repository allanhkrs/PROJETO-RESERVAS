package br.com.reservas.shared.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TB_BOLETO database table.
 * 
 */
@Entity
@Table(name="TB_BOLETO")
public class Boleto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_BOLETO_IDBOLETO_GENERATOR", sequenceName="SEQ_BOLETO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_BOLETO_IDBOLETO_GENERATOR")
	@Column(name="ID_BOLETO", unique=true, nullable=false, precision=22)
	private long idBoleto;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="tbBoleto")
	private List<Reserva> tbReservas;

    public Boleto() {
    }

	public long getIdBoleto() {
		return this.idBoleto;
	}

	public void setIdBoleto(long idBoleto) {
		this.idBoleto = idBoleto;
	}

	public List<Reserva> getTbReservas() {
		return this.tbReservas;
	}

	public void setTbReservas(List<Reserva> tbReservas) {
		this.tbReservas = tbReservas;
	}
	
}