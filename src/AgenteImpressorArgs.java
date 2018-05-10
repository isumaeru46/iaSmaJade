import jade.core.Agent;

public class AgenteImpressorArgs extends Agent{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6682117351681355288L;
	
	protected void setup(){
		Object [ ] args = getArguments();
		if ( args != null && args.length >0){
			long valor = Long.parseLong((String) args[0]);
		}
	}

}
