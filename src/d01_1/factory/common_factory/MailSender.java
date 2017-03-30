package d01_1.factory.common_factory;

public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is MailSender!");
	}
}
