package com.yizhi.tank.testObserver;

public class Test {
	public static void main(String[] args) {
		Kid k = new Kid();
		k.o = new HongHongObserver();//
		k.wakeUp();	
	}
}
