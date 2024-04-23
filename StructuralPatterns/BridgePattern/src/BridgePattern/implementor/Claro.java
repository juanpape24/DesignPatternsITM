package BridgePattern.implementor;

public class Claro implements ITransaction {

	@Override
	public void getPaymentAmount() {
        System.out.println("Claro payment amount obtained...");
	}

	@Override
	public void processPay() {
        System.out.println("Processing claro payment...");
	}

	@Override
	public void getProofPayment() {
        System.out.println("Getting claro proof payment...");
	}

}
