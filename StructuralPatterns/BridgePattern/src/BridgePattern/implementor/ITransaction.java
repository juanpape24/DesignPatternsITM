package BridgePattern.implementor;

public interface ITransaction {
	void getPaymentAmount();
	void processPay();
	void getProofPayment();
}
