package d05.prototype.com;

/**
 * 原型类
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
 * 很简单，一个原型类，只需要实现Cloneable接口，覆写clone方法，此处clone方法可以改成任意的名称，因为Cloneable接口是个空接口，
 * 你可以任意定义实现类的方法名,
 * 如cloneA或者cloneB，因为此处的重点是super.clone()这句话，super.clone()调用的是Object的clone()方法，
 * 而在Object类中，clone()是native的。首先需要了解对象深、浅复制的概念：
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 */
