package pl.coderslab.bean;

public class EmailService implements MessageService {

	public void send(String message) {
		System.out.println("Sending email: " + message);

	}

}
