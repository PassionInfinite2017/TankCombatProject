package com.yizhi.tank.test;
//����һ����ϰ�ࡣ
public class Review {
	public static void main(String[] args) {
		Person p = new Person("ʯ��");
		p.v= new Car();//��������ָ��������������˶�̬��
		p.go("�ൺ");
	}
}
//����һ���˵���
class Person{
		String name;
		Vihecle v;
	public Person(String name) {
			this.name = name;
	}
	//�˿����߶���
	public void go(String where){
		System.out.println(this.name + "��ʻ��");
		v.run();
		System.out.println("ȥ" + where);
	}
}
//����һ����ͨ���ߵĳ�����
abstract class Vihecle{
	public abstract  void run();
	}
//����̳н�ͨ�����࣬����ʵ������ĳ���run������
class Car extends Vihecle{
	public void run() {
		   System.out.println("Car run !");
		}
//����һ��ɨ����̳н�ͨ�����࣬����ʵ������ĳ���run������
class Broom extends Vihecle{
		public void run() {
			System.out.println("Broom fly !");		
		}
	}
}

