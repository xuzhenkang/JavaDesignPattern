package d08.proxy;

public class Source implements Sourceable {
	@Override
	public void method() {
		System.out.println("The original method!");
	}
}
