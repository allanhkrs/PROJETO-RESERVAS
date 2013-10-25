package br.com.reservas.shared.srv1.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.reservas.shared.entities.Boleto;
import br.com.reservas.shared.entities.Cliente;
import br.com.reservas.shared.entities.Reserva;

@Local
public interface ReservasPersistence
{

	public boolean setCheckin(Reserva reserva);

	public List<Boleto> getBoletos();

	public boolean setStatusReserva();

	public Cliente getDadosCliente(Long id);

}
