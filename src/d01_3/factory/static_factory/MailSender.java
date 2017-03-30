package d01_3.factory.static_factory;

public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is MailSender!");
	}
}
