package d05.prototype.com;

/**
 * ԭ����
 * 
 * @author Administrator
 * 
 */
public class Prototype implements Cloneable {
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
}
/**
 * �ܼ򵥣�һ��ԭ���ֻ࣬��Ҫʵ��Cloneable�ӿڣ���дclone�������˴�clone�������Ըĳ���������ƣ���ΪCloneable�ӿ��Ǹ��սӿڣ�
 * ��������ⶨ��ʵ����ķ�����,
 * ��cloneA����cloneB����Ϊ�˴����ص���super.clone()��仰��super.clone()���õ���Object��clone()������
 * ����Object���У�clone()��native�ġ�������Ҫ�˽�����ǳ���Ƶĸ��
 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
 * ��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
 */
