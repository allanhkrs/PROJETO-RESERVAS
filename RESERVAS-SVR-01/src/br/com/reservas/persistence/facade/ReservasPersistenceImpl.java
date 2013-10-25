package br.com.reservas.persistence.facade;

import java.util.List;

import javax.ejb.Stateless;

import br.com.reservas.shared.entities.Boleto;
import br.com.reservas.shared.entities.Cliente;
import br.com.reservas.shared.entities.Reserva;
import br.com.reservas.shared.persistence.AbstractPersistence;
import br.com.reservas.shared.srv1.persistence.ReservasPersistence;

@Stateless
public class ReservasPersistenceImpl extends AbstractPersistence implements ReservasPersistence
{

	@Override
	public boolean setCheckin(Reserva reserva)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Boleto> getBoletos()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setStatusReserva()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente getDadosCliente(Long id)
	{
		return getEntityManager().find(Cliente.class, id);
	}

}
