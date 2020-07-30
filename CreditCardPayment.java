package OOPConcepts;

public class CreditCardPayment extends Payment {
String name;
String exp;
String num;
public CreditCardPayment(double amount, String name, String exp, String num) {
	super(amount);
	this.name = name;
	this.exp = exp;
	this.num = num;
}

@Override
public String toString() {
	return "Credit Card Payment Details  [name on card=" + name + ", expiration date=" + exp + ", card number=" + num + ", amount=" + amount + "]";
}

public void paymentDetails() {
	System.out.println(toString());
}
}
