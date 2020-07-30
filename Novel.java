package OOPConcepts;

public class Novel extends Book1{
String author;

public Novel(String isbn, String title, double price, String author) {
	super(isbn, title, price);
	this.author = author;
}

@Override
public String toString() {
	return "Novel [author=" + author + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
}

}
