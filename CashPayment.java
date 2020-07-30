package OOPConcepts;

public class CashPayment extends Payment{

	public CashPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	public void paymentDetails() {
		System.out.println("The cash payment amount is Rs."+this.amount);
	}

}
