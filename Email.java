package OOPConcepts;

public class Email extends Document{
	String sender;
	String recipient;
	String titie;
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getTitie() {
		return titie;
	}
	public void setTitie(String titie) {
		this.titie = titie;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", titie=" + titie + ", text=" + text + "]";
	}
	public static void main(String[] args) {
		Email e = new Email();
		e.setSender("John");
		e.setRecipient("Marry");
		e.setTitie("Greeting");
		e.setText("Hi, Good Morning");
		System.out.println(e.toString());
	}
	

}
