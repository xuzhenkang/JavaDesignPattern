package d01_2.factory.multi_factory;

public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is MailSender!");
	}
}
