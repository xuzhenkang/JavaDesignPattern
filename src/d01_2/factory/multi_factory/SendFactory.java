package d01_2.factory.multi_factory;

/**
 * ���͹�����
 * @author Kang
 *
 */
public class SendFactory {
	public Sender produceMail() {
		return new MailSender();
	}
	public Sender produceSms() {
		return new SmsSender();
	}
}
