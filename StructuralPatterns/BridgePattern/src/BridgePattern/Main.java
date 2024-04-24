package BridgePattern;
import BridgePattern.implementor.Epayco;
import BridgePattern.implementor.Pse;
import BridgePattern.implementor.ITransaction;
import BridgePattern.abstraction.*;

public class Main {

	public static void main(String[] args) {
		ITransaction pse = new Pse();
		ITransaction ePayco = new Epayco();
		
		PublicService claroService = new ClaroPayment(pse);
		PublicService afiniaService = new AfiniaPayment(ePayco);
		PublicService claroService2 = new ClaroPayment(ePayco);

		claroService.getDebt();
		claroService.startPayment();
		claroService.finishTrasaction();
		
		afiniaService.getDebt();
		afiniaService.startPayment();
		afiniaService.finishTrasaction();
		
		claroService2.getDebt();
		claroService2.startPayment();
		claroService2.finishTrasaction();
	}

}
