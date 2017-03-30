package d02.factory.abstract_factory;

public class SendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new MailSender();
	}
}
