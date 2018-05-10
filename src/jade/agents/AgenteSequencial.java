package jade.agents;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class AgenteSequencial extends Agent{

	
	//-gui Nick:jade.agents.AgenteSequencial
	private static final long serialVersionUID = 3589013942430584038L;
	
	protected void setup(){
		System.out.println("Ola! Meu nome e " + getLocalName ( ));
		System.err.println("Vou executar tres comportamentos:");
		SequentialBehaviour comportamento = new SequentialBehaviour(this){
			private static final long serialVersionUID = 6973382544183524209L;

			public int onEnd (){
				myAgent.doDelete();
				return 0;
			}
		};
		comportamento.addSubBehaviour(new WakerBehaviour ( this , 500) {

			private static final long serialVersionUID = -1132312966780237294L;
			long t0 = System.currentTimeMillis();
			protected void onWake(){
				System.out.println((System.currentTimeMillis() - t0 ) +":Executei meu primeiro comportamento apos meio segundo!");
			}
			
		});
		
		comportamento.addSubBehaviour(new OneShotBehaviour ( this ){

			private static final long serialVersionUID = -8825406664538576196L;

			@Override
			public void action() {
				System.out.println("Executei meu segundo comportamento");
			}
			
		});
		
		comportamento.addSubBehaviour(new TickerBehaviour ( this , 700) {

			private static final long serialVersionUID = -3209168832587625797L;

			@Override
			protected void onTick() {
				int exec = 0;
				long t1 = System.currentTimeMillis();
				if ( exec == 3){ 
					stop();
				}else{
					System.out.println((System.currentTimeMillis() - t1 ) +":Estou executando meu terceiro comportamento!");
					exec++;
				}
			}
		});
		// acionamos sua execucao ;
		addBehaviour ( comportamento ) ;
	}
	
	protected void takeDown(){
		System.out.println("Fui finalizado com sucesso");
	}

}
