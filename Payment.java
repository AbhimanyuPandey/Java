package OOPConcepts;

public class Payment {
double amount;

public void setAmount(double amount) {
	this.amount = amount;
}

public Payment(double amount) {
	super();
	this.amount = amount;
}

public void paymentDetails() {
	System.out.println("The payment amount is Rs."+this.amount);
}
public static void main(String[] args) {
	CashPayment c1 = new CashPayment(300);
	CashPayment c2 = new  CashPayment(6000);
	c1.paymentDetails();
	c2.paymentDetails();
	CreditCardPayment p1 = new CreditCardPayment(5600, "Abhimanyu", "23-10-2021","4567-7845-8729" );
	CreditCardPayment p2 = new CreditCardPayment(674673,"Abhishek","22-7-2024","6783-6457-9871");
	p1.paymentDetails();
	p2.paymentDetails();
}
}
