package com.yizhi.tank.testObserver;
//����һ���¼��ࡣ
public class WakeUpEvent {
	public int voice;
	public Kid source;
//ȷ�����¼���������С�ͷ�����
	public WakeUpEvent(int voice, Kid source) {
		this.voice = voice;
		this.source = source;
	}
//�õ��¼��ķ�������˭
	public Kid getSource(){
		return source;
	}
}
