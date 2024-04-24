package BridgePattern.implementor;

public class Pse implements ITransaction {

	@Override
	public void getPaymentAmount() {
    System.out.println("Amount payment by PSE obtained...");
	}

	@Override
	public void processPay() {
        System.out.println("Processing PSE payment...");
	}

	@Override
	public void getProofPayment() {
        System.out.println("Getting PSE proof payment...");
	}

}
