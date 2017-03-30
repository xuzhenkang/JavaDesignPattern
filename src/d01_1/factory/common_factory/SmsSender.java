package d01_1.factory.common_factory;

public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is SmsSender!");	
	}
}
