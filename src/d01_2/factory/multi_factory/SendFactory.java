package d01_2.factory.multi_factory;

/**
 * 发送工厂类
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
