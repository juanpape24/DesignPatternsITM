package BridgePattern.abstraction;

import BridgePattern.implementor.ITransaction;

public class AfiniaPayment extends PublicService{

	public AfiniaPayment(ITransaction transaction) {
		super(transaction);
	}


	@Override
	public void getDebt() {
	     System.out.println("Checking debit payment.");
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
	    System.out.println("transaction finished.");
	}

}
