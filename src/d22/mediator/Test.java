package d22.mediator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}

}
/*
 * �н���ģʽҲ��������������֮�����ϵģ���Ϊ�������֮����������ϵ�Ļ���
 * �����ڹ��ܵ���չ��ά������ΪֻҪ�޸�һ���������������Ķ��󶼵ý����޸ġ�
 * ���ʹ���н���ģʽ��ֻ����ĺ�Mediator��Ĺ�ϵ��
 * ��������֮��Ĺ�ϵ�����Ƚ���Mediator���У����е���spring���������á�
 * 
 * User��ͳһ�ӿڣ�User1��User2�ֱ��ǲ�ͬ�Ķ��󣬶���֮���й�����
 * ����������н���ģʽ������Ҫ�����໥�������ã��������ߵ���϶Ⱥܸߣ�
 * Ϊ�˽��������Mediator�࣬�ṩͳһ�ӿڣ�MyMediatorΪ��ʵ���࣬
 * �������User1��User2��ʵ��������ʵ�ֶ�User1��User2�Ŀ��ơ�
 * ����User1��User2���������໥������
 * ����ֻ��Ҫ���ֺú�Mediator֮��Ĺ�ϵ���У�
 * ʣ�µ�ȫ��MyMediator����ά����
 * 
 */
