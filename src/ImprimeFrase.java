import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class ImprimeFrase extends Behaviour{
	/**
	 * 
	 */
	private static final long serialVersionUID = -333777746850819391L;
	int numExecucao=1;
	long delay ;
	long tempoInicial = System.currentTimeMillis();

	public ImprimeFrase(Agent agenteImpressor, int i) {
		super(agenteImpressor);
		this.delay = i;
	}

	@Override
	public void action() {
		block(delay);
		System.out.println("# Tempo " + ( System.currentTimeMillis() - tempoInicial ) + ": Meu nome e " + myAgent . getLocalName());
		numExecucao++;
	}

	@Override
	public boolean done() {
		return numExecucao>10;
	}
	
	public int onEnd(){
		System.out.println(myAgent.getLocalName() + ": Meu comportamento foi finalizado! Ate mais...");
		 return 0;
	}

}
