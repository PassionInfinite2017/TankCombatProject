package com.yizhi.tank.testObserver;

public class HongHongObserver implements Observer{
//�¼������������Ĵ������������¼��ķ�������������������Ҫ�����¼���
	public void handleWakeUp(WakeUpEvent event) {
		// TODO Auto-generated method stub
		if(event.voice > 5){
		System.out.println("����ң�");
		}
	}
}
