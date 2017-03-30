package d03_3.singleton;

public class Singleton {
	/*
	 * ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ���
	 */
	// private static Singleton instance = null;

	/*
	 * ˽�й��췽������ֹ��ʵ����
	 */
	private Singleton() {
	}

	/*
	 * ʹ��һ���ڲ�����ά������ ����ģʽʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ�������ļ��ع������̻߳���ġ�
	 * ���������ǵ�һ�ε���getInstance��ʱ��,
	 * JVM�ܹ������Ǳ�֤instanceֻ������һ�Σ����һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ�����,
	 * �������ǾͲ��õ�����������⡣ͬʱ�÷���Ҳֻ���ڵ�һ�ε��õ�ʱ��ʹ�û�����ƣ������ͽ���˵��������⡣
	 */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	/*
	 * ��̬���̷���������ʵ��
	 */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

	/*
	 * ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
	 */
	public Object readResolve() {
		return getInstance();
	}
}

/**
 * ��ʵ˵�������������Ҳ��һ��������ڹ��캯�����׳��쳣��ʵ������Զ�ò���������Ҳ���������˵��ʮ�������Ķ�����û�еģ�����ֻ�ܸ���ʵ�������
 * ѡ�����ʺ��Լ�Ӧ�ó�����ʵ�ַ�����
 * 
 * */
