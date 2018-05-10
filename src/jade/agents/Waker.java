package jade.agents;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class Waker extends Agent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5705889350378450901L;
	
	protected void setup(){
		System.out.println("Adicionando waker behaviour");
		addBehaviour(new WakerBehaviour ( this , 10000){
			private static final long serialVersionUID = 9072870342481142723L;
			protected void onWake ( ) {
				// r e a l i z a operacao X
			}
		});
	}
	
}
