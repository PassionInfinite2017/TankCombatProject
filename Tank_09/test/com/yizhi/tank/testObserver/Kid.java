package com.yizhi.tank.testObserver;

import java.awt.Event;

//观察者设计模式
public class Kid {
	public boolean sleeping = true;
	Observer o;
	public void wakeUp(){
		//new一个事件，传入事件属性。
		WakeUpEvent event = new WakeUpEvent(8, this);
		o.handleWakeUp(event);
	}
}
