package d06_1.adapter.class_adapter;

public class AdapterTest {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
/*
 * ���������ģʽ��
 * 
 * ��ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ��
 * ����һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ��ɡ�
 */
