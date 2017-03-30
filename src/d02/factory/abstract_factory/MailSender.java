package d02.factory.abstract_factory;

public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is MailSender!");
	}
}
