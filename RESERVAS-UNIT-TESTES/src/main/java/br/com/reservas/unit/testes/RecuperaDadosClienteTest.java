package br.com.reservas.unit.testes;

import java.util.Properties;

import javax.naming.InitialContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.reservas.shared.entities.Cliente;
import br.com.reservas.shared.srv1.service.ReservasService;

public class RecuperaDadosClienteTest
{

	private InitialContext context;

	private Properties props;

	@Before
	public void inicializa()
	{
		try
		{
			props = new Properties();
			props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
			props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
			props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
			props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
			props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
			context = new InitialContext(props);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void executaTeste()
	{
		try
		{
			ReservasService service = (ReservasService) context.lookup("java:global/RESERVAS-SVR-01-EAR/RESERVAS-SVR-01/ReservasServiceImpl");
			Cliente cliente = service.recuperarDadosCliente(1L);
			System.out.println(cliente.getNmCliente());
			Assert.assertNotEquals("Testa se nome do cliente não esta null", cliente.getNmCliente(), null);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
