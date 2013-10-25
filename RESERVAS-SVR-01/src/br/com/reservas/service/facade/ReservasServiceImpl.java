package br.com.reservas.service.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import br.com.reservas.shared.entities.Assento;
import br.com.reservas.shared.entities.Aviao;
import br.com.reservas.shared.entities.Cidade;
import br.com.reservas.shared.entities.Cliente;
import br.com.reservas.shared.srv1.persistence.ReservasPersistence;
import br.com.reservas.shared.srv1.service.ReservasService;

@Stateful
public class ReservasServiceImpl implements ReservasService
{

	@EJB
	private ReservasPersistence persistence;
	
	@Override
	public boolean verificaAssentoReservado(Assento assento)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reservaAssento(Assento assento)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reservaAssentos(List<Assento> assentos)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Aviao recuperaMapaAviao(int codigoVoo)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cidade> recuperaListaCidades()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente recuperarDadosCliente(Long id)
	{
		return persistence.getDadosCliente(id);
	}

}
