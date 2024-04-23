package BridgePattern.abstraction;

import BridgePattern.implementor.ITransaction;

public abstract class PublicService {
	protected ITransaction transaction;
	
	public PublicService (ITransaction transaction) {
		this.transaction = transaction;
	}
	
	public abstract void getDebt();
	public abstract void startPayment();
	public abstract void finishTrasaction();
}
