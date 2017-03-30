package d05.prototype.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型类
 * 
 * @author Administrator
 * 
 */
public class Prototype implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	
	private String string;
	
	private SerializableObject obj;
	
	class SerializableObject implements Serializable {
		private static final long serialVersionUID = 1L;
	}
	
	/*浅复制*/
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
	
	/*深复制*/
	/*要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。*/
	public Object deepClone() throws IOException, ClassNotFoundException {
		/*写入当前对象的二进制流*/
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(oos);
		
		/*读出二进制流产生的新对象*/
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	
}

