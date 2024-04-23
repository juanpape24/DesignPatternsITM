package BridgePattern;
import BridgePattern.implementor.Afinia;
import BridgePattern.implementor.Claro;
import BridgePattern.implementor.ITransaction;
import BridgePattern.abstraction.*;

public class Main {

	public static void main(String[] args) {
		ITransaction claro = new Claro();
		ITransaction afinia = new Afinia();
		
		PublicService claroService = new ClaroPayment(claro);
		PublicService afiniaService = new AfiniaPayment(afinia);

		claroService.getDebt();
		claroService.startPayment();
		claroService.finishTrasaction();
		
		afiniaService.getDebt();
		afiniaService.startPayment();
		afiniaService.finishTrasaction();
	}

}
