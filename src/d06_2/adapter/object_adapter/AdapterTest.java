package d06_2.adapter.object_adapter;

public class AdapterTest {
	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2(); 
	}
}

/*
 * �����������ģʽ��
 * 
 * ��ϣ����һ������ת����������һ���½ӿڵĶ���ʱ��
 * ���Դ���һ��Wrapper�࣬����ԭ���һ��ʵ����
 * ��Wrapper��ķ����У�����ʵ���ķ�������.
 */
