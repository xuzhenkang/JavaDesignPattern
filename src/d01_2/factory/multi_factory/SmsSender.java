package d01_2.factory.multi_factory;

public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is SmsSender!");	
	}
}
