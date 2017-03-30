package d04.builder;

/**
 * 发送工厂类
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
