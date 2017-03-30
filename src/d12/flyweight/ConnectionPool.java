package d12.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {
	private Vector<Connection> pool;

	/* �������� */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "1234";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	/* ���췽������ʼ������ */
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; ++i) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* �������ӵ����ӳ� */
	public synchronized void release() {
		pool.add(conn);
	}

	/* �������ӳ��е�һ�����ݿ����� */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}
}
/*
 * FlyWeightFactory���𴴽��͹�����Ԫ��Ԫ����һ���ͻ�������ʱ��������Ҫ��鵱ǰ��������Ƿ��з��������Ķ�������У��ͷ����Ѿ����ڵĶ������û�У�
 * �򴴽�һ���¶���FlyWeight�ǳ��ࡣһ�ᵽ����أ����Ǻ��������뵽Java�����JDBC���ӳأ�����ÿ�����ӵ��ص㣬���ǲ����ܽ����
 * �������������һЩ������
 * ������һЩ���е����ԣ��������ݿ����ӳ���˵��url��driverClassName��username��password��dbname��
 * ��Щ���Զ���ÿ��������˵����һ���ģ�
 * ���Ծ��ʺ�����Ԫģʽ��������һ�������࣬����������������Ϊ�ڲ����ݣ���������Ϊ�ⲿ���ݣ��ڷ�������ʱ������������������
 * �����ͽ�ʡ�˿ռ䣬������ʵ����������
 * 
 * ͨ�����ӳصĹ���ʵ�������ݿ����ӵĹ�������Ҫÿһ�ζ����´������ӣ���ʡ�����ݿ����´����Ŀ�����������ϵͳ�����ܣ�
 * 
 */
