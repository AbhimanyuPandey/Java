package OOPConcepts;

public class Magazine extends Book1{
String type;

public Magazine(String isbn, String title, double price, String type) {
	super(isbn, title, price);
	this.type = type;
}

@Override
public String toString() {
	return "Magazine [type=" + type + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
}



}
