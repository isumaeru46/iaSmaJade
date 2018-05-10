import java.util.Iterator;

import jade.core.Agent;

@SuppressWarnings("rawtypes")
public class InfoAgentes extends Agent{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -636139713270076345L;

	protected void setup(){
		System.out.println("Hello World. Eu sou um agente!");
		System.out.println("Todas as minhas informações: \n" + getAID());
		System.out.println("Meu nome local é "+ getAID().getLocalName());
		System.out.println("Meu nome global (GUID) é"+ getAID().getName());
		System.out.println("Meus endereços são:");
		Iterator it = getAID().getAllAddresses();
		while (it.hasNext()) {
			System.out.println("- "+it.next());
		}
		
	}

}
