package jade.agents;
import jade.core.Agent;

public class CompradorDeLivros extends Agent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7703140081102092087L;
	private String livrosComprar ;
	
	protected void setup(){
		System.out.println("Ola!!! Eu sou o Agente Comprador "+ getLocalName()+" e estou pronto para comprar!");
		Object [ ] args = getArguments();
		if(args != null && args.length >0){
			livrosComprar = (String) args[0];
			System.out.println( "Pretendo comprar o livro: "+ livrosComprar);
		}else{
			System.out.println("Não tenho livros para comprar!");
			doDelete();
		}
	}
	
	protected void takeDown(){
		System.out.println("Agente Comprador" + getAID().getName() + "esta finalizado");
		
	}

}
