package jade.agents;
import jade.behaviours.MeuComportamento;
import jade.core.Agent;

public class MeuAgente extends Agent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 872996407337026717L;
	
	protected void setup(){
		System.out.println("Ola, eu sou um agente.");
		System.out.println("Estou disparando meu comportamento ...");
		addBehaviour(new MeuComportamento(this));
	}

}
