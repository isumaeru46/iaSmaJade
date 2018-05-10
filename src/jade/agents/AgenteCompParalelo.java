package jade.agents;

import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.SimpleBehaviour;

public class AgenteCompParalelo extends Agent{

	
	//-gui Azul:jade.agents.AgenteCompParalelo
	private static final long serialVersionUID = -9036460255638576447L;
	
	protected void setup(){
		System.out.println("Ola! Eu sou o agente " + getLocalName ( ));
		System.out.println("Vou executar tres comportamentos concorrentemente");
		
		ParallelBehaviour s = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ALL /* ParallelBehaviour.WHEN_ANY*/){

			private static final long serialVersionUID = 1L;
			public int onEnd(){
				System.out.println("Comportamento Composto Finalizado com Sucesso!");
				return 0;
			}
		};
		addBehaviour(s);
		s.addSubBehaviour(new SimpleBehaviour ( this ) {

			private static final long serialVersionUID = 8409704617420571202L;
			int qtd=1;

			@Override
			public void action() {
				System.out.println("Comportamento 1: Executando pela " + qtd + " vez");
				qtd = qtd + 1;
			}

			@Override
			public boolean done() {
				if(qtd == 4){
					System.out.println("Comportamento 1 - Finalizado");
					return true;
				}else{
					return false;
				}
			}
		});
		
		s.addSubBehaviour(new SimpleBehaviour ( this ) {

			private static final long serialVersionUID = 8409704617420571202L;
			int qtd=1;

			@Override
			public void action() {
				System.out.println("Comportamento 2: Executando pela " + qtd + " vez");
				qtd = qtd + 1;
			}

			@Override
			public boolean done() {
				if(qtd == 8){
					System.out.println("Comportamento 2 - Finalizado");
					return true;
				}else{
					return false;
				}
			}
		});
		
		s.addSubBehaviour(new SimpleBehaviour ( this ) {

			private static final long serialVersionUID = 8409704617420571202L;
			int qtd=1;

			@Override
			public void action() {
				System.out.println("Comportamento 3: Executando pela " + qtd + " vez");
				qtd = qtd + 1;
			}

			@Override
			public boolean done() {
				if(qtd == 10){
					System.out.println("Comportamento 3 - Finalizado");
					return true;
				}else{
					return false;
				}
			}
		});
		
	}

}
