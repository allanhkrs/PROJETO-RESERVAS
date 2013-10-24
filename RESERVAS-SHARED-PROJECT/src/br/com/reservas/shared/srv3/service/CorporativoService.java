package br.com.reservas.shared.srv3.service;

import java.util.List;

import javax.ejb.Remote;

import br.com.reservas.shared.entities.Boleto;
import br.com.reservas.shared.entities.Reserva;

@Remote
public interface CorporativoService
{

	public boolean efetuaCheckin(Reserva reserva);

	public List<Boleto> relatorioBoletos();

	public boolean alteraStatusReserva();

}
