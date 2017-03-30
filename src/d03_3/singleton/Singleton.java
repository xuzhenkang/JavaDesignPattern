package d03_3.singleton;

public class Singleton {
	/*
	 * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
	 */
	// private static Singleton instance = null;

	/*
	 * 私有构造方法，防止被实例化
	 */
	private Singleton() {
	}

	/*
	 * 使用一个内部类来维护单例 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
	 * 这样当我们第一次调用getInstance的时候,
	 * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕,
	 * 这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。
	 */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	/*
	 * 静态工程方法，创建实例
	 */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

	/*
	 * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	 */
	public Object readResolve() {
		return getInstance();
	}
}

/**
 * 其实说这个程序完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。所以说，十分完美的东西是没有的，我们只能根据实际情况，
 * 选择最适合自己应用场景的实现方法。
 * 
 * */
