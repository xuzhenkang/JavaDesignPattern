package d15.observer;

public interface Subject {
	/*���ӹ۲���*/
	public void add(Observer observer);
	
	/*ɾ���۲���*/
	public void del(Observer observer);
	
	/*֪ͨ�۲���*/
	public void notifyObservers();
	
	/*����Ĳ���*/
	public void operation();
}
