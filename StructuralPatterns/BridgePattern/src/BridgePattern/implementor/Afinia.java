package BridgePattern.implementor;

public class Afinia implements ITransaction{

	@Override
	public void getPaymentAmount() {
        System.out.println("Afinia payment amount obtained...");
	}

	@Override
	public void processPay() {
        System.out.println("Processing afinia payment...");
		
	}

	@Override
	public void getProofPayment() {
        System.out.println("Getting afinia proof payment...");
	}

}
