package OOPConcepts;

public class Book1 {
String isbn;
String title;
double price;
public Book1(String isbn, String title, double price) {
	this.isbn = isbn;
	this.title = title;
	this.price = price;
}
public static void main(String[] args) {
	Magazine m = new Magazine("5367571","India Today",100.0,"Media");
	Novel n = new Novel("3756423","Brida",360.0,"Paulo Coelho");
	System.out.println(m.toString());
	System.out.println(n.toString());
}
}
