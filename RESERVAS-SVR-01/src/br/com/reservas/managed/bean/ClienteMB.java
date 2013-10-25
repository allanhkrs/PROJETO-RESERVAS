package br.com.reservas.managed.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.reservas.shared.entities.Cliente;
import br.com.reservas.shared.srv1.service.ReservasService;

@ManagedBean
public class ClienteMB
{

	@EJB
	private ReservasService service;

	private Cliente cliente = new Cliente();

	public String getNomeCliente()
	{
		cliente = service.recuperarDadosCliente(1L);
		return cliente.getNmCliente();
	}

}
