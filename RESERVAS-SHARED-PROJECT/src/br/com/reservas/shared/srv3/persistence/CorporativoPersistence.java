package br.com.reservas.shared.srv3.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.reservas.shared.entities.Assento;
import br.com.reservas.shared.entities.Aviao;
import br.com.reservas.shared.entities.Cidade;

@Local
public interface CorporativoPersistence
{

	public boolean isAssentoReservado(Assento assento);

	public void setAssentoReservado(Assento assento);

	public List<Cidade> getListaCidade();

	public Aviao getMapaAviao(int codigoVoo);

}
