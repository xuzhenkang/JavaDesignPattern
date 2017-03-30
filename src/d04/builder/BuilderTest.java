package d04.builder;

public class BuilderTest {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);// 使用建造者模式创建出了10个MailSender对象
	}
}
