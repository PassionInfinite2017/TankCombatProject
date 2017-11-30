package com.yizhi.tank.testObserver;

public class HongHongObserver implements Observer{
//事件发生后作出的处理方案，根据事件的发出性质来定，所以需要传入事件。
	public void handleWakeUp(WakeUpEvent event) {
		// TODO Auto-generated method stub
		if(event.voice > 5){
		System.out.println("哄哄我！");
		}
	}
}
