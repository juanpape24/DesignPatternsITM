package BridgePattern.abstraction;

import BridgePattern.implementor.ITransaction;

public class ClaroPayment extends PublicService{

	public ClaroPayment(ITransaction transaction) {
		super(transaction);
	}

	@Override
	public void getDebt() {
		System.out.println("\nChecking debit payment.");
		transaction.getPaymentAmount();
	}

	@Override
	public void startPayment() {
	    System.out.println("Init process payment.");
	    transaction.processPay();
	    transaction.getProofPayment();
	}

	@Override
	public void finishTrasaction() {
	    System.out.println("transaction finished.\n");
	}

}
