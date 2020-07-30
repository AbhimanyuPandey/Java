package OOPConcepts;

public class Document {
	String text;


	public void setText(String text) {
		this.text = text;
	}


	@Override
	public String toString() {
		return "Document [text=" + text + "]";
	}
	
	

}
