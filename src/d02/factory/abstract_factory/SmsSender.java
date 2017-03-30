package d02.factory.abstract_factory;

public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is SmsSender!");
	}
}
