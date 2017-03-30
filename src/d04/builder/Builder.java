package d04.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; ++i) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; ++i) {
			list.add(new SmsSender());
		}
	}
}

/**
 * ����㿴����������ģʽ���ܶ๦�ܼ��ɵ�һ������������Դ�����Ƚϸ��ӵĶ����������빤��ģʽ��������ǣ�����ģʽ��ע���Ǵ���������Ʒ��
 * ��������ģʽ���ע�������϶��󣬶�����֡���ˣ���ѡ�񹤳�ģʽ���ǽ�����ģʽ����ʵ�����������
 * 
 * */
