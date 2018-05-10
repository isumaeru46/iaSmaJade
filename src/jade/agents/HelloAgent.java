package jade.agents;
import jade.core.Agent;

public class HelloAgent extends Agent{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7400760072107415275L;

	public void setup() {
		System.out.println("Hello World. ");
		System.out.println("Meu nome  ́e " + getLocalName());
	}
}
