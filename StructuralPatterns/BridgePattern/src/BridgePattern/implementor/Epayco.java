package BridgePattern.implementor;

public class Epayco implements ITransaction{

	@Override
	public void getPaymentAmount() {
        System.out.println("Amount payment by Epayco obtained...");
	}

	@Override
	public void processPay() {
        System.out.println("Processing Epayco payment...");
		
	}

	@Override
	public void getProofPayment() {
        System.out.println("Getting Epayco proof payment...");
	}

}
