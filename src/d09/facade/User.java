package d09.facade;

public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
/*
 * ���ģʽ
 * 
 * �������û��Computer�࣬��ô��CPU��Memory��Disk����֮�佫���໥����ʵ����
 * ������ϵ��������������ص��������޸�һ���࣬���ܻ������������޸ģ�
 * �ⲻ��������Ҫ�����ģ�����Computer�࣬����֮��Ĺ�ϵ��������Computer���
 * ���������˽�������ã��⣬�������ģʽ��
 */
