package d01_3.factory.static_factory;

/**
 * ���͹�����
 * @author Kang
 *
 */
public class SendFactory {
	public static Sender produceMail() {
		return new MailSender();
	}
	public static Sender produceSms() {
		return new SmsSender();
	}
}
