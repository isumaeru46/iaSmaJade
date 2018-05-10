package jade.behaviours;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class MeuComportamento extends Behaviour{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4809778681544584571L;
	int i = 0;
	
	public MeuComportamento(Agent a) {
		super(a);
	}

	@Override
	public void action() {
		System.out.println("* Ola Mundo! ... Meu nome e " + myAgent.getLocalName());
		i++;
	}

	@Override
	public boolean done() {
		return i >3;
	}

}
