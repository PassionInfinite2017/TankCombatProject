package com.yizhi.tank.testObserver;
//定义一个事件类。
public class WakeUpEvent {
	public int voice;
	public Kid source;
//确定此事件的声音大小和发出者
	public WakeUpEvent(int voice, Kid source) {
		this.voice = voice;
		this.source = source;
	}
//得到事件的发出者是谁
	public Kid getSource(){
		return source;
	}
}
