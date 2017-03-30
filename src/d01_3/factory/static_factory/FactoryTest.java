package d01_3.factory.static_factory;

public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}
