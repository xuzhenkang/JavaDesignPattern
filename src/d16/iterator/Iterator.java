package d16.iterator;

public interface Iterator {
	
	// 前移
	public Object previous();
	
	// 后移
	public Object next();
	
	// 判断是否有下元素
	public boolean hasNext();
	
	// 取得第一个元素
	public Object first();
}
