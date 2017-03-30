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
		/* Enumeration和Iterator接口功能相似，而且Iterator的功能还比Enumeration多，
		 * 那么为什么还要使用Enumeration？这是因为java的发展经历了很长时间，
		 * 一些比较古老的系统或者类库中的方法还在使用Enumeration接口，因此为了兼容，
		 * 还是需要使用Enumeration。*/
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}
}
