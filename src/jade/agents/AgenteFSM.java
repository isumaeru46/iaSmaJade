package jade.agents;

import jade.core.Agent;
import jade.core.behaviours.FSMBehaviour;
import jade.core.behaviours.OneShotBehaviour;

public class AgenteFSM extends Agent{

	//-gui Caio:jade.agents.AgenteFSM
	private static final long serialVersionUID = 2403357880225548408L;
	
	public void setup(){
		FSMBehaviour compFSM = new FSMBehaviour ( this ) {

			private static final long serialVersionUID = 3624266875596352280L;
			public int onEnd(){
				System.out.println("Comportamento FSM finalizado com sucesso!");
				return 0;
			}
			
		};
		
		// r e g i s t r amo s o pr ime i ro comportamento - X
		compFSM.registerFirstState(new OneShotBehaviour ( this ) {

			private static final long serialVersionUID = -8852042547057080844L;
			int c =0;
			
			@Override
			public void action() {
				System.out.println("Executando Comportamento X");
				c++;
			}
			public int onEnd(){
				return (c>4 ? 1:0);
			}
			
		}, "X" ) ;
		
		compFSM.registerState(new OneShotBehaviour ( this ) {

			private static final long serialVersionUID = -8852042547057080844L;
			
			@Override
			public void action() {
				System.out.println("Executando Comportamento Z");
			}
			public int onEnd(){
				return 2;
			}
			
		}, "Z" ) ;
		
		compFSM.registerLastState(new OneShotBehaviour ( this ) {

			private static final long serialVersionUID = -8852042547057080844L;
			
			@Override
			public void action() {
				System.out.println("Executando meu ultimo comportamento.");
			}
			
		}, "Y" ) ;
		
		// definimos as transicoes
		compFSM.registerTransition( "X" , "Z" , 0) ; //X --> Z, caso onEnd ( ) do X retorne 0
		compFSM.registerTransition( "X" , "Y" , 1) ; //X --> Y, caso onEnd ( ) do X retorne 1
		
		compFSM.registerDefaultTransition( "Z" , "X" , new String [ ] { "X" , "Z" }) ;
		
		// acionamos o comportamento
		addBehaviour (compFSM) ;
		
	}

}
