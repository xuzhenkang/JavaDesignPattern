package d15.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
	
	private Vector<Observer> vector = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}
	@Override
	public void notifyObservers() {
		/* Enumeration��Iterator�ӿڹ������ƣ�����Iterator�Ĺ��ܻ���Enumeration�࣬
		 * ��ôΪʲô��Ҫʹ��Enumeration��������Ϊjava�ķ�չ�����˺ܳ�ʱ�䣬
		 * һЩ�ȽϹ��ϵ�ϵͳ��������еķ�������ʹ��Enumeration�ӿڣ����Ϊ�˼��ݣ�
		 * ������Ҫʹ��Enumeration��*/
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}
}
