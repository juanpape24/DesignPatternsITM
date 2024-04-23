package BridgePattern.implementor;

public interface ITransaction {
	String bankAccount = "";
	void getPaymentAmount();
	void processPay();
	void getProofPayment();
}
