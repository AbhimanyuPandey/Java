package OOPConcepts;

public class Book {
String isbn;
String title;
String author;
double price;
public Book(String isbn, String title, String author, double price) {
	super();
	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.price = price;
}
@Override
public String toString() {
	return "Details of the book : [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
}
public void displayDetails() {
	System.out.println(toString());
}
public void discountedPrice(int d) {
	double discounted_price = this.price - (this.price*d/100);
	System.out.println("The discounted price is : "+ discounted_price);
}
public static void main(String[] args) {
	Book b = new Book("463128312","The Alchemist","Paulo Coelho", 350.0);
	b.displayDetails();
	b.discountedPrice(20);
}
}
