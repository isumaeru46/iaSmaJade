package jade.agents;
import jade.behaviours.ImprimeFrase;
import jade.core.Agent;

public class AgenteImpressor extends Agent{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4396629914318095760L;
	
	protected void setup(){
		System.out.println("Olá! Eu sou um agente impressor!");
		System.out.println("# Vou executar meu comportamento");
		addBehaviour(new ImprimeFrase ( this , 5000));
	}

}
