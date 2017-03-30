package d14.template_method;

public class TemplateMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}
/*
 * ģ�巽��ģʽ��ָ��һ���������У���һ�����������ٶ���1...n�������������ǳ���ģ�Ҳ������ʵ�ʵķ�����
 * ����һ���࣬�̳иó����࣬��д���󷽷���ͨ�����ó����࣬ʵ�ֶ�����ĵ��á�
 * ������AbstractCalculator���ж���һ��������calculate��calculate()����spilt()�ȣ�
 * Plus��Minus�ֱ�̳�AbstractCalculator�࣬ͨ����AbstractCalculator�ĵ���ʵ�ֶ�����ĵ��á�
 * �Ҹ��������С�����ִ�й��̣����Ƚ�exp��"\\+"��������
 * ����AbstractCalculator�����calculate(String,String)������
 * ��calculate(String,String)�����ͬ���split()��֮���ٵ���calculate(int ,int)������
 * ������������뵽�����У�ִ����return num1 + num2�󣬽�ֵ���ص�AbstractCalculator�࣬����result����ӡ������
 */
