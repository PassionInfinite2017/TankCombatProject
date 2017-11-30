package com.yizhi.tank.test;
//定义一个复习类。
public class Review {
	public static void main(String[] args) {
		Person p = new Person("石锁");
		p.v= new Car();//父类引用指向子类对象，体现了多态。
		p.go("青岛");
	}
}
//定义一个人的类
class Person{
		String name;
		Vihecle v;
	public Person(String name) {
			this.name = name;
	}
	//人可以走动。
	public void go(String where){
		System.out.println(this.name + "驾驶着");
		v.run();
		System.out.println("去" + where);
	}
}
//定义一个交通工具的抽象类
abstract class Vihecle{
	public abstract  void run();
	}
//车类继承交通工具类，并且实现里面的抽象run方法。
class Car extends Vihecle{
	public void run() {
		   System.out.println("Car run !");
		}
//定义一个扫帚类继承交通工具类，并且实现里面的抽象run方法。
class Broom extends Vihecle{
		public void run() {
			System.out.println("Broom fly !");		
		}
	}
}

