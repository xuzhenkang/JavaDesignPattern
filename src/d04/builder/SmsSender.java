package d04.builder;

public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is SmsSender!");	
	}
}
