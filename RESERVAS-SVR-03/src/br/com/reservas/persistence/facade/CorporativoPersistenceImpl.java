package br.com.reservas.persistence.facade;

import java.util.List;

import javax.ejb.Stateless;

import br.com.reservas.shared.entities.Assento;
import br.com.reservas.shared.entities.Aviao;
import br.com.reservas.shared.entities.Cidade;
import br.com.reservas.shared.persistence.AbstractPersistence;
import br.com.reservas.shared.srv3.persistence.CorporativoPersistence;

@Stateless
public class CorporativoPersistenceImpl extends AbstractPersistence implements CorporativoPersistence
{

	@Override
	public boolean isAssentoReservado(Assento assento)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAssentoReservado(Assento assento)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cidade> getListaCidade()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aviao getMapaAviao(int codigoVoo)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
