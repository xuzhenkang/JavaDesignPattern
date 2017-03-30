package d04.builder;

/**
 * ���͹�����
 * @author Kang
 *
 */
public class SendFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("Error Type!");
			return null;
		}
	}
}
