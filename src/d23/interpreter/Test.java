package d23.interpreter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����9+2-8��ֵ
		int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
		System.out.println(result);
	}
}
/*
 * ������ģʽһ����ҪӦ����OOP�����еı������Ŀ����У�����������Ƚ�խ��
 * 
 * Context����һ�������Ļ����࣬Plus��Minus�ֱ������������ʵ�֡�
 * ������ģʽ���������ָ����Ľ����������������ʽ�ȵĽ������ȵȣ�
 * 
 */