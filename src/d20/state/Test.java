package d20.state;

public class Test {
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		
		// ���õ�һ��״̬
		state.setValue("state1");
		context.method();
		
		// ���õڶ���״̬
		state.setValue("state2");
		context.method();
	}
}
/*
 * ״̬ģʽ����˼����ǣ��������״̬�ı�ʱ��ͬʱ�ı�����Ϊ���ܺ���⣡
 * ����QQ��˵���м���״̬�����ߡ�����æµ�ȣ�ÿ��״̬��Ӧ��ͬ�Ĳ�����
 * ������ĺ���Ҳ�ܿ������״̬��
 * ���ԣ�״̬ģʽ�����㣺
 * 1������ͨ���ı�״̬����ò�ͬ����Ϊ��
 * 2����ĺ�����ͬʱ������ı仯��
 * 
 * State���Ǹ�״̬�࣬Context�����ʵ���л���
 * 
 * ����������ԣ�״̬ģʽ���ճ��������õ�ͦ��ģ�
 * ����������վ��ʱ��������ʱϣ�����ݶ����ĳһ���ԣ�
 * �������ǵ�һЩ���ܣ�����˵�򵥵�Ȩ�޿��Ƶȡ�
 * 
 * */
