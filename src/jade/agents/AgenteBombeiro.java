package jade.agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgenteBombeiro extends Agent{

	private static final long serialVersionUID = -338681668219127949L;
	
	protected void setup(){
		addBehaviour(new CyclicBehaviour(this) {
			
			private static final long serialVersionUID = 8692105193725738735L;

			@Override
			public void action() {
				ACLMessage msg = myAgent.receive() ;
				if(msg != null){
					String content = msg.getContent();
					//com e qual s I gnor eCas e fazemos uma comparacao
					//nao case-s e n s i t i v e .
					if ( content.equalsIgnoreCase ( "Fogo" ) ) {
						System.out.println("O agente " + msg.getSender() .getName ( ) + " avisou de um incendio");
						System.out.println("Vou ativar os procedimentos de combate ao incendio!");
					}
					block();
				}
				
			}
		});
	}

}
