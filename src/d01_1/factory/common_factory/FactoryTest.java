package d01_1.factory.common_factory;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.send();
	}
}
