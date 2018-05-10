package jade.agents;
import jade.behaviours.ImprimeFrase;
import jade.core.Agent;

public class AgenteImpressorArgs extends Agent{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6682117351681355288L;
	
	protected void setup(){
		Object [ ] args = getArguments();
		if ( args != null && args.length >0){
			Long valor = Long.parseLong((String) args[0]);
			System.out.println("Ola! Eu sou um agente impressor!");
			System.out.println("# Vou executar meu comportamento");
			addBehaviour(new ImprimeFrase(this, valor.intValue()));
		}else{
			System.out.println("Voce nao passou argumentos");
		}
	}

}
