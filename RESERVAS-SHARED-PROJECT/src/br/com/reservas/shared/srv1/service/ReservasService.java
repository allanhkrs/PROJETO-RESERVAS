package br.com.reservas.shared.srv1.service;

import java.util.List;

import javax.ejb.Remote;

import br.com.reservas.shared.entities.Assento;
import br.com.reservas.shared.entities.Aviao;
import br.com.reservas.shared.entities.Cidade;

@Remote
public interface ReservasService
{

	public boolean verificaAssentoReservado(Assento assento);

	public boolean reservaAssento(Assento assento);

	public boolean reservaAssentos(List<Assento> assentos);

	public Aviao recuperaMapaAviao(int codigoVoo);

	public List<Cidade> recuperaListaCidades();
	
}
