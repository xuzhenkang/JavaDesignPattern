package d03_1.singleton;

public class Singleton {
	/*
	 * ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ���
	 */
	private static Singleton instance = null;

	/*
	 * ˽�й��췽������ֹ��ʵ����
	 */
	private Singleton() {
	}

	/*
	 * ��̬���̷���������ʵ��
	 * 
	 * ���������������Ҫ�󣬵��ǣ������������̰߳�ȫ�������࣬������ǰ���������̵߳Ļ����£��϶��ͻ����������,
	 * ��ν�����������Ȼ��뵽��getInstance������synchronized�ؼ��֣���Ŀ��03-2Singleton
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	/*
	 * ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
	 */
	public Object readResolve() {
		return instance;
	}
}

