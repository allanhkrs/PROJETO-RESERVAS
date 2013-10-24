package br.com.reservas.service.facade;

import java.util.List;

import javax.ejb.Stateful;

import br.com.reservas.persistence.facade.CorporativoPersistenceImpl;
import br.com.reservas.shared.entities.Boleto;
import br.com.reservas.shared.entities.Reserva;
import br.com.reservas.shared.srv3.persistence.CorporativoPersistence;
import br.com.reservas.shared.srv3.service.CorporativoService;

@Stateful
public class CorporativoServiceImpl implements CorporativoService
{

	private CorporativoPersistence persistence = new CorporativoPersistenceImpl();

	@Override
	public boolean efetuaCheckin(Reserva reserva)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Boleto> relatorioBoletos()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alteraStatusReserva()
	{
		// TODO Auto-generated method stub
		return false;
	}

}
