package jade.agents;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class Ticker extends Agent{
	
	//-gui teste:jade.agents.Ticker

	private static final long serialVersionUID = 1784759729154796904L;
	protected void setup(){
		System.out.println("Adicionando TickerBehaviour");
		addBehaviour(new TickerBehaviour(this, 1000 ) {

			private static final long serialVersionUID = 2792593863382262938L;

			@Override
			protected void onTick() {
				if(getTickCount() >5){
					stop();
				}else{
					// getTickCount ( ) retorna o numero de execucoes do comportamento .
					System.out.println( "Estou realizando meu " + getTickCount() + " tick");
				}
				
			}
			
		});
	}

}
