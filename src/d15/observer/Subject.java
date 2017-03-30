package d15.observer;

public interface Subject {
	/*增加观察者*/
	public void add(Observer observer);
	
	/*删除观察者*/
	public void del(Observer observer);
	
	/*通知观察者*/
	public void notifyObservers();
	
	/*自身的操作*/
	public void operation();
}
