package com.yizhi.tank.testObserver;

import java.awt.Event;

//�۲������ģʽ
public class Kid {
	public boolean sleeping = true;
	Observer o;
	public void wakeUp(){
		//newһ���¼��������¼����ԡ�
		WakeUpEvent event = new WakeUpEvent(8, this);
		o.handleWakeUp(event);
	}
}
